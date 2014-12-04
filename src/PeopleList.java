
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author conn6070
 */
public class PeopleList {

   
    public static void main(String[] args) {
       ArrayList people = new ArrayList();
       Person p = new Person("Bob", 32);
       people.add(p);
       people.add(new Person("John", 25));
       //add cindy to front of the line  
       people.add(0,new Person("Cindy", 7));
       for (int x=0; x<people.size(); x++)
       {
           p = (Person) people.get(x);
           System.out.println(p);
       }
       
    }
    
}
