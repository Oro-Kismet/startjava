public class CyclesTheme {
    public static void main(String[] args) {
       /* Подсчет суммы четных и нечетных чисел
       подсчитайте с помощью do-while сумму четных и нечетных чисел в отрезке [-10, 21]
       отобразите эти значения в формате: */
       int counter = 0;
       int beginNumber = -10;
       int endNumber = 21;
       int currentInt = 0;
       float currentFloat = 0;
       int summaChet = 0;
       int summaNechet = 0;
       counter = beginNumber;
       do { 
        currentInt = (counter / 2);
        currentFloat = (float) counter / 2;
        //System.out.print(currentInt + "  " + currentFloat + " ;");
        if  ( currentInt == currentFloat ) {
            summaChet += counter;
        } else {
            summaNechet += counter;
        }
        counter++;
        }  while ( counter != endNumber );
    System.out.print("В отрезке [");
    System.out.print(beginNumber);
    System.out.print(",");
    System.out.print(endNumber);
    System.out.print("] сумма четных чисел = ");
    System.out.print(summaChet);
    System.out.print(", а нечетных = ");
    System.out.print(summaNechet);
       //В отрезке [-10, 21] сумма четных чисел = X, а нечетных = Y

/*при этом для вывода чисел из [-10, 21] используйте значения переменных, а не сами числа

Вывод чисел в порядке убывания
среди значений 10, 5, -1 найдите max и min число
отобразите в одну строку в порядке убывания все числа в интервале (min, max) 
для вывода чисел используйте for
обратите внимание, что интервал — математический (не путайте его с отрезком)
использовать методы max и min класса Math — нельзя

Вывод реверсивного числа и суммы его цифр
из числа 1234 выделите каждую цифру, используя while
подсчитайте сумму полученных цифр
отобразите в консоли:
исходное число в обратном порядке (при этом формировать число целиком, чтобы вывести, не нужно)
сумму его цифр

Вывод чисел в несколько строк
выведите с помощью for нечетные числа в полуинтервале [1, 24)
отображайте в каждой строке по 5 чисел
отделяйте их друг от друга необходимым количеством пробелов
не указывайте впереди числа нули
недостающее в последней строке до 5 количество чисел заполните нулями
число нулей определяйте программно. Не считайте их в уме и не пишите сами
выравнивайте числа в каждом столбце по правому краю, используя форматированный вывод с помощью printf (1, 2)
для себя проверьте, правильно ли работает программа для полуинтервала [1, 30). В последней строке не должны отображаться одни нули

Проверка количества двоек числа на четность/нечетность
подсчитайте с помощью while количество входящих в 3242592 двоек
проверьте получившееся значение на четность/нечетность
отобразите результат в следующем формате:
В 3242592 нечетное количество двоек — 3


Отображение геометрических фигур
отобразите геометрические фигуры, используя:
для прямоугольника только for
для прямоугольного треугольника только while
для второго треугольника только do-while (для его отображения достаточно двух циклов, а не четырех)
фигуры отображайте друг под другом (не как в образце)
**********    #####    $
**********    ####     $$
**********    ###      $$$ 
**********    ##       $$
**********    #        $

Отделяйте пустой строкой код одной фигуры от другой, чтобы он не сливался

Отображение ASCII-символов
отобразите, используя for, данные столбцов DECIMAL, CHARACTER и DESCRIPTION (включая их названия) из таблицы
для вывода значений последнего столбца используйте метод Character.getName()
выведите в консоль:
символы, идущие до цифр и имеющие нечетные коды, начиная с кода 15
маленькие английские буквы, имеющие четные коды
данные столбцов выровняйте по центру их названий. А в DESCRIPTION — еще и по левому краю



Проверка, является ли число палиндромом
проверьте, является ли 1234321 палиндромом (читается одинаково с любой стороны)
использовать Math.pow нельзя
отобразите результат в следующем формате:
число N является (не является) палиндромом


Проверка, является ли число счастливым
счастливым называется число, сумма первых трех цифр которого равна сумме последних
возьмите любое шестизначное число
подсчитайте сумму каждой его половины
отобразите результат в следующем формате:
Число ABCDEF является (не является) счастливым
Сумма цифр ABC = S1, а сумма DEF = S2


Отображение таблицы умножения Пифагора
с помощью for отобразите таблицу умножения в точности, как в образце (включая горизонтальные и вертикальные линии. Их можно отображать прерывистыми)
*/
    }
    
}
