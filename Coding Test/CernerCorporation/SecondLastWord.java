public class SecondLastWord {

    public static void main(String[] args) {

        String strSentence = "This a test sentence";
        String[] words = strSentence.split(" ");
        String word1 = words[words.length - 2];
        System.out.println(word1);
    }
}
