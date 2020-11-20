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
public class saga extends proton {
    private String fuel;
    private String name;   //encapsulation
    
    saga(){
        this.fuel = "Fuel consumption ";
    }
    
    public void printFuel(){
        System.out.println("Saga Features : " + fuel);
    }
    
    public void setName(String newName){   //setter
        name = newName;
    }
    
    public String getName(){   //getter
        return name;
    }
    
    void run(){
        System.out.println("Saga is running good !");
         super.run();
    }
    
    void color(String c1, String c2, String c3, String c4){
        System.out.println(c1 + c2 + c3 + c4);   
    }
    
    
}

