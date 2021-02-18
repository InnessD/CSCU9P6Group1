package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application

public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
        Controller1 c1 = new Controller1(model, "Fisrt Controller", 40, 40); // Create first controller
        
        Controller2 c2 = new Controller2(model, "Second Controller", 40, 200); // Create second controller
        Controller2 c21 = new Controller2(model, "Third Controller", 40, 350); // Create third controller
        Controller2 c22 = new Controller2(model, "Fourth Controller", 40, 500);// Create fourth controller
        
    } // main
  
} // Main
