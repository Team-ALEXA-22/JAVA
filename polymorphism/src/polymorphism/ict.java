/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;


public class ict {
    String name;
    String course;
    void learn(){
        System.out.println(name+" provides "+course+" course for free.");
    }
    void learn(int days){
        System.out.println(name+" provides "+course+" course for free for "+days+" days.");
    }
}
