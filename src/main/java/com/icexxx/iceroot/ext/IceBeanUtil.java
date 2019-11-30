package com.icexxx.iceroot.ext;

import java.util.List;

import org.springframework.context.ApplicationContext;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ClassUtil;
import cn.hutool.core.util.StrUtil;

/**
 * spring bean工具类
 * 
 * @author IceWater
 * @version 2.0.1
 */
public class IceBeanUtil {
    /**
     * 根据spring上下文获取bean
     * 
     * @param ac spring上下文
     * @param <T> 泛型
     * @return 获取的bean
     * @since 2.0.1
     */
    public static <T> T getBean(ApplicationContext ac) {
        if (ac == null) {
            return null;
        }
        StackTraceElement stackTraceCurrent = null;
        try {
            throw new Exception();
        } catch (Exception e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            stackTraceCurrent = stackTrace[1];
        }
        String className = stackTraceCurrent.getClassName();
        int lineNumber = stackTraceCurrent.getLineNumber();
        String basePath = ClassUtil.getClassPath();
        String sourceCodePath = null;
        String middlePath = null;
        if (basePath.contains("/target/")) {
            sourceCodePath = StrUtil.subBefore(basePath, "/target/", true);
            if (basePath.contains("/test-classes/")) {
                middlePath = "src/test/java";
            } else {
                middlePath = "src/main/java";
            }
        } else {
            sourceCodePath = StrUtil.subBefore(basePath, "/build/classes/", true);
            middlePath = "src";
        }
        String javaFileName = sourceCodePath + "/" + middlePath + "/" + className.replace(".", "/") + ".java";
        List<String> lines = FileUtil.readUtf8Lines(javaFileName);
        String line = lines.get(lineNumber - 1);
        line = StrUtil.trim(line);
        String statement = StrUtil.subBefore(line, "=", false);
        String beanName = null;
        String varible = null;
        if (statement.contains(" ")) {
            String classname = StrUtil.subBefore(statement, " ", false);
            classname = classname.trim();
            beanName = StrUtil.lowerFirst(classname);
            varible = StrUtil.subAfter(statement, " ", false);
            varible = StrUtil.lowerFirst(varible.trim());
        } else {
            String classname = statement.trim();
            beanName = StrUtil.lowerFirst(classname);
        }
        line = StrUtil.trim(line);
        T bean = (T) ac.getBean(beanName);
        if (bean == null && varible != null) {
            bean = (T) ac.getBean(varible);
        }
        return bean;
    }

    /**
     * 根据spring上下文获取bean
     * 
     * @param ac spring上下文
     * @param name bean名称
     * @return 获取的bean对象
     * @since 2.0.1
     */
    public static <T> T getBean(ApplicationContext ac, String name) {
        if (ac == null) {
            return null;
        }
        T bean = (T) ac.getBean(name);
        return bean;
    }

}
