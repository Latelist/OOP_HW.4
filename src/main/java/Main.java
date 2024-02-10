import java.util.List;

/**
 * Класс Main содержит метод main для демонстрации использования класса Calculator.
 */
public class Main {
    /**
     * Точка входа в программу. Использование класса Calculator с дженериками для различных типов данных.
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        // Создание экземпляра калькулятора для работы с целыми числами
        Calculator<Integer> intCalculator = new Calculator<>();
        // Создание списка целых чисел
        List<Integer> numbers = List.of(92, 2);
        // Вычисление суммы, деления и произведения элементов списка
        double sum = intCalculator.sum(numbers);
        double div = intCalculator.div(numbers);
        double mult = intCalculator.mult(numbers);
        // Вывод результатов
        System.out.println(sum);
        System.out.println(div);
        System.out.println(mult);

        System.out.println("");

        // Создание экземпляра калькулятора для работы с вещественными числами
        Calculator<Double> doubleCalculator = new Calculator<>();
        // Создание списка вещественных чисел
        List<Double> doubleNumbers = List.of(23.7, 91.3, -14.12, 82.0, 95.3);
        // Вычисление суммы, деления и произведения элементов списка
        double doubleSum = doubleCalculator.sum(doubleNumbers);
        double doubleDiv = doubleCalculator.div(doubleNumbers);
        double doubleMult = doubleCalculator.mult(doubleNumbers);
        // Вывод результатов
        System.out.println(doubleSum);
        System.out.println(doubleDiv);
        System.out.println(doubleMult);

        System.out.println("");

        // Создание экземпляра калькулятора для работы с объектами
        Calculator<Object> objectCalculator = new Calculator<>();
        // Создание списка объектов разных типов
        List<Object> objects = List.of("adasda", 21.3, 34, 5, "awwqe");
        // Вычисление суммы, деления и произведения элементов списка
        double objSum = objectCalculator.sum(objects);
        double objDiv = objectCalculator.div(objects);
        double objMult = objectCalculator.mult(objects);
        // Вывод результатов
        System.out.println(objSum);
        System.out.println(objDiv);
        System.out.println(objMult);

        System.out.println("");

        // Вывод результатов бинарного перевода разных значений
        System.out.println(objectCalculator.binaryTranslate(5));
        System.out.println(objectCalculator.binaryTranslate(5.1));
        System.out.println(objectCalculator.binaryTranslate("5.0"));
        System.out.println(objectCalculator.binaryTranslate("5.1"));
        System.out.println(objectCalculator.binaryTranslate("Не число."));
    }
}
