package com.demo.LamdaExpression;


interface A{
    void show(int i);
}
public class LamdaDemoTest {

        public static void main(String [] args){
            A obj;
            obj = i -> System.out.println("Hello "+ i);
            obj.show(6);
        }
    }


