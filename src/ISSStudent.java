/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author conn6070
 */
public class ISSStudent {
    private String name, address;
    private int id;
         public ISSStudent (String n, String a, int i)
         {
             name = "null";
             address = "null";
             id = 0;
             
         }
         public int compareTo (Object o)
         {
        int difference = id - ((ISSStudent)o).getId();
        return difference;
         }
         public int getId()
         {
         return id;
         
         }
         public String ToString()
         {
             String str = "Name\t" + name;
             str +="\nAddress:\t" + address;
                str +="\nNumber:\t" + id;
                return str;
         }
         
             
         
}
