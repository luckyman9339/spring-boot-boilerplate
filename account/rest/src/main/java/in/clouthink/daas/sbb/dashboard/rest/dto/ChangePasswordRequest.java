package in.clouthink.daas.sbb.dashboard.rest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;

/**
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel
public class ChangePasswordRequest {

	private String userId;

	private String newPassword;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

}
