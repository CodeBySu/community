package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: suhuan
 * @Date: 2022/2/2 - 02 - 02 - 10:06
 */
@Mapper
public interface DiscussMapper {
    /**
     * 根据用户id，起始行号和页大小查询帖子
     * @param userId：帖子用户的id
     * @param offset：起始页号
     * @param limit：页大小
     * @return 帖子集合
     */
    List<DiscussPost> selectDiscussPost(int userId, int offset, int limit);

    //@Param用于给参数起别名、如果只有一个参数，并且在<if>里面使用那么必须加别名
    int selectDiscussRows(@Param("userId") int userId);

}
