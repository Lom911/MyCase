
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) throws Exception {
        System.out.print("Введите выражение: ");
        Scanner input = new Scanner(System.in);
        String exp1 = input.nextLine();
        input.close();
        String[] exp = exp1.split(" ");
        if (exp.length != 3) throw new Exception("Введено более 2х значений"); // проверка на количество символов
        int x = 0;
        int y = 0;
        int[] arab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] rim = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        boolean uslRim1 = false;
        boolean uslRim2 = false;
        for (int i = 0; i < rim.length; i++) {
            if (exp[0].equals(rim[i])) {
                x = arab[i];
                uslRim1 = true;
            }
            if (exp[2].equals(rim[i])) {
                y = arab[i];
                uslRim2 = true;
            }
        }
        if (((uslRim1 == false) && (uslRim2 == true)) || ((uslRim2 == false) && (uslRim1 == true)))
            throw new Exception("Не корректное значение");
        String znak1 = exp[1];                                      // определяем математический знак
        if ((uslRim1 == true) && (uslRim2 == true)) {   // Римский Калькулятор
        RimGo resultr = new RimGo();
        resultr.x = x;
        resultr.y = y;
        resultr.znak1 = znak1;
            resultr.summ();
    } else {                                        // Арабский калькулятор
            int x1 = Integer.parseInt(exp[0]);
            int y1 = Integer.parseInt(exp[2]);
            if ( x1 < -10 || x1 > 10 || y1 < -10 || y1 > 10)
                throw new Exception("Введите значение от -10 до 10");
            ArabGo resultr = new ArabGo();
            resultr.x1 = x1;
            resultr.y1 = y1;
            resultr.znak1 = znak1;
            resultr.summ();
        }
    }
}


