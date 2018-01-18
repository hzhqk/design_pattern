package state.state;

import state.context.FanContext;

/**
 * Created by HanQiankun(hqk2015@foxmail.com) on 2018/01/09.
 */
public class FanHighState extends FanState {

    @Override
    public void turnOff() {
        context.setFanState(FanContext.OFF);
        context.getFanState().turnOff();
    }

    @Override
    public void shiftLow() {
        context.setFanState(FanContext.LOW);
        context.getFanState().shiftLow();
    }

    @Override
    public void shiftHigh() {
        System.out.println("高速ok");
    }
}
