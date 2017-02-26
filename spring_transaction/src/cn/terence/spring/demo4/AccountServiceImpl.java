package cn.terence.spring.demo4;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Transactional注解中的属性
 * propagation:事务的传播行为
 * isolation:事务的隔离级别
 * readOnly:只读
 * rollbackFor:发生哪些异常事务回滚
 * noRollbackFor:发生哪些异常事务不回滚
 *
 */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,readOnly=false)
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
