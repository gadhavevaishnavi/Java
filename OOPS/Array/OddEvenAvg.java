
class EvenOddAvg
  {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        double avg = 0;
        for (int i = 0; i < a.length; i++) {
            avg += a[i];
        }
        avg /= a.length;
        System.out.println("Average = " + avg);
        Sysstem.out.println("Elements greater than average:");
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > avg) {
                System.out.println(a[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No elements greater than average.");
        }
    }
}