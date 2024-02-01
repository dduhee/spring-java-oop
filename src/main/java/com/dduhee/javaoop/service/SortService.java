package com.dduhee.javaoop.service;

import com.dduhee.javaoop.logic.JavaSort;
import com.dduhee.javaoop.logic.Sort;

import java.util.List;

public class SortService {

    // 생성자에서 사용할 인터페이스 객체 > 한번 세팅되면 변하지않으니 파이널붙임
    private final Sort<String> sort;

    // 생성자에 의존성 주입으로 구현체를 주입 (어떤 구현체를 넣었는지 코드상에 가릴수 있음)
    public SortService(Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체> "+sort.getClass().getName());
    }

//    JavaSort<String> bubbleSort = new JavaSort<>( );
//    List<String> result = bubbleSort.sort(List.of("1","2","3")));
//    위처럼 구현체로 객체를 생성해 메서드를 호출하는게 아니라
//    인터페이스를 오버라이드한 해당 구현체의 메서드를 호출하기 때문에 어떤 구현체를 사용했는지 코드상에 가릴수 있음 >> 약결합
    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
