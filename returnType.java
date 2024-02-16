/* public class returnType {
    public static void main(String [] args){
        System.out.println("in main class");
        returnType obj =new returnType();
        obj.fun(10);
    }
    int fun(int a){
        int b = a;
        System.out.println("in return type");
        return a;
    }
} */

class returnType {
    public static void main(String [] args){
        returnType obj =new returnType();
        int a =obj.addition(10,20);
        System.out.println("in main method "+a);
    }
    int addition(int a,int b){
        int sum = a+b;
        System.out.println("in additin method "+b);
        return  sum;
        //return a+b;
    }
}
/* in additin method 20
in main method 30 */