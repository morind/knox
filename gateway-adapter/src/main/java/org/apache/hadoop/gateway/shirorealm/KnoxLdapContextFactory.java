package org.apache.hadoop.gateway.shirorealm;

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

import javax.naming.NamingException;
import javax.naming.ldap.LdapContext;
import java.util.Hashtable;

/**
 * An adapter class that delegate calls to {@link org.apache.knox.gateway.shirorealm.KnoxLdapContextFactory}
 * for backwards compatability with package structure.
 *
 * This is class is deprecated and only used for backwards compatibility
 * please use
 * org.apache.knox.gateway.shirorealm.KnoxLdapContextFactory
 * @since 0.14.0
 */
@Deprecated
public class KnoxLdapContextFactory extends org.apache.knox.gateway.shirorealm.KnoxLdapContextFactory {

  /**
   * Create an instance
   */
  public KnoxLdapContextFactory() {
    super();
  }

  @Override
  protected LdapContext createLdapContext(Hashtable env)
      throws NamingException {
    return super.createLdapContext(env);
  }

}
