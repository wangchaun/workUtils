import java.io.*;

/**
 * @program: myTest
 * @description:
 * @author: siming.wang
 * @create: 2018-07-23 11:39
 **/

public class TransUpdateSysEnumUtils {


    public static void main(String[] args) {

        File f1 = new File("/Users/wangsiming/Desktop/1.txt");
        File f2 = new File("/Users/wangsiming/Desktop/i18N/usAll.txt");
        File f3 = new File("/Users/wangsiming/Desktop/sql-sys_enum—en_US.txt");
        File f4 = new File("/Users/wangsiming/Desktop/sys_enum-unfind.txt");
        String s,s1,sCopy;
        String m,m1,m2;


        try {
            BufferedReader bf1 = new BufferedReader(new FileReader(f1));
            BufferedReader bf2 = new BufferedReader(new FileReader(f2));
            BufferedWriter bw = new BufferedWriter(new FileWriter(f3));
            BufferedWriter bw1 = new BufferedWriter(new FileWriter(f4));

            while ((s = bf1.readLine()) != null) {
                int init = s.indexOf("enum_name");
                int end = s.indexOf("enum_name_lang");
                s1 = s.substring(init+14,end-4).trim();
                sCopy = s;
                boolean find = false;

                while((m=bf2.readLine())!=null){
                    if(!m.contains("=w=")){
                        continue;
                    }
                    m1 = m.substring(0,m.indexOf("=w=")).trim();
                    m2 = m.substring(m.indexOf("=w=")+3).trim();
                    if(m1.equals(s1)) {
                        sCopy = sCopy.replace(s1, m2);
                        bw.write(sCopy);
                        bw.newLine();
                        find = true;
                        break;
                    }



                }
                if(!find){
                    bw1.write(s1);
                    bw1.newLine();
                }
                bf2 = new BufferedReader(new FileReader(f2));

            }
            bw.close();
            bw1.close();
            bf1.close();
            bf2.close();
            System.out.println("over");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
