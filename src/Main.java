import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Самостоятельная работа:
         */
        /*1) Вывести список
        Создайте список из 5 целых чисел. Выведите его элементы через пробел.*/

        System.out.println("1. Создайте список из 5 целых чисел. Выведите его элементы через пробел.");
        List<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(7);
        numList.add(42);
        numList.add(9);
        numList.add(95);
        printList(numList);
        /*
        2) Доступ по индексу
        Выведите третий элемент списка
         */

        System.out.println("2. Выведите третий элемент списка");
        System.out.println(numList.get(2));

        /*3) Удаление элемента
        Удалите второй элемент списка и выведите оставшиеся*/

        System.out.println("3. Удалите второй элемент списка и выведите оставшиеся");
        numList.remove(1);
        printList(numList);
        /*4) Сумма элементов
        Найдите сумму всех чисел в списке*/
        System.out.println("4. Найдите сумму всех чисел в списке");
        long sum = 0;
        for (Integer num : numList) {
            sum += num;
        }
        System.out.println(sum);
        /*5) Подсчёт количества
        Подсчитайте, сколько раз в списке встречается число 7*/
        System.out.println("5. Подсчитайте, сколько раз в списке встречается число 7");
        System.out.println(Collections.frequency(numList, 7));
        /*6) Поиск элемента
        Проверьте, содержится ли число 42 в списке*/
        System.out.println("6. Проверьте, содержится ли число 42 в списке");
        if (numList.contains(42)) {
            System.out.println("В списке есть ответ на все вопросы");
        }
        /*7) Минимум и максимум
        Найдите и выведите минимальное и максимальное число в списке*/
        System.out.println("7. Найдите и выведите минимальное и максимальное число в списке");
        int max = Collections.max(numList);
        int min = Collections.min(numList);
        System.out.println("Максимальное: " + max + " Минимальное: " + min);
        /* 8) Удалить все чётные числа
        Удалите из списка все числа, делящиеся на 2.
        */
        System.out.println("8. Удалите из списка все числа, делящиеся на 2.");
        numList.removeIf(number -> number % 2 == 0);
        printList(numList);
        /* 9) Создание списка из массива
        Создайте список из массива int[] arr = {1, 2, 3, 4}.
        */
        System.out.println("9. Создайте список из массива int[] arr = {1, 2, 3, 4}.");
        int[] arr = {1, 2, 3, 4};
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            newList.add(arr[i]);
        }
        printList(newList);
        /*
        10) Количество элементов > N
        Найдите количество элементов, больше чем число N*/
        System.out.println("10. Найдите количество элементов, больше чем число 4");
        int count = 0;
        for (Integer num : numList) {
            if (num > 4) {
                count++;
            }
        }
        System.out.println("Количество: " + count);
        /*11) Создание списка строк и фильтрация
        Создайте список строк. Выведите строки, длина которых больше 5*/
        System.out.println("11. Создайте список строк. Выведите строки, длина которых больше 5");
        List<String> strList = new LinkedList<>();
        strList.add("Test");
        strList.add("Pivchanski");
        strList.add("Test of waters");
        strList.add("Airplane");
        strList.add("Orangutan");
        for (String str : strList) {
            if (str.length() > 5) {
                System.out.print(" " + str);
            }
        }
        System.out.println("");
        /*12) Инвертировать список
        Напишите метод, который возвращает список в обратном порядке*/
        System.out.println("12. Напишите метод, который возвращает список в обратном порядке");
        printList(strList);
        strList = invertList(strList);
        System.out.println("После инвертирования: ");
        printList(strList);
        /*13) Объединение двух списков без дубликатов
        Даны два списка. Объедините их в один, не добавляя повторы*/
        System.out.println("13. Даны два списка. Объедините их в один, не добавляя повторы");
        System.out.println("Первый список:");
        printList(numList);
        List<Integer> numList2 = new ArrayList<>();
        numList2.add(10);
        numList2.add(7);
        numList2.add(42);
        numList2.add(9);
        numList2.add(95);
        System.out.println("Второй список:");
        printList(numList);
        Set<Integer> set = new LinkedHashSet<>(numList2);
        set.addAll(numList2);
        System.out.println("Результат:");
        System.out.println(set);
        /*14) Сумма только нечётных чисел
        Считайте List<Integer> и посчитайте сумму только нечётных чисел*/
        System.out.println("14. Считайте List<Integer> и посчитайте сумму только нечётных чисел");
        sum = 0;
        printList(numList);
        for (Integer num : numList) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println("Сумма целых чисел: " + sum);
        /*15) Фильтр по первой букве
        Дан список строк. Верните новый список, содержащий только строки, начинающиеся с буквы "А"*/
        System.out.println("15.Дан список строк. Верните новый список, содержащий только строки, начинающиеся с буквы А");
        List<String> aList = new LinkedList<>();
        for (String str : strList) {
            if (str.startsWith("A")) {
                aList.add(str);
            }
        }
        printList(aList);
    }

    /**
     * Печать списка.
     *
     * @param arrlist - список
     */
    public static <T> void printList(List<T> arrlist) {
        for (T num : arrlist) {
            System.out.print(num + " ");
        }
        System.out.print("\n");
    }

    /**
     * Инвертирует список
     *
     * @param list - список на вход
     * @return - инвертированый список
     */
    public static <T> List<T> invertList(List<T> list) {
        for (int i = 0, j = list.size() - 1; i < j; i++) {
            list.add(i, list.remove(j));
        }
        return list;
    }
}