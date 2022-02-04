package com.nowcoder.community.service;

import com.nowcoder.community.dao.DiscussMapper;
import com.nowcoder.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: suhuan
 * @Date: 2022/2/3 - 02 - 03 - 3:10
 */
@Service
public class DiscussPosterService {
    @Autowired
    private DiscussMapper discussMapper;

    public List<DiscussPost> findDiscussPosts(int userId,int offset,int limit){
        return discussMapper.selectDiscussPost(userId,offset,limit);
    }

    /**
     * 用于查询总行数
     * @param userId
     * @return
     */
    public int findDiscussRows(int userId){
        return discussMapper.selectDiscussRows(userId);
    }
}
