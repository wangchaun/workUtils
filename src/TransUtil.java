import java.io.*;

public class TransUtil {

    public static void main(String[] args) {

        File f1 = new File("/Users/wangsiming/Desktop/stringCn.txt");
        File f2 = new File("/Users/wangsiming/Desktop/koTrans.txt");
        File f3 = new File("/Users/wangsiming/Desktop/3.txt");
        String s;
        String m, m1, m2;


        try {
            BufferedReader bf1 = new BufferedReader(new FileReader(f1));
            BufferedReader bf2 = new BufferedReader(new FileReader(f2));
            BufferedWriter bw = new BufferedWriter(new FileWriter(f3));

            while ((s = bf1.readLine()) != null) {
                int init = s.indexOf('<');
                int end = s.lastIndexOf('<');
                if (init == end) {
                    bw.write(s);
                    bw.newLine();
                    continue;
                }
                String su1 = s.substring(0, s.indexOf('>') + 1);
                String su2 = s.substring(s.indexOf('>') + 1, end);
                String su3 = s.substring(end);
                boolean find = false;
                while ((m = bf2.readLine()) != null) {
                    if (m.indexOf("=w=") != -1) {

                        m1 = m.substring(0, m.indexOf("=w=")).trim();
                        m2 = m.substring(m.indexOf("=w=") + 3).trim();
                        if(m1.equals(su2)){
                            bw.write(su1);
                            bw.write(m2);
                            bw.write(su3);
                            bw.newLine();
                            find = true;
                            break;
                        }
                    }


                }
                if(find != true){
                    bw.write(s);
                    bw.newLine();
                }
                bf2 = new BufferedReader(new FileReader(f2));
                bw.flush();

            }
            bw.close();
            bf1.close();
            bf2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
