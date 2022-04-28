package com.funcamentos.springboot.fundamentos.bean;

public class MyBeanWithDependencyImplements implements MyBeanWithDependency{

    private MyOperation myOperation;

    public MyBeanWithDependencyImplements(MyOperation myOperation){
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero=1;
        System.out.println(myOperation.sum(numero));
        System.out.println("hola desde la implementacion de un bean con dependencia");
    }
}
