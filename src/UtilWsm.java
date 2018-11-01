import java.io.*;

public class UtilWsm {

    public  static void  main(String[] args){

        File f1 = new File("/Users/wangsiming/Desktop/1.txt");
        File f2 = new File("/Users/wangsiming/Desktop/i18N/kaALl.txt");
        File f3 = new File("/Users/wangsiming/Desktop/3.txt");
        File f4 = new File("/Users/wangsiming/Desktop/unfind.txt");
        String s,s1,s2;
        String m,m1,m2;


        try {
            BufferedReader bf1 = new BufferedReader(new FileReader(f1)) ;
            BufferedReader bf2 = new BufferedReader(new FileReader(f2)) ;
            BufferedWriter bw = new BufferedWriter(new FileWriter(f3));
            BufferedWriter bw1 = new BufferedWriter(new FileWriter(f4));

            while((s=bf1.readLine())!=null){
                if(s.indexOf("=")==-1){
                    bw.write(s);
                    bw.newLine();
                }

                if(s.indexOf("=")!=-1){
                    s1 = s.substring(s.indexOf("=")+1).trim();
                    s2 = s.substring(0,s.indexOf("=")).trim();
                    boolean find = false;

                    while((m=bf2.readLine())!=null){
                        if(m.indexOf("=w=")!=-1){

                            m1 = m.substring(0,m.indexOf("=w=")).trim();
                            m2 = m.substring(m.indexOf("=w=")+3).trim();

                            if(m1.equals(s1)){
                                if(m1.equals("货值")){
                                    if(s1.equals("huozhi")){

                                    }
                                    System.out.println();

                                };
                                bw.write(s2);
                                bw.write("=");
                                bw.write(m2);
                                bw.newLine();
                                find = true;
                                break;
                            }
                        }
                    }
                    if (find != true){
                        bw.write(s);
                        bw.newLine();
                        bw1.write(s1);
                        bw1.newLine();
                    }
                    bf2 = new BufferedReader(new FileReader(f2));

                    bw.flush();
                }

            }
            System.out.println("over");
            bw.close();
            bw1.close();
            bf1.close();
            bf2.close();





        } catch ( Exception e) {
            e.printStackTrace();
        }


    }

}
