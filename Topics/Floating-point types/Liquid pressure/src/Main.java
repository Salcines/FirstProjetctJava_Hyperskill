import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final double gravity = 9.8;

        Scanner scanner = new Scanner(System.in);
        double density = scanner.nextDouble();
        double height = scanner.nextDouble();

        System.out.println(gravity * density * height);
    }
}