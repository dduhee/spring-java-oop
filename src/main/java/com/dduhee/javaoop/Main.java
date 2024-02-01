package com.dduhee.javaoop;

import com.dduhee.javaoop.logic.BubbleSort;
import com.dduhee.javaoop.logic.JavaSort;
import com.dduhee.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        new BubbleSort<> 또는 JavaSort<> 로 만들어 사용 >> 강결합
//        JavaSort<String> bubbleSort = new JavaSort<>( );
//        System.out.println("구현체> "+bubbleSort.getClass().getName());
//        System.out.println("bubleSort>> "+bubbleSort.sort(Arrays.asList(args)));

//        이런 강결합을 약하게 하기 위해 인터페이스를 생성하고 각 구현체가 사용하도록 함
        Sort<String> sort = new JavaSort<>();
        System.out.println("구현체> "+sort.getClass().getName());
        System.out.println("sort>> "+sort.sort(Arrays.asList(args)));

    }
}