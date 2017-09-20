import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Application {

    public static void main(final String... args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String textPath = scanner.nextLine();
        File file = new File(textPath);
//        File file = new File("Text.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            StringBuilder stringBuilder = new StringBuilder();
            String line = bufferedReader.readLine();
            while (line != null) {
                stringBuilder.append(line);
                line = bufferedReader.readLine();
            }
            line = stringBuilder.toString();

            char[] charArray = line.toCharArray();
            Brackets.contains_incorrect_brackets(charArray);

            String[] words = line.toLowerCase().replaceAll("[+-.,!?:']", "").split("\\s");

            Map<String, Integer> counterMap = new HashMap<>();
            Integer count;
            for (String word : words) {
                if (!word.isEmpty()) {
                    count = counterMap.get(word);
                    if (count == null) {
                        count = 0;
                    }
                    if (!UselessWords.contains_useless_words(word)) {
                        counterMap.put(word, ++count);
                    }
                }
            }

            List list = new ArrayList(counterMap.entrySet());
            Collections.sort(list, new Comparator() {
                @Override
                public int compare(Object obj1, Object obj2) {
                    return ((Comparable) ((Map.Entry) (obj1)).getValue())
                            .compareTo(((Map.Entry) (obj2)).getValue());
                }
            });

            for (int i = (list.size() - 10); i < list.size(); i++) {
                System.out.println(list.get(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
