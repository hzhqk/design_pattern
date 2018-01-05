package visitor.visitor;

import visitor.element.Student;
import visitor.element.Teacher;

/**
 * 优秀评选者
 * Created by HanQiankun(hqk2015@foxmail.com) on 2018/01/05.
 */
public class ExcellentReward implements Reward {
    @Override
    public void appraiseStudent(Student student) {
        if (student.getScore() > 90) {
            System.out.println(student.getName());
        }
    }

    @Override
    public void appraiseTeacher(Teacher teacher) {
        if (teacher.getNicePaper() > 5) {
            System.out.println(teacher.getName());
        }
    }
}
