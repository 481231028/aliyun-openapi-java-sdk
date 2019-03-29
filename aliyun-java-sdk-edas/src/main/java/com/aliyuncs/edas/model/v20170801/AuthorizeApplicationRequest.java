/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AuthorizeApplicationRequest extends RoaAcsRequest<AuthorizeApplicationResponse> {
	
	public AuthorizeApplicationRequest() {
		super("Edas", "2017-08-01", "AuthorizeApplication");
		setUriPattern("/pop/v5/account/authorize_app");
		setMethod(MethodType.POST);
	}

	private String appIds;

	private String targetUserId;

	public String getAppIds() {
		return this.appIds;
	}

	public void setAppIds(String appIds) {
		this.appIds = appIds;
		if(appIds != null){
			putQueryParameter("AppIds", appIds);
		}
	}

	public String getTargetUserId() {
		return this.targetUserId;
	}

	public void setTargetUserId(String targetUserId) {
		this.targetUserId = targetUserId;
		if(targetUserId != null){
			putQueryParameter("TargetUserId", targetUserId);
		}
	}

	@Override
	public Class<AuthorizeApplicationResponse> getResponseClass() {
		return AuthorizeApplicationResponse.class;
	}

}
