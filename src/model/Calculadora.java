package model;

public class Calculadora {

        //public static void main(String[] args) {

          public double calcula(double numero1,double numero2, String operador){

            switch (operador) {
                case "+":
                    return numero1 + numero2;

                case "-":
                    return numero1 - numero2;

                case "*":
                    return numero1 * numero2;

                case "/":
                    return numero1 / numero2;

                default:
                    throw new IllegalArgumentException("operador invalido");
            }

        }
    }