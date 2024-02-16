package day2;

public class Prog2 {
    public static void main(String [] args){
        int i=1;
        while (i<=20){
            if(i%2==0){
                System.out.println("Even Number : "+i);
                i++;
            }
            else{
                System.out.println("Odd Number : "+i);
                i++;
            }
        }
    }
}
