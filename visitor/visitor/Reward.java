package visitor.visitor;

import visitor.element.Student;
import visitor.element.Teacher;

/**
 * Created by HanQiankun(hqk2015@foxmail.com) on 2018/01/05.
 */
public interface Reward {
    /**
     * 评比学生
     *
     * @param student
     */
    void appraiseStudent(Student student);

    /**
     * 评比老师
     *
     * @param teacher
     */
    void appraiseTeacher(Teacher teacher);
}
