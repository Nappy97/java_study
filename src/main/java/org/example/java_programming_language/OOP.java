package org.example.java_programming_language;

public class OOP {

    public static void main(String[] args) {
        Tv t;
        t = new Tv(7);
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은 " + t.channel + "입니다");

        Tv[] tvArr = new Tv[3];

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv(7);
            tvArr[i].channel = i + 10;
        }

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
        }
    }

}

class Tv {
    // 속성 (멤버변수)
    String color;
    boolean power;
    int channel;

    // 기능(메서드)
    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }

    public Tv(int channel) {
        this.channel = channel;
    }
}
