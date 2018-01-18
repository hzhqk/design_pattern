package state.state;

import state.context.FanContext;

/**
 * Created by HanQiankun(hqk2015@foxmail.com) on 2018/01/09.
 */
public abstract class FanState {
    protected FanContext context;

    public void setContext(FanContext context) {
        this.context = context;
    }

    public abstract void turnOff();

    public abstract void shiftLow();

    public abstract void shiftHigh();
}
