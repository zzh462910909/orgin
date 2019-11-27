package cn.zzh.springboot.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<JSONObject> list=new ArrayList<>();
        String str ="{\"brandId\": \"2\",\"scope\":\"2\"}";
        try {
            JSONObject jo = JSONObject.parseObject(str);
            JSONArray array =(JSONArray) jo.get("data");
            for (int i = 0; i <array.size() ; i++) {
                JSONObject jsonObject = array.getJSONObject(i);
                JSONObject json = new JSONObject();
                json.put("dealerProvinceId", jsonObject.get("dealerPrvnceId"));
                json.put("dealerProvinceNm", jsonObject.get("dealerPrvnceNm"));
                json.put("dealerLandCityId", jsonObject.get("dealerLandCityId"));
                json.put("dealerLandCityNm", jsonObject.get("dealerLandCityNm"));
                json.put("dealerTownCityId", jsonObject.get("dealerTownCityId"));
                json.put("dealerTownCityNm", jsonObject.get("dealerTownCityNm"));
                list.add(json);
            }
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = list.size() - 1; j > i; j--) {
                    if (list.get(j).get("dealerTownCityId").equals(list.get(i).get("dealerTownCityId"))) {
                        list.remove(j);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(list);
    }
}
