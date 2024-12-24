public class lkapp {

    public static void main(String[] args) {

        Consumers lk151 = new Consumers();
        ByteArray ba = new ByteArray();
        ArrayOfString aos = new ArrayOfString();      
        System.out.println(lk151.reverseWords("  end   of the day  "));
        System.out.println(ba.reverseWords("  hello world   of java  "));
        System.out.println(aos.reverseWords("  hello world of  aos  "));
    
    }
}
