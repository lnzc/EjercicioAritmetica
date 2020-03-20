package com.example.myapplication;

public class Aritmetica {
    private  int num1;
    private  int num2;
    public Aritmetica(int num1, int num2){
        num1=num1;
        num2=num2;
    }
    public Aritmetica(){
        num1=0;
        num2=0;
    }
    public Aritmetica(Aritmetica objeto){
        num1=objeto.num1;
        num2=objeto.num2;
    }
    public int Suma(){
        return (num1+num2);
    }
    public int Resta(){
        return (num1-num2);
    }
    public int Multiplicacion(){
        return (num1*num2);
    }
    public int Division(){
        return (num1/num2);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Aritmetica{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
