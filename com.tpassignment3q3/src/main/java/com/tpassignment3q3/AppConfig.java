package com.tpassignment3q3; /**
 * Created by student on 2016/03/14.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
    @Bean(name="cal")
    public ClassCalculator getService(){
        return new CalculatorImp();
    }

    @Bean(name="newcal")
    public ClassCalculator getService(){
        return new CalculatorImp2();
    }



}
