package cn.zzh.springboot.main;

public class CreateComputer {
    public static void main(String[] args) {
        ComputerFactory.createComputer("hp").start();
    }
}
