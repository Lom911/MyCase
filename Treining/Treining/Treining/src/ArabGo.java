public class ArabGo {
    int x1;
    int y1;
    String znak1;
    public void summ() throws Exception {
                 switch (znak1) {
                     case "+" -> {
                         System.out.println(x1 + y1);
                      }
                     case "-" -> {
                         System.out.println(x1 - y1);
                     }
                     case "/" -> {
                         if (y1 == 0) {
                             throw new Exception("На 0 делить нельзя");
                         } else
                         System.out.println(x1 / y1);
                     }
                     case "*" -> {
                         System.out.println(x1 * y1);
                     }
                     default -> {
  //                       try {
                             throw new Exception("Не верный знак");
  //                       } catch (Exception e) {
 //                           throw new RuntimeException(e);
  //                       }
                     }
                 }
                 }
}


