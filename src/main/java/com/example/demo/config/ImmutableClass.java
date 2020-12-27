package com.example.demo.config;

import java.util.HashMap;
import java.util.Map;

public class ImmutableClass {

        public static void main(String[] args) {

            Map<String, String> map = new HashMap<>();
            map.put("1", "HardWork");
            map.put("2", "Passion");
            map.put("4", "Marrage");

            Student student = new Student("Jeevani", 123, map);
            System.out.println(student.getName());
            System.out.println(student.getRegNo());
            System.out.println(student.getData());

            map.put("3", "Career");

            System.out.println(student.getData());

        }

    }
