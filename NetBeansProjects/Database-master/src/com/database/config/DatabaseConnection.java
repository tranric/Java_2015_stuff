package com.database.config;

import com.database.tables.impl.Result;

import java.sql.*;

/**
 * Created by Jonathan on 10/5/2015.
 */
public final class DatabaseConnection {

    /**
     * Singleton instance of the DatabaseConnection class. (This will be removed to avoid Global State)
     */
    public static DatabaseConnection instance;

    /**
     * Create a new instance of the DatabaseConnection class.
     *
     * @return the connection
     */
    public static DatabaseConnection open() {
        if (instance != null) {
            throw new RuntimeException("You can not open more than one instance of a database.");
        }
        return instance = new DatabaseConnection(DatabaseConfiguration.DEFAULT);
    }

    /**
     * The configuration for the database.
     */
    private final DatabaseConfiguration config;

    /**
     * The database connection
     */
    private Connection connection;

    /**
     * Creates a <code>Statement</code> object for sending
     * SQL statements to the database.
     *
     * @param config the database configuration
     */
    private DatabaseConnection(DatabaseConfiguration config) {
        this.config = config;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Opens a new connection to the database.
     */
    public void connect() {
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@" + config.getHost() + ":" + config.getPort() + ":grok", config.getUsername(), config.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Executes a SQL query to the server
     *
     * @param query the string to be executed
     * @return result of the query
     */
    public Result execute(String query) {
        if (connection == null) {
            connect();
        }
        try {
            Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            return new Result(stmt.executeQuery(query));
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean addStudent(String firstname, String lastname, int studentId) {
        if (hasStudent(studentId)) {
            System.err.println("Student with that StudentID already exists!");
            return false;
        }
        String query = "INSERT INTO STUDENT(FIRST_NAME, LAST_NAME, STUDENT_ID) VALUES (" + quo(firstname)
                + ", " + quo(lastname) + ", " + studentId + ")";
        return execute(query) != null;
    }

    public boolean hasStudent(int studentId) {
        String query = "SELECT * FROM STUDENT WHERE STUDENT_ID = " + studentId;
        try {
            return execute(query).set().isBeforeFirst();
        } catch (Throwable e) {
            // e.printStackTrace();
        }
        return false;
    }

    public boolean removeStudent(int studentId) {
        if (!hasStudent(studentId)) {
            return false;
        }
        String query = "DELETE FROM STUDENT WHERE STUDENT_ID = " + studentId;
        return execute(query) != null;
    }

    //// NEW !!!!
    public boolean hasCourse(String course_code) {
        String query = "SELECT * FROM COURSE WHERE COURSE_CODE = " + quo(course_code);
        try {
            return execute(query).set().isBeforeFirst();
        } catch (Throwable e) {
            // e.printStackTrace();
        }
        return false;
    }

    public boolean addCourse(String course_code, String course_name, String course_desc, String exam, String room_num, String program_code, int teacher_id) {
        if (hasCourse(course_code)) {
            System.err.println("Course with that course code already exists!");
            return false;
        }
        String query = "INSERT INTO COURSE VALUES (" + quo(course_code) + com() + quo(course_name) + com() + quo(course_desc) + com() + quo(exam) + com() + quo(room_num) + com() + quo(program_code) + com() + teacher_id + ")";
        return execute(query) != null;
    }

    public boolean removeCourse(String course_code) {
        if (!hasCourse(course_code)) {
            return false;
        }
        String query = "DELETE FROM COURSE WHERE COURSE_CODE = " + quo(course_code);
        return execute(query) != null;
    }

    public boolean hasProgram(String programCode) {
        String query = "SELECT * FROM PROGRAM WHERE PROGRAM_CODE = " + quo(programCode);
        try {
            return execute(query).set().isBeforeFirst();
        } catch (Throwable e) {
            // e.printStackTrace();
        }
        return false;
    }

    public boolean addProgram(String program_code, String program_name) {
        if (hasProgram(program_code)) {
            System.err.println("Program already exists!");
            return false;
        }
        String query = "INSERT INTO PROGRAM VALUES (" + quo(program_code) + com() + quo(program_name) + ")";
        return execute(query) != null;
    }

    public boolean removeProgram(String programCode) {
        if (!hasProgram(programCode)) {
            return false;
        }
        String query = "DELETE FROM PROGRAM WHERE PROGRAM_CODE = " + quo(programCode);
        return execute(query) != null;
    }

    public boolean hasExam(String courseCode, String roomNumber, Timestamp start_time, Timestamp end_time, int numOfPeriods) {
        String query = "SELECT * FROM EXAM WHERE COURSE_CODE = " + quo(courseCode) + " AND ROOM_NUM = " + quo(roomNumber) + " AND START_TIME = " + start_time + " AND END_TIME = " + end_time +"  AND NUM_OF_PERIODS = "+numOfPeriods;
        try {
            return execute(query).set().isBeforeFirst();
        } catch (Throwable e) {
            // e.printStackTrace();
        }
        return false;
    }

    public Result getExamsForProgram(String courseCode) {
        String query =
                "SELECT E.COURSE_CODE, START_TIME, END_TIME " +
                        "FROM EXAM E, COURSE C, PROGRAM P " +
                        "WHERE E.COURSE_CODE = C.COURSE_CODE " +
                        "AND C.PROGRAM_CODE = P.PROGRAM_CODE " +
                        "AND P.PROGRAM_CODE = " + quo(courseCode);
        return execute(query);
    }

    public Result getExamsForRoom(String roomNum) {
        String query = "SELECT COURSE_CODE, START_TIME, END_TIME FROM EXAM WHERE ROOM_NUM =" + quo(roomNum);
        return execute(query);
    }

    public Result getExamsForTeacher(int teacherId) {
        String query = "SELECT E.COURSE_CODE, START_TIME, END_TIME FROM EXAM E, COURSE C WHERE E.COURSE_CODE = C.COURSE_CODE AND TEACHER_ID = " + teacherId;
        return execute(query);
    }

    public boolean addExam(String courseCode, String roomNumber, Timestamp start_time, Timestamp end_time, int numOfPeriods) {
        if (hasExam(courseCode, roomNumber, start_time, end_time, numOfPeriods)) {
            System.err.println("There is already an exam in that room!");
            return false;
        }
        String query = "INSERT INTO EXAM VALUES (" + quo(courseCode) + com() + quo(roomNumber) + com() + start_time + com() + end_time + com() + numOfPeriods + ")";
        return execute(query) != null;
    }

    public boolean removeExam(String courseCode, String roomNumber, Timestamp start_time, Timestamp end_time, int numOfPeriods) {
        if (!hasExam(courseCode, roomNumber, start_time, end_time, numOfPeriods)) {
            return false;
        }
        String query = "DELETE FROM EXAM WHERE COURSE_CODE = " + quo(courseCode) + " AND ROOM_NUM = " + quo(roomNumber) +" AND NUM_OF_PERIODS = "+numOfPeriods;
        return execute(query) != null;
    }

    public boolean hasRoom(String room_num, String room_desc) {
        String query = "SELECT * FROM ROOM WHERE ROOM_NUM = " + quo(room_num) + " AND ROOM_DESC = " + quo(room_desc);
        try {
            return execute(query).set().isBeforeFirst();
        } catch (Throwable e) {
            // e.printStackTrace();
        }
        return false;
    }

    public boolean addRoom(String room_num, String room_desc) {
        if (hasRoom(room_num, room_desc)) {
            System.err.println("That room already exists in the database!");
            return false;
        }
        String query = "INSERT INTO ROOM VALUES (" + quo(room_num) + com() + quo(room_desc) + ")";
        return execute(query) != null;
    }

    public boolean removeRoom(String room_num, String room_desc) {
        if (!hasRoom(room_num, room_desc)) {
            return false;
        }
        String query = "DELETE FROM ROOM WHERE ROOM_NUM = " + quo(room_num) + " AND ROOM_DESC = " + quo(room_desc);
        return execute(query) != null;
    }

    public boolean hasEnrollment(int student_id, String program_code) {
        String query = "SELECT * FROM ENROLLMENT WHERE STUDENT_ID = " + student_id + " AND PROGRAM_CODE = " + quo(program_code);
        try {
            return execute(query).set().isBeforeFirst();
        } catch (Throwable e) {
            // e.printStackTrace();
        }
        return false;
    }

    public boolean addEnrollment(int student_id, String program_code) {
        if (hasEnrollment(student_id, program_code)) {
            System.err.println("Duplicate enrollment!");
            return false;
        }
        String query = "INSERT INTO ENROLLMENT VALUES (" + student_id + com() + quo(program_code) + ")";
        return execute(query) != null;
    }

    public boolean removeEnrollment(int student_id, String program_code) {
        if (!hasEnrollment(student_id, program_code)) {
            return false;
        }
        String query = "DELETE FROM ENROLLMENT WHERE STUDENT_ID = " + student_id + " AND PROGRAM_CODE = " + quo(program_code);
        return execute(query) != null;
    }

    public boolean hasTeacher(int teacher_id) {
        String query = "SELECT * FROM TEACHER WHERE TEACHER_ID = " + teacher_id;
        try {
            return execute(query).set().isBeforeFirst();
        } catch (Throwable e) {
            // e.printStackTrace();
        }
        return false;
    }

    public boolean addTeacher(int teacher_id, String first_name, String last_name) {
        if (hasTeacher(teacher_id)) {
            System.err.println("That teacher already exists!");
            return false;
        }
        String query = "INSERT INTO TEACHER VALUES (" + teacher_id + com() + quo(first_name) + com() + quo(last_name) + ")";
        return execute(query) != null;
    }

    public boolean removeTeacher(int teacher_id) {
        if (!hasTeacher(teacher_id)) {
            return false;
        }
        String query = "DELETE FROM TEACHER WHERE TEACHER_ID = " + teacher_id;
        return execute(query) != null;
    }

    public boolean hasAdmin(int admin_id) {
        String query = "SELECT * FROM ADMIN WHERE ADMIN_ID = " + admin_id;
        try {
            return execute(query).set().isBeforeFirst();
        } catch (Throwable e) {
            // e.printStackTrace();
        }
        return false;
    }

    public boolean addAdmin(int admin_id, String first_name, String last_name) {
        if (hasAdmin(admin_id)) {
            System.err.println("That admin already exists!");
            return false;
        }
        String query = "INSERT INTO ADMIN VALUES (" + admin_id + com() + quo(first_name) + com() + quo(last_name) + ")";
        return execute(query) != null;
    }

    public boolean removeAdmin(int admin_id) {
        if (!hasAdmin(admin_id)) {
            return false;
        }
        String query = "DELETE FROM ADMIN WHERE ADMIN_ID = " + admin_id;
        return execute(query) != null;
    }

    public String quo(String s) {
        return "'" + s + "'";
    }

    public String com() {
        return ", ";
    }
}

