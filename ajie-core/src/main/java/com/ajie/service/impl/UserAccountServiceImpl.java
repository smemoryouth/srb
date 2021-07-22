package com.ajie.service.impl;

import com.ajie.pojo.entity.UserAccount;
import com.ajie.mapper.UserAccountMapper;
import com.ajie.service.UserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author 阿劼
 * @since 2021-07-22
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
