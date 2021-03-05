import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.print("Введите размер списка: ");
        int size = scanner.nextInt();

        System.out.print("Введите верхнюю границу для значений: ");
        int high = scanner.nextInt();

        logger.log("Создаем и наполняем список случайными числами");
        List<Integer> numbers = new Random()
                .ints(0, high)
                .limit(size)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Вот случайный список: " + numbers);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int treshold = scanner.nextInt();

        Filter filter = new Filter(treshold);

        List<Integer> filteredList = filter.filterOut(numbers);

        logger.log("Выводим результат на экран");

        System.out.println("Отфильтрованный список: " + filteredList);

        logger.log("Завершаем программу");
    }
}
