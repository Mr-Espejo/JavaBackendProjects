package com.funcamentos.springboot.fundamentos.configuration;

import com.funcamentos.springboot.fundamentos.bean.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBeanTwoImplement();
    }

    @Bean
    public MyOperation beanOperationOperation(){
        return new MyOperationImplement() ;
    }

    @Bean
    public MyBeanWithDependency beanOperationWithDependency(MyOperation myOperation ){
        return new MyBeanWithDependencyImplements(myOperation);
    }
}

