package entity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/*
 * 购物车类
 */
public class Cart 
{
	//购买商品的集合
	private HashMap<Items,Integer> goods;
	//购物车总金额
	private double totalPrice;
	
	public Cart()
	{
		goods=new HashMap<Items,Integer>();
		totalPrice=0.0;
	}

	public HashMap<Items, Integer> getGoods() {
		return goods;
	}

	public void setGoods(HashMap<Items, Integer> goods) {
		this.goods = goods;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	//向购物车添加商品
	public boolean addGoodsInCart(Items items,int number)
	{
		if(goods.containsKey(items))
		{
			goods.put(items,  goods.get(items)+number);
		}
		else{
			goods.put(items,number);
		}
		calTotalPrice();//重新计算购物车商品价钱
		return true;
	}
	//从购物车删除商品
	public boolean removeGoodsFromCart(Items items)
	{
		goods.remove(items);
		calTotalPrice();
		return true;
	}
	//统计购物车总金额
	public double calTotalPrice()
	{
		double sum=0.0;
		Set<Items> keys=goods.keySet();//获取键值集合
		for(Iterator<Items> it=keys.iterator();it.hasNext();)
		{
			Items i=it.next();
			sum+=i.getPrice()*goods.get(i);//通过键值it获取对应的数量；
		}
		this.setTotalPrice(sum);
		return totalPrice;
		
		
	}
	public static void main(String[] args)
	{
		Items i1=new Items(1,"沃特篮球鞋","温州",100,500,"001,jpg");
		Items i2=new Items(2,"李宁篮球鞋","莆田",400,500,"002,jpg");
		Items i3=new Items(1,"沃特篮球鞋","温州",100,500,"001,jpg");
		Cart cart=new Cart();
		cart.addGoodsInCart(i1, 1);
		cart.addGoodsInCart(i2, 2);
		cart.addGoodsInCart(i3, 3);//合并了相同商品记录
		
		Set<Map.Entry<Items,Integer>> items=cart.getGoods().entrySet();//Entry是指键值对
		for(Map.Entry<Items,Integer> obj:items)
		{
			System.out.println(obj);
		}
		System.out.println("购物车的总金额："+cart.getTotalPrice());
	}
	
}
