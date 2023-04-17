import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] family = new String[] {"mama", "papa", "sister", "brother", "best family"};
        result(family);
    }

    public static void result(String[] family) {
        List<String> helpList = new ArrayList<>();
        for (int i = 0; i < family.length; i++) {
            char[] letters = family[i].toCharArray();

            Map<Character, Integer> helpMap = new HashMap<>();
            for (Character letter : letters) {
                if (helpMap.containsKey(letter)) {
                    Integer count = helpMap.get(letter) + 1;
                    helpMap.put(letter, count);
                } else {
                    helpMap.put(letter, 1);
                }
            }
            boolean isCorrect = true;
            for (Character key : helpMap.keySet()) {
                if (helpMap.get(key) % 2 != 0) {
                    isCorrect = false;
                }
            }
            if (isCorrect) {
                helpList.add(family[i]);
            }
        }
        Set<Character> resultSet = new HashSet<>();
        for (String word : helpList) {
            for (Character character : word.toCharArray()) {
                resultSet.add(character);
            }
        }
        System.out.println(resultSet);
    }
}