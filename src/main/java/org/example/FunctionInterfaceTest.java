package org.example;

import java.lang.annotation.Annotation;

public class FunctionInterfaceTest implements FunctionalInterface{
    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

  //  @Override
    public  void defaultMethod(){
        System.out.println("Default Method");
    }


}
