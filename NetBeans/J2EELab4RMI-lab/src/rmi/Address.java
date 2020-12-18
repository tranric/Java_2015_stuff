
package rmi;

import java.io.Serializable;

/**
 *
 * @author Mohammad
 */

public class Address implements Serializable {
   private String name;
   private String phone;
   
   public Address(String name,String phone){
       this.name = name ;
       this.phone = phone;
   }
   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name=name;
   }
   public String getPhone(){
       return phone;
   }
   public void setPhone(String phone){
       this.phone= phone;
   }




}
