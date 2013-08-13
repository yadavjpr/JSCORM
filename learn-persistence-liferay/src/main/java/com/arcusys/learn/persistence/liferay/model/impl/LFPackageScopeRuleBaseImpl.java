package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule;
import com.arcusys.learn.persistence.liferay.service.LFPackageScopeRuleLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the LFPackageScopeRule service. Represents a row in the &quot;Learn_LFPackageScopeRule&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFPackageScopeRuleImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFPackageScopeRuleImpl
 * @see com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule
 * @generated
 */
public abstract class LFPackageScopeRuleBaseImpl
    extends LFPackageScopeRuleModelImpl implements LFPackageScopeRule {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a l f package scope rule model instance should use the {@link LFPackageScopeRule} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            LFPackageScopeRuleLocalServiceUtil.addLFPackageScopeRule(this);
        } else {
            LFPackageScopeRuleLocalServiceUtil.updateLFPackageScopeRule(this);
        }
    }
}