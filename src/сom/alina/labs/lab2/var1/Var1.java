package ñom.alina.labs.lab2.var1;

public class Var1
{
    public static void main(String[] args)
    {
        String wordfromText="Choose";
        String rep="Pick out";
        String text = "Choose life. Choose a job. Choose a career. Choose a family. Choose a fucking big television, Choose washing machines, cars, compact disc players, and electrical tin can openers. Choose good health, low cholesterol and dental insurance. Choose fixed-interest mortgage repayments. Choose a starter home. Choose your friends. Choose leisure wear and matching luggage. Choose a three piece suite on hire purchase in a range of fucking fabrics. Choose DIY and wondering who the fuck you are on a Sunday morning. Choose sitting on that couch watching mind-numbing spirit-crushing game shows, stuffing fucking junk food into your mouth.";
        StringBuilder sbText = new StringBuilder(text);
        int i=0;
        while ( (i = sbText.indexOf(wordfromText, i)) >= 0)
        {
            sbText.delete(i, i + wordfromText.length());
            sbText.insert(i, rep);
        }
        System.out.print(sbText);
    }
}
