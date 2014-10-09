package com.alina.labs.lab1.var1;

public class Var1
{
    public static void main(String[] args)
    {
        int first = 1;
        int last = 100;
        
       for (int i = first; i <= last; i++)
        {
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0) 
                {
                    break;
                }
                else  
                {
                    System.out.print(i + ", ");
                    break;
                }
            }
        }
    }
}
