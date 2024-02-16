package day2;

public class Prog3 {
    public static void main(String [] args){
        for(int i=1;i<=20;i++){
            if(i%3==0 && i%7==0){
                System.out.println("Number is divisible by 3 and 7 : "+i);
            }
        }
    }
}
