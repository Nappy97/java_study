package org.example.java_programming_language;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx {

    public static void main(String[] args) {
//        HashMap map = new HashMap();
        Map map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요");
            System.out.print("id: ");
            String id = s.nextLine();

            System.out.print("password: ");
            String password = s.nextLine().trim();
            System.out.println();

            if (!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다." +
                        "다시 입력해주세요");
                continue;
            }
            if (!(map.get(id)).equals(password)) {
                System.out.println("비밀번호가 일치하지않습니다. 다시 입력해주세요");
            } else {
                System.out.println("일치!");
                break;
            }
        }
    }
}
