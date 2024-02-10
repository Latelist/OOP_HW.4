import java.util.List;

/**
 * Класс Calculator с методами математических операций над элементами списка.
 * Методы могут работать как с числами, так и с строками, которые можно преобразовать в числа.
 */
public class Calculator<T extends Object> {

    /**
     * Вычисляет сумму элементов списка.
     * @param list Список элементов, над которыми выполняется операция.
     * @return Сумма элементов списка.
     */
    public double sum(List<T> list) {
        double sum = 0;
        for (T item : list) {
            if (item instanceof Number) {
                sum += ((Number) item).doubleValue();
            }
        }
        return sum;
    }

    /**
     * Выполняет деление элементов списка.
     * @param list Список элементов, над которыми выполняется операция.
     * @return Результат деления элементов списка.
     */
    public double div(List<T> list) {
        double div = 0;
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i) instanceof Number) {
                div = ((Number)list.get(i)).doubleValue();
                for (int j = i+1; j < list.size(); ++j) {
                    if (list.get(j) instanceof Number) {
                        div = div / ((Number)list.get(j)).doubleValue();
                    }
                }
                break;
            }
        }
        return div;
    }

    /**
     * Вычисляет произведение элементов списка.
     * @param list Список элементов, над которыми выполняется операция.
     * @return Произведение элементов списка.
     */
    public double mult(List<T> list) {
        double mult = 1;
        for (T item : list) {
            if (item instanceof Number) {
                mult *= ((Number)item).doubleValue();
            }
        }
        return mult;
    }

    /**
     * Проверяет, является ли строка числом.
     * @param line Строка для проверки.
     * @return true, если строка является числом, в противном случае false.
     */
    public boolean isNumeric(String line) {
        return line.matches("-?\\d+(\\.\\d+)?");
    }

    /**
     * Преобразует строку в число.
     * @param line Строка для преобразования.
     * @return Число, представленное строкой.
     */
    public double parceAsNumber(String line) {
        double number = 0.0;
        if (isNumeric(line)) {
            number = Double.parseDouble(line);
        } else {
            System.out.println("Это не число.");
        }
        return number;
    }

    /**
     * Преобразует числовое значение в двоичную систему счисления.
     * @param input Входное значение для преобразования.
     * @return Строковое представление двоичного числа.
     */
    public <T> String binaryTranslate(T input) {
        double number = 0;
        StringBuilder result = new StringBuilder();
        if (input instanceof String) {
            number = parceAsNumber((String) input);
        } else if (input instanceof Number) {
            number = ((Number)input).doubleValue();
        }
        double rest = number - (int) number;
        int intNumber = (int) number;
        while (intNumber > 0) {
            int resNumber = intNumber % 2;
            result.insert(0, resNumber);
            intNumber /= 2;
        }
        if (rest == 0) {
            return result.toString();
        } else {
            result.append(".");
            while (rest != 0) {
                rest *= 2;
                result.append((int) rest);
                rest = rest - (int) rest;
            }
            return result.toString();
        }
    }
}
