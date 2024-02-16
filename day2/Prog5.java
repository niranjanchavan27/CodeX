package day2;

public class Prog5 {
    public static void main(String [] args){
        int i=1;
        while(i<=21){
            if(i%3==0 && i%7==0){
                System.out.println(i);
                i++;
            }
        }
    }
}
