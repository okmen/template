package com.srdz.dao;

import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.srdz.entity.EErrors;

public interface EErrorsMapper extends BaseMapper<EErrors> {
	List<EErrors> findErrorlist(Date datetime);
}
