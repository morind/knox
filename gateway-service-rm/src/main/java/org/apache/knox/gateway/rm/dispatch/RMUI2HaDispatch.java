/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.knox.gateway.rm.dispatch;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.knox.gateway.config.Configure;
import org.apache.knox.gateway.ha.provider.HaProvider;
import org.apache.knox.gateway.ha.provider.HaServiceConfig;

public class RMUI2HaDispatch extends RMHaBaseDispatcher {

  private static final String RESOURCE_ROLE = "YARNUIV2";
  private HaProvider haProvider;

  public RMUI2HaDispatch() throws ServletException {
   super();
  }

  @Configure
  public void setHaProvider(HaProvider haProvider) {
    this.haProvider = haProvider;
  }

  @Override
  public void init() {
    super.init();
    if (haProvider != null) {
      super.setResourceRole(RESOURCE_ROLE);
      HaServiceConfig serviceConfig = haProvider.getHaDescriptor().getServiceConfig(RESOURCE_ROLE);
      super.setMaxFailoverAttempts(serviceConfig.getMaxFailoverAttempts());
      super.setFailoverSleep(serviceConfig.getFailoverSleep());
      super.setMaxRetryAttempts(serviceConfig.getMaxRetryAttempts());
      super.setRetrySleep(serviceConfig.getRetrySleep());
      super.setHaProvider(haProvider);
    }
  }
}
