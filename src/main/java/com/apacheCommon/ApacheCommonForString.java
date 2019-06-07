package com.apacheCommon;

import org.apache.commons.lang.StringUtils;

public class ApacheCommonForString {

    public String reverseString (String str){

        String newStr  = StringUtils.reverse(str);
        return newStr;
    }

    public String joinMethod(String[] str){
        String[] strArr = {"AB", "CD", "EF"};

        String strOne = StringUtils.join(strArr, "*");
        System.out.println(strOne);

        return strOne;
    }

    public String diffString (String strOne, String strTwo){
        String diff = StringUtils.difference(strOne, strTwo);
        System.out.println(diff);
        return diff;
    }
    public static void main(String[] args){
        ApacheCommonForString forString= new ApacheCommonForString();
        System.out.println(forString.reverseString("name"));

        String[] strArr = {"AB", "CD", "EF"};
        forString.joinMethod(strArr);

        forString.diffString("ABCD", "ABCde");
    }
}
