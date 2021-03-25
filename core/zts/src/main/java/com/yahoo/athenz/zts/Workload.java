//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zts;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import com.yahoo.rdl.*;

//
// Workload -
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class Workload {
    public String domainName;
    public String serviceName;
    public String uuid;
    public List<String> ipAddresses;
    public String provider;
    public Timestamp updateTime;

    public Workload setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return domainName;
    }
    public Workload setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return serviceName;
    }
    public Workload setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return uuid;
    }
    public Workload setIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
        return this;
    }
    public List<String> getIpAddresses() {
        return ipAddresses;
    }
    public Workload setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return provider;
    }
    public Workload setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != Workload.class) {
                return false;
            }
            Workload a = (Workload) another;
            if (domainName == null ? a.domainName != null : !domainName.equals(a.domainName)) {
                return false;
            }
            if (serviceName == null ? a.serviceName != null : !serviceName.equals(a.serviceName)) {
                return false;
            }
            if (uuid == null ? a.uuid != null : !uuid.equals(a.uuid)) {
                return false;
            }
            if (ipAddresses == null ? a.ipAddresses != null : !ipAddresses.equals(a.ipAddresses)) {
                return false;
            }
            if (provider == null ? a.provider != null : !provider.equals(a.provider)) {
                return false;
            }
            if (updateTime == null ? a.updateTime != null : !updateTime.equals(a.updateTime)) {
                return false;
            }
        }
        return true;
    }
}
