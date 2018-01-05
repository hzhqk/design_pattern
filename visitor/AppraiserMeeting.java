package visitor;

import visitor.element.Candidate;
import visitor.visitor.Reward;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HanQiankun(hqk2015@foxmail.com) on 2018/01/05.
 */
public class AppraiserMeeting {
    private List<Candidate> candidates = new ArrayList<>();

    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }

    public void cancelCandidate(Candidate candidate) {
        candidates.remove(candidate);
    }

    public void appraise(Reward reward) {
        for (Candidate candidate : candidates) {
            candidate.accept(reward);
        }
    }
}
