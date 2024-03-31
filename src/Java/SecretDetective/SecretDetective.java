package SecretDetective;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecretDetective {

    public String recoverSecret(char[][] triplets) {

        Map<Character, LinkedHashSet<Character>> charMap = tripletsToHashMap(triplets);
        orderCharMap(charMap);

        // Sort the HashMap by the size of its list values in the opposite order using streams

        return charMap.entrySet().stream()
                .sorted((entry1, entry2) -> Integer.compare(((LinkedHashSet<?>) entry2.getValue()).size(), ((LinkedHashSet<?>) entry1.getValue()).size()))
                .map(entry -> String.valueOf(entry.getKey()))
                .collect(Collectors.joining(""));
    }


    private void orderCharMap(Map<Character, LinkedHashSet<Character>> charMap) {
        for (LinkedHashSet<Character> cValue : charMap.values()) {
            Set<Character> toAddList = new LinkedHashSet<>();

            for (Character character : cValue) {
                charMap.entrySet().stream()
                        .filter(entry -> entry.getKey().equals(character))
                        .map(Map.Entry::getValue)
                        .findFirst()
                        .ifPresent(toAddList::addAll);
            }

            cValue.addAll(toAddList);
        }
    }

    private Map<Character, LinkedHashSet<Character>> tripletsToHashMap(char[][] triplets) {
        LinkedHashMap<Character, LinkedHashSet<Character>> charMap = new LinkedHashMap<>();
        for (char[] triplet : triplets) {
            charMap.putIfAbsent(triplet[0], new LinkedHashSet<>());
            charMap.putIfAbsent(triplet[1], new LinkedHashSet<>());
            charMap.putIfAbsent(triplet[2], new LinkedHashSet<>());

            charMap.getOrDefault(triplet[0], new LinkedHashSet<>()).addAll(List.of(triplet[1], triplet[2]));
            charMap.getOrDefault(triplet[1], new LinkedHashSet<>()).add(triplet[2]);

        }
        return charMap;
    }

    @SafeVarargs
    private <T> LinkedHashSet<T> newHashSet(T... objs) {
        LinkedHashSet<T> set = new LinkedHashSet<T>();
        Collections.addAll(set, objs);
        return set;
    }
}
