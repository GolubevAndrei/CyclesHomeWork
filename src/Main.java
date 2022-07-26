public class Main {
    public static void main(String[] args) {
        // Задание 1
        int i = 1;
        while (i <= 10) {
            System.out.print(i++);
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j);
        }
        // Задание 2
        System.out.println();
        int b = 3;
        for (int g = 1; g <= 31; g++) {
            if (g == b) {
                System.out.println("Сегодня пятница " + b + "е число. Необходимо подготовить отчёт");
                b = b + 7;
            }
        }
        // Задание 3
        int zeroYear = 0;
        int yearDown = 1822;
        int yearUp = 2122;
        while (zeroYear < yearUp) {
            if (zeroYear % 79 == 0 && zeroYear >= yearDown && zeroYear <= yearUp) {
                System.out.println("Комета пролетала в " + zeroYear + " году");
            }
            zeroYear++;
        }
    }
}