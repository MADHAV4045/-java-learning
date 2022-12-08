package Interface;

public class Dataswep implements Try1 {

    @Override
    public void swep(int a,int b) {
       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
