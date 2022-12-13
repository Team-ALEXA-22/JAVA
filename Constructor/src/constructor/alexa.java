/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructor;

/**
 *
 * @author ABINESH JAIN A J
 */
public class alexa {
    String name;
    int members;
    void details(){
        System.out.println(name+" has "+members+" members.");
    }
    alexa(){
        name="Team ALEXA";
        members=5;
    }
    alexa(int i){
        name="Team TIGERS";
        members=6;
    }
}
