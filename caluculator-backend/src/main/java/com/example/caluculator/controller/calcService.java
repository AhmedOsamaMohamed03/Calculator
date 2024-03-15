package com.example.caluculator.controller;

public class calcService {

    public String solve(double a,String op , double b){
        return String.valueOf(operation(a,op,b));
    }

    public String solveUn(double a,String op){
        return operationU(a,op);
    }
    private double operation(double a, String op,double b){

        switch(op){
            case "+" : return  a+b;
            case "-" : return  a-b;
            case "div": return  a/b;
            case "times": return a*b;
        }
        return 0;
    }

    private String operationU(double a, String op){
        double res = 0;
        switch(op){
            case "r" : if(a < 0) {
                           return "Error";
                        }else{
                            res = Math.sqrt(a);
                        }
                        break;
            case "sq" : res =  Math.pow(a,2);
                        break;
            case "neg":  res = -a;
                        break;
            case "inv" : if(a==0){
                           return "Error";
                        }
                        else{
                           res = 1/a;
                        }
                        break;
            case "per": res = a/100;
                        break;
            default  : return "Error";
        }
        return String.valueOf(res);
    }
}
