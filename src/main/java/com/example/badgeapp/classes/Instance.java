
package com.example.badgeapp.classes;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.joda.time.DateTime;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "slug",
    "email",
    "expires",
    "issuedOn",
    "claimCode",
    "assertionUrl",
    "badge"
})
public class Instance {

    @JsonProperty("slug")
    private String slug;
    @JsonProperty("email")
    private String email;
    @JsonProperty("expires")
    private DateTime expires;
    @JsonProperty("issuedOn")
    private DateTime issuedOn;
    @JsonProperty("claimCode")
    private ClaimCode claimCode;
    @JsonProperty("assertionUrl")
    private String assertionUrl;
    @JsonProperty("badge")
    private Badge badge;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The slug
     */
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    /**
     * 
     * @param slug
     *     The slug
     */
    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * 
     * @return
     *     The email
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The expires
     */
    @JsonProperty("expires")
    public Object getExpires() {
        return expires;
    }

    /**
     * 
     * @param expires
     *     The expires
     */
    @JsonProperty("expires")
    public void setExpires(DateTime expires) {
        this.expires = expires;
    }

    /**
     * 
     * @return
     *     The issuedOn
     */
    @JsonProperty("issuedOn")
    public DateTime getIssuedOn() {
        return issuedOn;
    }

    /**
     * 
     * @param issuedOn
     *     The issuedOn
     */
    @JsonProperty("issuedOn")
    public void setIssuedOn(DateTime issuedOn) {
        this.issuedOn = issuedOn;
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

    /**
     * 
     * @return
     *     The assertionUrl
     */
    @JsonProperty("assertionUrl")
    public String getAssertionUrl() {
        return assertionUrl;
    }

    /**
     * 
     * @param assertionUrl
     *     The assertionUrl
     */
    @JsonProperty("assertionUrl")
    public void setAssertionUrl(String assertionUrl) {
        this.assertionUrl = assertionUrl;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
