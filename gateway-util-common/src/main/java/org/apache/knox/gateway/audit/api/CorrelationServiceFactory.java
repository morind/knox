/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.knox.gateway.audit.api;

import org.apache.knox.gateway.audit.log4j.correlation.Log4jCorrelationService;


public abstract class CorrelationServiceFactory {

  // The global correlation service instance.
  private static CorrelationService correlationService = null;

  // To prevent instantiation.
  private CorrelationServiceFactory() {
  }

  /**
   * Provides access to the default correlation service implementation.
   * @return The default correlation service implementation.  Will not be null.
   */
  public static CorrelationService getCorrelationService() {
    // Race condition acceptable and will only result in multiple service instantiations.
    if( correlationService == null ) {
      correlationService = new Log4jCorrelationService();
    }
    return correlationService;
  }

}
