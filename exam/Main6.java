package exam;

import org.apache.commons.lang3.StringUtils;

public class Main6 {
    public static void main(String[] args) {
        String text = "aaabbbcccaaabbbccc";
        String newText = replaceStr(text, "aaa", "ddd");
        System.out.println(newText);
    }

    static String replaceStr(String str, String forReplace, String replacement) {
        String strAfterReplace = str.replaceAll(forReplace, replacement);
        return strAfterReplace;
    }
}
