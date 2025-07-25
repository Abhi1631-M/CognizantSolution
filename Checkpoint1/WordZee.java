package Checkpoint1;

import java.util.Scanner;

public class WordZee {


    private static boolean check(String s, boolean isS) {
        for (char c : s.toCharArray()) {
            if (isS) {
                if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
                    return false;
                } else {
                    if (!Character.isLetter(c)) {
                        return false;
                    }
                }

            }


        }
        return true;

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sen=sc.nextLine();
        if(!check(sen,true))
        {
            System.out.println(sen+" is an invalid sentence");
        }
        else{
            System.out.println("Enter a word");
            String w=sc.nextLine();
            if(!check(w,false))
            {
                System.out.println(w+" is an invalid word");
            }
            else if(!sen.contains(w))
            {
                System.out.println(w+" is not in the sentence");
            }
            else{
                String res=new StringBuilder(w).reverse().toString();
                String ans=sen.replace(w,res);
                System.out.println(ans);
            }
        }
    }
}
