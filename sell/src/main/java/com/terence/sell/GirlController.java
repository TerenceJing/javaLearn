package com.terence.sell;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 对数据库的操作
 */
@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;

    @GetMapping(value="/girls")
    public List<Girl> girlList(){

        return girlRepository.findAll(); //不需要数据库一句话可以查询接口数据库中
    }

    /**
     * 添加要给女生
     * @param cupSize
     * @param age
     * @return
     */
    //@PostMapping(value="/postGirls")
    //@RequestMapping(value="/getGirl_1",params = {"cupSize","age"},method=RequestMethod.GET)
    @RequestMapping(value="/getGirl_1/{cupSize}/{age}",method=RequestMethod.GET)
    public Girl girlAdd(@PathVariable("cupSize") String cupSize,
                        @PathVariable("age") Integer age)
    {
        Girl girl=new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository .save(girl); //save返回了添加的对象
    }
    @PostMapping(value="/postGirl_2")
    public Girl girlAdd2(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age)
    {
        Girl girl=new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository .save(girl); //save返回了添加的对象
    }
    //查询
    @GetMapping(value="/girls/find/{id}")
    public Girl girlFindOne(@PathVariable Integer id)
    {
        return girlRepository.findOne(id);
    }
    //更新
    @PutMapping(value="/girls/update/{id}")
    public Girl girlUpdate(@PathVariable Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age)
    {
        Girl girl=new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);
    }
    //删除
    @GetMapping(value="/girls/delete/{id}")
    public void girlDeleteOne(@PathVariable Integer id)
    {
        girlRepository.delete(id); //没有返回值
    }

    //通过年龄查询列表
    @GetMapping(value="/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age)
    {
        return girlRepository.findByAge(age);
    }


    @PostMapping (value="/girls/two")
    public void girlTwo()
    {
        girlService.insertTwo();
    }

}
