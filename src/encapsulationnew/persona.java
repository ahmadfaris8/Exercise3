/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationnew;

/**
 *
 * @author user
 */
public class persona extends proton {
    private String boot;
    private String name;   //encapsulation
    String radio;
    
    persona(){
        this.boot = "Bigger boot ";
    }
    
    public void printBoot(){
        System.out.println("Persona Features : " + boot);
    }
    
    public void setName(String newName){   //setter
        name = newName;
    }
    
    public String getName(){   //getter
        return name;
    }
    
    public void setRadio(String myradio){
        this.radio = myradio;
    }
    
    public String getRadio(){
        return radio;
    }
    
    
    
    void run(){
        System.out.println("Persona is running good ! ");  
    }
    
    void color(String c1, String c2, String c3, String c4){
        System.out.println(c1 + c2 + c3 + c4);   
    }
    
}
