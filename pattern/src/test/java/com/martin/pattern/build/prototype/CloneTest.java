package com.martin.pattern.build.prototype;

import com.martin.pattern.builder.bean.JavaCourse;
import com.martin.pattern.builder.prototype.ProtoType;
import org.junit.Test;

public class CloneTest {
    @Test
    public void test() throws Exception {
        ProtoType protoType = new ProtoType();
        protoType.setName("Java");
        protoType.getCourses().add(new JavaCourse());

        testClone(protoType);

        testDeepClone(protoType);
    }

    public static void testClone(ProtoType protoType) throws Exception {
        System.out.println("clone .................");
        ProtoType clone = (ProtoType) protoType.clone();
        System.out.println(clone.getName());
        System.out.println("origin car: " + protoType.getCourses().get(0));
        System.out.println("destinct car: " + clone.getCourses().get(0));

    }

    public static void testDeepClone(ProtoType protoType) {
        System.out.println("deep clone .................");
        ProtoType clone = (ProtoType) protoType.deepClone();
        System.out.println(clone.getName());
        System.out.println("origin car: " + protoType.getCourses().get(0));
        System.out.println("destinct car: " + clone.getCourses().get(0));

    }
}
