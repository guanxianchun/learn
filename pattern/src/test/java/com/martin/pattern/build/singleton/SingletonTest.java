package com.martin.pattern.build.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.concurrent.CountDownLatch;

import com.martin.pattern.builder.singleton.lazy.ImproveLazySingleton;
import com.martin.pattern.builder.singleton.lazy.LazySingleton;
import com.martin.pattern.builder.singleton.lazy.SyncLazySingleton;
import com.martin.pattern.builder.singleton.register.BeanFactory;
import org.junit.Test;

public class SingletonTest {

    private int threads = 20000;

    /**
     * 测试并发情况下，单例对象被创建多次
     */
    @Test
    public void testLazySingleton() {
        final CountDownLatch latch = new CountDownLatch(this.threads);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < this.threads; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {
                        try {
                            latch.await();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        Object o1 = LazySingleton.getInstance();
                        System.out.println(System.currentTimeMillis() + ":" + o1);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                }
            }.start();

            latch.countDown();
        }
        System.out.println("运行用时：" + (System.currentTimeMillis() - startTime));
    }

    @Test
    public void testImproveLazySingleton() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < threads; i++) {
            Object o1 = ImproveLazySingleton.getInstance();
        }
        System.out.println("运行用时：" + (System.currentTimeMillis() - startTime));
    }

    public void testRefImproveLazySingleton() throws Exception {
        Class<?> clz = ImproveLazySingleton.class;
        Constructor<?> constructor = clz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        Object o1 = constructor.newInstance();

        //修改initialized值,还可以初始化单例
        Field field = clz.getDeclaredField("initialized");
        field.setAccessible(true);
        System.out.println("before " + field.getName() + ":" + field.getBoolean(o1));
        field.setBoolean(o1, false);
        System.out.println("after " + field.getName() + ":" + field.getBoolean(o1));

        Object o2 = constructor.newInstance();
        System.out.println(o1 == o2);
    }

    @Test
    public void testSyncLazySingleton() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < threads; i++) {
            Object o1 = SyncLazySingleton.getInstance();
        }
        System.out.println("运行用时：" + (System.currentTimeMillis() - startTime));
    }

    @Test
    public void testRegister() {
        System.out.println(BeanFactory.getBean("com.martin.pattern.builder.bean.JavaCourse"));
    }
}
