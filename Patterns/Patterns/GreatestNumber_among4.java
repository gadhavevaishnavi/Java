class GreatestNumber {
    public static void main(String[] args) {
        System.out.println("Program started");

        int a = 10, b = 20, c = 30, d = 40;

        // Assume 'a' is the greatest initially
        if (a >= b) {
            if (a >= c) {
                if (a >= d) {
                    System.out.println("a is the greatest: " + a);
                } else {
                    System.out.println("d is the greatest: " + d);
                }
            } else {
                if (c >= d) {
                    System.out.println("c is the greatest: " + c);
                } else {
                    System.out.println("d is the greatest: " + d);
                }
            }
        } else {
            if (b >= c) {
                if (b >= d) {
                    System.out.println("b is the greatest: " + b);
                } else {
                    System.out.println("d is the greatest: " + d);
                }
            } else {
                if (c >= d) {
                    System.out.println("c is the greatest: " + c);
                } else {
                    System.out.println("d is the greatest: " + d);
                }
            }
        }
    }
}