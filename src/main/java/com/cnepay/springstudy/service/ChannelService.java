package com.cnepay.springstudy.service;

import com.cnepay.springstudy.annotation.Master;
import com.cnepay.springstudy.domain.Channel;
import com.cnepay.springstudy.mapper.ChannelMapper;
import com.cnepay.springstudy.mutidatabase.DBContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ChannelService {
    @Autowired
    private ChannelMapper channelMapper;
    @Master
   // @Transactional(propagation=Propagation.REQUIRED)
    public int saveChannel(Channel channel){
        return channelMapper.insertSelective(channel);
    }

    public List<Channel> findAllChannels(){
        return channelMapper.findAll();
    }
}
