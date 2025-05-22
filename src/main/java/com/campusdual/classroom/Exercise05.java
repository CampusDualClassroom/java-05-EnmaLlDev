package com.campusdual.classroom;

public class Exercise05 {
    public static void main(String[] args) {
        checkLessOrGreaterEqual(5,20);
        checkLessOrGreaterEqual(20,5);
        checkMultiply(5, 5);
        checkMultiply(5, 1);
        checkPositiveNegative(-5);
        checkPositiveNegative(5);
    }

    //TODO ↓
    // Si el valor es menor, tiene que devolver el siguiente mensaje: X es menor que Y
    // Si el valor es mayor o igual, tiene que devolver el siguiente mensaje: X es mayor o igual que Y
    public static void checkLessOrGreaterEqual(int n1, int n2) {
        int x = n1, y = n2;
        if(x < y) {
            System.out.println(x + " es menor que " + y);
        } else {
            System.out.println(x + " es mayor o igual que " + y);
        }
    }

    //TODO ↓
    // Si es múltiplo, tiene que devolver el siguiente mensaje: X es múltiplo de Y
    // Si no es múltiplo, tiene que devolver el siguiente mensaje: X no es múltiplo de Y
    public static void checkMultiply(int n1, int n2) {
        int x = n1, y = n2;

        if (x % y == 0) {
            System.out.println(x + " es multiplo de " + y);
        } else {
            System.out.println(x + " no es multiplo de " + y);
        }
    }

    //TODO ↓
    // Si es negativo, tiene que devolver el siguiente mensaje: X es negativo.
    // Si es positivo o cero, tiene que devolver el siguiente mensaje: X es positivo.
    public static void checkPositiveNegative(int num) {
        int x = num;
        if(x < 0) {
            System.out.println(x + " es negativo.");
        } else {
            System.out.println(x + " es positivo.");
        }
    }
}
