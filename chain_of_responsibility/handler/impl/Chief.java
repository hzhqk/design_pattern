package chain_of_responsibility.handler.impl;

import chain_of_responsibility.Message;
import chain_of_responsibility.handler.Handler;

/**
 * Created by hqk2015@foxmail.com on 2017/12/14.
 */
public class Chief extends Handler {

    public Chief(String name) {
        super(name);
    }

    @Override
    public void handle(Message message) {
        if ("2".equals(message.getCode())) {
            System.out.println("Yes, I get it. It's OK! This is Chief.");
        } else {
            passMessage(message);
        }
    }
}
