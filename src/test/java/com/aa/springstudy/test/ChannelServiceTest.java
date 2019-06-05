package com.aa.springstudy.test;

import com.aa.springstudy.Application;
import com.aa.springstudy.domain.Channel;
import com.aa.springstudy.service.ChannelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@EnableTransactionManagement
public class ChannelServiceTest {
    @Autowired
    private ChannelService channelService;
    @Test
  //  @Transactional
    public void testSaveChannel(){
        Channel channel = new Channel();
        channel.setId(11L);
        channel.setChannelCode("test");
        channel.setChannelName("mytest");
        channel.setStatus(0);
        channel.setCreateDate(new Date());
       int status= channelService.saveChannel(channel);
        System.out.println("---------------------------------channel:-----------------------------------"+status);
        List<Channel> list=  channelService.findAllChannels();
        for(Channel channel1:list){
            System.out.println("chanel1:"+channel1);
        }
        Channel channel1 = new Channel();
        channel1.setId(12L);
        channel1.setChannelCode("test");
        channel1.setChannelName("mytest");
        channel1.setStatus(0);
        channel1.setCreateDate(new Date());
        int status1= channelService.saveChannel(channel1);
        System.out.println("---------------------------------channel:-----------------------------------"+status1);


    }
    @Test
    public void testFind(){
       // System.out.println("---------------------------------channel:-----------------------------------"+status);
        List<Channel> list=  channelService.findAllChannels();
        for(Channel channel1:list){
            System.out.println("chanel1:"+channel1);
        }
    }
}
