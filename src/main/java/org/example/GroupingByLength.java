package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByLength {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Amir", "Hatef", "Mehran", "Mojtaba", "Mohammad", "Ali",
                "Davood", "Mohsen", "Reza");

        Map<Integer, List<String>> groupedByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));


        groupedByLength.forEach((k, v) -> System.out.println("Length: " + k + " -> Words: " + v));
    }
}

/*
دسته‌بندی و شمارش کلمات بر اساس طول‌شان:
از Collectors.groupingBy برای دسته‌بندی کلمات بر اساس طول‌شان (تعداد حروف)
و از Collectors.counting برای شمارش تعداد کلمات موجود در هر گروه استفاده کردیم.

نمایش نتیجه:
نتیجه را نمایش می‌دهیم که هر گروه شامل چه تعداد کلمات با چه طولی است.

این کد کلمات را بر اساس تعداد حروف دسته‌بندی کرده
و تعداد کلمات موجود در هر گروه را نیز مشخص می‌کند
*/
