import java.io.*;

/**
 * @program: myTest
 * @description:
 * @author: siming.wang
 * @create: 2018-05-29 19:00
 **/

public class BuildSqlUtils {
    public static void main(String[] args) {

        File f1 = new File("/Users/wangsiming/Desktop/old.txt");
        File f2 = new File("/Users/wangsiming/Desktop/new.txt");
        String s,s1,sCopy;
        String m,m1,m2;
        int count = 9000000;



        try {
            BufferedReader bf1 = new BufferedReader(new FileReader(f1));
            BufferedWriter bw1 = new BufferedWriter(new FileWriter(f2));

            while ((s = bf1.readLine()) != null) {
                String sql = "INSERT INTO `atlas_mst`.`sys_enum`(`sys_no`, `enum_type`, `enum_value`, `enum_name`, `enum_name_lang`, `system_flag`, `yn`, `ts`, `create_time`, `create_pin`, `update_pin`, `versions`) VALUES (countWSM, 'DownloadTaskType', 'valueWSM', 'nameWSM', 'zh_CN', 'Y', 'Y', '2017-02-24 16:15:42', '2017-02-24 16:15:42', 'acc', 'acc', 0);";
                String enumName = s.substring(s.indexOf("//")+2).trim();
                s = bf1.readLine();
                String enumValue = s.substring(s.indexOf("=")+1,s.length()-2).trim();
                enumValue = enumValue.substring(1);
                s = bf1.readLine();

                sql = sql.replace("countWSM",count++ + "");
                sql = sql.replace("nameWSM",enumName);
                sql = sql.replace("valueWSM",enumValue);


                bw1.write(sql);

                bw1.newLine();





            }
            bw1.close();


            System.out.println("over");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
