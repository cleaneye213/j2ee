package cn.zhiyou.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zhiyou.mapper.GoodsMapper;
import cn.zhiyou.model.Goods;

@Service
public class GoodsService {
	
	@Autowired
	private GoodsMapper goodMapper;
	
	public Goods getGoods(Integer id){
		return goodMapper.selectByPrimaryKey(id);
	}

}
