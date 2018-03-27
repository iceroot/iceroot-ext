package com.icexxx.iceroot.ext;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;

/**
 * 反射工具类
 * 
 * @author IceWater
 * @version 2.0.1
 */
public class IceReflectUtil {
    /**
     * 根据类名称创建一个类
     * 
     * @param className 类名称
     * @return 创建的类
     * @since 2.0.1
     */
    public static Class create(String className) {
        ClassPool pool = ClassPool.getDefault();
        CtClass ctClass = pool.makeClass(className);
        Class<?> clazz = null;
        try {
            clazz = ctClass.toClass();
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
        return clazz;
    }
}
