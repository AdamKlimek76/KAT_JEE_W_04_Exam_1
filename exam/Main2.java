package exam;

import org.apache.commons.lang3.StringUtils;

public class Main2 {
    public static void main(String[] args) {
        String text="Naucz się programować od podstaw";
        System.out.println(shorten(text, 2));
    }
    static String shorten(String str, int length){
        String leftText= StringUtils.left(str, length);
        return leftText;

    }

}
