package calculator;

import java.text.MessageFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int income;
        income = TotalIncome();
        System.out.println(MessageFormat.format("\nIncome: ${0}", Integer.toString(income)));

        int expenses = totalExpanses();

        System.out.println(MessageFormat.format("Net income: ${0}", Integer.toString(income - expenses)));




    }

    public static void ProductsOfStore() {

        Map<String, String> Products = new LinkedHashMap<>();

        Products.put("Bubblegum", "$2");
        Products.put("Toffee", "$0.2");
        Products.put("Ice cream", "$5");
        Products.put("Milk chocolate", "$4");
        Products.put("Doughnut", "$2.5");
        Products.put("Pancake", "$3.2");

        Iterator<String> iterator = Products.keySet().iterator();

        System.out.println("Prices:");
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(MessageFormat.format
                    ("{0}: {1}", key, Products.get(key))
            );
        }
    }

    public static int TotalIncome() {

        int income = 0;
        Map<String, Integer> totalIncomeByProduct = new LinkedHashMap<>();

        totalIncomeByProduct.put("Bubblegum", 202);
        totalIncomeByProduct.put("Toffee", 118);
        totalIncomeByProduct.put("Ice cream", 2250);
        totalIncomeByProduct.put("Milk chocolate", 1680);
        totalIncomeByProduct.put("Doughnut", 1075);
        totalIncomeByProduct.put("Pancake", 80);

        Iterator<String> iterator = totalIncomeByProduct.keySet().iterator();

        System.out.println("Earned amount:");
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(MessageFormat.format("{0}: ${1}", key, totalIncomeByProduct.get(key).toString()));
            income = Integer.sum(income, totalIncomeByProduct.get(key));
        }

        return income;
    }

    public static int totalExpanses() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Staff expenses:");
        int staff = scanner.nextInt();

        System.out.println("Other expenses:");
        int other = scanner.nextInt();

        return staff + other;



    }
}