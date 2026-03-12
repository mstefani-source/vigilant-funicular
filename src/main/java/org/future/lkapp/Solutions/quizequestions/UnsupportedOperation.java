package org.future.lkapp.Solutions.quizequestions;

import java.util.ArrayList;

import java.util.List;

public class UnsupportedOperation {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>(10); // Arrays.asList("A","B","C");

        lst.add("G");
        lst.set(0, "X");

        System.out.println(lst);
    }
}
