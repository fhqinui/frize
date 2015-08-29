package com.fhqinui.frize.dal;

public class PermissionResult {

	private String businesscode;
	private String controlCode;
	private String permissionCode;
	private String parentPermissionCode;
	private String permissionName;
	private String permissionType;
	private String rawUpdateTime;
	private String url;
	public String getBusinesscode() {
		return businesscode;
	}
	public void setBusinesscode(String businesscode) {
		this.businesscode = businesscode;
	}
	public String getControlCode() {
		return controlCode;
	}
	public void setControlCode(String controlCode) {
		this.controlCode = controlCode;
	}
	public String getPermissionCode() {
		return permissionCode;
	}
	public void setPermissionCode(String permissionCode) {
		this.permissionCode = permissionCode;
	}
	public String getParentPermissionCode() {
		return parentPermissionCode;
	}
	public void setParentPermissionCode(String parentPermissionCode) {
		this.parentPermissionCode = parentPermissionCode;
	}
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	public String getPermissionType() {
		return permissionType;
	}
	public void setPermissionType(String permissionType) {
		this.permissionType = permissionType;
	}
	public String getRawUpdateTime() {
		return rawUpdateTime;
	}
	public void setRawUpdateTime(String rawUpdateTime) {
		this.rawUpdateTime = rawUpdateTime;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
