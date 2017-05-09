package com.imsasa.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Written with love
 *
 * @author Sasa Prsic 09/05/2017
 */
public class Main {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        List<String>  listOfStrings = new ArrayList<String>(){{
            add("String 1");
            add("String 2");
            add("String 3");
            add("String 4");
        }};

        for (String s : listOfStrings) {
            stack.push(s);
        }
        // iterate print and pop  strings
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().toUpperCase());
        }
    }
}
