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
public class proton {
    private String brand;
    private String window;
    private String headlight;
    private int tyre;
    
    proton(){
        brand = "Bridgestone";
        tyre = 19;
    }
    proton(String w, String h){
        window = w;
        headlight = h;
    }
    
    public void printProton(){
        proton obj1 = new proton();
        proton obj2 = new proton("Up","On");
        proton obj3 = new proton("Down","Off");
        
        System.out.println("Tyre brand : "+obj1.brand+"\nTyre size : "+obj1.tyre);
        System.out.println("Window : "+obj2.window+"\nHeadlight : "+obj2.headlight);
        System.out.println("Window : "+obj3.window+"\nHeadlight : "+obj3.headlight);
        
    }
    void run(){
        System.out.println("Good value for money!!! ");
    }
    
}
