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
public class mainProton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona p = new persona();
        saga s = new saga();
        x70 p1 = new x70();
        x50 p2 = new x50();
        
        p.setName("Persona ");
        s.setName("Saga ");
        p1.setName("X70 ");
        p2.setName("X50 ");
        
        System.out.println("Proton " + p.getName());
        p.printBoot();
        p.printProton();
        p.radio = "Radio : Sony ";
        System.out.println(p.getRadio());
        p.color("Available color : Silver" , ", Red", ", Brown", ", Purple");
        p.run();
        
        System.out.println();
        System.out.println("Proton " + s.getName());
        s.printFuel();
        s.printProton();
        s.color("Available color : Silver" , ", Red", ", Grey", ", Black Yellow");
        s.run();
        
        System.out.println();
        System.out.println("Proton " + p1.getName());
        p1.printAutoDriving();
        p1.printProton();
        p1.color("Available color : Silver" , ", Red", ", Grey", ", Black");
        p1.run();
        
        System.out.println();
        System.out.println("Proton " + p2.getName());
        p2.printAutoParking();
        p2.printProton();
        p2.color("Available color : Silver" , ", Red", ", Blue", ", Orange");
        p2.run();
        
    }
    
}
