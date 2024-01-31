package com.dduhee.javaoop.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSort <T extends Comparable<T>>{

    public List<T> sort(List<T> input){
        List<T> output = new ArrayList<>(input);

        // java 정렬 구현체 사용
        Collections.sort(output);

        return output;
    }
}
