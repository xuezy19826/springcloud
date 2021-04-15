package cn.how2j.springcloud.client;

import cn.how2j.springcloud.pojo.Product;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author xuezy
 * @description Ribbon客户端
 * @date 2021/4/15 18:13
 */
@Component
public class ProductClientRibbon {

	@Autowired
	RestTemplate restTemplate;

	/**
	 * @describe 通过Ribbon客户端调用eureka注册中心的服务
	 * 通过 restTemplate 访问 http://PRODUCT-DATA-SERVICE/products ， 而 product-data-service 既不是域名也不是ip地址，
	 * 而是 数据服务在 eureka 注册中心的名称。
	 * 注意看，这里只是指定了要访问的 微服务名称，但是并没有指定端口号到底是 8001, 还是 8002
	 * @author xuezy
	 * @date 2021/4/15 18:15
	 * @return java.util.List<cn.how2j.springcloud.pojo.Product>
	 */
	public List<Product> listProducts(){
		return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products", List.class);
	}
}
