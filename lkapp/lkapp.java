package lkapp;

import java.util.Map;

import lkapp.Solutions.zigzag.ZigZag;

public class lkapp {

    public static void main(String[] args) {

        ZigZag zig = new ZigZag();
        Map<Integer, String> testcases = Map.of(
                1, "{'PAYPALISHIRING', 3}",
                2, "{'PAYPALISHIRING', 4}",
                3, "{'A', 3}",
                4, "{'PAYP', 4}");

        ZigZag zigZag = new ZigZag();

        System.out.print("waiting for PAHNAPLSIIGYIR got ");
        System.out.println(zigZag.convert("PAYPALISHIRING", 3) + " " + zigZag.convert("PAYPALISHIRING", 3).equals("PAHNAPLSIIGYIR"));
        System.out.print("waiting for PINALSIGYAHRPI got ");
        System.out.println(zigZag.convert("PAYPALISHIRING", 4) + " " + zigZag.convert("PAYPALISHIRING", 4).equals("PINALSIGYAHRPI"));
        System.out.println(zigZag.convert("PAYP", 2) + " " + zigZag.convert("PAYP", 2).equals("PYAP"));
        System.out.println(zigZag.convert("PAY", 2) + " " + zigZag.convert("PAY", 2).equals("PYA"));        
        System.out.println(zigZag.convert("PAYPAL", 2) + " <-> " + "PYAAPL " + zigZag.convert("PAYPAL", 2).equals("PYAAPL") );
        System.out.println(zigZag.convert("PAYPAL", 3) + " <-> " + "PAAPLY " + zigZag.convert("PAYPAL", 3).equals("PAAPLY"));
    }
}
