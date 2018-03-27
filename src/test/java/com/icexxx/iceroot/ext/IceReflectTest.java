package com.icexxx.iceroot.ext;

import org.junit.Test;

public class IceReflectTest {
    //@Test
    public void create(){
        Class create = IceReflectUtil.create("zzz.java.ccc");
        System.out.println(create);
        System.out.println(create.getName());
    }
}
