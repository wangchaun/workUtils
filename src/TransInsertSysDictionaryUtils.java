import java.io.*;

public class TransInsertSysDictionaryUtils {

    public static void main(String[] args) {

        File f1 = new File("/Users/wangsiming/Desktop/i18N/en_US翻译/sql-dictionary-zh_CN.txt");
        File f2 = new File("/Users/wangsiming/Desktop/i18N/usAll.txt");
        File f3 = new File("/Users/wangsiming/Desktop/i18N/en_US翻译/sql-sys_dictionary-en_US.txt");
        File f4 = new File("/Users/wangsiming/Desktop/i18N/en_US翻译/sys_dictionary-unfind.txt");
        String s, s1,sCount;
        String m, m1, m2;
        int count = 4000100;


        try {
            BufferedReader bf1 = new BufferedReader(new FileReader(f1));
            BufferedReader bf2 = new BufferedReader(new FileReader(f2));
            BufferedWriter bw = new BufferedWriter(new FileWriter(f3));
            BufferedWriter bw1 = new BufferedWriter(new FileWriter(f4));

            while ((s=bf1.readLine())!=null){
                if(!s.contains("zh_CN")){
                    continue;
                }

                int init = s.indexOf("zh_CN");
                int end = s.lastIndexOf("'Y'");
                s1 = s.substring(init+35,end-3).trim();
//                System.out.println(s1);
                boolean find = false;

//                if(s1.equals("系统配置")){
//                    System.out.println("");
//                }
                while((m=bf2.readLine())!=null){

                    m1 = m.substring(0,m.indexOf("=w=")).trim();
                    m2 = m.substring(m.indexOf("=w=")+3).trim();


                    if(m1.equals(s1)){

                        int cInit = s.indexOf("', ");
                        int cEnd = s.indexOf(", '");
                        sCount = s.substring(cInit+3,cEnd);
                        s = s.replaceFirst(sCount,count++ + "");
                        s = s.replace(s1,m2);
                        s = s.replace("zh_CN","en_US");
                        s = s.replace("lzhou","swang2");

                        bw.write(s);
                        bw.newLine();
                        find = true;
                        break;
                    }

                }

                if(!find){
                    int cInit = s.indexOf("', ");
                    int cEnd = s.indexOf(", '");
                    sCount = s.substring(cInit+3,cEnd);
                    s = s.replaceFirst(sCount,count++ + "");
                    s = s.replace("zh_CN","en_US");
                    bw.write(s);
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