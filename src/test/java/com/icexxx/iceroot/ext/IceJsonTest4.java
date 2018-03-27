package com.icexxx.iceroot.ext;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.hutool.json.JSONUtil;

public class IceJsonTest4 {

    public static void main(String[] args) {
        User user = new User();
        user.setUsername("zs");
        user.setPassword("pass");
        user.setAge(18L);
        user.setBirthday(new Date());
        user.setPrice(3.14159265358);
        user.setCars(15);
        user.setEmpty(null);
        user.setSex(true);
        user.setCars(23);
        user.set_123("556699");
        user.setBook("西游记");
        Product product = new Product();
        product.setName("素材");
        product.setCount(33);
        Map<String, String> table = new HashMap<String, String>();
        table.put("aaa", "bbb");
        table.put("eee", "fff");
        table.put("ggg", "hhh");
        product.setTable(table);
        user.setProduct(product);
        Product product1 = new Product();
        product1.setName("素材");
        product1.setCount(33);
        Product product2 = new Product();
        product2.setName("测试");
        product2.setCount(55);
        List<Product> listProduct = new ArrayList<Product>();
        listProduct.add(product1);
        listProduct.add(product2);
        user.setList2(listProduct);
        List<String> listStr = new ArrayList<String>();
        listStr.add("zzz");
        listStr.add("rrr");
        listStr.add("ttt");
        listStr.add("yyy");
        user.setList1(listStr);
        String json = null;
        json = JSONUtil.toJsonStr(listProduct);
        System.out.println(listProduct);
        cn.hutool.json.JSONArray hutoolJson = JSONUtil.parseArray(json);
        System.out.println(hutoolJson.get(0));
        com.alibaba.fastjson.JSONArray fast = JSONConvert.toFastJSONArray(hutoolJson);
        System.out.println(fast.get(0));
        cn.hutool.json.JSONArray hutool = JSONConvert.toHutoolJSONArray(fast);
        System.out.println(hutool.get(0));
        net.sf.json.JSONArray sf = JSONConvert.toSfJSONArray(hutool);
        System.out.println(sf.get(0));
        cn.hutool.json.JSONArray hutool2 = JSONConvert.toHutoolJSONArray(sf);
        System.out.println(hutool2.get(0));
        com.alibaba.fastjson.JSONArray fast2 = JSONConvert.toFastJSONArray(sf);
        System.out.println(fast2.get(0));
        net.sf.json.JSONArray sf2 = JSONConvert.toSfJSONArray(fast2);
        System.out.println(sf2.get(0));
        System.out.println(hutool2);
        System.out.println(sf);
        System.out.println(fast2);
    }

}
