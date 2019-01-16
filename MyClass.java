public class MyClass {
    public static void main(String args[]) {
        int n = 93;
        double d = 1.27;
        double result = n-d;
        if (result > 0) {
            boolean b = result < 0;
            if (b) {
                System.out.println("This can not be true!");
            
            }
        } else {
            String s = "wow";
            if (result >= 0) {
                s = "bravo!";
                System.out.println(s);
            } else {
                System.out.println(s);
            }
        }

    }
}

/* I then had to guess what would print. Because the first part of the master If statement is true, but the statement after the
true boolean does not display anything, then the answser is nothing would print. */
