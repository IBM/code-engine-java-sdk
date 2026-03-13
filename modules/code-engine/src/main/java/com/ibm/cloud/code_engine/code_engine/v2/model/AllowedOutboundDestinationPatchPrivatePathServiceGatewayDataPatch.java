/*
 * (C) Copyright IBM Corp. 2026.
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

package com.ibm.cloud.code_engine.code_engine.v2.model;

import java.util.Map;

import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Updating properties of an allowed outbound destination of type VPC Private Path service.
 */
public class AllowedOutboundDestinationPatchPrivatePathServiceGatewayDataPatch extends AllowedOutboundDestinationPatch {

  /**
   * Optional property to specify the isolation policy of the private path service gateway. If set to `shared`, other
   * projects within the same account or enterprise account family can connect to Private Path service, too. If set to
   * `dedicated` the gateway can only be used by a single Code Engine project. If not specified the isolation policy
   * will be set to `shared`.
   */
  public interface IsolationPolicy {
    /** shared. */
    String SHARED = "shared";
    /** dedicated. */
    String DEDICATED = "dedicated";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String isolationPolicy;

    /**
     * Instantiates a new Builder from an existing AllowedOutboundDestinationPatchPrivatePathServiceGatewayDataPatch instance.
     *
     * @param allowedOutboundDestinationPatchPrivatePathServiceGatewayDataPatch the instance to initialize the Builder with
     */
    public Builder(AllowedOutboundDestinationPatch allowedOutboundDestinationPatchPrivatePathServiceGatewayDataPatch) {
      this.isolationPolicy = allowedOutboundDestinationPatchPrivatePathServiceGatewayDataPatch.isolationPolicy;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AllowedOutboundDestinationPatchPrivatePathServiceGatewayDataPatch.
     *
     * @return the new AllowedOutboundDestinationPatchPrivatePathServiceGatewayDataPatch instance
     */
    public AllowedOutboundDestinationPatchPrivatePathServiceGatewayDataPatch build() {
      return new AllowedOutboundDestinationPatchPrivatePathServiceGatewayDataPatch(this);
    }

    /**
     * Set the isolationPolicy.
     *
     * @param isolationPolicy the isolationPolicy
     * @return the AllowedOutboundDestinationPatchPrivatePathServiceGatewayDataPatch builder
     */
    public Builder isolationPolicy(String isolationPolicy) {
      this.isolationPolicy = isolationPolicy;
      return this;
    }
  }

  protected AllowedOutboundDestinationPatchPrivatePathServiceGatewayDataPatch() { }

  protected AllowedOutboundDestinationPatchPrivatePathServiceGatewayDataPatch(Builder builder) {
    isolationPolicy = builder.isolationPolicy;
  }

  /**
   * New builder.
   *
   * @return a AllowedOutboundDestinationPatchPrivatePathServiceGatewayDataPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Construct a JSON merge-patch from the AllowedOutboundDestinationPatchPrivatePathServiceGatewayDataPatch.
   *
   * Note that properties of the AllowedOutboundDestinationPatchPrivatePathServiceGatewayDataPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the AllowedOutboundDestinationPatchPrivatePathServiceGatewayDataPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

