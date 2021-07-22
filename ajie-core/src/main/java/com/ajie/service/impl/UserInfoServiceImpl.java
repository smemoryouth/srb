package com.ajie.service.impl;

import com.ajie.pojo.entity.UserInfo;
import com.ajie.mapper.UserInfoMapper;
import com.ajie.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息 服务实现类
 * </p>
 *
 * @author 阿劼
 * @since 2021-07-22
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
