public class Test {
    public static void reverseAStr(String originalStr) {

        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        System.out.println(reversedStr);
    }

    public static void main(String[] args) {
        Test.reverseAStr("hello from java main class");
    }
}
