import java.io.*;

public class TransSysMessageUtils {

    public static void main(String[] args) {

        File f1 = new File("/Users/wangsiming/Desktop/i18N/en_US翻译/sql-sys_message_zhCN.txt");
        File f2 = new File("/Users/wangsiming/Desktop/i18N/usAll.txt");
        File f3 = new File("/Users/wangsiming/Desktop/i18N/en_US翻译/sql-sys_message-en_US.txt");
        File f4 = new File("/Users/wangsiming/Desktop/i18N/en_US翻译/sys_message-unfind.txt");
        String s,s1,sCopy;
        String m,m1,m2,mCount;
        int count = 2000500;


        try {
            BufferedReader bf1 = new BufferedReader(new FileReader(f1));
            BufferedReader bf2 = new BufferedReader(new FileReader(f2));
            BufferedWriter bw = new BufferedWriter(new FileWriter(f3));
            BufferedWriter bw1 = new BufferedWriter(new FileWriter(f4));

            while ((s = bf1.readLine()) != null) {
                if(!s.contains("zh_CN")){
                    continue;
                }
                int init = s.indexOf(", '");
                int end = s.indexOf("zh_CN");
                s1 = s.substring(init+3,end-4);
                sCopy = s;
                boolean find = false;

                while((m=bf2.readLine())!=null){

                    m1 = m.substring(0,m.indexOf("=w=")).trim();
                    m2 = m.substring(m.indexOf("=w=")+3).trim();
                    if(m1.equals(s1)) {

                        sCopy = sCopy.replace("zh_CN", "en_US");
                        sCopy = sCopy.replace(s1, m2);
                        sCopy = sCopy.replace("lzhou", "swang2");


                        int lastInit = sCopy.indexOf("VALUES");
                        int lastend = sCopy.indexOf(", '");

                        mCount = sCopy.substring(lastInit + 8, lastend);

                        sCopy = sCopy.replaceFirst(mCount, count++ + "");
                        bw.write(sCopy);
                        bw.newLine();
                        find = true;
                        break;
                    }



                }
                if(!find){
                    int lastInit = sCopy.indexOf("VALUES");
                    int lastend = sCopy.indexOf(", '");
                    mCount = sCopy.substring(lastInit + 8, lastend);
                    sCopy = sCopy.replaceFirst(mCount, count++ + "");
                    sCopy = sCopy.replace("zh_CN", "en_US");
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
