/**
 * Copyright 2019 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.mysdk.common;

import java.util.HashMap;
import java.util.Map;

import com.ibm.cloud.sdk.core.http.HttpHeaders;
import com.ibm.cloud.sdk.core.util.RequestUtils;

/**
 * The purpose of this class is to provide SDK-specific HTTP headers to be included in REST API requests made
 * by the SDK.
 */
public class SdkCommon {

    /**
     * SDK-specific "user agent" header value.
     */
    private static String userAgent;

    private SdkCommon() {
    }

    private static String loadSdkVersion() {
        return "1.0.0";
    }

    /**
     * This function uses lazy initialization to build the SDK's "user agent" value.
     * This will consist of the SDK name and version, followed by
     * a set of properties provided by the Java Core's RequestUtils class.
     * @return the SDK-specific user agent value
     */
    private static String getUserAgent() {
        if (userAgent == null) {
            userAgent = "MySDK/" + loadSdkVersion() + "; " + RequestUtils.getUserAgent();
        }
        return userAgent;
    }

    /**
     * This function is invoked by generated service methods (i.e. methods which implement the REST API operations
     * defined within the API definition). The purpose of this function is to give the SDK implementor the opportunity
     * to provide SDK-specific HTTP headers that will be sent with an outgoing REST API request.
     * <p>This function is invoked for <b>each</b> invocation of a generated service method,
     * so the set of HTTP headers could be request-specific.
     * As an optimization, if your SDK will be returning the same set of HTTP headers for each invocation of this
     * function, it is recommended that you initialize the returned map just once (perhaps by using
     * lazy initialization) and simply return it each time the function is invoked, instead of building it each time
     * as in the example below.
     *
     * @param serviceName
     *            the name of the service as defined in the API definition (e.g. "MyService1")
     * @param serviceVersion
     *            the version of the service as defined in the API definition (e.g. "V1")
     * @param operationId
     *            the operationId as defined in the API definition (e.g. getContext)
     * @return a Map which contains the set of headers to be included in the REST API request
     */
    public static Map<String, String> getSdkHeaders(String serviceName, String serviceVersion, String operationId) {
        Map<String, String> headers = new HashMap<>();
        headers.put(HttpHeaders.USER_AGENT, getUserAgent());
        return headers;
    }
}
