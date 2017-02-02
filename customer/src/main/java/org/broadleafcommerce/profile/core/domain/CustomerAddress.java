/*
 * #%L
 * BroadleafCommerce Profile
 * %%
 * Copyright (C) 2009 - 2016 Broadleaf Commerce
 * %%
 * Licensed under the Broadleaf Fair Use License Agreement, Version 1.0
 * (the "Fair Use License" located  at http://license.broadleafcommerce.org/fair_use_license-1.0.txt)
 * unless the restrictions on use therein are violated and require payment to Broadleaf in which case
 * the Broadleaf End User License Agreement (EULA), Version 1.1
 * (the "Commercial License" located at http://license.broadleafcommerce.org/commercial_license-1.1.txt)
 * shall apply.
 * 
 * Alternatively, the Commercial License may be replaced with a mutually agreed upon license (the "Custom License")
 * between you and Broadleaf Commerce. You may not use this file except in compliance with the applicable license.
 * #L%
 */
package org.broadleafcommerce.profile.core.domain;

import org.broadleafcommerce.common.copy.MultiTenantCloneable;
import org.broadleafcommerce.common.persistence.Status;

import java.io.Serializable;

public interface CustomerAddress extends Status, Serializable, MultiTenantCloneable<CustomerAddress> {

    public void setId(Long id);

    public Long getId();

    public void setAddressName(String addressName);

    public String getAddressName();

    public boolean isDefault();

    public void setDefault(boolean isDefault);

    public Customer getCustomer();

    public void setCustomer(Customer customer);

    public Long getAddressExternalId();

    public void setAddressExternalId(Long externalId);

}