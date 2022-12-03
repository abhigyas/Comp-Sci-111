/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author:
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {
        double [] arr = new double[array.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = array[i];
        }
        return arr;
	// WRITE YOUR CODE HERE
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] * alpha;
        }
        for (int i = 0; i < y.length; i++) {
            y[i] = y[i] * alpha;
        }
	// WRITE YOUR CODE HERE
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i]+dx;
        }
        for (int i = 0; i < y.length; i++) {
            y[i] = y[i]+dy;
        }
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {
        double[] temp = copy(x);
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] * Math.cos(Math.toRadians(theta)) - y[i] * Math.sin(Math.toRadians(theta));
        }
        for (int i = 0; i < y.length; i++) {
            y[i] = y[i] * Math.cos(Math.toRadians(theta)) + temp[i] * Math.sin(Math.toRadians(theta));
        }
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {
// Translates polygon by (2, 1).
StdDraw.setScale(-5.0, +5.0); 
double[] x = { 0, 1, 1, 0 }; 
double[] y = { 0, 0, 2, 1 }; 
double dx = 2.0, dy = 1.0; 
StdDraw.setPenColor(StdDraw.RED); 
StdDraw.polygon(x, y); 
translate(x, y, dx, dy); 
StdDraw.setPenColor(StdDraw.BLUE);
StdDraw.polygon(x, y);

	// WRITE YOUR CODE HERE
    }
}
