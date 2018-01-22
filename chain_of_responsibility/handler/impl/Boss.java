package chain_of_responsibility.handler.impl;

import chain_of_responsibility.Message;
import chain_of_responsibility.handler.Handler;

/**
 * Created by hqk2015@foxmail.com on 2017/12/14.
 */
public class Boss extends Handler {

    public Boss(String name) {
        super(name);
    }

    @Override
    public void handle(Message message) {
        if ("3".equals(message.getCode())) {
            System.out.println("Yes, I get it. It's OK! This is Boss.");
        } else {
            passMessage(message);
        }
    }
}
