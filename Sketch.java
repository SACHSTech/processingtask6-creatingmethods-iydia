import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * Assignment: 5.7 Processing Task 6 - Creating Methods
   * Author: Lydia He
   * Date: Sun Apr 10, 2022
   * Description: Draws a composite object at various locations specified by a method with parameters and a return value
   */
  
  public void settings() {
    // Set size of drawing
    int width = 500;
    int height = 500;
    size(width, height);
  }
  
  public void setup() {
    // Initialize setup values that will be consistent throughout the code
    background(0);
  }

  public void draw() {
    // composite objects of different size, location and colours
    // rainbows
    drawRainbow(130, 150, 180, 100, 100, 100);
    drawRainbow(100, 200, 120, 0, 200, 150);
    drawRainbow(350, 350, 130, 100, 100, 100);
    drawRainbow(380, 100, 140, 50, 120, 255);

    // clouds
    drawCloud(100, 380, 70, 150);
    drawCloud(380, 400, 60, 255);
    drawCloud(250, 250, 50, 255);
  }

  /**
  * define method 1: rainbows
  * 
  * @param rainbowX is the x-location of the rainbow arch
  * @param rainbowX is the y-location of the rainbow arch
  * @param rainbowRadius is the radius of the rainbow arch
  * @param r is red in RGB colouring
  * @param g is green in RGB colouring
  * @param b is blue in RGB colouring
  */

  private void drawRainbow(float rainbowX, float rainbowY, float rainbowRadius, float r, float g, float b) {
    // Red arc
    stroke(r + 155, g - 100, b - 100);
    fill(r + 155, g - 100, b - 100);
    ellipse(rainbowX, rainbowY, rainbowRadius, rainbowRadius); 

    // Orange arc
    stroke(r + 155, g + 30, b - 100);
    fill(r + 155, g + 30, b - 100);
    ellipse(rainbowX, rainbowY, rainbowRadius - 20, rainbowRadius - 20);

    // Yellow arc
    stroke(r + 155, g + 110, b - 100);
    fill(r + 155, g + 110, b - 100);
    ellipse(rainbowX, rainbowY, rainbowRadius - 40, rainbowRadius - 40);
    
    // Green arc
    stroke(100, 200, 0);
    fill(100, 200, 0);
    ellipse(rainbowX, rainbowY, rainbowRadius - 60, rainbowRadius - 60);
    
    // Blue arc
    stroke(0, 190, 250);
    fill(0, 190, 250);
    ellipse(rainbowX, rainbowY, rainbowRadius - 80, rainbowRadius - 80);
    
    // Purple arc
    stroke(100, 100, 255);
    fill(100, 100, 255);
    ellipse(rainbowX, rainbowY, rainbowRadius - 100, rainbowRadius - 100);

    // Cut rainbow in half
    stroke(0);
    fill(0);
    rect(rainbowX - rainbowRadius, rainbowY, rainbowRadius * 2, rainbowRadius);
  }

  /**
  * define method 2: clouds
  * 
  * @param cloudX is the x-location of the left-most cloud
  * @param cloudY is the y-location of the left-most cloud
  * @param cloudRadius is the radius of the left-most cloud
  * @param cloudRgb defines the colour of the cloud
  */

  private void drawCloud(float cloudX, float cloudY, float cloudRadius, float cloudRgb) {

    // draw cloud
    stroke(cloudRgb);
    fill(cloudRgb);
    ellipse(cloudX, cloudY, cloudRadius, cloudRadius);
    ellipse(cloudX + 35, cloudY, cloudRadius - 6, cloudRadius - 6);
    ellipse(cloudX + 65, cloudY, cloudRadius - 12, cloudRadius - 12);
    
    // if the cloud is 50 in diameter, draw it to the middle of the screen
    if (cloudRadius == 50) {
      drawCloud(width / 2, height / 2, 50, 255);
      return;
    }

  }
}