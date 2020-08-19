package com.zhang.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class mySelfRule {
    @Bean
    public IRule muRule(){
        return new RandomRule();
    }
}
