package cn.how2j.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xuezy
 * @description 生产者
 * @date 2021/4/15 16:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	private int id;

	private String name;

	private int price;

}
