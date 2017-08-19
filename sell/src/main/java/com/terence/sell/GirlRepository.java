package com.terence.sell;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
/**
 * 继承自一个访问的数据库，列表为Girl,主键id类型为Integer
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {

    //通过年龄查询,修改DDL，自定义查询方法
    public List<Girl> findByAge(Integer age);
}
