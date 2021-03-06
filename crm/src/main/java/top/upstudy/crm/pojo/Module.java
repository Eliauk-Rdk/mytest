package top.upstudy.crm.pojo;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Weder
 * @since 2020-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_module")
@ApiModel(value="Module对象", description="")
public class Module implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "资源id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "资源名")
    private String moduleName;

    @ApiModelProperty(value = "模块样式")
    private String moduleStyle;

    @ApiModelProperty(value = "资源地址")
    private String url;

    @ApiModelProperty(value = "上级资源id")
    private Integer parentId;

    @ApiModelProperty(value = "上级资源权限码")
    private String parentOptValue;

    @ApiModelProperty(value = "层级")
    private Integer grade;

    @ApiModelProperty(value = "权限值")
    private String optValue;

    @ApiModelProperty(value = "排序号")
    private Integer orders;

    @ApiModelProperty(value = "有效状态")
    @TableLogic //逻辑删除
    private Integer isValid;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createDate;

    @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateDate;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModuleStyle() {
		return moduleStyle;
	}

	public void setModuleStyle(String moduleStyle) {
		this.moduleStyle = moduleStyle;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getParentOptValue() {
		return parentOptValue;
	}

	public void setParentOptValue(String parentOptValue) {
		this.parentOptValue = parentOptValue;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public String getOptValue() {
		return optValue;
	}

	public void setOptValue(String optValue) {
		this.optValue = optValue;
	}

	public Integer getOrders() {
		return orders;
	}

	public void setOrders(Integer orders) {
		this.orders = orders;
	}

	public Integer getIsValid() {
		return isValid;
	}

	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
