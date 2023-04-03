package exams;

public class EX01 {
        public static void main(String[] args) {
            String a = "\n";
            System.out.println("*   *     **     ****     ****     *   *          /////");
            System.out.println("*   *    *  *    *   *    *   *    *   *         | o o |");
            System.out.println("*****   *    *   ****     ****      * *         (|  ^  |)");
            System.out.println("*   *   ******   *   *    *   *      *           | [_] |");
            System.out.println("*   *   *    *   *    *   *    *     *            _____");
            System.out.println(a);
            System.out.println("            +---+");
            System.out.println("            |   |");
            System.out.println("        +---+---+");
            System.out.println("        |   |   |");
            System.out.println("    +---+---+---+           /\\_/\\        -----");
            System.out.println("    |   |   |   |         (  ' '  )    / Hello \\");
            System.out.println("+---+---+---+---+         (   -   )   <  Junior |");
            System.out.println("|   |   |   |   |          |  |  |     \\ Coder!/");
            System.out.println("+---+---+---+---+         (___|___)      -----");
            System.out.println(a);

            int soju = 3000;
            int sj_qty = 2;
            int chicken = 12000;
            int chck_qty = 1;

            int total = (soju * sj_qty) + (chicken * chck_qty);
            int vat = (int)(total * 0.1);

            int money = 50000;
            int charge = money - total;

            System.out.println(" [ 음식나라 ] ");
            System.out.println(" ------------------------ ");
            System.out.printf(" 소주\t\t%d\t\t%d\n", sj_qty, soju * sj_qty);
            System.out.printf(" 너나치킨\t\t%d\t\t%d\n", chck_qty, chicken * chck_qty);
            System.out.println(" ------------------------ ");
            System.out.println(" 과세합계\t\t\t\t" + total);
            System.out.println(" 부가세\t\t\t\t" + vat);
            System.out.println(" ------------------------ ");
            System.out.println(" 총합계\t\t\t\t" + total);
            System.out.println(" 받은금액\t\t\t\t" + money);
            System.out.println(" 잔돈\t\t\t\t" + charge);
            System.out.println(" ------------------------ ");
            System.out.println(" 2023. 01. 20\t 13:06:24 ");
        }
}
