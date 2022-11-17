package org.example.java_programming_language;

import java.util.function.Function;

public class MethodReferenceEx1 {
    // 기존 메서드
    Integer chgInt(String s) {
        return Integer.parseInt(s) ;
    }

    //람다식으로 바꾸기
    Function<String,Integer> f = (String s) -> Integer.parseInt(s) ;

    // 메서드 참조 방법으로 바꾸기
    Function<String,Integer> f1 = Integer::parseInt ; // 직접 호출
}
