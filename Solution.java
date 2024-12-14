class Solution {

    public static String reverseWords(String s) {

        byte[] byteArray = s.getBytes();

        for (int i = byteArray.length - 1; i >= 0; i--){
            System.out.println(byteArray[i]);
        }

        return s;
    }

    public static void main(String[] args) {

        System.out.print(reverseWords(" new  era "));
    }
}