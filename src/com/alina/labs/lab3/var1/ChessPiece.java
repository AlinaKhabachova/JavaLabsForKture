package com.alina.labs.lab3.var1;

abstract class ChessPiece
{
   int x;
   int y;
   boolean isDead=false;
  
   void setX(int x)
   {
       this.x = x;
   }
   int getX()
   {
       return x;
   }
   void setY(int y)
   {
       this.y = y;
   }
   int getY()
   {
       return y;
   }
   void setIsDead(boolean isDead)
   {
       this.isDead = isDead;
   }
   int getIsDead()
   {
       return x;
   }
   
   ChessPiece()
   {
       this.x = 0;
       this.y = 0;
       this.isDead=false;
   }

   ChessPiece(int x, int y)
   {
       this.x = x;
       this.y = y;
       this.isDead=false;
   }
   
   abstract void Move();
}
