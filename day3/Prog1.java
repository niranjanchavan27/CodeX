package day3;

public class Prog1 {
    public static void main(String [] args){
        char ch='A';
        for(;ch<='I';ch++){
            if(ch%2==1){
                System.out.print(ch);
            }
            else{
                System.out.print(" ");
            }
        }
    }
}
