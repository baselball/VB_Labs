public class Point3d {

    private double xCoord;

    private double yCoord;

    private double zCoord; 


    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public Point3d() {
        
        this (0, 0, 0);
    }

    public double getX() {
        return xCoord;
    }

    public double getY() {
        return yCoord;
    }

    public double getZ() {
        return zCoord;
    }

    public void setX(double val) {
        xCoord = val;
    }

    public void setY(double val) {
        yCoord = val;
    }

    public void setZ(double val) {
        zCoord = val;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Point3d) {
            Point3d other = (Point3d) obj;
            if (xCoord == other.getX() &&
                yCoord == other.getY() &&
                zCoord == other.getZ()) {
                return true;
            }
        }
        
        return false;
    }

    public double distanceTo(Point3d other_point) {
        return Math.sqrt(Math.pow(xCoord - other_point.getX(), 2) + 
        Math.pow(yCoord - other_point.getY(), 2) + 
        Math.pow(zCoord - other_point.getZ(), 2));
    }
}