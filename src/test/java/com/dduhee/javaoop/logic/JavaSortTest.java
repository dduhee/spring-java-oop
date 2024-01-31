package com.dduhee.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

    @DisplayName("자바구현체소트> 입력한 리스트를 정렬")
    @Test
    void listSort(){
        JavaSort<Integer> javaSort = new JavaSort<>();

        List<Integer> result = javaSort.sort(List.of(2,5,3,4,1));

        assertEquals(List.of(1,2,3,4,5), result);

    }


}