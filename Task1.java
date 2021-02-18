public class Task1{
    public static void main(String[] args) {
        System.out.printf("%n ---Part 1--- %n");
        System.out.printf("  5 %% 5 -> %d %n", remainder(5,5));
        System.out.printf("-9 %% 45 -> %d %n", remainder(-9,45));
        System.out.printf("  1 %% 3 -> %d %n", remainder(1,3));
        System.out.printf("  3 %% 4 -> %d %n", remainder(3,4));

        System.out.printf("%n ---Part 2--- %n");
        System.out.printf("triArea( 3, 2) -> %d %n", triArea(3,2));
        System.out.printf("triArea( 7, 4) -> %d %n", triArea(7,4));
        System.out.printf("triArea(10,10) -> %d %n", triArea(10,10));

        System.out.printf("%n ---Part 3--- %n");
        System.out.printf("animals(2,3,5) -> %d %n", animals(2,3,5));
        System.out.printf("animals(1,2,3) -> %d %n", animals(1,2,3));
        System.out.printf("animals(5,2,8) -> %d %n", animals(5,2,8));

        System.out.printf("%n ---Part 4--- %n");
        System.out.printf("profitableGamble(0.2,50,9) -> %b %n", profitableGamble(0.2,50,9));
        System.out.printf("profitableGamble(0.9, 1,2) -> %b %n", profitableGamble(0.9,1,2));
        System.out.printf("profitableGamble(0.9, 3,2) -> %b %n", profitableGamble(0.9,3,2));

        System.out.printf("%n ---Part 5--- %n");
        System.out.printf("operation(24,15, 9) -> %s %n", operation(24,15,9));
        System.out.printf("operation(24,26, 2) -> %s %n", operation(24,26,2));
        System.out.printf("operation(15,11,11) -> %s %n", operation(15,11,11));

        System.out.printf("%n ---Part 6--- %n");
        System.out.printf("ctoa(\'A\') -> %d %n", ctoa('A'));
        System.out.printf("ctoa(\'m\') -> %d %n", ctoa('m'));
        System.out.printf("ctoa(\'[\') -> %d %n", ctoa('['));
        System.out.printf("ctoa(\'\\\') -> %d %n", ctoa('\\'));

        System.out.printf("%n ---Part 7--- %n");
        System.out.printf("addUpTo( 3) -> %d %n", addUpTo(3));
        System.out.printf("addUpTo(10) -> %d %n", addUpTo(10));
        System.out.printf("addUpTo( 7) -> %d %n", addUpTo(7));

        System.out.printf("%n ---Part 8--- %n");
        System.out.printf("nextEdge(8,10) -> %d %n", nextEdge(8,10));
        System.out.printf("nextEdge(5, 7) -> %d %n", nextEdge(5,7));
        System.out.printf("nextEdge(9, 2) -> %d %n", nextEdge(9,2));

        System.out.printf("%n ---Part 9--- %n");
        System.out.printf("sumOfCubes(new int[]{1, 5, 9}) -> %d %n", sumOfCubes(new int[]{1, 5, 9}));
        System.out.printf("sumOfCubes(new int[]{3, 4, 5}) -> %d %n", sumOfCubes(new int[]{3, 4, 5}));
        System.out.printf("sumOfCubes(new int[]{      2}) -> %d %n", sumOfCubes(new int[]{2}));
        System.out.printf("sumOfCubes(new int[]{       }) -> %d %n", sumOfCubes(new int[]{}));
        System.out.printf("sumOfCubes(new int[]{ -1, -3}) -> %d %n", sumOfCubes(new int[]{-1, -3}));

        System.out.printf("%n ---Part10--- %n");
        System.out.printf("abcmath(42, 5, 10) -> %b %n", abcmath(42, 5, 10));
        System.out.printf("abcmath( 5, 2,  1) -> %b %n", abcmath(5, 2, 1));
        System.out.printf("abcmath( 1, 2,  3) -> %b %n", abcmath(1, 2, 3));
    }

    // Задание №1
    // В Java есть единственный оператор, способный обеспечить остаток от операции
    // деления. Два числа передаются в качестве параметров. Первый параметр,
    // разделенный на второй параметр, будет иметь остаток, возможно, ноль. Верните
    // это значение.

    // Создадим метод remainder, возвращающий остаток частного при делении,
    // использовав оператор %
    public static int remainder(int num, int div) {
        return num % div;
    }

    // Задание №2
    // Напишите функцию, которая принимает основание и высоту треугольника и
    // возвращает его площадь.

    // Возвращаем произведение основания на высоту, поделенное пополам
    public static int triArea(int w, int h) {
        return w*h/2;
    }

    // Задание №3
    // В этой задаче фермер просит вас сказать ему, сколько ног можно сосчитать среди
    // всех его животных. Фермер разводит три вида:
    // chickens = 2 legs, cows = 4 legs, pigs = 4 legs
    // Фермер подсчитал своих животных, и он дает вам промежуточный итог для каждого вида.
    // Вы должны реализовать функцию, которая возвращает общее количество ног всех
    // животных.

    // Возвращаем количество ног среди животных
    public static int animals(int chickens, int cows, int pigs) {
        return chickens*2 + (cows+pigs)*4;
    }

    // Задание №4
    // Создайте функцию, которая принимает три аргумента (prob, prize, pay) и
    // возвращает true, если prob * prize > pay; в противном случае возвращает false.

    // Возвращаем значение сравнения полученного дохода с 0
    public static boolean profitableGamble(double prob, double prize, double pay) {
        boolean profitable = prob*prize - pay > 0.;
        return profitable;
    }

    // Задание №5
    // Напишите функцию, которая принимает 3 числа и возвращает, что нужно сделать с
    // a и b: они должны быть сложены, вычитаны, умножены или разделены, чтобы
    // получить N. Если ни одна из операций не может дать N, верните "none".
    // 3 числа – это N, a и b.

    // Проверяем с помощью ветвлений if else
    public static String operation(int result, int a, int b) {
        if (a + b == result)
            return "added";
        else if (a - b == result)
            return "subtracted";
        else
            return "none";
    }

    // Задание №6
    // Создайте функцию, которая возвращает значение ASCII переданного символа.

    // Явно преобразовываем символ в целочисленный тип
    public static int ctoa(char c) {
        return (int)c;
    }

    // Задание №7
    // Напишите функцию, которая берет последнее число из последовательного списка
    // чисел и возвращает сумму всех чисел до него и включая его.

    // С помощью цикла for складываем все числа от 1 до n включительно
    public static int addUpTo(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    // Задание №8
    // Создайте функцию, которая находит максимальное значение третьего ребра
    // треугольника, где длины сторон являются целыми числами.

    // Так как a + b > c и a,b,c - целые числа, 
    // то максимальное значение c = a + b - 1.
    public static int nextEdge(int a, int b) {
        return a + b - 1;
    }

    // Задание №9
    // Создайте функцию, которая принимает массив чисел и возвращает сумму его
    // кубов.

    // Возводим в куб каждый элемент массива и прибавляем к результату.
    public static int sumOfCubes(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i]*array[i]*array[i]; // или (int)Math.pow(array[i],3)
        }
        return result;
    }

    // Задание №10
    // Создайте функцию, которая будет для данного a, b, c выполнять следующие
    //действия:
    //– Добавьте A к себе B раз.
    //– Проверьте, делится ли результат на C.

    // С помощью цикла for добавляем a к себе b раз
    // Возвращаем результат сравнения нуля и остатка частного от деления a на c
    public static boolean abcmath(int a, int b, int c) {
        for (int i = 0; i < b; i++) {
            a += a;
        }
        return a % c == 0;
    }
}