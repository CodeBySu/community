package com.nowcoder.community.entity;


import java.util.Date;

/**
 * @Auther: suhuan
 * @Date: 2022/2/2 - 02 - 02 - 9:56
 */
public class DiscussPost {
    private int id;//帖子的id
    private int userId;//用户的id
    private String title;//帖子的标题
    private String content;//帖子的内容
    private int type;//帖子的类型，0：普通，1：置顶
    private int status;//帖子的状态，0：正常，1：精华，2：拉黑
    private Date createTime;
    private int commentCount;
    private double score;//帖子的分数

    @Override
    public String toString() {
        return "DisscussPost{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", createTime=" + createTime +
                ", commentCount=" + commentCount +
                ", score=" + score +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
