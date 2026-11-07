public class Assignment01Q03 {
    public static void main(String[] args) {
        int x  = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        long b1 = 1;
        long b2 = 1;
        int numOdd = 2;
        System.out.print("1 1 ");
        for (int i = 2; i < x; i++) {
            long curr = b1 + b2;
            System.out.print(curr);
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
            b2 = b1;
            b1 = curr;
            if (curr %2 !=0){numOdd++;}
        }        
        System.out.println();        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
