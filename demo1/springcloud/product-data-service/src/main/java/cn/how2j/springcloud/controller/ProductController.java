package cn.how2j.springcloud.controller;

import cn.how2j.springcloud.pojo.Product;
import cn.how2j.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xuezy
 * @description 生产者controller
 * @date 2021/4/15 17:17
 */
@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping("/products")
	public Object products(){
		List<Product> ps = productService.listProducts();
		return ps;
	}

}
