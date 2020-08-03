public class Mommifier {

    public int countVowels(String str) {
        int count = 0;
        for (int i=0; i<str.length(); i++) {
            String letter = String.valueOf(str.charAt(i)).toLowerCase();
            if (isVowel(letter)) {
                count++;
            }
        }
        return count;
    }

    public double countPercentage(String str) {
        double count = countVowels(str);
        return count/str.length();
    }

    public boolean greaterThanThirtyPercentage(String str) {
        return countPercentage(str) > 0.3 ? true : false;
    }

    public boolean isVowel(String letter) {
        if (letter.equals("a") || letter.equals("e") || letter.equals("i")
                || letter.equals("o") || letter.equals("u")) {
            return true;
        }
        return false;
    }

    public String insertMommy(String str) {
        if (greaterThanThirtyPercentage(str)) {
            String result = "";
            for (int i=0; i<str.length(); i++) {
                if (i != str.length() - 1) {
                    String currentLetter = String.valueOf(str.charAt(i));
                    String nextLetter = String.valueOf(str.charAt(i+1));
                    result += currentLetter;
                    if (isVowel(currentLetter) && isVowel(nextLetter)) {
                        result += "mommy";
                    }
                } else {
                    result += str.charAt(str.length() - 1);
                }
            }
            return result;
        } else {
            return str;
        }
    }
}
