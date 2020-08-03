public class Mommifier {

    public int countVowels(String str) {
        int count = 0;
        for (int i=0; i<str.length(); i++) {
            String letter = String.valueOf(str.charAt(i)).toLowerCase();
            if (letter.equals("a") || letter.equals("e") || letter.equals("i")
                    || letter.equals("o") || letter.equals("u")) {
                count++;
            }
        }
        return count;
    }
}
