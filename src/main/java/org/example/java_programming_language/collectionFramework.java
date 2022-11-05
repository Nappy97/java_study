package org.example.java_programming_language;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class collectionFramework {

    public static void main(String[] args) {

        // ArrayList
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        System.out.println(integers);
        System.out.println(integers.size());

        // LinkedList
        LinkedList<Integer> strings = new LinkedList<>();

        strings.add(1);
        strings.add(1);
        strings.add(0, 2);  // 0번째 값 추가
        System.out.println(strings);
        System.out.println(strings.size());
        System.out.println("contains: " + strings.contains(1));
        System.out.println("indexOf: " + strings.indexOf(2));   // indexOf는 가지고 있는 배열을 출력

        // stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("stack");
        System.out.println(stack.pop());    // 데이터 꺼내기 (제거하면서 빼내는거임)
        System.out.println(stack.peek());   // 최상단 값 출력 (제거 X)

        // queue
        Queue<Integer> queue = new LinkedList<>();  // Queue 인터페이스의 구현체인 LinkedList 사용

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.add(1);

        System.out.println("Queue");
        System.out.println(queue);
        System.out.println(queue.poll());   // 데이터 꺼내기 (제거하면서 빼내는거임)
        System.out.println(queue.peek());   // 최하단값 출력 (제거 X)
    }
}

