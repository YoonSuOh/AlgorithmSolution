import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int sum = 0;
        String [] arr = s.split("");

        for(int i=0;i<n;i++){
            sum += (Integer.parseInt(arr[i]));
        }

        System.out.println(sum);
    }
}