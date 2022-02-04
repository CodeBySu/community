package com.nowcoder.community;

import com.nowcoder.community.dao.DiscussMapper;
import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DiscussMapper discussMapper;

    @Test
    public void testSelectPosts(){
        List<DiscussPost> disscussPosts = discussMapper.selectDiscussPost(149, 0, 10);
        disscussPosts.forEach(System.out::println);
        int rows = discussMapper.selectDiscussRows(149);
        System.out.println("帖子的总数："+rows);
    }
}
