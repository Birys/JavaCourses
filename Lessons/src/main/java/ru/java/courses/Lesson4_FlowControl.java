package ru.java.courses;

public class Lesson4_FlowControl {

    /**
     * В рамках задания необходимо найти в полученном массиве строк самую длинную
     * и вернуть ее в результате выполнени метода.
     * Если таких строк окажется несколько - возвращаем первую найденную.
     * <p>
     * Например, для массива {"Тихий дон", "Вишневый сад", "Война и мир", "Мертвые души"}
     * ответом будет "Вишнеый сад".
     * <p>
     * Подсказка: массив может быть пустой
     *
     * @param strings массив строк случайной длины
     *
     * @return самую длинную строку из полученного массива
     */
    public static String task1(String[] strings) {
        /**   int i = strings.length;
     *   if (i == 0)
    *        {return "";}
    *    else{
   *          int p = 0;
    *         int maxp = 0;
    *         int[] u = new int[i];
    *         while (p < i) {
    *              u[p]=strings[p].length();
    *              maxp= u[p]>u[maxp] ?  p : maxp;
    *               if(u[p]>u[maxp]){maxp = p;}
    *              p++;
    *         }
    *
    *     return strings[maxp];}
    **/

        String smax = "";
        for (String p : strings) {
            smax = p.length() > smax.length() ? p : smax;
        }
        return  smax;}






    /**
     * В рамках задания необходимо реализовать микро-калькулятор.
     *  В качестве входных параметров будут два числа i и k, а так же символ указывающий на операцию:
     * + - сложение i и k
     * - - вычитание k из i
     * * - умножение i на k
     * / - деление i на k
     * % - остаток от деления i на k
     * <p>
     * Как мы помним, на 0 делить нельзя. В этом случае просто возвращаем 0.
     *
     * Подсказка: переданный символ операции может быть не из списка выше
     *
     * @param i         первый числовой параметр
     * @param k         второй числовой параметр
     * @param operation символ, указывающий на операцию
     *
     * @return целочисленный результат выполнения операции
     */
    public static int task2(int i, int k, char operation) {
   switch (operation){
       case '+':
           i=i+k;
           break;
       case '*':
           i=i*k;
           break;
       case '-':
           i=i-k;
           break;
       case '%':
           i=i%k;
           break;
       case '/':
           i = k==0 || i ==0 ? 0 : i/k;
        //   if (k == 0 || i ==0 )
        //   { return 0;}
        //   else{i=i/k;}
          break;
        default:
            i=0; }
            return i;




        /*   if (operation == '+') {i=i+k;}
      else{
         if (operation =='-')  {i=i-k;}
             else{
                  if (operation == '*') {i=i*k;}
                        else{
                             if (operation == '%') {i=i%k;}
                             else{
                                 if (k == 0 | i ==0 ){ i = 0;}
                                      else{
                                           if (operation == '/') {i=i/k;}
                                                else {
                                                    i=0;
                                                     }
                                            }
                                  }
                             }
                   }
          }

      return i;*/
    }





    public static void main(String[] args) {
        System.out.println(task1(new String[]{}));
    }

}
