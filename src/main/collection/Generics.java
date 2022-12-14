package collection;

public class Generics <T>{
    void Data (T data)
    {
        System.out.println(data);
        System.out.println(data.getClass());

    }

    public static void main(String[] args) {
        Generics o=new Generics();
        float arr[]={20.2f,30.50f,30.0f,40};
        int arr1[]={10,20,30,40,50,60,70};
        o.Data(arr);

    }
}
