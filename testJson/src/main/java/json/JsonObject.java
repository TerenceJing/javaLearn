package json;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import bean.DaShen;

public class JsonObject {
	public static void main(String[] args)
	{
		JSONObject();
		createJsonByMap();
		createJsonByBean();
	}
	
	//一般方法
	private static void JSONObject(){
		 JSONObject terence =new JSONObject();
		 Object nullObj=null;
		 try {
			 terence.put("name","terence");
			 terence.put("age",25.9);
			 terence.put("birthday","1996-05-06");
			 terence.put("school","HDU");
			 terence.put("major",new String[]{"敲键盘","装13"});
			 terence.put("has_girlfriend",false);
			 terence.put("car",nullObj);
			 terence.put("house",nullObj);
			 terence.put("comment","注释到底");
			 System.out.println(terence.toString());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	//使用Map构建JSON,将Map转换成JSON
	private static void createJsonByMap()
	{
		Map<String,Object> terence=new HashMap<String,Object>();
		Object nullObj=null;
		terence.put("name","terence");
		terence.put("age",25);
		terence.put("birthday","1990-05-06");
		terence.put("school","HDU");
		terence.put("major",new String[]{"敲键盘","装13"});
		terence.put("has_girlfriend",false);
		terence.put("car",nullObj);
		terence.put("house",nullObj);
		terence.put("comment","注释到底");
		
		System.out.println(new JSONObject(terence));
	}
	
	//使用JavaBean构建对象,推荐使用，因为这样的业务对象JavaBean可以重用。
	private static void createJsonByBean()
	{
		DaShen terence=new DaShen();
		terence.setAge(25.9);
		terence.setBirthday("1990-5-9");
		terence.setSchool("HDU");
		terence.setMajor(new String[]{"Computer","qiqiqiqi"});
		terence.setHas_girlfriend(false);
		terence.setComment("sha,sha,sha,sha……");
		terence.setCar(null);
		terence.setHouse(null);
		System.out.println(new JSONObject(terence));
	}
	
}

	
