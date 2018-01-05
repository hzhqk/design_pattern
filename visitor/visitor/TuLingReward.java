package visitor.visitor;

import visitor.element.Student;
import visitor.element.Teacher;

/**
 * Created by HanQiankun(hqk2015@foxmail.com) on 2018/01/05.
 */
public class TuLingReward implements Reward {
    @Override
    public void appraiseStudent(Student student) {
        if (student.getScore() > 95) {
            System.out.println(student.getName());
        }
    }

    @Override
    public void appraiseTeacher(Teacher teacher) {
        if (teacher.getScore() > 90) {
            System.out.println(teacher.getName());
        }
    }
}
