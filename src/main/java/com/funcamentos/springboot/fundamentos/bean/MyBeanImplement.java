package com.funcamentos.springboot.fundamentos.bean;

public class MyBeanImplement implements MyBean{

    @Override
    public void print() {
        System.out.println("Hola desde mi emplementacion propia de bean");
    }
}
