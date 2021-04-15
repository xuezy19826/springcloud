package cn.how2j.springcloud.service;

import cn.how2j.springcloud.pojo.Product;
import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuezy
 * @description 生产者Service
 * @date 2021/4/15 17:12
 */
@Service
public class ProductService {

	/**
	 * 获取配置文件中的端口号
	 */
	@Value("${server.port}")
	String port;

	/**
	 * @describe 获取示例数据
	 * @author xuezy
	 * @date 2021/4/15 17:14
	 * @return java.util.List<cn.how2j.springcloud.pojo.Product>
	 */
	public List<Product> listProducts(){
		List<Product> ps = new ArrayList<>();
		ps.add(new Product(1, "product a from port:" + port, 50));
		ps.add(new Product(2, "product b from port:" + port, 150));
		ps.add(new Product(3, "product c from port:" + port, 250));
		return ps;
	}

}
