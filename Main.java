import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public String arrToStr(int[] arr) {
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
            if (i != arr.length - 1) {
                res += " ";
            }
        }
        return res;
    }
    // Задание 1.
    // Номер 1
    public double fraction(double x) {
        return Math.abs(x) - Math.floor(Math.abs(x));
    }
    // Номер 3
    public int charToNum(char x) {
        if (x > 56 || x < 48) {
            throw new IllegalArgumentException("Неверный ввод");
        }
        return x - 48;
    }
    // Номер 5
    public boolean is2Digits (int x) {
        return x >= 10 && x <= 99;
    }
    // Номер 7
    public boolean isInRange (int a, int b, int num) {
        return (num >= a && num <= b) || (num <= a && num >= b);
    }
    // Номер 9
    public boolean isEqual(int a, int b, int c) {
        return (a == b) && (c == b);
    }
    // Задание 2
    // Номер 1
    public int abs (int x) {
        if (x >= 0) {
            return x;
        }
        return -x;
    }
    // Номер 3
    public boolean is35 (int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return false;
        }
        else if (x % 3 == 0 || x % 5 == 0) {
            return true;
        }
        return false;
    }
    // Номер 5
    public int max3 (int x, int y, int z) {
        int res = x;
        if (y > res) {
            res = y;
        }
        if (z > res) {
            res = z;
        }
        return res;
    }
    // Номер 7
    public int sum2 (int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }
    // Номер 9
    public String day (int x) {
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }

    // Задание 3
    // Номер 1
    public String listNums (int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Неверный ввод");
        }
        String res = "";
        for (int i = 0; i <= x; i++) {
            res += i;
            if (i != x) {
                res += " ";
            }
        }
        return res;
    }
    // Номер 3
    public String chet (int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Неверный ввод");
        }
        String res = "";
        for (int i = 0; i <= x; i+=2) {
            res += i;
            res += " ";
        }
        return res;
    }
    // Номер 5
    public int numLen (long x) {
        int res = 1;
        while (x / 10 > 0) {
            res += 1;
            x /= 10;
        }
        return res;
    }
    // Номер 7
    public void square (int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Неверный ввод");
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                out.print("*");
            }
            out.println();
        }
    }
    // Номер 9
    public void rightTriangle (int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Неверный ввод");
        }
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                out.print("*");
            }
            out.println();
        }
    }

    // Задание 4
    // Номер 1
    public int findFirst (int[] arr, int x) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Неверный массив");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    // Номер 3
    public int maxAbs (int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Неверный ввод");
        }
        int maxAbs = 0;
        int maxInt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) > maxAbs) {
                maxAbs = Math.abs(arr[i]);
                maxInt = arr[i];
            }
        }
        return maxInt;
    }
    // Номер 5
    public int[] add (int[] arr, int[] ins, int pos) {
        if (arr == null || ins == null || pos < 0 || pos > arr.length) {
            throw new IllegalArgumentException("Неверный ввод");
        }
        int[] res = new int[arr.length + ins.length];
        System.arraycopy(arr, 0, res, 0, pos);
        System.arraycopy(ins, 0, res, pos, ins.length);
        System.arraycopy(arr, pos, res, pos + ins.length, arr.length - pos);
        return res;
    }
    // Номер 7
    public int[] reverseBack (int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Неверный ввод");
        }
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
    // Номер 9
    public int[] findAll (int[] arr, int x) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Неверный ввод");
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        int[] indexes = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indexes[index] = i;
                index++;
            }
        }
        return indexes;
    }

    private static void task1(Main m, Scanner scanner) {
        out.println("Выберите номер подзадания:");
        int subChoice = scanner.nextInt();

        switch (subChoice) {
            case 1:
                out.print("Введите дробное число: ");
                double x = scanner.nextDouble();
                double res_double = m.fraction(x);
                out.printf("Для x = %.2f, дробная часть: %.2f%n", x, res_double);
                break;
            case 3:
                out.print("Введите символ цифры: ");
                char x1 = scanner.next().charAt(0);
                int res_int = m.charToNum(x1);
                out.println("Для символа '" + x1 + "' числовое значение: " + res_int);
                break;
            case 5:
                out.print("Введите число для проверки на двузначность: ");
                int x2 = scanner.nextInt();
                boolean res_bool = m.is2Digits(x2);
                out.println(x2 + " - это двузначное число: " + res_bool);
                break;
            case 7:
                out.print("Введите три числа (a, b, num): ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int num = scanner.nextInt();
                res_bool = m.isInRange(a, b, num);
                out.println(num + " входит в диапазон (" + a + ", " + b + "): " + res_bool);
                break;
            case 9:
                out.print("Введите три числа для проверки на равенство: ");
                a = scanner.nextInt();
                b = scanner.nextInt();
                int c = scanner.nextInt();
                res_bool = m.isEqual(a, b, c);
                out.printf("Числа %d, %d, %d равны: %b%n", a, b, c, res_bool);
                break;
            default:
                out.println("Неверный ввод");
        }
    }

    private static void task2(Main m, Scanner scanner) {
        out.println("Выберите номер подзадания");
        int subChoice = scanner.nextInt();

        switch (subChoice) {
            case 1:
                out.print("Введите число для вычисления модуля: ");
                int x = scanner.nextInt();
                out.println("Модуль " + x + " = " + m.abs(x));
                break;
            case 3:
                out.print("Введите число для проверки делимости на 3 или 5: ");
                x = scanner.nextInt();
                out.println("Число " + x + " подходит: " + m.is35(x));
                break;
            case 5:
                out.print("Введите три числа для нахождения максимума: ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                out.println("Максимум: " + m.max3(a, b, c));
                break;
            case 7:
                out.print("Введите два числа для суммирования: ");
                int x_int = scanner.nextInt();
                int y_int = scanner.nextInt();
                out.printf("Сумма %d + %d = %d\n", x_int, y_int, m.sum2(x_int, y_int));
                break;
            case 9:
                out.print("Введите номер дня недели: ");
                int d = scanner.nextInt();
                out.printf("День недели %d: %s\n", d, m.day(d));
                break;
            default:
                out.println("Неверный ввод");
        }
    }

    private static void task3(Main m, Scanner scanner) {
        out.println("Выберите номер подзадания:");
        int subChoice = scanner.nextInt();

        switch (subChoice) {
            case 1:
                out.print("Введите число для вывода списка чисел: ");
                int x = scanner.nextInt();
                out.println("Числа до " + x + ": " + m.listNums(x));
                break;
            case 3:
                out.print("Введите число для вывода четных чисел: ");
                x = scanner.nextInt();
                out.println("Чётные до " + x + ": " + m.chet(x));
                break;
            case 5:
                out.print("Введите число для подсчета количества знаков: ");
                long x_long = scanner.nextLong();
                out.println("Количество знаков в числе " + x_long + ": " + m.numLen(x_long));
                break;
            case 7:
                out.print("Введите размер квадрата: ");
                x = scanner.nextInt();
                m.square(x);
                break;
            case 9:
                out.print("Введите высоту треугольника: ");
                x = scanner.nextInt();
                m.rightTriangle(x);
                break;
            default:
                out.println("Неверный ввод");
        }
    }

    private static void task4(Main m, Scanner scanner) {
        out.println("Выберите номер подзадания:");
        int subChoice = scanner.nextInt();

        // Ввод общего массива для всех подзаданий
        out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        switch (subChoice) {
            case 1:
                out.print("Введите число для поиска: ");
                int x = scanner.nextInt();
                out.println("Первое вхождение " + x + " в массив " + m.arrToStr(arr) + ": " + m.findFirst(arr, x));
                break;
            case 3:
                out.println("Максимальный модуль в " + m.arrToStr(arr) + " : " + m.maxAbs(arr));
                break;
            case 5:
                out.print("Введите размер второго массива: ");
                int insSize = scanner.nextInt();
                int[] ins = new int[insSize];
                out.println("Введите элементы второго массива:");
                for (int i = 0; i < insSize; i++) {
                    ins[i] = scanner.nextInt();
                }
                out.print("Введите позицию для вставки: ");
                int pos = scanner.nextInt();
                int[] output = m.add(arr, ins, pos);
                out.println("Итоговый массив: " + m.arrToStr(output));
                break;
            case 7:
                out.println("Исходный массив: " + m.arrToStr(arr));
                out.println("Обратный массив: " + m.arrToStr(m.reverseBack(arr)));
                break;
            case 9:
                out.print("Введите число для поиска всех вхождений: ");
                x = scanner.nextInt();
                out.println("Индексы: " + m.arrToStr(m.findAll(arr, x)));
                break;
            default:
                out.println("Неверный ввод");
        }
    }


    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);

        out.println("\nВыберите номер задания:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                task1(m, scanner);
                break;
            case 2:
                task2(m, scanner);
                break;
            case 3:
                task3(m, scanner);
                break;
            case 4:
                task4(m, scanner);
                break;
            default:
                out.println("Неверный ввод");
        }
        scanner.close();
    }
}