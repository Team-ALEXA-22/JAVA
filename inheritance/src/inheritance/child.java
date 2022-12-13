/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author ABINESH JAIN A J
 */
class parent{
    String Name;
    void Details(){
        System.out.println(Name+" ia a parent.");
    }
    void character(){
        System.out.println(Name+" is Strict.");
    }
}
public class child extends parent{
    String name;
    String gender;
    void details(){
        System.out.println(name+" is a "+gender);
    } 
}
