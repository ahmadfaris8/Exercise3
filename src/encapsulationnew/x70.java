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
public class x70 extends proton {
    private String autoDrive;
    private String name;   //encapsulation
    
    x70(){
        this.autoDrive = "Auto driving assist ";
    }
    
    public void printAutoDriving(){
        System.out.println("X70 Features : " + autoDrive);
    }
    
    public void setName(String newName){   //setter
        name = newName;
    }
    
    public String getName(){   //getter
        return name;
    }
    
    void run(){
        System.out.println("X70 is running good ! ");
    }
    
    void color(String c1, String c2, String c3, String c4){
        System.out.println(c1 + c2 + c3 + c4);   
    }
    
}
