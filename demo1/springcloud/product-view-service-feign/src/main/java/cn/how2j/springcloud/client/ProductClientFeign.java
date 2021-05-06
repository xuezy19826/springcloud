package cn.how2j.springcloud.client;

import cn.how2j.springcloud.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author xuezy
 * @description Feign客户端
 * Feign 客户端， 通过 注解方式 访问 访问PRODUCT-DATA-SERVICE服务的 products路径，
 * product-data-service 既不是域名也不是ip地址，而是 数据服务在 eureka 注册中心的名称
 * @date 2021/5/6 18:21
 */
@FeignClient(value = "PRODUCT-DATA-SERVICE")
public interface ProductClientFeign {

	/**
	 * 获取列表信息
	 * @author xuezy
	 * @date 2021/5/6 18:25
	 * @return java.util.List<cn.how2j.springcloud.pojo.Product>
	 */
	@GetMapping("/products")
	public List<Product> listProducts();
}
