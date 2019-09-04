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

package com.aliyuncs.ros.transform.v20150901;

import com.aliyuncs.ros.model.v20150901.ExecuteChangeSetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecuteChangeSetResponseUnmarshaller {

	public static ExecuteChangeSetResponse unmarshall(ExecuteChangeSetResponse executeChangeSetResponse, UnmarshallerContext _ctx) {
		
		executeChangeSetResponse.setDummy(_ctx.stringValue("ExecuteChangeSetResponse.Dummy"));
	 
	 	return executeChangeSetResponse;
	}
}