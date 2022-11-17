package org.example.java_programming_language;

public class TestDaemonThread extends Thread{

    public void run(){

        // 데몬 스레드인지 확인
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread");
        }
        else{
            System.out.println("Normal thread executing");
        }
    }
    public static void main(String[] args){

        TestDaemonThread t1=new TestDaemonThread();
        TestDaemonThread t2=new TestDaemonThread();

        //t1을 데몬으로 설정
        t1.setDaemon(true);

        // 스레드 시작
        t1.start();
        t2.start();
    }
}