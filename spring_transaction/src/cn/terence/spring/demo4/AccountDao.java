package cn.terence.spring.demo4;

/**
 * 转账案例Dao层
 * @author Terence
 *
 */
public interface AccountDao {
	/**
	 * 
	 * @param out
	 * @param money
	 */
	public void outMoney(String out,Double money);
	
	/**
	 * 
	 * @param in
	 * @param money
	 */
	public void inMoney(String in,Double money);

}
