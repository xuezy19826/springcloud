package cn.how2j.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @describe eurekaServer启动类
 * @author xuezy
 * @date 2021/4/15 15:45
 * @return
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplicaion {
    public static void main( String[] args ) {
        new SpringApplicationBuilder(EurekaServerApplicaion.class).run(args);
        System.out.println( "Hello World!" );
    }
}
