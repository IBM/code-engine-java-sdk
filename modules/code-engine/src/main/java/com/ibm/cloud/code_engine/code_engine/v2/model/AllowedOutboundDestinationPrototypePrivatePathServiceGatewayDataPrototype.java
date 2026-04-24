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

/**
 * Create an allowed outbound destination by connecting to a VPC Private Path service.
 */
public class AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype extends AllowedOutboundDestinationPrototype {

  /**
   * Specify the type of the allowed outbound destination. Allowed types are: `cidr_block` and
   * `private_path_service_gateway`.
   */
  public interface Type {
    /** cidr_block. */
    String CIDR_BLOCK = "cidr_block";
    /** private_path_service_gateway. */
    String PRIVATE_PATH_SERVICE_GATEWAY = "private_path_service_gateway";
  }

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
    private String name;
    private String type;
    private String isolationPolicy;
    private String privatePathServiceGatewayCrn;

    /**
     * Instantiates a new Builder from an existing AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype instance.
     *
     * @param allowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype the instance to initialize the Builder with
     */
    public Builder(AllowedOutboundDestinationPrototype allowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype) {
      this.name = allowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype.name;
      this.type = allowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype.type;
      this.isolationPolicy = allowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype.isolationPolicy;
      this.privatePathServiceGatewayCrn = allowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype.privatePathServiceGatewayCrn;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     * @param type the type
     * @param privatePathServiceGatewayCrn the privatePathServiceGatewayCrn
     */
    public Builder(String name, String type, String privatePathServiceGatewayCrn) {
      this.name = name;
      this.type = type;
      this.privatePathServiceGatewayCrn = privatePathServiceGatewayCrn;
    }

    /**
     * Builds a AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype.
     *
     * @return the new AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype instance
     */
    public AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype build() {
      return new AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the isolationPolicy.
     *
     * @param isolationPolicy the isolationPolicy
     * @return the AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype builder
     */
    public Builder isolationPolicy(String isolationPolicy) {
      this.isolationPolicy = isolationPolicy;
      return this;
    }

    /**
     * Set the privatePathServiceGatewayCrn.
     *
     * @param privatePathServiceGatewayCrn the privatePathServiceGatewayCrn
     * @return the AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype builder
     */
    public Builder privatePathServiceGatewayCrn(String privatePathServiceGatewayCrn) {
      this.privatePathServiceGatewayCrn = privatePathServiceGatewayCrn;
      return this;
    }
  }

  protected AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype() { }

  protected AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.privatePathServiceGatewayCrn,
      "privatePathServiceGatewayCrn cannot be null");
    name = builder.name;
    type = builder.type;
    isolationPolicy = builder.isolationPolicy;
    privatePathServiceGatewayCrn = builder.privatePathServiceGatewayCrn;
  }

  /**
   * New builder.
   *
   * @return a AllowedOutboundDestinationPrototypePrivatePathServiceGatewayDataPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

