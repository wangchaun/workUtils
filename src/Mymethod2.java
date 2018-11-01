import java.util.*;

public class Mymethod2 {

    private static Map<String, Map<String, Integer>> TPAll = new HashMap<>();

    public static void main(String[] args) {
        Map<String, Integer> mapSkuQtyCount = new HashMap<>();
        //入库托盘数据
        Map<String, Map<String, Integer>> mapTPMapSkuQty = new HashMap<>();

        Map<String, Integer> mapSkuQty1 = new HashMap<>(); //<skuName, 箱数>
        mapSkuQty1.put("sku1", 5);
        mapSkuQty1.put("sku2", 10);
        mapSkuQty1.put("sku3", 15);
        mapTPMapSkuQty.put("tp1", mapSkuQty1);

        Map<String, Integer> mapSkuQty2 = new HashMap<>();
        mapSkuQty2.put("sku11", 3);
        mapSkuQty2.put("sku12", 7);
        mapSkuQty2.put("sku3", 9);
        mapTPMapSkuQty.put("tp2", mapSkuQty2);


        Map<String, Integer> mapSkuQty3 = new HashMap<>();
        mapSkuQty3.put("sku11", 10);
        mapSkuQty3.put("sku21", 7);
        mapSkuQty3.put("sku3", 4);
        mapTPMapSkuQty.put("tp3", mapSkuQty3);


        Map<String, Integer> mapSkuQty6 = new HashMap<>();
        mapSkuQty6.put("sku13", 10);
        mapSkuQty6.put("sku24", 7);
        mapSkuQty6.put("sku3", 4);
        mapTPMapSkuQty.put("tp4", mapSkuQty6);


        mapTPMapSkuQty.forEach((k,v)->{
             getVitrulaMap(v,mapSkuQtyCount);
        });

        mapTPMapSkuQty.forEach((k,v)->{
            getRealMap(v,mapSkuQtyCount);
            mapTPMapSkuQty.put(k,v);
        });

        mapTPMapSkuQty.forEach((k,v)->{
            System.out.println("=========托盘="+k);
            v.forEach((k1,v1)->{
                System.out.println("=========key="+k1+"  value="+v1);
            });
        });

    }

    public static void getVitrulaMap(Map<String, Integer>map,Map<String, Integer> mapSkuQtyCount){
        map.forEach((k,v)->{
            mapSkuQtyCount.put(k,0);
        });
    }

    public static void getRealMap(Map<String, Integer>map,Map<String, Integer> mapSkuQtyCount){

        mapSkuQtyCount.forEach((k,v)->{
            if(!map.containsKey(k)){
                map.put(k,0);
            }
        });
    }


}
