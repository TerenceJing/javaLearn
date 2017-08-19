package com.terence.sell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @RestController=@Controller+@ResponseBody
 */
//@Controller
//@ResponseBody()
@RestController
//@RequestMapping("/temp") //需要作为Url的方法名的前缀和方法名拼接起来:http://127.0.0.1:8081/sell/temp/hello
public class HelloController {
   @Value("${high}")
    private String high;

    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;

    @Autowired
    private SellProperties sellProperties;

    @RequestMapping(value="hello",method = RequestMethod.GET )
    public String say(){
        return "Hello Spring Boot";
    }

    /**
     * 多个url地址访问到同一个方法，用集合的方式写url方法地址
     * @return
     */
   @RequestMapping(value={"info","private"},method = RequestMethod.GET )
    public String say2(){
        String str ="身高："+high+"\n;年龄："+age;
       // return str;
        return content;
    }

    @RequestMapping(value="assem",method = RequestMethod.GET )
    public String say3(){
        return sellProperties.getContent();
    }

    @RequestMapping(value="template",method = RequestMethod.GET )
    public String say4(){
        return "index";
    }

    /*
      路参绑定
      @PathVariable(value = "id" ,required = false,defalutValue="0"
      表示将路径中的参数绑定给方法中的参数，required=false表示参数传不传都可以，不传的时候默认值为0
     */
    @RequestMapping(value="/pathV/{id}",method = RequestMethod.GET )
   // @GetMapping(value)
    public String say4(@PathVariable(value = "id" ) Integer id){
        return "id"+id;
    }
    /*@RequestMapping(value="/pathV/{id}",method = RequestMethod.GET )
    // @GetMapping(value)
    public String say4(@PathVariable(value = "id" ,required = false,defalutValue="0") Integer id){
        return "id"+id;
    }*/
}
