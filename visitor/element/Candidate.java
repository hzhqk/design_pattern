package visitor.element;

import visitor.visitor.Reward;

/**
 * Created by HanQiankun(hqk2015@foxmail.com) on 2018/01/05.
 */
public interface Candidate {
    void accept(Reward reward);
}
