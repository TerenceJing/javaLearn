package com.terence.sell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional //事务注解 --将该方法的所有操作作为一个事务进行，要么全部执行，要么全部失败
    public void insertTwo()
    {
        Girl girlA=new Girl();
        girlA.setAge(23);
        girlA.setCupSize("C");
        girlRepository.save(girlA);


        Girl girlB=new Girl();
        girlB.setAge(20);
        girlB.setCupSize("D");
        girlRepository.save(girlB);
    }

}
