package lesson5;

import java.util.Arrays;

public class Less5_hw_2 {
    private static int W = 30;//Вместимость рюкзака по весу, она же текущий остаток вместимости
    private static int[] weights = new int[] {8, 6, 4, 0, 21};//Массив весов предметов
    private static int[] values = new int[] {894, 260, 392, 281, 27};//Массив ценностей предметов

    private static int count;//TODO временно

    private static int knapsack(int i, int W) {
        //TODO временно
        System.out.println("iteration #" + count++ + ".");

        if (i < 0) {
            return 0;
        }
        if (weights[i] > W) {

            //TODO временно
            System.out.print("*weights[" + i + "]: " + weights[i] + " > W: " + W + " >> first_if\n");

            int first_if = knapsack(i - 1, W);
            System.out.print("knapsack(i - 1: " + (i -1) + ", W: " + W + "). first_if: " + first_if + "\n");
            return first_if;
        } else {

            //TODO временно
            System.out.print("**weights[" + i + "]: " + weights[i] + " <= W: " + W + " >> first_else\n");

            int first_else = knapsack(i - 1, W);
            System.out.print("knapsack(i - 1: " + (i - 1) + ", W: " + W + "). first_else: " + first_else + "\n");

            System.out.print("**weights[" + i + "]: " + weights[i] + " <= W: " + W + " >> second\n");

            int second = knapsack(i - 1, W - weights[i]);
            System.out.print("knapsack(i - 1: " + (i -1) + ", W - weights[" + i + "]: " + (W - weights[i]) + ". second: " + second + "\n");
            second += values[i];
            System.out.print("second + values[" + i + "]("+ values[i] + "): " + second + "\n");
            int math_max = Math.max(first_else, second);
            System.out.println("Math.max(first_else: "+ first_else + ", second: "+ second + "): " + math_max);
            return math_max;
        }
    }

    public static void main(String[] args) {
        System.out.println(knapsack(values.length - 1, W));}
}
