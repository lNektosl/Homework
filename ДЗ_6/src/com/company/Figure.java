package com.company;

public class Figure {
    double x = 0;
    double y = 0;
    double Per(){
        return 0;
    }
    void Move(double x, double y){
        this.x = x;
        this.y = y;
    }
    void MoveX(double x){
        this.x = x;
    }
    void MoveY(double y){
        this.y = y;
    }
    void ShowCoordinate() {
        System.out.printf("\nx: %s\ny: %s\n%n", x, y);
    }
}
