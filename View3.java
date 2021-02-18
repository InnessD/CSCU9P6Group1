package mvcexample;

// This is the yellow view.
// It displays the A component of the model (data base).
// As supplied, this view does not subscribe to the model as an Observer,
// and relies on its controller to call update to cause the view to be refreshed.

import java.util.*;  // For Observer
import java.awt.*;
import javax.swing.*;

public class View3 extends JPanel implements Observer{
  
    private Model model;
    private Controller2 contr;   // Parent Frame
    
    private JTextField display;
    
    private boolean componentDisplay = true;
    
    // Constructor
    public View3(Controller2 contr, Model model, String name) {
        
        // Record references to the parent controller and the model
        this.contr = contr;
        this.model = model;
        
        
        
        // Set up view GUI
        setBackground(Color.yellow);
        add(new JLabel("View3"));
        display = new JTextField("No data", 15);
        add(display);
        
        if(!name.equalsIgnoreCase("Fourth Controller")){
            // Subscribe to the model
            model.addObserver(this);
        }
        
    } // constructor
    
    // Called by controller to refresh the view:
    public void update() {
        
        // Fetch (potentially) updated information and display it
        int a = model.getDataA();
        display.setText("Model data A: " + a);
      
    } // update
    
    // Called by the controller to clear the view:
    public void clear() {
        
        display.setText("");
      
    } // clear

    @Override
    public void update(Observable o, Object arg) {
        // Fetch (potentially) updated information and display it
        int a = model.getDataA();
        display.setText("Model data A: " + a);
        
        
    }

    public void update(boolean receivedInputButton) {
        
        if(receivedInputButton == true){
            // Fetch (potentially) updated information and display it
            //display.setText("");
            int a = model.getDataA();
            display.setText("Model data A: " + a);
        }else if (receivedInputButton == false){
            //display.setText("");
            int b = model.getDataB();
            display.setText("Model data B: " + b);
        }
        
    }
  
} // class View3




