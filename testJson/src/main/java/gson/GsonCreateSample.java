package gson;

import java.lang.reflect.Field;

import bean.DaShen;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonCreateSample {

	public static void main(String[] args) {
		DaShen terence=new DaShen();
		terence.setName("terence");
		terence.setAge(25.9);
		terence.setBirthday("1990-5-9");
		terence.setSchool("HDU");
		terence.setMajor(new String[]{"Computer","qiqiqiqi","装B"});
		terence.setHas_girlfriend(false);
		terence.setComment("sha,sha,sha,sha……");
		terence.setCar(null);
		terence.setHouse(null);
		terence.setIgnore("请把我忽略掉，beng……sah ka la ka");
		Gson gson=new Gson();
		System.out.println(gson.toJson(terence));
		
		GsonBuilder gsonBuilder=new GsonBuilder();
		gsonBuilder.setPrettyPrinting();//设置出漂亮的格式
		Gson gson2=gsonBuilder.create();
		System.out.println(gson2.toJson(terence));
		
		//利用Gson生成一个新的策略，生成个性化的json，显然JSONObject不具备这样的能力
		//传给这个策略一个回调函数，通过回调函数添加一些额外的功能
		gsonBuilder.setFieldNamingStrategy(new FieldNamingStrategy() 
		{
			public String translateName(Field f)
			{
				if(f.getName().equals("age"))
					return "AGE";
				else
					return f.getName();
			}
		});
		Gson gson3=gsonBuilder.create();
		System.out.println(gson3.toJson(terence));

	}

}
