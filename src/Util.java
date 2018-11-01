
import java.io.*;
import java.util.Properties;

public class Util {

    public  static void  main(String[] args){

        String[] a=new String[]{"asy"};
        for(String fileName:a){
            slove(fileName);
        }

    }
    public static  void slove(String fileName){
        String a="/Users/yubin/IdeaProject/atlas/atlas-wms/src/main/resources/i18n/%s/Msg_zh_CN.properties";
        String c="/Users/yubin/IdeaProject/atlas/atlas-wms/src/main/resources/i18n/%s/3.properties";
        String d="/Users/yubin/IdeaProject/atlas/atlas-wms/src/main/resources/i18n/%s/unfind.propertie";
        File f1 = new File(String.format(a,fileName));
        File f2 = new File("/Users/yubin/IdeaProject/atlas/atlas-wms/src/main/resources/kaAll.txt");
        File f3 = new File(String.format(c,fileName));
        File f4 = new File(String.format(d,fileName));
        String m,m1,m2;


        try {
            Properties prop = new Properties();
            Properties prop1 = new Properties();

            BufferedReader bf1 = new BufferedReader(new InputStreamReader(new FileInputStream(f1),"UTF-8")) ;
            BufferedReader bf2 = new BufferedReader(new InputStreamReader(new FileInputStream(f2),"UTF-8")) ;
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f3,true), "UTF-8"));
            BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f4,true), "UTF-8"));
            prop.load(new InputStreamReader(new FileInputStream(f1),"UTF-8"));

            for (String key : prop.stringPropertyNames()) {

                while((m=bf2.readLine())!=null){
                    if(m.indexOf("=w=")!=-1){
                        m1 = m.substring(0,m.indexOf("=w=")).trim();
                        m2 = m.substring(m.indexOf("=w=")+3).trim();

                        prop1.load(new InputStreamReader(new FileInputStream(f3),"UTF-8"));

                        if(prop1.containsKey(key)){
                            break;
                        }

                        if(m1.equals(prop.getProperty(key))){
                            bw.write(key);
                            bw.write("=");
                            bw.write(m2);
                            bw.newLine();
                            break;
                        }

                    }
                }
                bf2 = new BufferedReader(new InputStreamReader(new FileInputStream(f2),"UTF-8")) ;
            }
            bw1.close();
            bw.close();
            bf2.close();


        } catch ( Exception e) {
            e.printStackTrace();
        }

    }

}
