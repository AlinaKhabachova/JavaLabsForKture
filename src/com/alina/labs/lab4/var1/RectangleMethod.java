package com.alina.labs.lab4.var1;

public class RectangleMethod
{    
    private static double function(double x, double pow)
    { 
        return Math.pow(x, pow) ;
    }
     
    public static double calculate(double a, double b, double pow)
    {
        double h, result=0, n=500;
     
        h = (b-a)/n;
     
        for(int i=1; i <= n; i++)
        {
            result += function(a + h * i - h/2, pow); 
        }
        
        result *= h;
        return result;
    }
}
