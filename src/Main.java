import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        long n = input.nextLong();

        if(Int(n)%2==0) System.out.println("even");
        else System.out.println("odd");

    }

    private static long Int(long number){
        long N=0;
        for(int i=1;i<=number;i++){
            if(number%i==0)N++;
        }
        return N;
    }
}