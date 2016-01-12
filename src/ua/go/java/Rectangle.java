package ua.go.java;

/**
 * Created by Litvinenko on 12.01.2016.
 */
public class Rectangle extends Figure {


    @Override
    public double calculateSquare(FigureParam param){

        return param.getSideFirst() * param.getSideSecond()/2;
    }
}
