class Space {
    int x, y, z;
    Space() {
        x = 0;
        y = 0;
        z = 0;
    }
    Space(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    void setPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    void displayPoint() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }
    double getDistance(Space p) {
        return Math.sqrt((p.x - x) * (p.x - x) + (p.y - y) * (p.y - y) + (p.z - z) * (p.z - z));
    }
}

public class lab6_6 {
    public static void main(String[] args) {
        Space p1 = new Space();
        Space p2 = new Space(2, 4, 5);

        System.out.print("Point 1: ");
        p1.displayPoint();

        System.out.print("Point 2: ");
        p2.displayPoint();

        double distance = p1.getDistance(p2);
        System.out.println("Distance between two points: " + distance);
    }
}