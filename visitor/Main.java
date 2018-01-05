package visitor;

import visitor.element.Student;
import visitor.element.Teacher;
import visitor.visitor.ExcellentReward;
import visitor.visitor.Reward;
import visitor.visitor.TuLingReward;

/**
 * Created by HanQiankun(hqk2015@foxmail.com) on 2018/01/05.
 */
public class Main {
    public static void main(String[] args) {
        //评比大会先布置好
        AppraiserMeeting appraiserMeeting = new AppraiserMeeting();
        //学生老师都准备好，要开始了
        Student ming = new Student("ming", 98, 3);
        Student ning = new Student("ning", 95, 8);
        Student hua = new Student("hua", 90, 5);

        Teacher kong = new Teacher("kong", 98, 6);
        Teacher juli = new Teacher("juli", 88, 3);
        Teacher peng = new Teacher("peng", 90, 5);
        //准备好的都参选
        appraiserMeeting.addCandidate(ming);
        appraiserMeeting.addCandidate(ning);
        appraiserMeeting.addCandidate(hua);
        appraiserMeeting.addCandidate(kong);
        appraiserMeeting.addCandidate(juli);
        appraiserMeeting.addCandidate(peng);
        //开始评“比优秀个人奖”
        System.out.println("优秀个人奖获奖者：");
        Reward excellentPersonReward = new ExcellentReward();
        appraiserMeeting.appraise(excellentPersonReward);

        //开始评比“校园图灵奖”
        System.out.println("校园图灵获奖者：");
        Reward tulingReward = new TuLingReward();
        appraiserMeeting.appraise(tulingReward);
    }
}
