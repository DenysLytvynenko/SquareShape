package ua.go.java;

/**
 * Created by Litvinenko on 12.01.2016.
 */
public class SquareShape {

    public static void main(String[] args){
        if (args.length == 0) {
            System.out.printf("Parameters are needed\n");
            return;
        }
        else if (( !args[0].equals("3") && args.length < 3 ) ||
             ( args[0].equals("3") && args.length < 2 )
                ){
            System.out.printf("Usage: SquareShape Rectangle first_side second_side,\n " +
                    "Triangle 2 first_side second_side,\n" +
                    "Circle 3 radius\n");
            return;
        }

        int counter = 0;
        for (String param:args){
            System.out.printf("args[%d]: %s\n", counter, param);
            counter++;
        }

        FigureParam fParam = new FigureParam();

        Figure rectangle = new Rectangle();
        Figure triagle = new Triangle();
        Figure circle = new Circle();

        switch ( Integer.parseInt(args[0]) ){
            case 1:
                fParam.setSideFirst(Double.parseDouble(args[1]));
                fParam.setSideSecond(Double.parseDouble(args[2]));
                System.out.printf("Rectangle square is: %f", rectangle.calculateSquare(fParam));
                break;
            case 2:
                fParam.setSideFirst(Double.parseDouble(args[1]));
                fParam.setSideSecond(Double.parseDouble(args[2]));
                System.out.printf("Triangle square is: %f", triagle.calculateSquare(fParam));
                break;
            case 3:
                fParam.setRadius(Double.parseDouble(args[1]));
                System.out.printf("Circle square is: %f", circle.calculateSquare(fParam));
                break;
            default:
                System.out.println("Unknown figure type");
        }



    }




}
