package org.apache.knox.gateway.filter.rewrite.impl.html;

import org.apache.knox.gateway.filter.rewrite.api.UrlRewriteFunctionDescriptor;

/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership.  The ASF
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

/**
 * {@link UrlRewriteFunctionDescriptor} for the variable {@link
 * HtmlInfixDescriptor#FUNCTION_NAME}
 *
 * @since 1.1.0
 */
public class HtmlInfixDescriptor
    implements UrlRewriteFunctionDescriptor<HtmlInfixDescriptor> {

  /**
   * variable name used in rewrite.xml
   */
  public static final String FUNCTION_NAME = "infix";

  /**
   * Create an instance
   */
  public HtmlInfixDescriptor() {
    super();
  }

  @Override
  public String name() {
    return FUNCTION_NAME;
  }

}
