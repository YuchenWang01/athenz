//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yahoo.rdl.*;

//
// DependentService - Dependent service provider details
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class DependentService {
    public String service;

    public DependentService setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return service;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != DependentService.class) {
                return false;
            }
            DependentService a = (DependentService) another;
            if (service == null ? a.service != null : !service.equals(a.service)) {
                return false;
            }
        }
        return true;
    }
}