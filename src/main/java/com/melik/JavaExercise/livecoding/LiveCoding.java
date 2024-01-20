package com.melik.JavaExercise.livecoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * @Author mselvi
 * @Created 01.09.2023
 */

/*
* Geliştirilerin isimleri ve tahminleri alan sonrasında en büyük ve küçük tahmini geliştiricinin ismiyle ortaya koyan bir uygulama geliştirebilir misin?
*  Bu uygulamanın testinine yazabilir misin?



Örnek Girdi  = { ""Ayse, 10"", ""Osman, 20"",  ""Zeynep, 50"" ,  ""Onur, 30"" }
Çıktı   = { ""Ayse, 10"",  ""Zeynep, 50""  }
* */
public class LiveCoding {

    public static void main(String[] args) {
        Map<String ,Integer> map=new HashMap<>();
        map.put("Osman",20);
        map.put("Zeynep",15);
        map.put("Ayşe",10);

        Set<String> strings = map.keySet();

        System.out.println(strings);

        Optional<Integer> max = map.entrySet().stream().map(stringIntegerEntry -> stringIntegerEntry.getValue()).max(Integer::compareTo);
        Optional<Integer> min = map.entrySet().stream().map(stringIntegerEntry -> stringIntegerEntry.getValue()).min(Integer::compareTo);

        Integer maxNumber = max.get();

        Integer minNumber = min.get();


        for (String s : map.keySet()) {

            Integer integer1 = map.get(s);
            if (maxNumber.equals(integer1)) {
                System.out.print(s+" ");
                System.out.println(map.get(s));
            }

            if (minNumber.equals(integer1)){
                System.out.print(s+" ");
                System.out.println(map.get(s));
            }

        }
    }
}
