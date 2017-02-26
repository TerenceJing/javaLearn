package cn.terence.spring.demo2;

import org.springframework.jdbc.core.support.JdbcDaoSupport;


/**
 * 转账案例Dao层实现类
 * @author Terence
 *
 *继承JdbcDaoSupport模板给Dao层实现类
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	public void inMoney(String out, Double money) {
		String sql="update account set money=money-? where name=?";
		this.getJdbcTemplate().update(sql,money,out);
	}

	public void outMoney(String in, Double money) {
		String sql="update account set money=money+? where name=?";
		this.getJdbcTemplate().update(sql,money,in);
	}

}
