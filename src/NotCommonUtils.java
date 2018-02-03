import java.io.*;

public class NotCommonUtils {

    public static void main(String[] args) {

        File f1 = new File("/Users/wangsiming/Desktop/1.txt");
        File f2 = new File("/Users/wangsiming/Desktop/2.txt");
        File f3 = new File("/Users/wangsiming/Desktop/sql-sys_dictionary—ja-Jp.txt");
        String s,s1,s2,sCopy;
        String m,m1,m2;


        try {
            BufferedReader bf1 = new BufferedReader(new FileReader(f1));
            BufferedReader bf2 = new BufferedReader(new FileReader(f2));
            BufferedWriter bw = new BufferedWriter(new FileWriter(f3));

            while ((s = bf1.readLine()) != null) {
                s1 = s.substring(s.indexOf("content")+10,s.indexOf("content_lang")-4);

                while ((m=bf2.readLine())!=null){
                    m1 = m.substring(0,m.indexOf("=w=")).trim();
                    m2 = m.substring(m.indexOf("=w=")+3).trim();

                    if(m1.equals(s1)){

                        sCopy = s.replace(s1,m2);
                         bw.write(sCopy);
                        bw.newLine();
                        break;
                    }
                }

                bf2 = new BufferedReader(new FileReader(f2));

            }
            System.out.println("over");
            bw.close();
            bf1.close();
            bf2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
