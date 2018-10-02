public class Coordinate {

    public static void main(String[] args) {
        Coordinate c1 = new Coordinate(5,7);
        Coordinate c2 = new Coordinate(2,3);

        System.out.println(c1.distanceTo(c2));
        System.out.println(c2.distanceToOrigin());
        c1.interchange(c2);
        System.out.println(c1.distanceToOrigin());
    }

    static final double origin = 0;
    public double x;
    public double y;

    Coordinate(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distanceToOrigin(){
        return Math.sqrt((this.x-origin)*(this.x-origin) + (this.y-origin)*(this.y-origin));
    }

    public double distanceTo(Coordinate c){
        return Math.sqrt((this.x-c.x)*(this.x-c.x) + (this.y-c.y)*(this.y-c.y));
    }

    public void interchange(Coordinate c){
        double tempX = c.x;
        double tempY = c.y;

        c.x = this.x;
        c.y = this.y;

        this.x = tempX;
        this.y = tempY;
    }

    public boolean equals(Coordinate c){
        if(c.x == this.x && c.y == this.y){
            return true;
        }else{
            return false;
        }
    }

}
