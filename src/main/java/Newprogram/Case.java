package Newprogram;

public class Case {

    String uperCase(String c) {
        String ans = "";
        for (int i = 0; i < c.length(); i++) {
            int team = (int) c.charAt(i);
            if (97 <= team && 122 >= team) {
                team = team - 32;
                ans = ans + ((char) team);
            } else {
                ans = ans + ((char) team);
            }
        }
        return ans;
    }

    String lowerCase(String d) {
        String ans2 = "";
        for (int i = 0; i < d.length(); i++) {
            int demo = (int) d.charAt(i);
            if (65 <= demo && 90 >= demo) {
                demo = demo + 32;
                ans2 = ans2 + ((char) demo);
            } else {
                ans2=ans2+((char)demo);

            }
        }
        return ans2;
    }
        public static void main (String[]args){
            Case c = new Case();
            System.out.println(c.uperCase("Madhav sahu"));
            System.out.println(c.lowerCase("MADHaV"));
        }
    }

