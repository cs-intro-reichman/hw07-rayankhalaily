/** Draws ths Sierpinski Triangle fractal. */
public class Sierpinski {
	
	public static void main(String[] args) {
		sierpinski(Integer.parseInt(args[0]));
	}
	
	// Draws a Sierpinski triangle of depth n on the standard canvass.
	public static void sierpinski (int n) {

    	StdDraw.clear();
    	StdDraw.setScale(0, 1);
    	double x1 = 0.0, y1 = 0.0;
	    double x2 = 1.0, y2 = 0.0;
    	double x3 = 0.5, y3 = Math.sqrt(3) / 2;

    sierpinski(n, x1, x2, x3, y1, y2, y3);
}
	private static void sierpinski(int n, double x1, double x2, double x3,
		 double y1, double y2, double y3) {
		
		if (n == 0) {
        	StdDraw.line(x1, y1, x2, y2);
        	StdDraw.line(x2, y2, x3, y3);
        	StdDraw.line(x3, y3, x1, y1);
        return;
		}
    	double mx12 = (x1 + x2) / 2;
    	double my12 = (y1 + y2) / 2;
    	double mx23 = (x2 + x3) / 2;
    	double my23 = (y2 + y3) / 2;
    	double mx31 = (x3 + x1) / 2;
    	double my31 = (y3 + y1) / 2;
    	sierpinski(n - 1, x1, y1, mx12, my12, mx31, my31);
    	sierpinski(n - 1, mx12, my12, x2, y2, mx23, my23);
		sierpinski(n - 1, mx31, my31, mx23, my23, x3, y3);
	}
}