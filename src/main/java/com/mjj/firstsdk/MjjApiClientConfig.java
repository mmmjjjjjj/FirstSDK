package com.mjj.firstsdk;


import com.mjj.firstsdk.client.MjjApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("mjj.client")//读取配置
@Data
@ComponentScan
public class MjjApiClientConfig {
    private String accessKey;

    private String secretKey;

    @Bean
    public MjjApiClient mjjApiClient(){
        return new MjjApiClient(accessKey, secretKey);
    }
}
