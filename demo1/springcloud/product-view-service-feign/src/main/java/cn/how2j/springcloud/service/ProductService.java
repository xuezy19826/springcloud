package cn.how2j.springcloud.service;
import cn.how2j.springcloud.client.ProductClientFeign;
import cn.how2j.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuezy
 * @description service服务类
 * @date 2021/5/6 18:28
 */
@Service
public class ProductService {

	@Autowired
	ProductClientFeign productClientFeign;

	public List<Product> listProducts(){
		return productClientFeign.listProducts();
	}


}
