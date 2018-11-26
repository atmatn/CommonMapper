package com.youdao.analyzer.Controller;

import com.youdao.analyzer.entities.Data_tree_items;
import com.youdao.analyzer.mapper.Data_tree_itemsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by gaocheng on 2018/11/26.
 */
@RestController
public class Data_tree_itemsController {
    @Autowired
    Data_tree_itemsMapper mapper;
    @RequestMapping("/list")
    public List<Data_tree_items> getList(){
        return mapper.selectAll();
    }
}
