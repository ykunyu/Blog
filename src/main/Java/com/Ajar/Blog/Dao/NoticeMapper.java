package com.Ajar.Blog.Dao;

import com.Ajar.Blog.Pojo.Notice;
import com.Ajar.Blog.Pojo.NoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeMapper {
    int countByExample(NoticeExample example);

    int deleteByExample(NoticeExample example);

    int deleteByPrimaryKey(Integer noticeId);

    int insert(Notice record);

    int insertSelective(Notice record);

    List<Notice> selectByExample(NoticeExample example);

    Notice selectByPrimaryKey(Integer noticeId);

    int updateByExampleSelective(@Param("record") Notice record, @Param("example") NoticeExample example);

    int updateByExample(@Param("record") Notice record, @Param("example") NoticeExample example);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);
}