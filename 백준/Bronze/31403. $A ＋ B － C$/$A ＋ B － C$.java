import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String AB = "" + a + b;

        System.out.println(a + b - c);
        System.out.println(Integer.parseInt(AB)-c);
    }
}