package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle();
        double P = rectangle.Per(1,2);
        System.out.println("rectangle P = " + P);
        P = rectangle.Per(4);
        System.out.println("rectangle1 P = " + P);
        rectangle.Move(15,6);
        rectangle.ShowCoordinate();
        Ellipse ellipse = new Ellipse();
        P = ellipse.Per(4,5);
        System.out.println("ellipse P = " + P);
        ellipse.ShowCoordinate();
        ellipse.Move(2,5);
        ellipse.ShowCoordinate();
        ellipse.MoveX(5.16);
        ellipse.ShowCoordinate();
        Circle circle = new Circle();
        double P1 = circle.Per(3,3);
        double P2 = circle.Per(3);
        System.out.println("circle formula 1 P = " + P1);
        System.out.println("circle formula 2 P = " + P2);



    }
}
class Rectangle extends Figure{


    double Per(double a, double b){
        return 2 * (a+b);
    }
    double Per(double a){
        return 4*a;
    }
}

class Ellipse extends Figure{
    double Per(double a, double b){
        double P = 4*((Math.PI*a*b + Math.pow(a-b,2))/(a+b));
            return P;
    }

}
class Circle extends Ellipse{
    double Per(double r){
        return 2*Math.PI*r;
    }
}