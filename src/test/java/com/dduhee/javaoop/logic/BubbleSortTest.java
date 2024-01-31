package com.dduhee.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @DisplayName("버블소트> 입력한 리스트를 정렬")
    @Test
    void listSort() {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        List<Integer> result = bubbleSort.sort(List.of(3,5,4,2,1));

        assertEquals(List.of(1,2,3,4,5), result);

    }
}