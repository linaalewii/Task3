public class Main {
    public static void main(String[] args) {
        StringArray stringArray = new StringArray();

        stringArray.addString("student");
        stringArray.addString("school");
        stringArray.addString("apple");
        stringArray.addString("r");

        System.out.println("Строка максимальной длины: " + stringArray.getMax());
        System.out.println("Средняя длина строк: " + stringArray.getAverageLength());
    }
}




