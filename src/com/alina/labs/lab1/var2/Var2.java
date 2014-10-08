package com.alina.labs.lab1.var2;

import java.util.Random;

public class Var2
{
    public static void createArray(int size, int range)
    {
        int[][] array = new int[size][size];
        Random rand = new Random();
        
        for (int i = 0; i <size; i++)
        {            
            for (int j = 0; j <size; j++)
            {
                array[i][j] = rand.nextInt(range);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args)
    {
        Var2.createArray(10, 50);
    }
}
