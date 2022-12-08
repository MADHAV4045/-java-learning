package Newprogram;

public class test1 {
    public int sum(int a,int b)
    {
        return a+b;
    }
    public long  sub(long a, long b)
    {
        return a-b;
    }
    public String name (String s)
    {
        return "My Name is "+s;
    }


    public static void main(String[] args) {
        test1 a=new test1();
        System.out.println("\033[0;31m"+a.sum(50,100));
        System.out.println(("\033[38;2;225;153;0m")+a.sub(100,50));
        System.out.println(a.name("\033[1;34m"+"Madhav Sahu"));
    }
}
