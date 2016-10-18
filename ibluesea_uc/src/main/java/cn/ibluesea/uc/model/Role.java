package cn.ibluesea.uc.model;

public class Role {
    private String id;

    private String roleName;

    private String description;

    private String system_Code;

    private Boolean available;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSystem_Code() {
        return system_Code;
    }

    public void setSystem_Code(String system_Code) {
        this.system_Code = system_Code;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}