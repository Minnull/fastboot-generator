package factory.scheme;

import java.util.List;

/**
 * Created by 张钦 on 2016/7/29.
 */
public class ControllerQueryToolModel extends BaseModel {
    private List<ControllerQueryModel> criterias;
    private String basePackage;

    public List<ControllerQueryModel> getCriterias() {
        return criterias;
    }

    public void setCriterias(List<ControllerQueryModel> criterias) {
        this.criterias = criterias;
    }

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }
}
