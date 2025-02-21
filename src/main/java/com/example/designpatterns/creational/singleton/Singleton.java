package main.java.com.example.designpatterns.creational.singleton;

public class Singleton {
    // 私有静态变量，保存唯一实例
    private static Singleton instance;

    // 私有构造函数，防止外部实例化
    private Singleton() {
    }

    // 公共静态方法，提供全局访问点
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // 示例方法
    public void showMessage() {
        System.out.println("Hello from Singleton!!!");
    }
}
