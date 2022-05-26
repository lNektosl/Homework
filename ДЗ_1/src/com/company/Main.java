package com.company;

public class Main {

    public static void main(String[] args) {
	int[] Numb;
    Numb=new int[10];
    var i=0;
    do{
        Numb[i]=i;
        i++;
    }while(i<10);
    System.out.println(Numb.length + " - Длина Массива");
    System.out.println("_______________________________");
    System.out.println("Значения массива:");
    for (i = 0;i<Numb.length;i++ ){
        System.out.println(Numb[i]);
         }
    }
}
