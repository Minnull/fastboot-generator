package factory.scheme;

/**
 * Created by 张钦 on 2016/6/28.
 */
public class FormImageModel extends BaseModel {

    private String ctxPath = "${ctxPath}";
    private String coulumnTitle;
    private String coulumnCaseName;
    private String formValue;

    public String getCtxPath() {
        return ctxPath;
    }

    public void setCtxPath(String ctxPath) {
        this.ctxPath = ctxPath;
    }

    public String getCoulumnTitle() {
        return coulumnTitle;
    }

    public void setCoulumnTitle(String coulumnTitle) {
        this.coulumnTitle = coulumnTitle;
    }

    public String getCoulumnCaseName() {
        return coulumnCaseName;
    }

    public void setCoulumnCaseName(String coulumnCaseName) {
        this.coulumnCaseName = coulumnCaseName;
    }

    public String getFormValue() {
        return formValue;
    }

    public void setFormValue(String formValue) {
        this.formValue = formValue;
    }
}
