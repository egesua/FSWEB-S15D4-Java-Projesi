package com.workintech.Challenges.Decimal;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DecimalToBinaryMain {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(445));
        System.out.println(decimalToBinary(115));
        System.out.println(decimalToBinary(5));
    }

    private static LinkedList<Integer> decimalToBinary(int number){
        Stack<Integer> remainderStack = new Stack<>();
        LinkedList<Integer> result = new LinkedList<>();

        while( number > 0 ){
            int remainder = number % 2;
            remainderStack.push(remainder);
            number = number / 2;
        }
        Iterator<Integer> iterator = remainderStack.iterator();
        while(iterator.hasNext()){
            Integer binaryNum = iterator.next();
            result.push(binaryNum);
        }
        return result;
    }
}
