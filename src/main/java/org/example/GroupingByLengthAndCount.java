package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByLengthAndCount {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amir", "Hatef", "Mehran", "Mojtaba", "Mohammad", "Ali",
                "Davood", "Mohsen", "Reza");

        Map<Integer, List<String>> groupedByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));


        Map<Integer, Long> wordCountByLength = names.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));


        groupedByLength.forEach((k, v) ->
                System.out.println("Length: " + k + " -> Names: " + v + " | Count: " + wordCountByLength.get(k)));
    }
}
/*
دسته‌بندی کلمات بر اساس طول‌شان:
 از Collectors.groupingBy استفاده کردیم تا کلمات را بر اساس تعداد حروف‌شان دسته‌بندی کنیم.

شمارش تعداد کلمات در هر گروه:
از Collectors.counting استفاده کردیم تا تعداد کلمات موجود در هر گروه را شمارش کنیم.

نمایش نتیجه: هر گروه و تعداد کلمات موجود در آن را نمایش می‌دهیم.

این کد کلمات را بر اساس تعداد حروف دسته‌بندی کرده و تعداد کلمات موجود در هر گروه را نیز مشخص می‌کند
*/
