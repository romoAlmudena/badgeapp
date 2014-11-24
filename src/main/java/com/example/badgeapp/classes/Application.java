
package com.example.badgeapp.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "slug",
    "learner",
    "created",
    "assignedTo",
    "assignedExpiration",
    "badge",
    "processed",
    "evidence"
})
public class Application {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("learner")
    private String learner;
    @JsonProperty("created")
    private String created;
    @JsonProperty("assignedTo")
    private Object assignedTo;
    @JsonProperty("assignedExpiration")
    private Object assignedExpiration;
    @JsonProperty("badge")
    private Badge badge;
    @JsonProperty("processed")
    private Object processed;
    @JsonProperty("evidence")
    
    private List<Evidence> evidence = new ArrayList<Evidence>();
    @Override
	public String toString() {
		return "Application [id=" + id + ", slug=" + slug + ", learner="
				+ learner + ", created=" + created + ", assignedTo="
				+ assignedTo + ", assignedExpiration=" + assignedExpiration
				+ ", badge=" + badge + ", processed=" + processed
				+ ", evidence=" + evidence + ", additionalProperties="
				+ additionalProperties + "]";
	}

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
     *     The learner
     */
    @JsonProperty("learner")
    public String getLearner() {
        return learner;
    }

    /**
     * 
     * @param learner
     *     The learner
     */
    @JsonProperty("learner")
    public void setLearner(String learner) {
        this.learner = learner;
    }

    /**
     * 
     * @return
     *     The created
     */
    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    /**
     * 
     * @param created
     *     The created
     */
    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * 
     * @return
     *     The assignedTo
     */
    @JsonProperty("assignedTo")
    public Object getAssignedTo() {
        return assignedTo;
    }

    /**
     * 
     * @param assignedTo
     *     The assignedTo
     */
    @JsonProperty("assignedTo")
    public void setAssignedTo(Object assignedTo) {
        this.assignedTo = assignedTo;
    }

    /**
     * 
     * @return
     *     The assignedExpiration
     */
    @JsonProperty("assignedExpiration")
    public Object getAssignedExpiration() {
        return assignedExpiration;
    }

    /**
     * 
     * @param assignedExpiration
     *     The assignedExpiration
     */
    @JsonProperty("assignedExpiration")
    public void setAssignedExpiration(Object assignedExpiration) {
        this.assignedExpiration = assignedExpiration;
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

    /**
     * 
     * @return
     *     The processed
     */
    @JsonProperty("processed")
    public Object getProcessed() {
        return processed;
    }

    /**
     * 
     * @param processed
     *     The processed
     */
    @JsonProperty("processed")
    public void setProcessed(Object processed) {
        this.processed = processed;
    }

    /**
     * 
     * @return
     *     The evidence
     */
    @JsonProperty("evidence")
    public List<Evidence> getEvidence() {
        return evidence;
    }

    /**
     * 
     * @param evidence
     *     The evidence
     */
    @JsonProperty("evidence")
    public void setEvidence(List<Evidence> evidence) {
        this.evidence = evidence;
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
