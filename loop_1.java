import java.util.Scanner;

class loop_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.err.print(N);
            System.out.print(" x ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(N * i);
        }
    }
}