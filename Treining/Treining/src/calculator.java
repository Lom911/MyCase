
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        System.out.print("Введите выражение: ");
        Scanner input = new Scanner(System.in);
        String  exp1 = input.nextLine();
        input.close();
        exp1 = exp1.replaceAll("\\s+","");
        String[] exp = exp1.split("");

            if (exp.length != 3){
                System.out.println("throws Exception");
                System.exit(1);
            }
                int x = 0, x1;
                int y = 0, y1;
                int summ = 0;
                int t;
         int [] arab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
         String [] rim = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
         String [] test = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10","-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};

         for(int i = 0; i < rim.length; i++) {
             if (exp[0].equals(rim[i]))
                  x = arab[i];
             if (exp[2].equals(rim[i]))
                 y = arab[i];
         }
         if (x != 0 && y != 0) {
             String znak1 = exp[1];
             switch (znak1) {
                 case "+" -> summ = x + y;
                 case "-" -> summ = x - y;
                 case "/" -> summ = x / y;
                 case "*" -> summ = x * y;
                 default -> {
                     System.out.println("throws Exception");
                     System.exit(1);
                 }
             }
             if (summ <= 0) {
                 System.out.println("throws Exception");
                 System.exit(1);
             }
             if (summ == 100) {
                 System.out.println("C");
                 System.exit(1);
             }
             if (summ <= 10)
                 for (int i = 0; i < arab.length; i++)
                     if (summ == (arab[i])) {
                         System.out.println(rim[i]);
                         System.exit(1);
                     }
             t = summ / 50;
             if (t > 0) {
                 System.out.print("L");
                 summ = summ - (50 * t);
             }
             for (int j = 0; j < 4; j++) {
                 t = summ / 10;
                 if (t > 0) {
                     System.out.print("X");
                     summ = summ - 10;
                 }
             }
             for (int i = 0; i < arab.length; i++)
                 if (summ == (arab[i])) {
                     System.out.println(rim[i]);
                 }
         }
         else {                    ///второй калькулятор//
             boolean find = false;
             boolean find2 = false;
             for (String s : test) {
                 if (exp[0].equals(s))
                     find = true;
                 if (exp[2].equals(s))
                     find2 = true;
             }
              if (!find || !find2)
                  System.out.println("throws Exception");
              else {
             x1 = Integer.parseInt(exp[0]);
             y1 = Integer.parseInt(exp[2]);
                      String znak1 = exp[1];
             if ( x1 < -10 || x1 > 10 || y1 < -10 || y1 > 10) {
                 System.out.println("throws Exception");
             } else {
                 switch (znak1) {
                     case "+" -> {
                         summ = x1 + y1;
                         System.out.println("Результат: " + summ);
                     }
                     case "-" -> {
                         summ = x1 - y1;
                         System.out.println("Результат: " + summ);
                     }
                     case "/" -> {
                         summ = x1 / y1;
                         System.out.println("Результат: " + summ);
                     }
                     case "*" -> {
                         summ = x1 * y1;
                         System.out.println("Результат: " + summ);
                     }
                     default -> System.out.println("throws Exception");
                 }
                 }
             }
         }
    }
}


//        System.out.println("Успех");
//      char znak = znak1.charAt(0); // пока применение не нашел