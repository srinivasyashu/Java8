package org.example;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

    public void test();

    // Can't have more than 1 Abstract method
  //  public void test1();

    public default void defaultMethod(){
        System.out.println("Default Method");
    }

    public static void staticMethod(){
        System.out.println("Static Method");
    }


}
