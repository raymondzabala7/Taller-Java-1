package com.taller.practico;

// Sección 1: Calentamiento de operadores
public class Main {
    public static void main(String[] args) {
        { int seg = 86400 % 3600; System.out.println("seg = " + seg); }
        { int x = 7; int y = ++x + x++; System.out.println("y = " + y + ", x = " + x); }
        { double div1 = 15 / 2; double div2 = 15.0 / 2;
          System.out.println("div1 = " + div1 + ", div2 = " + div2); }
        { int x = 7; boolean flag = false; boolean res = flag && (++x > 0);
          System.out.println("res = " + res + ", x = " + x); }
    }
}
