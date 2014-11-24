
package com.example.badgeapp.classes.response;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.example.badgeapp.classes.Badge;
import com.example.badgeapp.classes.ClaimCode;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "status",
    "claimCode",
    "badge"
})
public class ClaimCodeResponse {

    @JsonProperty("status")
    private String status;
    @JsonProperty("claimCode")
    private ClaimCode claimCode;
    @JsonProperty("badge")
    private Badge badge;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public ClaimCodeResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 
     * @return
     *     The claimCode
     */
    @JsonProperty("claimCode")
    public ClaimCode getClaimCode() {
        return claimCode;
    }

    /**
     * 
     * @param claimCode
     *     The claimCode
     */
    @JsonProperty("claimCode")
    public void setClaimCode(ClaimCode claimCode) {
        this.claimCode = claimCode;
    }

    public ClaimCodeResponse withClaimCode(ClaimCode claimCode) {
        this.claimCode = claimCode;
        return this;
    }

    /**
     * 
     * @return
     *     The badge
     */
    @JsonProperty("badge")
    public Badge getBadge() {
        return badge;
    }

    /**
     * 
     * @param badge
     *     The badge
     */
    @JsonProperty("badge")
    public void setBadge(Badge badge) {
        this.badge = badge;
    }

    public ClaimCodeResponse withBadge(Badge badge) {
        this.badge = badge;
        return this;
    }


    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public ClaimCodeResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
