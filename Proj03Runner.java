// Victoria Brown
// 02/24/2016
// Proj02Runner.java

import java.awt.*;
import javax.swing.JFrame;

public class Proj03Runner <Frame> {
  
  private Frame thisFrame;
  
  // Constructor to initialize the parameter passed to this class when instantiated
  public Proj03Runner(Frame f) {
    thisFrame = f;
  }
  
  // Method runit that takes parameter that was passed and prints out what class it is
  public void runIt() {
    System.out.println("Victoria Brown");
    System.out.println(thisFrame.getClass());
  } 
}