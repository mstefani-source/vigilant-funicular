import Solutions.lk151.*;

public class lkapp {

    public static void main(String[] args) {

        Consumers lk151 = new Consumers();
        ByteArray ba = new ByteArray();
        ArrayOfString aos = new ArrayOfString();      
        System.out.print(lk151.reverseWords("  end   of the day  "));
        System.out.print(ba.reverseWords("  hello world   of java  "));
        System.out.print(aos.reverseWords("  hello world of  aos  "));
    
    }
}
