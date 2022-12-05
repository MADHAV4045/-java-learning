package Day1;

import Newprogram.ArrayClass;

public class In extends ArrayClass {

//    public In(int roll_no, String name, String ID_no, String mobile, String email) {
//        super(roll_no, name, ID_no, mobile, email);
//    }
//
//    public static void main(String[] args) {
//       In b=new In(10,"madhav","154","8818953989","madhavsahu");
//        System.out.println(b.getName());
//    }

    public static void main(String[] args) {
        In n = new In();
        int res = n.Biggest(new int[]{1, 2, 3, 4, 5, 6});
        System.out.println(res);
        int res2 = n.findingLowest(new int[]{2, 5, 1, 5, 2});
        System.out.println(res2);
        int res3 = n.Second(new int[]{2, 5, 8, 9, 1});
        System.out.println(res3);
    }
}

