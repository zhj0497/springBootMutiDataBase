package com.aa.springstudy.service;

import com.aa.springstudy.mapper.ChannelMapper;
import com.aa.springstudy.annotation.Master;
import com.aa.springstudy.domain.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
