import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zuhe {
    //全局变量，存储所有字符组合  
    List<String> list = new ArrayList<String>();

    public void getNext(String begin, String[] s, int num) {
        if (num > 1) {
            for (int i = 0; i < s.length - num + 1; i++) {
                String str = s[i];
                String[] newS = Arrays.copyOfRange(s, i + 1, s.length);
                getNext(begin == null ? str : (begin + "-" + str), newS, num - 1);
            }
        } else {
            for (int b = 0; b < s.length; b++) {
                list.add(begin + "-" + s[b]);
            }

        }

    }

    public  List<String> zuhe(String[] names,int num){
        getNext(null,names,num);
        return list;
    }
}