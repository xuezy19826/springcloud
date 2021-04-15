package cn.how2j.test;

import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * @author xuezy
 * @description 测试子项目是否可以引用父项目jar包
 * @date 2021/4/15 14:44
 */
public class TestHutool {

	public static void main(String[] args) {
		String dataStr = "2021-04-15 14:48:01";
		Date date = DateUtil.parse(dataStr);
		System.out.println(date);
	}
}
