package chain_of_responsibility;

import chain_of_responsibility.handler.Handler;
import chain_of_responsibility.handler.impl.Boss;
import chain_of_responsibility.handler.impl.Chief;
import chain_of_responsibility.handler.impl.Manager;

/**
 * Created by hqk2015@foxmail.com on 2017/12/14.
 */
public class Main {
    public static void main(String[] args){
        Handler manager = new Manager("经理");
        Handler chief = new Chief("总监");
        Handler boss = new Boss("老板");

        manager.setNextHandler(chief);
        chief.setNextHandler(boss);

        Message msg1 = new Message("1", "小明");
        Message msg2 = new Message("2", "未知");

        manager.handle(msg1);
        manager.handle(msg2);

    }
}
