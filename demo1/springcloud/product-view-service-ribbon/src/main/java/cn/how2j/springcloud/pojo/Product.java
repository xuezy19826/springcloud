package cn.how2j.springcloud.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import	java.util.Date;

/**
 * @author xuezy
 * @description 生产者
 * @date 2021/4/15 18:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	private int id;

	private String name;

	private int price;

}
