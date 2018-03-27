package com.icexxx.iceroot.ext;

/**
 * JSON转换工具类
 * 
 * @author IceWater
 * @version 2.0.0
 */
public class JSONConvert {
    public static <T> cn.hutool.json.JSONObject toHutoolJSONObject(T jsonObject) {
        String className = jsonObject.getClass().getName();
        if ("com.alibaba.fastjson.JSONObject".equals(className)) {
            return JSONAdapter.fastJSON2HutoolJSONObject(jsonObject);
        } else if ("net.sf.json.JSONObject".equals(className)) {
            return JSONAdapter.sfJSON2HutoolJSONObject(jsonObject);
        }
        return null;

    }

    public static <T> cn.hutool.json.JSONArray toHutoolJSONArray(T jsonArray) {
        String className = jsonArray.getClass().getName();
        if ("com.alibaba.fastjson.JSONArray".equals(className)) {
            return JSONAdapter.fastJSON2HutoolJSONArray(jsonArray);
        } else if ("net.sf.json.JSONArray".equals(className)) {
            return JSONAdapter.sfJSON2HutoolJSONArray(jsonArray);
        }
        return null;
    }

    public static <T> com.alibaba.fastjson.JSONObject toFastJSONObject(T jsonObject) {
        String className = jsonObject.getClass().getName();
        if ("cn.hutool.json.JSONObject".equals(className)) {
            return JSONAdapter.hutoolJSON2FastJSONObject(jsonObject);
        } else if ("net.sf.json.JSONObject".equals(className)) {
            return JSONAdapter.sfJSON2FastJSONObject(jsonObject);
        }
        return null;

    }

    public static <T> com.alibaba.fastjson.JSONArray toFastJSONArray(T jsonArray) {
        String className = jsonArray.getClass().getName();
        if ("cn.hutool.json.JSONArray".equals(className)) {
            return JSONAdapter.hutoolJSON2FastJSONArray(jsonArray);
        } else if ("net.sf.json.JSONArray".equals(className)) {
            return JSONAdapter.sfJSON2FastJSONArray(jsonArray);
        }
        return null;
    }

    public static <T> net.sf.json.JSONObject toSfJSONObject(T jsonObject) {
        String className = jsonObject.getClass().getName();
        if ("cn.hutool.json.JSONObject".equals(className)) {
            return JSONAdapter.hutoolJSON2SfJSONObject(jsonObject);
        } else if ("com.alibaba.fastjson.JSONObject".equals(className)) {
            return JSONAdapter.fastJSON2SfJSONObject(jsonObject);
        }
        return null;

    }

    public static <T> net.sf.json.JSONArray toSfJSONArray(T jsonArray) {
        String className = jsonArray.getClass().getName();
        if ("cn.hutool.json.JSONArray".equals(className)) {
            return JSONAdapter.hutoolJSON2SfJSONArray(jsonArray);
        } else if ("com.alibaba.fastjson.JSONArray".equals(className)) {
            return JSONAdapter.fastJSON2SfJSONArray(jsonArray);
        }
        return null;
    }
}
