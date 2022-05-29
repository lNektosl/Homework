package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        System.out.println("");
        dog1.sayHello();
        System.out.println("_______________________________");
        Dog dog2 = new Dog("Johan","M");
        dog2.sayHello();
        System.out.println("_______________________________");
        Dog dog3 = new Dog(16,"Snowball",3,"M","English bulldog");
        dog3.sayAge();
        dog3.change(4);
        dog3.sayAge();
        System.out.println("_______________________________");
        dog3.change("Martin", 3);
        dog3.sayHello();
        dog3.sayAge();
        System.out.println("_______________________________");
        Dog dog4 = new Dog("Charcoal","M");
        dog4.sayHello();
        dog4.change("Snow-white");
        dog4.sayHello();
        dog4.change("Chilly-pepper","F");
        dog4.sayHello();

    }
//  ДЗ-5  Добавить в созданный класс Собака поля пол, возраст, порода. Создать несколько конструкторов в данном классе с различными вариантами параметров,
//  создать несколько перегруженных методов change с различными вариантами и количеством параметров,
//  создать несколько объектов данного класса согласны разным конструкторам и продемонстрировать работу методов в методе main

}
     class Dog{
         private String name;
         private int weight;
         private String sex;
         private int age;
         private String specie;

         public Dog(){
             this.name = "Mabel";
             this.weight = 15;
             this.age = 2;
             this.sex = "F";
             this.specie = "Samoyed";
         }

        public Dog(int weight, String name, int age,String sex, String specie){
            this.weight = weight;
            this.name = name;
            this.sex= sex;
            this.age = age;
            this.specie = specie;
        }
        public Dog(String name, String sex, int age){
            this.name = name;
            this.sex= sex;
            this.age = age;
        }
        public Dog(String name, String sex){
            this.name = name;
            this.sex= sex;
        }
        public Dog(String name){
             this.name=name;
        }
        void sayHello(){
             if (sex == "F")
             System.out.println("Hello! My name is " + name +" I'm a good girl!");
             else {
                 System.out.println("Hello! My name is " + name + " I'm a good boy!");
             }
        }
        void sayAge(){
            System.out.println("I'm " + age);
        }

        void change(String name){
             this.name = name;
        }
        void change(int age){
             this.age=age;
        }
       void change(String name,String sex){
             this.name=name;
             this.sex=sex;
       }
       void change(String name, int age){
             this.name=name;
             this.age=age;
       }

        int grow (int i){
          int totalWeight = weight + i;
          return totalWeight;
        }
    }

