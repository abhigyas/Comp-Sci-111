public class RandomWalker {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        System.out.println("(" + x + "," + y + ")");
        for (int i = 0; i < n - 1; i++) {
            double direction = Math.random();
            if (direction < 0.25) {
                x++; // move east
            } else if (direction < 0.5) {
                y++; // move north
            } else if (direction < 0.75) {
                y--; // move south
            } else if (direction < 1.0) {
                x--; // move west
            }
            System.out.println("(" + x + "," + y + ")");
        }
        double x2 = x*x;
        double y2 = y*y;
        System.out.println("Squared Distance = " + ((x2+y2)));
    }
}
