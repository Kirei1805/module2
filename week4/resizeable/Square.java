package week4.resizeable;

public class Square extends Rectangle {
    public Square(double side){
        super(side, side);
    }
    @Override
    public void resize(double percent){
        super.resize(percent);
    }
}
