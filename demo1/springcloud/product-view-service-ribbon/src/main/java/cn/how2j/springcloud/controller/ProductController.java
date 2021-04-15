package cn.how2j.springcloud.controller;
import cn.how2j.springcloud.pojo.Product;
import cn.how2j.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author xuezy
 * @description 生产者controller
 * @date 2021/4/15 18:19
 */
@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	/**
	 * @describe 获取数据展示到页面
	 * @author xuezy
	 * @date 2021/4/15 18:21
	 * @param m
	 * @return java.lang.Object
	 */
	@RequestMapping("/products")
	public Object products(Model m){
		List<Product> ps = productService.listProducts();
		m.addAttribute("ps", ps);
		return "products";
	}

}
