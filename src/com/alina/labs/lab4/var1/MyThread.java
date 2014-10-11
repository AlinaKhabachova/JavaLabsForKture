package com.alina.labs.lab4.var1;

public class MyThread implements Runnable
{
   private double a;
   private double b;
   private double pow;
   private String name;
   
   public MyThread(double a, double b, double pow, String name)
   {
       this.a = a;
       this.b = b;
       this.pow = pow;
       this.name=name;
   }

    public void run()     
    {              
          System.out.println(name);  
          double result=RectangleMethod.calculate(a, b, pow);
          System.out.println(name+" : "+result); 
    }
}