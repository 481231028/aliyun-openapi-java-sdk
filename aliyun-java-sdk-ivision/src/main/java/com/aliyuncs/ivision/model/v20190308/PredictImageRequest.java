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

package com.aliyuncs.ivision.model.v20190308;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class PredictImageRequest extends RpcAcsRequest<PredictImageResponse> {
	
	public PredictImageRequest() {
		super("ivision", "2019-03-08", "PredictImage", "ivision");
	}

	private String projectId;

	private Long ownerId;

	private String iterationId;

	private String dataUrls;

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getIterationId() {
		return this.iterationId;
	}

	public void setIterationId(String iterationId) {
		this.iterationId = iterationId;
		if(iterationId != null){
			putQueryParameter("IterationId", iterationId);
		}
	}

	public String getDataUrls() {
		return this.dataUrls;
	}

	public void setDataUrls(String dataUrls) {
		this.dataUrls = dataUrls;
		if(dataUrls != null){
			putQueryParameter("DataUrls", dataUrls);
		}
	}

	@Override
	public Class<PredictImageResponse> getResponseClass() {
		return PredictImageResponse.class;
	}

}
