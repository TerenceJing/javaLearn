package com.terence.sell;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component //声明注入Bean
@ConfigurationProperties(prefix = "sell")
public class SellProperties
{
    @Value("${high}")
    private String high;

    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;

    public SellProperties() {
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
