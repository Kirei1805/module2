package week4.resizeable;

public  class Circle implements Resizeable {
    private double radius;
    public Circle (double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public void resize(double percent){
        radius += radius * percent/100;
    }
}
