import java.io.*;

public class TransSysEnumUtils {


    public static void main(String[] args) {

        File f1 = new File("/Users/wangsiming/Desktop/i18N/ja_Jp-sys_dictionary&meassage&enum翻译/sql-sys_enum_zhCN.txt");
        File f2 = new File("/Users/wangsiming/Desktop/i18N/jpAll.txt");
        File f3 = new File("/Users/wangsiming/Desktop/i18N/ja_Jp-sys_dictionary&meassage&enum翻译/sql-sys_enum-ja_JP.txt");
        File f4 = new File("/Users/wangsiming/Desktop/i18N/ja_Jp-sys_dictionary&meassage&enum翻译/sys_enum-unfind.txt");
        String s,s1,sCopy;
        String m,m1,m2;
        int count = 6000001;


        try {
            BufferedReader bf1 = new BufferedReader(new FileReader(f1));
            BufferedReader bf2 = new BufferedReader(new FileReader(f2));
            BufferedWriter bw = new BufferedWriter(new FileWriter(f3));
            BufferedWriter bw1 = new BufferedWriter(new FileWriter(f4));

            while ((s = bf1.readLine()) != null) {
                int init = s.indexOf("zh_CN");
                int end =s.indexOf("', ",init+8);
                s1 = s.substring(init+9,end);
                sCopy = s;
                boolean find = false;

                while((m=bf2.readLine())!=null){
                    m1 = m.substring(0,m.indexOf("=w=")).trim();
                    m2 = m.substring(m.indexOf("=w=")+3).trim();
                    if(m1.equals(s1)) {
                        sCopy = sCopy.replace("zh_CN", "ja_JP");
                        sCopy = sCopy.replace(s1, m2);
                        sCopy = sCopy.replace("hezh", "swang2");
                        int lastInit = sCopy.lastIndexOf("', '");
                        int lastend = sCopy.indexOf("');");

                        m1 = sCopy.substring(lastInit + 4, lastend);
                        sCopy = sCopy.replace(m1, count++ + "");
                        bw.write(sCopy);
                        bw.newLine();
                        find = true;
                        break;
                    }



                 }
                 if(!find){
                    sCopy = sCopy.replace("zh_CN", "ja_JP");
                    int lastInit = sCopy.lastIndexOf("', '");
                    int lastend = sCopy.indexOf("');");

                    m1 = sCopy.substring(lastInit + 4, lastend);
                    sCopy = sCopy.replace(m1, count++ + "");
                    bw.write(sCopy);
                    bw.newLine();
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
