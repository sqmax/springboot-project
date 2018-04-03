package com.imooc.service.impl;

import com.imooc.dto.OrderDTO;
import com.imooc.service.PushMessage;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SqMax on 2018/4/2.
 */
@Service
@Slf4j
public class PushMessageImpl implements PushMessage {

    @Autowired
    private WxMpService wxMpService;

    @Override
    public void orderStatus(OrderDTO orderDTO) {

        WxMpTemplateMessage templateMessage=new WxMpTemplateMessage();
        templateMessage.setTemplateId("GoCullfix05R-rCibvoyI87ZUg50cyieKA5AyX7pPzo");
        templateMessage.setToUser("");
        try {
            wxMpService.getTemplateMsgService().sendTemplateMsg(templateMessage);
        }catch (WxErrorException e){
            log.error("【微信模板消息】发送失败，{}",e);
        }
    }
}
