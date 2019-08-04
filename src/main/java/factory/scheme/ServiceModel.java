package factory.scheme;

/**
 * Created by 张钦 on 2016/6/16.
 */
public class ServiceModel extends BaseModel {

    private String basePackage;
    private String beanName;
    private String caseBeanName;
    private String beanDao;
    private String caseBeanDao;
    private String baseUrl;
    private String idType;
    private String criteria;
    private String idName;

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getCaseBeanName() {
        return caseBeanName;
    }

    public void setCaseBeanName(String caseBeanName) {
        this.caseBeanName = caseBeanName;
    }

    public String getBeanDao() {
        return beanDao;
    }

    public void setBeanDao(String beanDao) {
        this.beanDao = beanDao;
    }

    public String getCaseBeanDao() {
        return caseBeanDao;
    }

    public void setCaseBeanDao(String caseBeanDao) {
        this.caseBeanDao = caseBeanDao;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }
}
