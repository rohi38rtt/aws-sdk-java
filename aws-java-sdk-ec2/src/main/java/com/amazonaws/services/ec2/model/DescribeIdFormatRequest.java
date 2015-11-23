/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeIdFormat(DescribeIdFormatRequest) DescribeIdFormat operation}.
 * <p>
 * <b>Important: This command is reserved for future use, and is
 * currently not available for you to use.</b>
 * </p>
 * <p>
 * Describes the ID format settings for your resources, for example, to
 * view which resource types are enabled for longer IDs. This request
 * only returns information about resource types whose ID formats can be
 * modified; it does not return information about other resource types.
 * </p>
 * <p>
 * The following resource types support longer IDs: <code>instance</code>
 * |
 * 
 * <code>reservation</code> .
 * </p>
 * <p>
 * These settings apply to the IAM user who makes the request; they do
 * not apply to the entire AWS account. By default, an IAM user defaults
 * to the same settings as the root user, unless they explicitly override
 * the settings by running the ModifyIdFormat command. These settings are
 * applied on a per-region basis.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeIdFormat(DescribeIdFormatRequest)
 */
public class DescribeIdFormatRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The type of resource.
     */
    private String resource;

    /**
     * The type of resource.
     *
     * @return The type of resource.
     */
    public String getResource() {
        return resource;
    }
    
    /**
     * The type of resource.
     *
     * @param resource The type of resource.
     */
    public void setResource(String resource) {
        this.resource = resource;
    }
    
    /**
     * The type of resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resource The type of resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeIdFormatRequest withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResource() != null) sb.append("Resource: " + getResource() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeIdFormatRequest == false) return false;
        DescribeIdFormatRequest other = (DescribeIdFormatRequest)obj;
        
        if (other.getResource() == null ^ this.getResource() == null) return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeIdFormatRequest clone() {
        
            return (DescribeIdFormatRequest) super.clone();
    }

}
    