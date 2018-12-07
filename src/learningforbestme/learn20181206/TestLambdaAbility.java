package learningforbestme.learn20181206;

import org.junit.Test;
import sun.jvm.hotspot.runtime.Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @program: myTest
 * @description:
 * @author: siming.wang
 * @create: 2018-12-07 14:17
 **/

public class TestLambdaAbility {


    @Test
    public void testLambdaAbility() throws Exception{
        List<String> strings = initializationList();


        for (int i=0; i<3; i++){
            Long startTimeMillis = System.currentTimeMillis();

            strings.stream().forEach(s-> {
                try {
                    java.lang.Thread.sleep(4);
                } catch (Exception ex) {
                }
                s.toUpperCase();});

            Long lambdaPalletTimeMillis = System.currentTimeMillis();
//
//            for (String s : strings) {
//                try {
//                    java.lang.Thread.sleep(4);
//                } catch (Exception ex) {
//                }
//                s.toUpperCase();
//            }

            Long forTimeMillis = System.currentTimeMillis();
//
//            strings.stream().forEach(s-> {try {
//                java.lang.Thread.sleep(4);
//            } catch (Exception ex) {
//            }
//            s.toUpperCase();});

            Long lambdaTimeMillis = System.currentTimeMillis();


            System.out.println("第"+i+"次，lambda-parallel: " + (lambdaPalletTimeMillis - startTimeMillis) + "ms");
            System.out.println("第"+i+"次，for: " + (forTimeMillis - lambdaPalletTimeMillis) + "ms");
            System.out.println("第"+i+"次，lambda: " + (lambdaTimeMillis - forTimeMillis) + "ms");
            System.out.println("----------------");
        }

        System.out.println(strings.get(0));


    }




    private List<String> initializationList(){
        List<String> strings = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i<1000000; i++){
            strings.add("rqi"+ random.nextInt(10000));
        }

        return strings;
    }
}
