package chain_of_responsibility.handler;

import chain_of_responsibility.Message;

/**
 * Created by hqk2015@foxmail.com on 2017/12/14.
 */
public abstract class Handler {
    protected String name;
    protected Handler nextHandler;

    public Handler(String name) {
        this.name = name;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(Message message);

    protected void passMessage(Message message) {
        if (nextHandler != null) {
            nextHandler.handle(message);
        } else {
            throw new UnsupportedOperationException("can't handle this message!");
        }
    }
}
