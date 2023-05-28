//Пусть дан произвольный список целых чисел.
//
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение

package org.example;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(10));
        }
        System.out.println(list);

        double sum = 0;
        for (int x: list) {
            sum += x;
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) {
                list2.add(list.get(i));
            }
        }
        System.out.println("------------------------------------");
        System.out.println(list2);
        System.out.println("Минимальное значение = "+Collections.min(list));
        System.out.println("Максимальное значение = "+Collections.max(list));
        System.out.println("Среднее значение = "+sum/list.size());
    }
}
