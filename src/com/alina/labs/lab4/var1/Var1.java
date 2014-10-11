package com.alina.labs.lab4.var1;

public class Var1
{
    public static void main(String args[]) 
    { 
       MyThread   firstThread = new MyThread(1, 10, 100, "first"); 
       MyThread   secondThread = new MyThread(1, 20, 50, "second"); 
       
       Thread thread1 = new Thread(firstThread); 
       thread1.start(); 

       Thread thread2 = new Thread(secondThread); 
       thread2.start();        
    }
}
    
