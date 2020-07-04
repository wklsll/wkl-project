package com.wuhu.parent.wuhu;


import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WuhuApplicationTests {

    @Test
    public void contextLoads() {

        System.out.println("hhhh");
    }


    @Test
    public void filter() {
        List<Integer> array = Arrays.asList(5, 7, 9, 10, 11, 12, 13);
        //array= array.stream().filter(it -> {
        //            if (it % 2 == 0) {
        //                return true;
        //            }
        //            return false;
        //        }
        //).collect(Collectors.toList());
        //  Stream<Integer> integerStream = array.stream().map(n -> n * n);


        List<Integer> collect = array.stream().filter(it -> it % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(array);

    }

    @Test
    public void map() {
        List<Integer> array = Arrays.asList(5, 7, 9, 10, 11, 12, 13);
        List<Integer> collect = array.stream().filter(it -> it % 2 == 0).map(it -> it * it).collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void reduce() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .filter(n -> n % 2 == 1)
                .map(n -> n * n)
                .reduce(10, Integer::sum);  // reduce 的第一个参数-> 起始值

        System.out.println(sum);
    }

}
