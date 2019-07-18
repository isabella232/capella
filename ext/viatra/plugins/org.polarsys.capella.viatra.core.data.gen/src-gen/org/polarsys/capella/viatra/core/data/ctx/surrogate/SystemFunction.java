/**
 * 
 *   Copyright (c) 2006, 2019 THALES DMS FRANCE.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *  
 *   Contributors:
 *      Thales - initial API and implementation
 *  
 */
package org.polarsys.capella.viatra.core.data.ctx.surrogate;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.polarsys.capella.viatra.core.data.ctx.surrogate.SystemFunction__allocatorActors;
import org.polarsys.capella.viatra.core.data.ctx.surrogate.SystemFunction__allocatorSystems;
import org.polarsys.capella.viatra.core.data.ctx.surrogate.SystemFunction__childrenSystemFunctions;
import org.polarsys.capella.viatra.core.data.ctx.surrogate.SystemFunction__containedSystemFunctions;
import org.polarsys.capella.viatra.core.data.ctx.surrogate.SystemFunction__realizedOperationalActivities;
import org.polarsys.capella.viatra.core.data.ctx.surrogate.SystemFunction__realizingLogicalFunctions;

/**
 * A pattern group formed of all public patterns defined in SystemFunction.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file SystemFunction.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.polarsys.capella.viatra.core.data.ctx.surrogate, the group contains the definition of the following patterns: <ul>
 * <li>SystemFunction__allocatorActors</li>
 * <li>SystemFunction__allocatorSystems</li>
 * <li>SystemFunction__realizedOperationalActivities</li>
 * <li>SystemFunction__realizingLogicalFunctions</li>
 * <li>SystemFunction__containedSystemFunctions</li>
 * <li>SystemFunction__childrenSystemFunctions</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class SystemFunction extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static SystemFunction instance() {
    if (INSTANCE == null) {
        INSTANCE = new SystemFunction();
    }
    return INSTANCE;
  }
  
  private static SystemFunction INSTANCE;
  
  private SystemFunction() {
    querySpecifications.add(SystemFunction__allocatorActors.instance());
    querySpecifications.add(SystemFunction__allocatorSystems.instance());
    querySpecifications.add(SystemFunction__realizedOperationalActivities.instance());
    querySpecifications.add(SystemFunction__realizingLogicalFunctions.instance());
    querySpecifications.add(SystemFunction__containedSystemFunctions.instance());
    querySpecifications.add(SystemFunction__childrenSystemFunctions.instance());
  }
  
  public SystemFunction__allocatorActors getSystemFunction__allocatorActors() {
    return SystemFunction__allocatorActors.instance();
  }
  
  public SystemFunction__allocatorActors.Matcher getSystemFunction__allocatorActors(final ViatraQueryEngine engine) {
    return SystemFunction__allocatorActors.Matcher.on(engine);
  }
  
  public SystemFunction__allocatorSystems getSystemFunction__allocatorSystems() {
    return SystemFunction__allocatorSystems.instance();
  }
  
  public SystemFunction__allocatorSystems.Matcher getSystemFunction__allocatorSystems(final ViatraQueryEngine engine) {
    return SystemFunction__allocatorSystems.Matcher.on(engine);
  }
  
  public SystemFunction__realizedOperationalActivities getSystemFunction__realizedOperationalActivities() {
    return SystemFunction__realizedOperationalActivities.instance();
  }
  
  public SystemFunction__realizedOperationalActivities.Matcher getSystemFunction__realizedOperationalActivities(final ViatraQueryEngine engine) {
    return SystemFunction__realizedOperationalActivities.Matcher.on(engine);
  }
  
  public SystemFunction__realizingLogicalFunctions getSystemFunction__realizingLogicalFunctions() {
    return SystemFunction__realizingLogicalFunctions.instance();
  }
  
  public SystemFunction__realizingLogicalFunctions.Matcher getSystemFunction__realizingLogicalFunctions(final ViatraQueryEngine engine) {
    return SystemFunction__realizingLogicalFunctions.Matcher.on(engine);
  }
  
  public SystemFunction__containedSystemFunctions getSystemFunction__containedSystemFunctions() {
    return SystemFunction__containedSystemFunctions.instance();
  }
  
  public SystemFunction__containedSystemFunctions.Matcher getSystemFunction__containedSystemFunctions(final ViatraQueryEngine engine) {
    return SystemFunction__containedSystemFunctions.Matcher.on(engine);
  }
  
  public SystemFunction__childrenSystemFunctions getSystemFunction__childrenSystemFunctions() {
    return SystemFunction__childrenSystemFunctions.instance();
  }
  
  public SystemFunction__childrenSystemFunctions.Matcher getSystemFunction__childrenSystemFunctions(final ViatraQueryEngine engine) {
    return SystemFunction__childrenSystemFunctions.Matcher.on(engine);
  }
}