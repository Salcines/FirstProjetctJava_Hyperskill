import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int speed = scanner.nextInt();

        double avgSpeed = distance / (double) speed;

        System.out.println(avgSpeed);
    }
}