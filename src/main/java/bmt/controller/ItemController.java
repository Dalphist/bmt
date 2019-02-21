package bmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

import bmt.common.beans.ResultBean;
import bmt.entity.Item;
import bmt.service.ItemServiceImpl;

/**
* Title: ItemController  
* Description:
* @author Dalphist  
* @date 2019年2月21日
 */
@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemServiceImpl itemService;

    @GetMapping("/list")
    @ResponseBody
    public PageInfo<Item> getItemList(){
    	Item item = new Item();
        PageInfo<Item> itemPage = itemService.selectItemList(item);
        return itemPage;
    }
    
    @PostMapping("/insert")
    @ResponseBody
    public ResultBean<Integer> insertItem(@RequestBody String itemJson){
    	Item item = JSON.parseObject(itemJson, Item.class);
    	int id = itemService.insertItem(item);
        return new ResultBean<Integer>(id);
    }
    
    @PostMapping("/delete")
    @ResponseBody
    public ResultBean<Integer> deleteItem(int id){
    	int count = itemService.deleteItem(id);
    	return new ResultBean<Integer>(count);
    }
    
}
