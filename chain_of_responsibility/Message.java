package chain_of_responsibility;

/**
 * Created by hqk2015@foxmail.com on 2017/12/14.
 */
public class Message {
    private String code;
    private String applicant;
    private String remark;

    public Message() {
    }

    public Message(String code, String applicant) {
        this.code = code;
        this.applicant = applicant;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
