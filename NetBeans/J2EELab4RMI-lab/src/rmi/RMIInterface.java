
package rmi;
import java.rmi.*;
/**
 *
 * @author Mohammad
 */
public interface RMIInterface extends Remote {

    public void addcontact(String name,String phoneNo)throws RemoteException;

    public String getContactList()throws RemoteException;

    public String hello(String helloname)throws RemoteException;
}
