/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.asset.entry.set.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AssetEntrySet}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetEntrySet
 * @generated
 */
public class AssetEntrySetWrapper implements AssetEntrySet,
	ModelWrapper<AssetEntrySet> {
	public AssetEntrySetWrapper(AssetEntrySet assetEntrySet) {
		_assetEntrySet = assetEntrySet;
	}

	@Override
	public Class<?> getModelClass() {
		return AssetEntrySet.class;
	}

	@Override
	public String getModelClassName() {
		return AssetEntrySet.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("assetEntrySetId", getAssetEntrySetId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("assetEntryId", getAssetEntryId());
		attributes.put("parentAssetEntrySetId", getParentAssetEntrySetId());
		attributes.put("creatorClassNameId", getCreatorClassNameId());
		attributes.put("creatorClassPK", getCreatorClassPK());
		attributes.put("content", getContent());
		attributes.put("data", getData());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long assetEntrySetId = (Long)attributes.get("assetEntrySetId");

		if (assetEntrySetId != null) {
			setAssetEntrySetId(assetEntrySetId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String assetEntryId = (String)attributes.get("assetEntryId");

		if (assetEntryId != null) {
			setAssetEntryId(assetEntryId);
		}

		Long parentAssetEntrySetId = (Long)attributes.get(
				"parentAssetEntrySetId");

		if (parentAssetEntrySetId != null) {
			setParentAssetEntrySetId(parentAssetEntrySetId);
		}

		Long creatorClassNameId = (Long)attributes.get("creatorClassNameId");

		if (creatorClassNameId != null) {
			setCreatorClassNameId(creatorClassNameId);
		}

		Long creatorClassPK = (Long)attributes.get("creatorClassPK");

		if (creatorClassPK != null) {
			setCreatorClassPK(creatorClassPK);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		String data = (String)attributes.get("data");

		if (data != null) {
			setData(data);
		}
	}

	/**
	* Returns the primary key of this asset entry set.
	*
	* @return the primary key of this asset entry set
	*/
	@Override
	public long getPrimaryKey() {
		return _assetEntrySet.getPrimaryKey();
	}

	/**
	* Sets the primary key of this asset entry set.
	*
	* @param primaryKey the primary key of this asset entry set
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_assetEntrySet.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the asset entry set ID of this asset entry set.
	*
	* @return the asset entry set ID of this asset entry set
	*/
	@Override
	public long getAssetEntrySetId() {
		return _assetEntrySet.getAssetEntrySetId();
	}

	/**
	* Sets the asset entry set ID of this asset entry set.
	*
	* @param assetEntrySetId the asset entry set ID of this asset entry set
	*/
	@Override
	public void setAssetEntrySetId(long assetEntrySetId) {
		_assetEntrySet.setAssetEntrySetId(assetEntrySetId);
	}

	/**
	* Returns the company ID of this asset entry set.
	*
	* @return the company ID of this asset entry set
	*/
	@Override
	public long getCompanyId() {
		return _assetEntrySet.getCompanyId();
	}

	/**
	* Sets the company ID of this asset entry set.
	*
	* @param companyId the company ID of this asset entry set
	*/
	@Override
	public void setCompanyId(long companyId) {
		_assetEntrySet.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this asset entry set.
	*
	* @return the user ID of this asset entry set
	*/
	@Override
	public long getUserId() {
		return _assetEntrySet.getUserId();
	}

	/**
	* Sets the user ID of this asset entry set.
	*
	* @param userId the user ID of this asset entry set
	*/
	@Override
	public void setUserId(long userId) {
		_assetEntrySet.setUserId(userId);
	}

	/**
	* Returns the user uuid of this asset entry set.
	*
	* @return the user uuid of this asset entry set
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetEntrySet.getUserUuid();
	}

	/**
	* Sets the user uuid of this asset entry set.
	*
	* @param userUuid the user uuid of this asset entry set
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_assetEntrySet.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this asset entry set.
	*
	* @return the user name of this asset entry set
	*/
	@Override
	public java.lang.String getUserName() {
		return _assetEntrySet.getUserName();
	}

	/**
	* Sets the user name of this asset entry set.
	*
	* @param userName the user name of this asset entry set
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_assetEntrySet.setUserName(userName);
	}

	/**
	* Returns the create date of this asset entry set.
	*
	* @return the create date of this asset entry set
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _assetEntrySet.getCreateDate();
	}

	/**
	* Sets the create date of this asset entry set.
	*
	* @param createDate the create date of this asset entry set
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_assetEntrySet.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this asset entry set.
	*
	* @return the modified date of this asset entry set
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _assetEntrySet.getModifiedDate();
	}

	/**
	* Sets the modified date of this asset entry set.
	*
	* @param modifiedDate the modified date of this asset entry set
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_assetEntrySet.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the asset entry ID of this asset entry set.
	*
	* @return the asset entry ID of this asset entry set
	*/
	@Override
	public java.lang.String getAssetEntryId() {
		return _assetEntrySet.getAssetEntryId();
	}

	/**
	* Sets the asset entry ID of this asset entry set.
	*
	* @param assetEntryId the asset entry ID of this asset entry set
	*/
	@Override
	public void setAssetEntryId(java.lang.String assetEntryId) {
		_assetEntrySet.setAssetEntryId(assetEntryId);
	}

	/**
	* Returns the parent asset entry set ID of this asset entry set.
	*
	* @return the parent asset entry set ID of this asset entry set
	*/
	@Override
	public long getParentAssetEntrySetId() {
		return _assetEntrySet.getParentAssetEntrySetId();
	}

	/**
	* Sets the parent asset entry set ID of this asset entry set.
	*
	* @param parentAssetEntrySetId the parent asset entry set ID of this asset entry set
	*/
	@Override
	public void setParentAssetEntrySetId(long parentAssetEntrySetId) {
		_assetEntrySet.setParentAssetEntrySetId(parentAssetEntrySetId);
	}

	/**
	* Returns the creator class name ID of this asset entry set.
	*
	* @return the creator class name ID of this asset entry set
	*/
	@Override
	public long getCreatorClassNameId() {
		return _assetEntrySet.getCreatorClassNameId();
	}

	/**
	* Sets the creator class name ID of this asset entry set.
	*
	* @param creatorClassNameId the creator class name ID of this asset entry set
	*/
	@Override
	public void setCreatorClassNameId(long creatorClassNameId) {
		_assetEntrySet.setCreatorClassNameId(creatorClassNameId);
	}

	/**
	* Returns the creator class p k of this asset entry set.
	*
	* @return the creator class p k of this asset entry set
	*/
	@Override
	public long getCreatorClassPK() {
		return _assetEntrySet.getCreatorClassPK();
	}

	/**
	* Sets the creator class p k of this asset entry set.
	*
	* @param creatorClassPK the creator class p k of this asset entry set
	*/
	@Override
	public void setCreatorClassPK(long creatorClassPK) {
		_assetEntrySet.setCreatorClassPK(creatorClassPK);
	}

	/**
	* Returns the content of this asset entry set.
	*
	* @return the content of this asset entry set
	*/
	@Override
	public java.lang.String getContent() {
		return _assetEntrySet.getContent();
	}

	/**
	* Sets the content of this asset entry set.
	*
	* @param content the content of this asset entry set
	*/
	@Override
	public void setContent(java.lang.String content) {
		_assetEntrySet.setContent(content);
	}

	/**
	* Returns the data of this asset entry set.
	*
	* @return the data of this asset entry set
	*/
	@Override
	public java.lang.String getData() {
		return _assetEntrySet.getData();
	}

	/**
	* Sets the data of this asset entry set.
	*
	* @param data the data of this asset entry set
	*/
	@Override
	public void setData(java.lang.String data) {
		_assetEntrySet.setData(data);
	}

	@Override
	public boolean isNew() {
		return _assetEntrySet.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_assetEntrySet.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _assetEntrySet.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_assetEntrySet.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _assetEntrySet.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _assetEntrySet.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assetEntrySet.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assetEntrySet.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_assetEntrySet.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_assetEntrySet.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assetEntrySet.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AssetEntrySetWrapper((AssetEntrySet)_assetEntrySet.clone());
	}

	@Override
	public int compareTo(AssetEntrySet assetEntrySet) {
		return _assetEntrySet.compareTo(assetEntrySet);
	}

	@Override
	public int hashCode() {
		return _assetEntrySet.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<AssetEntrySet> toCacheModel() {
		return _assetEntrySet.toCacheModel();
	}

	@Override
	public AssetEntrySet toEscapedModel() {
		return new AssetEntrySetWrapper(_assetEntrySet.toEscapedModel());
	}

	@Override
	public AssetEntrySet toUnescapedModel() {
		return new AssetEntrySetWrapper(_assetEntrySet.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assetEntrySet.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _assetEntrySet.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assetEntrySet.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetEntrySetWrapper)) {
			return false;
		}

		AssetEntrySetWrapper assetEntrySetWrapper = (AssetEntrySetWrapper)obj;

		if (Validator.equals(_assetEntrySet, assetEntrySetWrapper._assetEntrySet)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AssetEntrySet getWrappedAssetEntrySet() {
		return _assetEntrySet;
	}

	@Override
	public AssetEntrySet getWrappedModel() {
		return _assetEntrySet;
	}

	@Override
	public void resetOriginalValues() {
		_assetEntrySet.resetOriginalValues();
	}

	private AssetEntrySet _assetEntrySet;
}