package ua.go.java;

/**
 * Created by Litvinenko on 12.01.2016.
 */
public class Circle extends Figure {
    @Override
    public double calculateSquare(FigureParam param) {
        return Math.PI*Math.pow(param.getRadius(), 2);
    }
}
