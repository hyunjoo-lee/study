package com.study.lee.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.study.lee.domain.Study;


@Mapper
public interface StudyMapper {

	List<Study> loginCheck(Map<String, Object> params);


}
