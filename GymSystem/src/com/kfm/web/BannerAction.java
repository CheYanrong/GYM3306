package com.kfm.web;

import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public class BannerAction extends JsonServlet {

	@Override
	public String dealInput(Map<String, String[]> input) {
	   String[] array = {
		   "http://rj9fbp0cw.hb-bkt.clouddn.com/banner_01.jpg", 
		   "http://rj9fbp0cw.hb-bkt.clouddn.com/banner_02.png",
		   "http://rj9fbp0cw.hb-bkt.clouddn.com/banner_03.png",
		  // "../../images/banner_04.png"
		   "http://rj9fbp0cw.hb-bkt.clouddn.com/banner_04.png"
	   };
		return JSONObject.toJSONString(array);
	}
}
