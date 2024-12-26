import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StringArray {
    private ArrayList<String> strings;

    // Конструктор
    public StringArray() {
        strings = new ArrayList<>();
    }

    // Метод для добавления элемента
    public void addString(String str) {
        strings.add(str);
        // Сортировка по длине строки
        Collections.sort(strings, Comparator.comparingInt(String::length));
    }

    // Метод для получения строки максимальной длины
    public String getMax() {
        if (strings.isEmpty()) {
            throw new IllegalStateException("Массив пуст.");
        }
        return Collections.max(strings, Comparator.comparingInt(String::length));
    }

    // Метод для вычисления средней длины строк
    public double getAverageLength() {
        if (strings.isEmpty()) {
            return 0.0;
        }
        int totalLength = 0;
        for (String s : strings) {
            totalLength += s.length();
        }
        return (double) totalLength / strings.size();
    }
}







