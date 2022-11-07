package org.example.java_programming_language;

import java.util.*;

public class collectionFramework {

    public static void main(String[] args) {

        // ArrayList
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        System.out.println(integers);
        System.out.println(integers.size());

        // LinkedList
        List<Integer> strings = new LinkedList<>();

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

        // Iterator
        Iterator<Integer> it = queue.iterator();

        System.out.println(it.next());

        System.out.println();

        // Arrays
        // copyOf(), copyOfRange()
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] arr_2 = Arrays.copyOf(arr, arr.length);       // 전체 복사
        int[] arr_3 = Arrays.copyOf(arr, 3);     // 2번째 배열까지 복사
        int[] arr_4 = Arrays.copyOf(arr, 7);     // 개수만큼 복사후, 남은부분은 0으로 저장
        int[] arr_5 = Arrays.copyOfRange(arr, 2, 4); // 3번째 배열과 4번째 배열저장

        // fill(), setAll()
        int[] arr1 = new int[5];
        Arrays.fill(arr1, 9);   // arr = [9,9,9,9,9]
        Arrays.setAll(arr1, (i) -> (int) (Math.random() * 5) + 1);  // arr = [2, 5, 4, 4, 5]

        // sort(), binarySearch()
        int[] arr2 = {3, 2, 0, 1, 4};
        int idx = Arrays.binarySearch(arr2, 2); // idx = -5 잘못된 결과

        Arrays.sort(arr2);  // 배열정렬
        System.out.println(Arrays.toString(arr2));  // [0, 1, 2, 3, 4]
        int idx2 = Arrays.binarySearch(arr2, 2); // idx = 2

        // equals(), toString()
        int[] arr3 = {0, 1, 2, 3, 4};
        int[][] arr2D = {{11, 12}, {21, 22}};

        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.deepToString(arr2D));

        int[][] arr2D2 = {{11, 12}, {21, 22}};
        System.out.println(Arrays.equals(arr2D2, arr2D));   // false
        System.out.println(Arrays.deepEquals(arr2D, arr2D2));   // true

        // asList()
        List list = Arrays.asList(1, 2, 3, 4, 5);
        // list.add(6);    // 추가불가

    }
}

