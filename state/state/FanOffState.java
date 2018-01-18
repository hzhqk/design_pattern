package state.state;

import state.context.FanContext;

/**
 * Created by HanQiankun(hqk2015@foxmail.com) on 2018/01/09.
 */
public class FanOffState extends FanState {

    @Override
    public void turnOff() {
        System.out.println("关闭ok");
    }

    @Override
    public void shiftLow() {
        context.setFanState(FanContext.LOW);
        context.getFanState().shiftLow();
    }

    @Override
    public void shiftHigh() {
        context.setFanState(FanContext.HIGH);
        context.getFanState().shiftHigh();
    }
}
