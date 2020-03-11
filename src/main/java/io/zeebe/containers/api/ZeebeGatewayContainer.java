/*
 * Copyright © 2019 camunda services GmbH (info@camunda.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.zeebe.containers.api;

import java.time.Duration;
import org.testcontainers.containers.Network;

public interface ZeebeGatewayContainer<SELF extends ZeebeGatewayContainer<SELF>>
    extends ZeebeContainer<SELF> {

  SELF withGatewayHost(final String host);

  SELF withGatewayPort(final int port);

  SELF withClusterMemberId(final String memberId);

  SELF withGatewayClusterHost(final String host);

  SELF withGatewayClusterPort(final int port);

  SELF withGatewayContactPoint(String contactPoint);

  SELF withGatewayKeepAliveInterval(final Duration keepAliveInterval);

  SELF withGatewayRequestTimeout(final Duration requestTimeout);

  SELF withGatewayManagementThreadCount(final int managementThreadCount);

  SELF withNetwork(Network network);

  SELF withClusterName(final String clusterName);
}
