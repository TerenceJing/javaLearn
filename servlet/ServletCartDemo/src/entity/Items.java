package entity;

//商品类
public class Items {

	private int id; // 商品编号
	private String name; // 商品名称
	private String city; // 产地
	private int price; // 价格
	private int number; // 库存
	private String picture; // 商品图片

	//保留此不带参数的构造方法
	public Items(){}	
	public Items(int id,String name,String city,int price,int number,String picture)
	{
		this.id = id;
		this.name = name;
		this.city = city;
		this.picture = picture;
		this.number = number;
		this.price = price;
		
		
	}
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getCity() 
	{
		return city;
	}

	public void setCity(String city) 
	{
		this.city = city;
	}

	public int getPrice() 
	{
		return price;
	}

	public void setPrice(int price) 
	{
		this.price = price;
	}

	public int getNumber() 
	{
		return number;
	}

	public void setNumber(int number) 
	{
		this.number = number;
	}

	public String getPicture() 
	{
		return picture;
	}

	public void setPicture(String picture) 
	{
		this.picture = picture;
	}
	
	
	
	@Override
	public int hashCode() //添加重复商品的时候，对象相同（ID相同）
	{
		
		return this.getId()+this.getName().hashCode();
	}

	@Override
	public boolean equals(Object obj)  //判断对象是否相同，是否同一个对象；
	{  
		if(this==obj)
		{
			return true;
		}
		if(obj instanceof Items) //若为商品类
		{
			Items i = (Items)obj; //强制类型转换为商品
			if(this.getId()==i.getId()&&this.getName().equals(i.getName()))
				                                //比较当前商品编号和名称是否等于自身的编号和名称
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}

	public String toString()
	{
		return "商品编号："+this.getId()+",商品名称："+this.getName();
	}

}
