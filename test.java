import java.util.Scanner;

public class test{
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c, selection;
        System.out.println("please enter any two values");
        a=scan.nextInt();
        b=scan.nextInt();

        System.out.println("make your selection");
        System.out.println("1.addition");
        System.out.println("2.subtraction");
        System.out.println("3.division");
        System.out.println("4.multiplication");
// picking user selection
        selection = scan.nextInt();
        while(selection>4){
           System.out.println("please enter the correct selection:");
           selection = scan.nextInt(); 
        }
        Cal2 mani = new Cal2();
        if(selection == 1){
            c = mani.add(a, b);
            System.out.println("your answer is " + c);
        } else if(selection==2){
            c=mani.sub(a, b);
            System.out.println("your answer is " + c);
        } else if(selection == 3){
            c=mani.div(a, b);
            System.out.println("your answer is " + c);
        } else if(selection==4){
            c=mani.multi(a, b);
            System.out.println("your answer is " + c);
        }

    }
    public static class Cal2{
        public int add(int x, int y) {
            int z; 
            z=x+y;
            return z; 
            
        }
        public int sub(int x, int y) {
            int z; 
            z=x-y;
            return z; 
        }
        public int multi(int x, int y) {
            int z; 
            z=x*y;
            return z; 
        }
        public int div(int x, int y) {
            int z; 
            z=x/y;
            return z; 
        }
    
    }
}