package com.huiy.dataformat;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年3月29日
 * @version 1.0
 */
public class JsonUtil {
	public static void main(String[] args){
		Map<String,Object> map = new HashMap<String,Object>();
//        map.put("type","click");
        map.put("name", "客官，请点赞");
		Map<String,Object> submap = new HashMap<String,Object>();
		submap.put("type","view");
		submap.put("name", "搜索");
		submap.put("url","http://www.soso.com/");
		map.put("sub_button",submap);
        String jsonstr = JSONObject.toJSONString(map);
        System.out.println(jsonstr);
	}

}
