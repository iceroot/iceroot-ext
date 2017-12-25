package com.icexxx.iceroot.ext;

class JSONAdapter {
    public static <T> com.xiaoleilu.hutool.json.JSONObject fastJSON2HutoolJSONObject(T jsonObject) {
        return com.xiaoleilu.hutool.json.JSONUtil.parseObj(((com.alibaba.fastjson.JSONObject) jsonObject).toString());
    }

    public static <T> com.alibaba.fastjson.JSONObject hutoolJSON2FastJSONObject(T jsonObject) {
        return com.alibaba.fastjson.JSON.parseObject(
                com.xiaoleilu.hutool.json.JSONUtil.toJsonStr((com.xiaoleilu.hutool.json.JSONObject) jsonObject));
    }

    public static <T> com.xiaoleilu.hutool.json.JSONArray fastJSON2HutoolJSONArray(T jsonArray) {
        return com.xiaoleilu.hutool.json.JSONUtil.parseArray(((com.alibaba.fastjson.JSONArray) jsonArray).toString());
    }

    public static <T> com.alibaba.fastjson.JSONArray hutoolJSON2FastJSONArray(T jsonArray) {
        return com.alibaba.fastjson.JSON.parseArray(
                com.xiaoleilu.hutool.json.JSONUtil.toJsonStr((com.xiaoleilu.hutool.json.JSONArray) jsonArray));
    }

    public static <T> com.xiaoleilu.hutool.json.JSONObject sfJSON2HutoolJSONObject(T jsonObject) {
        return com.xiaoleilu.hutool.json.JSONUtil.parseObj(((net.sf.json.JSONObject) jsonObject).toString());
    }

    public static <T> net.sf.json.JSONObject hutoolJSON2SfJSONObject(T jsonObject) {
        return net.sf.json.JSONObject.fromObject(
                com.xiaoleilu.hutool.json.JSONUtil.toJsonStr((com.xiaoleilu.hutool.json.JSONObject) jsonObject));
    }

    public static <T> com.xiaoleilu.hutool.json.JSONArray sfJSON2HutoolJSONArray(T jsonArray) {
        return com.xiaoleilu.hutool.json.JSONUtil.parseArray(((net.sf.json.JSONArray) jsonArray).toString());
    }

    public static <T> net.sf.json.JSONArray hutoolJSON2SfJSONArray(T jsonArray) {
        return net.sf.json.JSONArray.fromObject(
                com.xiaoleilu.hutool.json.JSONUtil.toJsonStr((com.xiaoleilu.hutool.json.JSONArray) jsonArray));
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
