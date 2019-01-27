package com.martin.pattern.struct.proxy;

import java.io.FileOutputStream;

import org.junit.Before;
import org.junit.Test;
import sun.misc.ProxyGenerator;

public class StaticProxyTest {
    private Man user;

    @Before
    public void setUp() {
        user = new Man("Tom");
    }

    @Test
    public void testStaticProxy() {
        System.out.println("\ntest static proxy..................");
        StaticProxy proxyObj = new StaticProxy(user);
        System.out.println(proxyObj);
        proxyObj.walk();
    }

    @Test
    public void testDynamicProxy() {
        System.out.println("\ntest dynamic proxy..................");
        DynamicProxy proxy = new DynamicProxy(user);
        Person proxyObj = (Person) proxy.getInstance();
        System.out.println(proxyObj.getClass());
        proxyObj.findJob();
        writeClass("$Proxy0", Person.class);
    }

    @Test
    public void testCglibProxy() {
        System.out.println("\ntest cglib proxy..................");
        Student student = new Student();
        CglibProxy proxy = new CglibProxy();
        Student proxyObj = (Student) proxy.getInstance(Student.class);
        System.out.println(proxyObj);
        proxyObj.goToSchool();
    }

    public void writeClass(String className, Class<?> clazz) {
        try {
            byte[] bytes = ProxyGenerator.generateProxyClass(className, new Class[]{clazz});
            FileOutputStream os = new FileOutputStream("./$proxy0.class");
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
