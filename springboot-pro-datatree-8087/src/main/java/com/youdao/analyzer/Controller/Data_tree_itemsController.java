package com.youdao.analyzer.Controller;

import com.youdao.analyzer.entities.Data_tree_items;
import com.youdao.analyzer.mapper.Data_tree_itemsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

/**
 * Created by gaocheng on 2018/11/26.
 */
@RestController//使用这个注解后返回的数据都是json格式的
public class Data_tree_itemsController {
    @Autowired
    Data_tree_itemsMapper mapper;

    @RequestMapping("/list")
    public List<Data_tree_items> getList() {//获取datamenu表所有数据
        return mapper.selectAll();
    }

    @RequestMapping("/getCurrentUserDataTree")//获取用户以及树的相关数据
    public String getCurrentUserDataTree(String user, Set<String> perms, List<Data_tree_items> treeItems) {
        treeItems=mapper.selectAll();
        return null;
    }
}
