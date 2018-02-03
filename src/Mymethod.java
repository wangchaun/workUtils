import java.util.*;

public class Mymethod {

    private static List<Map<String, Map<String, Map<String, Integer>>>> doAll = new ArrayList<>();

    private static int countSplit;

    public static void main(String[] args) {
        //入库托盘数据
        Map<String, Map<String, Integer>> mapTPMapSkuQty = new HashMap<>();

        ArrayList<Map<String, Integer>> mapSkuQtyArray = new ArrayList<>(); //总托盘－－包括虚拟托盘

        Map<String, Integer> mapSkuQty1 = new HashMap<>(); //<skuName, 箱数>
        mapSkuQty1.put("sku1", 5);
        mapSkuQty1.put("sku2", 10);
        mapSkuQty1.put("sku3", 15);
        mapTPMapSkuQty.put("tp1", mapSkuQty1);


        Map<String, Integer> mapSkuQty2 = new HashMap<>();
        mapSkuQty2.put("sku1", 3);
        mapSkuQty2.put("sku2", 7);
        mapSkuQty2.put("sku3", 9);
        mapTPMapSkuQty.put("tp2", mapSkuQty2);

        Map<String, Integer> mapSkuQty3 = new HashMap<>();
        mapSkuQty3.put("sku1", 10);
        mapSkuQty3.put("sku2", 7);
        mapSkuQty3.put("sku3", 4);
        mapTPMapSkuQty.put("tp3", mapSkuQty3);

        Map<String, Integer> mapSkuQty6 = new HashMap<>();
        mapSkuQty6.put("sku1", 2);
        mapSkuQty6.put("sku2", 2);
        mapSkuQty6.put("sku3", 2);
        mapTPMapSkuQty.put("tp4", mapSkuQty6);


        //拆分后数据
        Map<String, Map<String, Integer>> mapCDMapSkuQty = new HashMap<>();

        Map<String, Integer> mapSkuQty4 = new HashMap<>(); //<skuname, 箱数>
        mapSkuQty4.put("sku1", 12);
        mapSkuQty4.put("sku2", 13);
        mapSkuQty4.put("sku3", 14);
        mapCDMapSkuQty.put("cd1", mapSkuQty4);

        Map<String, Integer> mapSkuQty5 = new HashMap<>();
        mapSkuQty5.put("sku1", 8);
        mapSkuQty5.put("sku2", 13);
        mapSkuQty5.put("sku3", 16);
        mapCDMapSkuQty.put("cd2", mapSkuQty5);


        //生成虚拟托盘
        String[] names = bulidTPNames(mapTPMapSkuQty);
        bulidtp(names, mapTPMapSkuQty);

        //要求最少拆托次数
        //mapDOMapSkuQty map<cd,map<tp,map<sku,箱数>>>
        Map<String, Map<String, Map<String, Integer>>> mapDOMapSkuQty = new HashMap<>();
        gogogo(mapTPMapSkuQty, mapCDMapSkuQty, mapDOMapSkuQty);

        System.out.println();
        System.out.println();
        System.out.println();


    }

    public static int[] findThemin(int[] d) {
        int min = 100000;
        int minj = 100000;
        int[] re = new int[2];
        int j = 0;
        for (int a : d) {
            if (a < min) {
                min = a;
                minj = j;
            }
            j++;
        }
        re[0] = min;
        re[1] = minj;

        return re;
    }


    public static int calcDifference(Map<String, Integer> in, Map<String, Integer> out) {
        int differene = 0;
        for (Map.Entry entryOut : out.entrySet()) {
            String skuOut = (String) entryOut.getKey();
            Integer skuCountOut = (Integer) entryOut.getValue();
            boolean find = false;
            for (Map.Entry entryInt : in.entrySet()) {
                String skuIn = (String) entryInt.getKey();
                Integer skuCountIn = (Integer) entryInt.getValue();
                if (skuIn.equals(skuOut) && skuCountIn <= skuCountOut) {
                    differene = differene + skuCountOut - skuCountIn;
                    find = true;
                    break;
                }
            }
            if (!find) {
                differene = differene + 1000000000;
                return differene;

            }


        }

        return differene;
    }

    public static String[] bulidTPNames(Map<String, Map<String, Integer>> mapTPMapSkuQty) {
        String[] names = new String[mapTPMapSkuQty.size()];
        int i = 0;
        for (Map.Entry entry : mapTPMapSkuQty.entrySet()) {
            names[i] = (String) entry.getKey();
            i++;
        }
        return names;

    }

