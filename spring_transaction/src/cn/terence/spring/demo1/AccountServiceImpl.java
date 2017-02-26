package cn.terence.spring.demo1;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl implements AccountService {
	//注入转账的Dao
	private AccountDao accountDao;	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	//注入事务管理模板
	private TransactionTemplate transactionTemplate;	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}
	/**
	 * 编程式事务管理
	 * 将操作绑定在一起，如果遇到异常，则发生事务回滚
	 * final型变量，内部使用
	 * @param out
	 * @param in
	 * @param money
	 */
	public void transfer(final String out,final String in,final Double money) {
		//在事务模板中执行操作
		transactionTemplate.execute(new TransactionCallbackWithoutResult(){
		@Override
		protected void doInTransactionWithoutResult(TransactionStatus transactionstatus){
			accountDao.outMoney(out, money);
			int i=1/0;
			accountDao.inMoney(in, money);
		 }
		});
	}
}
