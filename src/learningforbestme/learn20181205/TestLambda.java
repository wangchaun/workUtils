package learningforbestme.learn20181205;

import learningforbestme.model.CheckBill;
import learningforbestme.model.CheckBillList;
import learningforbestme.model.CheckLoadingBill;
import learningforbestme.model.InvLot;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

/**
 * @program: myTest
 * @description:
 * @author: siming.wang
 * @create: 2018-12-06 14:43
 **/

public class TestLambda {

    @Test
    public void testLambdaForZeusLoadingRece(){

        CheckLoadingBill checkLoadingBill = new CheckLoadingBill();


        Set<String> skuCodeSetAll = new HashSet<>();

        checkLoadingBill.getCheckBillList().parallelStream().filter(x -> x.getCheckBill() != null)
                .forEach(x -> skuCodeSetAll.addAll(x.getCheckBill().stream()
                        .filter(y -> y.getCodeTs() != null)
                        .map(y -> y.getCodeTs()).collect(toSet()))
                );

//        for (CheckBillList checkBillList : checkLoadingBill.getCheckBillList()) {
//            Set<String> skuCodeSet = checkBillList.getCheckBill().stream()
//                    .filter(y -> y.getCodeTs() != null)
//                    .map(y -> y.getCodeTs())
//                    .collect(toSet());
//            skuCodeSetAll.addAll(skuCodeSet);
//        }

        skuCodeSetAll.stream().forEach(x->System.out.println(x));

//        if (CollectionUtils.isNotEmpty(checkLoadingBill.getCheckBillList())) {
//            for (CheckBillList checkBillList : checkLoadingBill.getCheckBillList()) {
//                if(CollectionUtils.isNotEmpty(checkBillList.getCheckBill())) {
//                    for (CheckBill checkBill : checkBillList.getCheckBill()) {
//                        if(StringUtils.isNotEmpty(checkBill.getCodeTs())){
//                            skuCodeSet.add(checkBill.getCodeTs());
//                        }
//                    }
//                }
//            }
//        }

    }



    @Test
    public void testLambda(){
        List<String> proStrs = Arrays.asList(new String[]{"Ni","Hao","Lambda"});
        List<String> execStrs = proStrs.stream().map(str ->str.toLowerCase()).collect(toList());
        execStrs.forEach(System.out::println);

        List<InvLot> invLots = new ArrayList<>();
        InvLot invLot = new InvLot();
        invLots.add(invLot);

        Random random = new Random();

        for(int i=0;i<40; i++){
            InvLot invLot1 = new InvLot();
            invLot1.setAttribute1("2015-11-"+ random.nextInt(10)+ random.nextInt(10));
            invLots.add(invLot1);
        }

        invLots.forEach(x->System.out.println(x.getAttribute1()));

        String shelfLifeMin = invLots.stream().filter(x->x.getAttribute1()!=null)
                .min((o1,o2) -> o1.getAttribute1().compareToIgnoreCase(o2.getAttribute1()))
                .orElse(new InvLot()).getAttribute1();

        System.out.println("shelfLife: "+shelfLifeMin);


    }





}
