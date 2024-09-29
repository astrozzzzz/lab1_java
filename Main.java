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
        return x - (int) x;
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

    public static void main(String[] args) {
        Main m = new Main();

        // Задание 1.
        // Номер 1
        double x = 5.25;
        double res_double = m.fraction(x);
        out.printf("Для x = %.2f, дробная часть: %.2f%n", x, res_double);
        // Номер 3
        char x1 = '3';
        int res_int = m.charToNum(x1);
        out.println("Для символа '" + x1 + "' числовое значение: " + res_int);
        // Номер 5
        int x2 = 23;
        boolean res_bool = m.is2Digits(x2);
        out.println(x2 + " - это двузначное число: " + res_bool);
        // Номер 7
        int a, b, num;
        a = 5;
        b = 1;
        num = 2;
        res_bool = m.isInRange(a, b, num);
        out.println(num + " входит в диапазон (" + a + ", " + b + "): " + res_bool);
        // Номер 9
        int c;
        a = 2;
        b = 2;
        c = 3;
        res_bool = m.isEqual(a, b, c);
        out.printf("Числа %d, %d, %d равны: %b%n", a, b, c, res_bool);

        // Задание 2
        // Номер 1
        int x4 = -4;
        out.println("Модуль " + x4 + " = " + m.abs(x4));
        // Номер 3
        x4 = 5;
        out.println("Число " + x4 + " подходит: " + m.is35(x4));
        // Номер 5
        a = 5;
        b = 3;
        c = 2;
        out.println("Максимум: " + m.max3(a, b, c));
        // Номер 7
        int x_int, y_int;
        x_int = 5;
        y_int = 8;
        out.printf("Сумма %d + %d = %d\n", x_int, y_int, m.sum2(x_int, y_int));
        // Номер 9
        int d = 10;
        out.printf("День недели %d: %s\n", d, m.day(d));

        // Задание 3
        // Номер 1
        x_int = 0;
        out.println("Числа до " + x_int + ": " + m.listNums(x_int));
        // Номер 3
        x_int = 9;
        out.println("Чётные до " + x_int + ": " + m.chet(x_int));
        // Номер 5
        long x_long = 12345;
        out.println("Количество знаков в числе " + x_long + ": " + m.numLen(x_long));
        // Номер 7
        x_int = 4;
        m.square(x_int);
        // Номер 9
        x_int = 5;
        m.rightTriangle(x_int);

        // Задание 4
        // Номер 1
        x_int = 2;
        int[] arr_int = new int[]{1, 3, 4};
        out.println("Первое вхождение " + x_int + " в массив " + m.arrToStr(arr_int) + ": " + m.findFirst(arr_int, x_int));
        // Номер 3
        arr_int = new int[]{1, 2, -7, 8, -9};
        out.println("Максимальный модуль в " + m.arrToStr(arr_int) + " : " + m.maxAbs(arr_int));
        // Номер 5
        arr_int = new int[]{1, 2, 3, 4, 5};
        int[] ins = new int[]{7, 8, 9};
        int pos = 3;
        int[] output = m.add(arr_int, ins, pos);
        out.println("Итоговоый массив: " + m.arrToStr(output));
        // Номер 7
        out.println("Исходный массив: " + m.arrToStr(arr_int));
        out.println("Обратный массив: " + m.arrToStr(m.reverseBack(arr_int)));
        // Номер 9
        arr_int = new int[]{1,2,3,8,2,2,9};
        x_int = 2;
        out.println("Индексы: " + m.arrToStr(m.findAll(arr_int, x_int)));
    }
}