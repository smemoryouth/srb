package com.ajie.service.impl;

import com.ajie.pojo.entity.UserLoginRecord;
import com.ajie.mapper.UserLoginRecordMapper;
import com.ajie.service.UserLoginRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录记录表 服务实现类
 * </p>
 *
 * @author 阿劼
 * @since 2021-07-22
 */
@Service
public class UserLoginRecordServiceImpl extends ServiceImpl<UserLoginRecordMapper, UserLoginRecord> implements UserLoginRecordService {

}
