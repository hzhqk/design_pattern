package state.state;

import state.context.FanContext;

/**
 * Created by HanQiankun(hqk2015@foxmail.com) on 2018/01/09.
 */
public class FanLowState extends FanState {

    @Override
    public void turnOff() {
        context.setFanState(FanContext.OFF);
        context.getFanState().turnOff();
    }

    @Override
    public void shiftLow() {
        System.out.println("低速ok！");
    }

    @Override
    public void shiftHigh() {
        context.setFanState(FanContext.HIGH);
        context.getFanState().shiftHigh();
    }
}