    //生成虚拟托盘
    public static void bulidtp(String[] names, Map<String, Map<String, Integer>> mapTPMapSkuQty) {
//        String[] names = {"tp1", "tp2", "tp3"};
        List<String> listAll = new ArrayList<>();

        for (int i = 2; i <= names.length; i++) {
            Zuhe zuhe = new Zuhe();
            List<String> list = zuhe.zuhe(names, i);
            for (String s : list) {
                listAll.add(s);
            }
        }

        //产生所有虚拟托盘
        for (String name : listAll) {
            String[] tps = name.split("-");
            ArrayList<Map<String, Integer>> mapTemp = new ArrayList<>();
            for (String tp : tps) {
                Map<String, Integer> temp = mapTPMapSkuQty.get(tp);
                mapTemp.add(temp);
            }
            Map<String, Integer> mapSkuQty = new HashMap<>();
            for (Map<String, Integer> temp : mapTemp) {
                for (Map.Entry entry : temp.entrySet()) {
                    String jsku = (String) entry.getKey();
                    Integer jcount = (Integer) entry.getValue();
                    if (!mapSkuQty.containsKey(jsku)) {
                        mapSkuQty.put(jsku, jcount);
                    } else {
                        mapSkuQty.put(jsku, mapSkuQty.get(jsku) + jcount);
                    }

                }
            }
            mapTPMapSkuQty.put(name, mapSkuQty);//添加所有虚拟托盘

        }
    }

    public static void gogogo(Map<String, Map<String, Integer>> mapTPMapSkuQty, Map<String, Map<String, Integer>> mapCDMapSkuQty, Map<String, Map<String, Map<String, Integer>>> mapDOMapSkuQty) {

        if (mapDOMapSkuQty.size() == 0) {
            int[][] differences = new int[mapCDMapSkuQty.size()][mapTPMapSkuQty.size()];
            String[] cdNames = new String[mapCDMapSkuQty.size()];
            String[] tpNames = new String[mapTPMapSkuQty.size()];
            int i = 0;
            for (Map.Entry mapCD : mapCDMapSkuQty.entrySet()) {
                String cd = (String) mapCD.getKey();
                cdNames[i] = cd;
                Map<String, Integer> cdM = (Map<String, Integer>) mapCD.getValue();
                int j = 0;
                for (Map.Entry mapTP : mapTPMapSkuQty.entrySet()) {
                    {
                        String tp = (String) mapTP.getKey();
                        tpNames[j] = tp;
                        Map<String, Integer> tpM = (Map<String, Integer>) mapTP.getValue();
                        differences[i][j] = calcDifference(tpM, cdM);
                        j++;
                    }
                }
                i++;
            }

            for (int m = 0; m < cdNames.length; m++) {
            }

            //找出最小的difference
            int min = 100000;
            int[] mintp = new int[3];
            for (int m = 0, n = 0; m < cdNames.length; m++, n++) {
                int[] tp = findThemin(differences[m]);
                if (tp[0] <= min) {
                    min = tp[0];
                    mintp[0] = tp[0];
                    mintp[1] = tp[1];
                    mintp[2] = m;
                }
            }
            //没有满足的情况
            if (min == 100000) {
                for (String tp : tpNames) {
                    countSplit++;
                    Map<String,Map<String,Map<String,Integer>>> m = new HashMap<>();
                    m.put("拆",mapTPMapSkuQty);
                    doAll.add(m);
                }
                return;
            }
            //填充domap(有满足的情况)
            String docdName = cdNames[mintp[2]];
            String dotpName = tpNames[mintp[1]];

            Map<String, Integer> tpmap = mapTPMapSkuQty.get(dotpName);
            Map<String, Integer> cdmap = mapCDMapSkuQty.get(docdName);
            Map<String, Map<String, Integer>> domap = new HashMap<>();
            domap.put(dotpName, tpmap);
            mapDOMapSkuQty.put(docdName, domap);
            doAll.add(mapDOMapSkuQty);
            String[] nameDele = dotpName.split("-");

            //生成新的tp、cd、do
            //先减少目的托盘的需求
            for (Map.Entry entry : tpmap.entrySet()) {
                String sku = (String) entry.getKey();
                cdmap.put(sku, (cdmap.get(sku) - (int) entry.getValue()));
            }


            //然后删除tpmap中 已分配的托盘
            for (String na : nameDele) {
                for (Iterator<Map.Entry<String, Map<String, Integer>>> it = mapTPMapSkuQty.entrySet().iterator(); it.hasNext(); ) {
                    Map.Entry<String, Map<String, Integer>> item = it.next();
                    String key = item.getKey();
                    if (key.contains(na)) {
                        it.remove();
                    }
                }
            }
            Map<String, Map<String, Map<String, Integer>>> mapDOMap = new HashMap<>();

            gogogo(mapTPMapSkuQty,mapCDMapSkuQty,mapDOMap);

        }


    }

}
