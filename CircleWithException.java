public class CircleWithException {
    private double radius = -1;

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        if(this.radius != -1) return Math.PI * Math.pow(this.radius, 2);
        else return 0;
    }
    public double getDiameter(){
        if(this.radius != -1) return this.radius * 2;
        else return 0;
    }

    public void setRadius(double radius) throws Exception, IllegalArgumentException{
        if(inputValid(radius))
            this.radius = radius;
    }

    private boolean inputValid(double radius) throws Exception, IllegalArgumentException{
        if(radius < 0) throw new IllegalArgumentException("Invalid radius; radius lesser than 0");
        else if(radius > 1000) throw new Exception("Invalid radius; radius bigger than 1000");
        return true;
    }
}