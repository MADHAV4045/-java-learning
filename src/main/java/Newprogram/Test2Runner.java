package Newprogram;

public class Test2Runner {
    int a;
    float b;
    char c;
    boolean d;
    String e;

    @Override
    public String toString() {
        return "Test2Runner{" +'\n'+
                "a=" + a +'\n'+
                ", b=" + b +'\n'+
                ", c=" + c +'\n'+
                ", d=" + d +'\n'+
                ", e='" + e + '\'' +'\n'+
                '}';
    }

    public Test2Runner(int a, float b, char c, boolean d, String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;

    }
}
