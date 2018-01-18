package state.context;

import state.state.FanHighState;
import state.state.FanLowState;
import state.state.FanOffState;
import state.state.FanState;

/**
 * Created by HanQiankun(hqk2015@foxmail.com) on 2018/01/09.
 */
public class FanContext {
    public static final FanState OFF = new FanOffState();
    public static final FanState LOW = new FanLowState();
    public static final FanState HIGH = new FanHighState();

    private FanState fanState;

    public FanContext() {
        setFanState(OFF);
    }

    public void turnOff() {
        if (this.fanState == OFF) {
            System.out.println("已经是关闭状态了！");
            return;
        }
        fanState.turnOff();
    }

    public void shiftHigh() {
        if (this.fanState == HIGH) {
            System.out.println("已经是高速状态了！");
            return;
        }
        fanState.shiftHigh();
    }

    public void shiftLow() {
        if (this.fanState == LOW) {
            System.out.println("已经是低速状态了！");
            return;
        }
        fanState.shiftLow();
    }


    public void setFanState(FanState fanState) {
        this.fanState = fanState;
        this.fanState.setContext(this); //传入控制台
    }

    public FanState getFanState() {
        return fanState;
    }
}
