package visitor.element;

import visitor.visitor.Reward;

import java.util.Objects;

/**
 * Created by HanQiankun(hqk2015@foxmail.com) on 2018/01/05.
 */
public class Student implements Candidate {

    private String name;
    private int score;
    private int nicePaper;

    public Student(String name, int score, int nicePaper) {
        this.name = name;
        this.score = score;
        this.nicePaper = nicePaper;
    }

    @Override
    public void accept(Reward reward) {
        reward.appraiseStudent(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNicePaper() {
        return nicePaper;
    }

    public void setNicePaper(int nicePaper) {
        this.nicePaper = nicePaper;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return score == student.score &&
                nicePaper == student.nicePaper &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, score, nicePaper);
    }
}
