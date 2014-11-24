
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

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "code",
    "claimed",
    "multiuse"
})
public class ClaimCode {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("code")
    private String code;
    @JsonProperty("claimed")
    private Boolean claimed;
    @JsonProperty("multiuse")
    private Boolean multiuse;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public ClaimCode withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The code
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public ClaimCode withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 
     * @return
     *     The claimed
     */
    @JsonProperty("claimed")
    public Boolean getClaimed() {
        return claimed;
    }

    /**
     * 
     * @param claimed
     *     The claimed
     */
    @JsonProperty("claimed")
    public void setClaimed(Boolean claimed) {
        this.claimed = claimed;
    }

    public ClaimCode withClaimed(Boolean claimed) {
        this.claimed = claimed;
        return this;
    }

    /**
     * 
     * @return
     *     The multiuse
     */
    @JsonProperty("multiuse")
    public Boolean getMultiuse() {
        return multiuse;
    }

    /**
     * 
     * @param multiuse
     *     The multiuse
     */
    @JsonProperty("multiuse")
    public void setMultiuse(Boolean multiuse) {
        this.multiuse = multiuse;
    }

    public ClaimCode withMultiuse(Boolean multiuse) {
        this.multiuse = multiuse;
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

    public ClaimCode withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
