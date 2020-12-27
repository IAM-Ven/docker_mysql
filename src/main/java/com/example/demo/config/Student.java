package com.example.demo.config;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private final String name;
    private final int regNo;
    private final Map<String, String> data;

    public Student(String name, int regNo, Map<String, String> data) {
        super();
        this.name = name;
        this.regNo = regNo;
        Map<String, String> copyMap = new HashMap<>(data);
        /*for (Map.Entry<String, String> print : copyMap.entrySet()) {
            copyMap.put(print.getKey(), print.getValue());
        }
        this.data = copyMap;*/
        copyMap.replaceAll((key, value) -> value);
        this.data = copyMap;
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public Map<String, String> getData() {
        Map<String, String> copyMap = new HashMap<>(data);
        copyMap.replaceAll((k, v) -> v);
        return copyMap;
    }

}

