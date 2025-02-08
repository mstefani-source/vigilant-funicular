package lkapp;

import lkapp.Solutions.zigzag.ZigZag;

public class lkapp {
    public static void main(String[] args) {
        ZigZag zigZag = new ZigZag();
        System.out.print("waiting for PAHNAPLSIIGYIR got ");
        System.out.println(zigZag.convert("PAYPALISHIRING", 3) + " " + zigZag.convert("PAYPALISHIRING", 3).equals("PAHNAPLSIIGYIR"));
    }
}
