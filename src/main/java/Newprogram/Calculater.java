package Newprogram;

public class Calculater {
    int sum (int a,int b)
    {
        return a+b;
    }
    long sub (long a,long b)
    {
        return a-b;
    }
    float mul (float a,float b)
    {
        return  a*b;
    }
    float div(float a,float b)
    {
        return a/b;
    }
    String name(String s)
    {
        return '\n'+"My Name is "+s;
    }


    public static void main(String[] args) {
        Calculater m=new Calculater();
        System.out.println("\033[0;31m"+m.sum(10,20)+'\n'+m.name("Madhav Sahu")+'\n'+m.sub(50,20)+'\n'+m.mul(50,10)+'\n'+m.div(5,100));
/*
        System.out.println(m.sub(50,20));
        System.out.println(m.mul(50,10));
        System.out.println(m.name("Madhav Sahu"));
            System.out.println(m.sum(10,20));
*/

    }
}
