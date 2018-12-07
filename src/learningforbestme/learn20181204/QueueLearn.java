package learningforbestme.learn20181204;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

/**
 * @program: myTest
 * @description:
 * @author: siming.wang
 * @create: 2018-12-04 16:14
 **/


public class QueueLearn {

    @Test
    public void test(){

        ConcurrentLinkedQueue concurrentLinkedQueue;

        PriorityQueue<People> queue = new PriorityQueue(11,
                new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        for (int i = 1; i <= 10; i++) {
            queue.add(new People("张"+ i, (new Random().nextInt(100))));
        }

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }




    }

    static class People{
        String name;
        int age;

        public People(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "People{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String names) {
            name = names;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int ages) {
            age = ages;
        }
    }

}
