public class Main {
    public static void main(String[] args) {
        String a = new String("Wow!");
        String b = a;
        String c = new String("Wow");
        String d = c;
        
        System.out.println(a + "!");

        boolean b1 = a == b;
        boolean b2 = b.equals(c + "!");
        boolean b3 = !c.equals(a);
        
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        } else {
            System.out.println("Fail!");
        }
    }
}
    
