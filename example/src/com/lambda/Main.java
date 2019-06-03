package com.lambda;

public class Main
{
    //sdk - software development kit
    //jdk - java development kit (is a sdk specifically for java
    public static void main(String[] args)
    {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
        System.out.println(greeter.sayHello("Lambda"));
    }
}
