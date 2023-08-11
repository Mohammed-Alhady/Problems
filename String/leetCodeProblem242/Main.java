public class Main {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";

        System.out.println(Solution.isAnagram(s, t));

        s = "rat";
        t = "car";

        System.out.println(Solution.isAnagram(s, t));

        s = "rac";
        t = "car";

        System.out.println(Solution.isAnagram(s, t));
    }
}
