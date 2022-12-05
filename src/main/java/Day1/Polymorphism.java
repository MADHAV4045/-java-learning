package Day1;

public class Polymorphism {
    int add (int a ,int b){
        System.out.println("int");
        return a+b;
    }
    float add(float a,float b)
    {
        System.out.println("float");
        return a+b;
    }
    int add(int... a){
        int res=1;
        for (int i=0;i<a.length;i++){
            res+=a[i];
        }
        return res;
    }
    float add(float... b){
        float ans=1;
        for (int i=0;i<b.length;i++){
            ans+=b[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Polymorphism p=new Polymorphism();
        System.out.println(p.add(10,20));
        System.out.print(p.add(10.10f,20.30f));
        System.out.println(p.add(10,20,30,40,50,60,70));
        System.out.println(p.add(10,20,30,40,50.50f,60,70.50F));
    }

}
