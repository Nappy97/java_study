package org.example.java_programming_language;

// 전에 인터페이스 섹션에서 알아봤듯이
// public abstract 는 생략 가능하다.
@FunctionalInterface
interface MyFunction {
    public abstract int max(int a, int b);
}

class LamdaEx1 {
    MyFunction f = new MyFunction() {
        public int max(int a, int b) {
            return a > b ? a : b ;
        }
    };
    int mx = f.max(10, 15) ;
}

class LamdaEx2 {
    MyFunction f = (int a, int b) -> a > b ? a : b ; // 이 세미콜론(;)은 참조변수 대입을 하기 때문에 적어야 한다.
    int mx = f.max(10, 15) ;
}
