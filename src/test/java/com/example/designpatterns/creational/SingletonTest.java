package test.java.com.example.designpatterns.creational;

import main.java.com.example.designpatterns.creational.singleton.Singleton;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    public void testSingletonInstance() {
        // 获取两个实例
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // 验证两个实例是同一个
        assertSame(instance1, instance2, "Both instances should be the same");
        System.out.println("testSingletonInstance");
    }

    @Test
    public void testShowMessage() {
        Singleton instance = Singleton.getInstance();
        instance.showMessage(); // 这将输出 "Hello from Singleton!"
        System.out.println("testShowMessage");
    }
}

