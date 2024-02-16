package day3;

public class Prog2 {
    public static void main(String [] args){
        for(int i=1;i<=5;i++){
            if(i%2==0){
                System.out.print(" "+i*i+" ");
            }
            else{
                System.out.print(i*i*i);
            }
        }
    }
}
