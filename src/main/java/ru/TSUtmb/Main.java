package ru.TSUtmb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Task1();
        Task2();
    }

    public static void Task1()
    {
        System.out.println("Задание 1.");
        System.out.println("Введите x");
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = Tasks.Task1Equation(x);

        System.out.println("В результате магических вычислений y = " + y);
        
        if (Tasks.Task1Check(x,y))
        {
            System.out.println("Точка входит в заданный полукруг");
        }
        else
        {
            System.out.println("Точка не входит в заданных полукруг");
        }
    }

    public static void Task2()
    {
        System.out.println("Задание 2.");
        System.out.println("Введите x");
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = Tasks.Task2CalculateY(x);

        System.out.println("В результате магических вычислений получилось следующее число: " + y);
    }
}
