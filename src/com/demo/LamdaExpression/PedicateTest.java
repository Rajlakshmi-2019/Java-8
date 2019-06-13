package com.demo.LamdaExpression;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;


class PredicateTest {
    PredicateTest() {
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Geek", "GeeksQuiz", "g1", "QA", "Geek2");
        Predicate<String> p = (s) -> {
            return s.startsWith("G");
        };
        Iterator var3 = names.iterator();

        while(var3.hasNext()) {
            String st = (String)var3.next();
            if (p.test(st)) {
                System.out.println(st);
            }
        }

    }
}