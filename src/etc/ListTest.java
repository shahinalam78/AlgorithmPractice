package etc;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PaxoStudent on 1/5/2018.
 */
public class ListTest {

    public static void main(String[] args) {

        List<String> name = new ArrayList<>();

        name.add("alam");

        name.add("ahonaf");

        name.add("shathi");

        name.add("prioty");

       /* System.out.println(name);

        System.out.println(name.get(2));

        System.out.println(name.size());
        */
        for(String name1:name){

            System.out.println(name1);
        }

    }

    public static String rString(String text){

        char[] chars = text.toCharArray();

        int i = 0;

        int j = text.length() - 1;

        while (j > i){

            char temp = chars[i];

            chars[i] = chars[j];

            chars[j] = temp;

            i++;

            j--;
        }

        return new String(chars);
    }

    public static String rrString(String text) {

        String reverseString = "";

        StringBuffer bf = new StringBuffer(text);

        reverseString = reverseString + bf.reverse();

        return reverseString;
    }

    public static  String rrrstring(String text){

        String reverseString = "";

        for ( int i = text.length()-1; i >= 0; i-- ){

            reverseString = reverseString + text.charAt(i);
        }

        return reverseString;

    }

}
