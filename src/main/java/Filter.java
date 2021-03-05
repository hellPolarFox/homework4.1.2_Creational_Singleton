import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) < treshold) {
                logger.log("Элемент \"" + source.get(i) + "\" не прошел фильтрацию");
            } else {
                logger.log("Элемент \"" + source.get(i) + "\" подходит");
                result.add(source.get(i));
            }
        }
        return result;
    }
}
