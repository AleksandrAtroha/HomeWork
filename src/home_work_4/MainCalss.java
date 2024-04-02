package home_work_4;

public class MainCalss {
    public static void main(String[] args) {
        String[] array = {"12","123","45","48"};
        DataContainer<String> dataContainer = new DataContainer<>(array);
        System.out.println("Вывод массива- "+dataContainer.toString());
        System.out.println(dataContainer.add("15"));
        System.out.println("Вывод массива после добавления 15 - "+dataContainer.toString());
        System.out.println(dataContainer.delete("45"));
        System.out.println("Вывод массива после удаления 45- "+dataContainer.toString());
        System.out.println(dataContainer.delete(2));
        System.out.println("Вывод массива после удаления 2 элемента- "+dataContainer.toString());

    }
}
