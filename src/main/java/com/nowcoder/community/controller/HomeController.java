package com.nowcoder.community.controller;

import com.nowcoder.community.dao.DiscussMapper;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.Page;
import com.nowcoder.community.entity.User;
import com.nowcoder.community.service.DiscussPosterService;
import com.nowcoder.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: suhuan
 * @Date: 2022/2/3 - 02 - 03 - 3:47
 */
@Controller
public class HomeController {
    @Autowired
    private DiscussPosterService discussPosterService;
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/index",method = RequestMethod.GET)
    public String getIndexPage(Model model, Page page){//通过model携带数据传给模板
        page.setRows(discussPosterService.findDiscussRows(0));
        page.setPath("/index");

        List<DiscussPost> list = discussPosterService.findDiscussPosts(0, page.getOffset(), page.getLimit());
        List<Map<String,Object>> discussPosts = new ArrayList<>();//集合用于封装装查询出来的
        if(list !=  null){
            for (DiscussPost post : list) {
                Map<String, Object> map = new HashMap<>();
                map.put("post",post);//装的是每一个遍历出来的discussPost
                User user = userService.findUserById(post.getUserId());
                map.put("user",user);
                String headerUrl = user.getHeaderUrl();
                System.out.println(headerUrl);
                discussPosts.add(map);
            }
        }
        model.addAttribute("discussPosts",discussPosts);
        return "/index";
    }
}
