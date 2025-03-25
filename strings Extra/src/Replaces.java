public class Replaces {
    public static void main(String[] args) {
        String sentence = "Hello world";
        String oldWord = "world";
        String newWord = "Java";
        String result = sentence.replace(oldWord, newWord);
        System.out.println("Modified Sentence: " + result);
    }
}
