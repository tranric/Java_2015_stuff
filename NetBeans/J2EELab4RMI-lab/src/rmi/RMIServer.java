package rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Mohammad
 */

public class RMIServer {

    public static void main(String[] args){
        try{
            LocateRegistry.createRegistry(?); //You need the default port number
            
            RMIInterface obj = new ?();

            Naming.rebind("rmi://localhost/HelloServer", obj);
            System.out.println("server is ready!");

        }
        catch (Exception e){
             System.out.println("Server is failed:"+e);
        }
    }

}
