package cn.how2j.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xuezy
 * @description 实体类
 * @date 2021/5/6 18:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	private int id;

	private String name;

	private int price;

}
