package cn.terence.spring.demo3;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl implements AccountService {
	//注入转账的Dao
	private AccountDao accountDao;	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	/**
	 * @param out
	 * @param in
	 * @param money
	 */
	public void transfer(String out,String in,Double money) {
			accountDao.outMoney(out, money);
			int i=1/0;
			accountDao.inMoney(in, money);
	}
}
