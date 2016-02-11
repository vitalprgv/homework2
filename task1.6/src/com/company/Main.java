package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 40;
        int b = 45;
        System.out.println("Площадь прямоугольного теругольника с катетами "
                + a+" и "+ b+ " равна " +(a*b)/2);
        double c = Math.sqrt(a*a+b*b);
        System.out.println("Периметр прямоугольного теругольника с катетами "
                + a+" и "+ b+ " и гипотенузой " + (float) c+" равен " +(float)(a+b+c));
    }
}
