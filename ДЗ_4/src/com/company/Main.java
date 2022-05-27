package com.company;

public class Main {

    public static void main(String[] args) {
        dog dog1 = new dog(17, "Josh");
        dog1.sayHello();
        dog dog2 = new dog(13,"Snow-white");
        int totalWeight = dog2.Grow(5);
        System.out.println("My new weight " + totalWeight);
        dog dog3 = new dog();
        dog3.sayHello();
    }


}
     class dog{
         public String name;
         public int weight;

         public dog(){
             this.name = "Mabel";
             this.weight = 15;
         }

        public dog(int weight, String name){
            this.weight = weight;
            this.name = name;
        }
        void sayHello(){
             System.out.println("Hello! My name is " + name + " and my weight is " + weight);
        }

        int Grow (int i){
          int totalWeight = weight + i;
          return totalWeight;
        }
    }

