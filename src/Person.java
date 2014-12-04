/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author conn6070
 */
public class Person {
    String name;
    int age;
    
    public Person(String n, int a)
    {
        name = n;
        age = a;
    }
    public String toString()
    {
     return "name: " + name + "\t age: " + age;
     
    }
}
