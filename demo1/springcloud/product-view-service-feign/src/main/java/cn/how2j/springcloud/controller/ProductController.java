package cn.how2j.springcloud.controller;

import cn.how2j.springcloud.pojo.Product;
import cn.how2j.springcloud.service.ProductService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author xuezy
 * @description 控制器
 * @date 2021/5/6 18:31
 */
@Controller
@RefreshScope
public class ProductController {

	/**
	 * 从config-server中获取version信息
	 */
	@Value("${version}")
	String version;

	@Autowired
	ProductService productService;

	@GetMapping("/products")
	public Object products(Model m){
		List<Product> pList = productService.listProducts();
		m.addAttribute("ps", pList);
		m.addAttribute("version", version);
		return "products";
	}

}
