package cn.how2j.springcloud.service;

import cn.how2j.springcloud.client.ProductClientRibbon;
import cn.how2j.springcloud.pojo.Product;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuezy
 * @description 生产者业务层service
 * @date 2021/4/15 18:17
 */
@Service
public class ProductService {

	@Autowired
	ProductClientRibbon productClientRibbon;

	/**
	 * @describe 调用ribbon客户端获取数据
	 * @author xuezy
	 * @date 2021/4/15 18:18
	 * @return java.util.List<cn.how2j.springcloud.pojo.Product>
	 */
	public List<Product> listProducts(){
		return productClientRibbon.listProducts();
	}

}
