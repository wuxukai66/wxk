import java.util.ArrayList;
import java.util.List;

public class Text {
    public static List<Character> func(String str1, String str2) {
        List<Character> ret=new ArrayList<>();
        for (int i = 0; i <str1.length() ; i++) {
            char ch=str1.charAt(i);
            if(!str2.contains(ch+"")){
                ret.add(ch);
            }
        }
                return ret;
    }


}
