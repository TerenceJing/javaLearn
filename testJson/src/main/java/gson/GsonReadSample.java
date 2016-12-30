package gson;

import java.io.File;

import json.ReadJsonSample;

import org.apache.commons.io.FileUtils;

import bean.DaShen;
import bean.DiaoSi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//反向解析成一个bean;
public class GsonReadSample {

	public static void main(String[] args) throws Exception {
		File file=new File(ReadJsonSample.class.getResource("/data/terence.json").getFile());
		String content =FileUtils.readFileToString(file);
		Gson gson=new Gson();
		DaShen terence=gson.fromJson(content, DaShen.class);
		System.out.println(terence.toString());
		
		//利用GSON转换日期
		Gson g=new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		DiaoSi wang=g.fromJson(content, DiaoSi.class);
		System.out.println(wang.getBirthday().toLocaleString());
		
		System.out.println(wang.getClass());
		System.out.println(wang.getMajor());
		System.out.println(wang.getMajor().getClass());
		
	}

}
