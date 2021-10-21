package Task1;

import java.util.Scanner;

//В теле класса создайте четыре метода для арифметических действий: (add – сложение, sub – вычитание,
//        mul – умножение, div – деление).
//        Метод деления должен делать проверку деления на ноль, если проверка не проходит, сгенерировать
//        исключение.
//        Пользователь вводит значения, над которыми хочет произвести операцию и выбрать саму операцию.
//        При возникновении ошибок должны выбрасываться исключения
public class Calculator {
    double add(int a, int b){
        return a+b;
    }
    double sub(int a, int b){
        return a-b;
    }
    double mul(int a, int b){
        return a*b;
    }
    double div(int a, int b) {
        return a/b;
    }
}
class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Введите знак арифметической операции: ");
        String operation = sc.next();
        switch (operation) {
            case "+" : {
                System.out.println("Результат: " + calc.add(a,b));
            }
            case "-" : {
                System.out.println("Результат: " + calc.sub(a,b));
            }
            case "*" : {
                System.out.println("Результат: " + calc.mul(a,b));
            }
            case "/" : {
                try {
                    System.out.println("Результат: " + calc.div(a,b));
                }
                catch (Exception e) {
                    System.out.println("Деление на ноль");
                }
            }
        }
    }
}
