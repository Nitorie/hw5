public class Main {
    public static void main(String[] args) {
        max(2);
        max(9);
        max(29);
        max(99);
        max(11);
        max(19);
        max(219);
        max(929);
        max(1000000);
        print();
        print1();
        print2();
        print3();
    }

    public static void max(int num) {//
        String s = "";
        String[] base1 = {"", "one", "two", "", "", "", "", "", "", "nine"};
        String[] base2 = {"", "", "twenty", "", "", "", "", "", "", "ninety"};
        String[] base3 = {"", "eleven", "", "", "", "", "", "", "", "nineteen"};

        if (num > 0 && num < 10)
            s = base1[num];
        else if (num > 19 && num < 100)
            s = base2[num / 10] + " " + base1[num % 10];
        else if (num >= 10 && num <= 19)
            s = base3[num % 10];
        else if (num > 100 && num < 1000)
            if (num % 100 >= 10 && num % 100 <= 20)
                s = base1[num / 100] + " hundred " + base3[num % 10];
            else
                s = base1[num / 100] + " hundred " + base2[num / 10 % 10] + " " + base1[num % 10];
            //     s = base1[num / 1000000] + " million ";

        else if (num >= 1000 && num <= 100000)
            if (num % 100 >= 10 && num % 100 <= 20)
                s = base1[num / 100] + " hundred " + base3[num % 10];
            else
                s = base1[num / 100] + " hundred " + base2[num / 10 % 10] + " " + base1[num % 10];
        s = base1[num % 10] + " thousand " + base3[num % 10];
        System.out.println(s);
    }

    public static void print() {

        for (int y = 0; y < 10; y++) {

            for (int x = 0; x < 10; x++) {
                if (x == y && x >= 5 || 9 - x == y && x < 5 || y == 9)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();

        }
        System.out.println("---------------------------------");
    }

    public static void print1() {

        for (int y = 0; y < 10; y++) {

            for (int x = 0; x < 10; x++) {
                if (x == y && x >= 5 || 9 - x == y && x >= 5 || x == 9)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();

        }
        System.out.println("---------------------------------");
    }

    public static void print2() {

        for (int y = 0; y < 10; y++) {

            for (int x = 0; x < 10; x++) {
                if (x == y && y < 5 || 9 - x == y && y >= 5 || x == 0)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();

        }
        System.out.println("---------------------------------");
    }

    public static void print3() {

        for (int y = 0; y < 10; y++) {

            for (int x = 0; x < 10; x++) {
                if (x == y && y < 5 || 9 - x == y && y < 5 || y == 0)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
    }
}