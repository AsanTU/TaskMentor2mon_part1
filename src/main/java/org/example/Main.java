package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//Коллекции:
//Напишите программу, которая запрашивает у пользователя список чисел через запятую.
//Разделите строку на отдельные числа и добавьте их в список. Затем найдите сумму всех чисел в списке и выведите её.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите список чисел через запятую: ");
        String input = scanner.nextLine();
        String[] numbersStr = input.split(",");
        ArrayList<Double> numbers = new ArrayList<>();
        double sum = 0;

        for (String numStr : numbersStr) {
            try {
                double num = Double.parseDouble(numStr);
                numbers.add(num);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка формата числа: " + numStr);
            }
        }

        System.out.println("Список чисел: " + numbers);
        System.out.println("Сумма чисел: " + sum);
    }
}
