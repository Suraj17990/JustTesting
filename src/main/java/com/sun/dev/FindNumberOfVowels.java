package com.sun.dev;

/**
 * Created by senorita on 2/9/2017.
 */
public class FindNumberOfVowels {
    public void findNumberOfVowelsInString(String S) {
        char ch;
        int count = 0;
        for(int i=0;i< S.length();i++){
            ch = S.charAt(i);
            if((ch=='a')|(ch=='e')|(ch=='i')|(ch=='o')|(ch=='u')){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        FindNumberOfVowels vowels = new FindNumberOfVowels();
        vowels.findNumberOfVowelsInString("Tamilnadu");
    }
}
