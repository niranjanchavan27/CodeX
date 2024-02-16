package day4;

public class Prog1 {
    public static void main(String [] args){
        int a=20;
        int b = 30;
        int c= 40;
        if(a<b){
            if(b<c){
                System.out.println(c+ " Is largest among all number");
            }
            else{
                System.out.println(b+ " Is largest among all number");  
            }
        }
        else{
            System.out.println(a+ " Is largest among all number");
        }
    }
}
