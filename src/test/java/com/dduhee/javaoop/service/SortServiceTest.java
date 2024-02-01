package com.dduhee.javaoop.service;

import com.dduhee.javaoop.logic.BubbleSort;
import com.dduhee.javaoop.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

//    의존성 주입으로 구현체를 주입하고 해당 구현체의 인터페이스를 오버라이드한 메서드를 호출하는 서비스 객체를 생성
//    어떤 구현체를 넣었는지는 new BubbleSort<> 여기 코드에서만 확인 가능 >> 약결합 완료
    private SortService sort = new SortService(new BubbleSort<>());

    @Test
    void test(){
        List<String> result = sort.doSort(List.of("1", "3", "2"));
        assertEquals(List.of("1", "2", "3"), result);
    }
}