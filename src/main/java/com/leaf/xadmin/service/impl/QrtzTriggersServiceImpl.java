package com.leaf.xadmin.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.leaf.xadmin.entity.qrtz.QrtzTriggers;
import com.leaf.xadmin.mapper.QrtzTriggersMapper;
import com.leaf.xadmin.service.IQrtzTriggersService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author leaf
 * <p>date: 2018-03-01 23:40</p>
 * <p>version: 1.0</p>
 */
@Service
public class QrtzTriggersServiceImpl extends ServiceImpl<QrtzTriggersMapper, QrtzTriggers> implements IQrtzTriggersService {
    @Override
    public List<QrtzTriggers> queryList() {
        return baseMapper.selectList(new EntityWrapper<>());
    }
}