import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {


    public static Map<String, Integer> countWordFrequency(String sentence) {
        Map<String, Integer> wordCountMap = new HashMap<>();



        String[] words = sentence.toLowerCase().split("\\W+");


        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }


        return wordCountMap;
    }


    public static void main(String[] args) {

        String sentence = "Hello world! Hello everyone.";
        Map<String, Integer> frequencyMap = countWordFrequency(sentence);

        frequencyMap.forEach((word, count) -> System.out.println(word + ": " + count));
    }
}










