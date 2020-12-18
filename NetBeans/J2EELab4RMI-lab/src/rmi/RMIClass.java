package rmi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
/**
 *
 * @author Mohammad
 */
public class RMIClass extends UnicastRemoteObject implements ?{

    public RMIClass() throws RemoteException{super();}

     String filename = "d:\\temp\\address.txt";
     ArrayList<Address> addlist = new ArrayList<Address>();
    
    public String hello(String helloname)throws RemoteException{
       return "hello"+ helloname;
    }

    public void addcontact(String name, String phoneNo) throws RemoteException {
        Address address = new Address(name,phoneNo);
        addlist.add(address);
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try{
            fos= new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(addlist);
            out.close();
            System.out.println("write to file");
        }catch(IOException ex){
            ex.printStackTrace();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public String getContactList() throws RemoteException {
        String returnstring="";
        FileInputStream fis = null;
        ObjectInputStream in = null;
        
        try{
            fis= new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            addlist = (ArrayList)in.readObject();
            in.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }

        for (Address a:addlist){
            returnstring+=(a.getName()+" "+a.getPhone())+"\n";
        }

        return returnstring ;

    }

}
