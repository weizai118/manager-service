package io.choerodon.manager.api.dto;

import java.util.Date;
import java.util.Map;

public class ConfigDTO {

    private Long id;

    private String name;

    private String configVersion;

    private Boolean isDefault;

    private Long serviceId;

    private Map<String, Object> value;

    private String source;

    private Date publicTime;

    private Long objectVersionNumber;

    private String txt;

    public ConfigDTO(String name, String configVersion, Boolean isDefault, String source) {
        this.name = name;
        this.configVersion = configVersion;
        this.isDefault = isDefault;
        this.source = source;
    }

    public ConfigDTO() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConfigVersion() {
        return configVersion;
    }

    public void setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public Map<String, Object> getValue() {
        return value;
    }

    public void setValue(Map<String, Object> value) {
        this.value = value;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(Date publicTime) {
        this.publicTime = publicTime;
    }

    public Long getObjectVersionNumber() {
        return objectVersionNumber;
    }

    public void setObjectVersionNumber(Long objectVersionNumber) {
        this.objectVersionNumber = objectVersionNumber;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    @Override
    public String toString() {
        return "ConfigDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", configVersion='" + configVersion + '\'' +
                ", isDefault=" + isDefault +
                ", serviceId=" + serviceId +
                ", value=" + value +
                ", source='" + source + '\'' +
                ", publicTime=" + publicTime +
                ", objectVersionNumber=" + objectVersionNumber +
                ", txt='" + txt + '\'' +
                '}';
    }
}
