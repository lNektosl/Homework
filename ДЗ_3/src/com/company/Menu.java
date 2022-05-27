package com.company;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        String[] menu = new String[]{"Драники","Печёный картофель","Овощное рагу","Бобовый буррито","Вегетарианские бургеры","«Пустой» суп","Луковые кольца","Жареный минтай","Сырники","Курица на соли"};
        for(int m = 0; m<10 ;m++) System.out.println(m + 1+". " + menu[m]);

        System.out.println("Введите номер блюда");
        var i = c.nextInt();
        i=i-1;
        if(i<=10 && i>=0){
                System.out.println("Вы выбрали "+"'"+menu[i]+"'");
        }
        else System.out.println("Такого блюда нет!");
    }
}
