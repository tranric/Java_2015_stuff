import java.util.Arrays;
public class Planets {
	private String planetName;
	private String surface;
	private double orbitDays;
	private boolean megneticField;
	private int moons;
	private double diameter;
/*Here the diameters have been added to an array, 
the goal is to have a loop sort these by size. 
Later the other information on the planets shall 
be obtained through a case statement.*/
	private int[] arrayDiameter;
	
	public void getDiameters(){
//Sorting the array so that the planets are in the right order
		arrayDiameter = new int[8];
		arrayDiameter[0] = 4879;
		arrayDiameter[1] = 12104;
		arrayDiameter[2] = 12756;
		arrayDiameter[3] = 6792;
		arrayDiameter[4] = 142984;
		arrayDiameter[5] = 120536;
		arrayDiameter[6] = 51118;
		arrayDiameter[7] = 49528;
		Arrays.sort(arrayDiameter); //This will sort the planets by their diameter
	
		for (int i = 0; i<arrayDiameter.length;i++){
			diameter=arrayDiameter[i];
			getCase();
			getDrawCase();
			}
		}
	public void getCase(){
/*Here are all the informations about the planets.
The planets have been listed in the order of distance
from the sun. In the getDiameters() field, the value
diameter=arrayDiameter[i]; has been set. This means
that the ordered planets shall be the value i. The
diameter will then equal the same as the value of i 
so that the other information can also be changed. 
This will continue throughout the for loop in the 
getDiameters() field.
*/
		if (diameter==4879){
			planetName="MERCURY";
			surface="TERRESTRIAL";
			orbitDays=88;
			megneticField=true;
			moons=0;
			}
		if (diameter==12104){
			planetName="VENUS";
			surface="TERRESTRIAL";
			orbitDays=224.7;
			megneticField=false;
			moons=0;
			}
		if (diameter==12756){
			planetName="EARTH";
			surface="TERRESTRIAL";
			orbitDays=365.2;
			megneticField=true;
			moons=1;
			}
		if (diameter==6792){
			planetName="MARS";
			surface="TERRESTRIAL";
			orbitDays=687;
			megneticField=false;
			moons=2;
			}
		if (diameter==142984){
			planetName="JUPITER";
			surface="GASEOUS";
			orbitDays=4331;
			megneticField=true;
			moons=67;
			}
		if (diameter==120536){
			planetName="SATURN";
			surface="GASEOUS";
			orbitDays=10747;
			megneticField=true;
			moons=62;
			}
		if (diameter==51118){
			planetName="URANUS (GEORGE)";
			surface="GASEOUS";
			orbitDays=30589;
			megneticField=true;
			moons=27;
			}
		if (diameter==49528){
			planetName="NEPTUNE";
			surface="GASEOUS";
			orbitDays=59800;
			megneticField=true;
			moons=14;
			}
		}
	public void getDrawCase(){
/*Here the new values are being written. This field 
called right after the getCase() field in the for 
loop. Each time the getCase() field is called, the
planet values will change, hens the getDrawCase()
will be called to write down the new values while
keeping record of the values printed on the screen.
*/
		System.out.println("NAME:\t\t\t"+planetName);
		System.out.println("SURFACE TYPE:\t\t"+surface);
		System.out.println("LENGTH OF ORBIT:\t"+orbitDays);
		System.out.println("DIAMETER:\t\t"+diameter);
		System.out.println("GLOBAL MEGNETIC FIELD:\t"+megneticField);
		if (moons>=1){
			System.out.println("NUMBER OF MOONS:\t"+moons);
		}
		System.out.println("");
	}
}