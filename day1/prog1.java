package day1;
public class prog1 {
    public static void main(String [] args){
        int a=10;
        int b=10;
        int c;
        c= a++ + ++a + --b + b++ * b--;
        System.out.println("Value of a "+a);
        System.out.println("Value of b "+b);
        System.out.println("Value of c "+c);
    }
    
}
