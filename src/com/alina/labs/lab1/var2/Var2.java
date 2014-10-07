package com.alina.labs.lab1.var2;

import java.util.Arrays;
import java.util.Random;

public class Var2
{
    public void CreateArray()
    {
        int[][] array = new int[10][10];
        Random rand = new Random();
        
        for (int i = 0; i <10; i++)
        {
            for (int j = 0; j <10; j++)
            {
                array[i][j] = rand.nextInt(50);
                System.out.printf("%d ", array[i][j]);
            }
            System.out.printf("\n");
        }
    }
    
    public static void main(String[] args)
    {
        Var2 obj = new Var2();
        obj.CreateArray();
    }
    
}
