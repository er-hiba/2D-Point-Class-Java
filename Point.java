public class Point {
    private double xCoordinate;
    private double yCoordinate;

    // Default constructor
    public Point() {
        this.xCoordinate = 0;
        this.yCoordinate = 0;
    }

    // Constructor with parameters
    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    // Getter methods
    public double get_x_coordinate() {
        return this.xCoordinate;
    }

    public double get_y_coordinate() {
        return this.yCoordinate;
    }

    // Setter methods
    public void set_x_coordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void set_y_coordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    // Method to calculate distance between two points
    public double distance(Point otherPoint) {
        double x = otherPoint.get_x_coordinate();
        double y = otherPoint.get_y_coordinate();
        double a = this.xCoordinate;
        double b = this.yCoordinate;

        double distance = Math.pow(Math.pow(a - x, 2) + Math.pow(b - y, 2), 0.5);

        return distance;
    }

    // Method to calculate the distance from the origin
    public double norm() {
        double a = this.xCoordinate;
        double b = this.yCoordinate;

        double distance = Math.pow(a * a + b * b, 0.5);

        return distance;
    }

    // Main program
  
    public static void main(String[] args) {
        // Create 3 points using the default constructor (default x and y coordinates are 0)
        Point point1 = new Point();
        Point point2 = new Point();
        Point point3 = new Point();

        // Change the attributes of points 2 and 3
        point2.set_x_coordinate(5);
        point2.set_y_coordinate(6);

        point3.set_x_coordinate(4);
        point3.set_y_coordinate(8);

        // Display Point 1
        System.out.println("- Point 1:");
        System.out.println("X Coordinate: " + point1.get_x_coordinate());
        System.out.println("Y Coordinate: " + point1.get_y_coordinate());

        // Display Point 2
        System.out.println("\n- Point 2:");
        System.out.println("X Coordinate: " + point2.get_x_coordinate());
        System.out.println("Y Coordinate: " + point2.get_y_coordinate());

        // Display Point 3
        System.out.println("\n- Point 3:");
        System.out.println("X Coordinate: " + point3.get_x_coordinate());
        System.out.println("Y Coordinate: " + point3.get_y_coordinate());

        // Calculate and display distance between Point 2 and Point 3
        System.out.println("\n- The distance between point 2 and point 3: " + point3.distance(point2));

        // Calculate and display distance between Point 2 and the origin
        System.out.println("\n- The distance between point 2 and the origin of the coordinate system: " + point2.norm());
    }
}
