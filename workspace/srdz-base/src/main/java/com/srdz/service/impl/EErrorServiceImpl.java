package com.srdz.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.srdz.entity.EErrors;
import com.srdz.mapper.EErrorsMapper;
import com.srdz.service.IEErrorService;

@Service
public class EErrorServiceImpl extends ServiceImpl<EErrorsMapper, EErrors> implements IEErrorService{

}
