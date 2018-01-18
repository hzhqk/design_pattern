package state;

import state.context.FanContext;

/**
 * Created by HanQiankun(hqk2015@foxmail.com) on 2018/01/09.
 */
public class Main {
    public static void main(String[] args) {
        FanContext context = new FanContext();

        context.turnOff();

        context.shiftHigh();

        context.shiftLow();

        context.turnOff();
    }
}
