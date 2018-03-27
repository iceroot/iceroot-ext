package com.icexxx.iceroot.ext;

/**
 * json互相转化
 * 
 * @author IceWater
 * @version 2.0
 */
public class JSONAdapter {
    public static <T> cn.hutool.json.JSONObject fastJSON2HutoolJSONObject(T jsonObject) {
        return cn.hutool.json.JSONUtil.parseObj(((com.alibaba.fastjson.JSONObject) jsonObject).toString());
    }

    public static <T> com.alibaba.fastjson.JSONObject hutoolJSON2FastJSONObject(T jsonObject) {
        return com.alibaba.fastjson.JSON
                .parseObject(cn.hutool.json.JSONUtil.toJsonStr((cn.hutool.json.JSONObject) jsonObject));
    }

    public static <T> cn.hutool.json.JSONArray fastJSON2HutoolJSONArray(T jsonArray) {
        return cn.hutool.json.JSONUtil.parseArray(((com.alibaba.fastjson.JSONArray) jsonArray).toString());
    }

    public static <T> com.alibaba.fastjson.JSONArray hutoolJSON2FastJSONArray(T jsonArray) {
        return com.alibaba.fastjson.JSON
                .parseArray(cn.hutool.json.JSONUtil.toJsonStr((cn.hutool.json.JSONArray) jsonArray));
    }

    public static <T> cn.hutool.json.JSONObject sfJSON2HutoolJSONObject(T jsonObject) {
        return cn.hutool.json.JSONUtil.parseObj(((net.sf.json.JSONObject) jsonObject).toString());
    }

    public static <T> net.sf.json.JSONObject hutoolJSON2SfJSONObject(T jsonObject) {
        return net.sf.json.JSONObject
                .fromObject(cn.hutool.json.JSONUtil.toJsonStr((cn.hutool.json.JSONObject) jsonObject));
    }

    public static <T> cn.hutool.json.JSONArray sfJSON2HutoolJSONArray(T jsonArray) {
        return cn.hutool.json.JSONUtil.parseArray(((net.sf.json.JSONArray) jsonArray).toString());
    }

    public static <T> net.sf.json.JSONArray hutoolJSON2SfJSONArray(T jsonArray) {
        return net.sf.json.JSONArray
                .fromObject(cn.hutool.json.JSONUtil.toJsonStr((cn.hutool.json.JSONArray) jsonArray));
    }

    public static <T> com.alibaba.fastjson.JSONObject sfJSON2FastJSONObject(T jsonObject) {
        return com.alibaba.fastjson.JSON.parseObject(((net.sf.json.JSONObject) jsonObject).toString());
    }

    public static <T> net.sf.json.JSONObject fastJSON2SfJSONObject(T jsonObject) {
        return net.sf.json.JSONObject.fromObject(((com.alibaba.fastjson.JSONObject) jsonObject).toString());
    }

    public static <T> com.alibaba.fastjson.JSONArray sfJSON2FastJSONArray(T jsonArray) {
        return com.alibaba.fastjson.JSON.parseArray(((net.sf.json.JSONArray) jsonArray).toString());
    }

    public static <T> net.sf.json.JSONArray fastJSON2SfJSONArray(T jsonArray) {
        return net.sf.json.JSONArray.fromObject(((com.alibaba.fastjson.JSONArray) jsonArray).toString());
    }
}
