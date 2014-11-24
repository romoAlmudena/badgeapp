
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
    "name",
    "strapline",
    "earnerDescription",
    "consumerDescription",
    "issuerUrl",
    "rubricUrl",
    "timeValue",
    "timeUnits",
    "limit",
    "unique",
    "created",
    "imageUrl",
    "type",
    "archived",
    "system",
    "criteriaUrl",
    "criteria",
    "alignments",
    "evidenceType",
    "categories",
    "tags",
    "milestones"
})

public class Badge {

    @Override
	public String toString() {
		return "Badge [id=" + id + ", slug=" + slug + ", name=" + name
				+ ", strapline=" + strapline + ", earnerDescription="
				+ earnerDescription + ", consumerDescription="
				+ consumerDescription + ", issuerUrl=" + issuerUrl
				+ ", rubricUrl=" + rubricUrl + ", timeValue=" + timeValue
				+ ", timeUnits=" + timeUnits + ", limit=" + limit + ", unique="
				+ unique + ", created=" + created + ", imageUrl=" + imageUrl
				+ ", type=" + type + ", archived=" + archived + ", system="
				+ system + ", criteriaUrl=" + criteriaUrl + ", criteria="
				+ criteria + ", alignments=" + alignments + ", evidenceType="
				+ evidenceType + ", categories=" + categories + ", tags="
				+ tags + ", milestones=" + milestones
				+ ", additionalProperties=" + additionalProperties + "]";
	}

    public HashMap<String, Object> getStructure(){
    	HashMap<String, Object> struct = new HashMap<String,Object>();
    	
    	struct.put("slug", String.class);
    	struct.put("name", String.class);
    	struct.put("strapline", String.class);
    	struct.put("earnerDescription", String.class);
    	struct.put("consumerDescription", String.class);
    	struct.put("issuerUrl", String.class);
    	struct.put("rubricUrl", String.class);
    	struct.put("timeValue", Integer.class);
    	struct.put("timeUnits", String.class);
    	struct.put("limit", Integer.class);
    	struct.put("unique", Integer.class);
    	struct.put("created", String.class);
    	struct.put("imageUrl", String.class);
    	struct.put("type", String.class);
    	struct.put("archived", Boolean.class);
    	struct.put("system", System.class);
    	struct.put("criteriaUrl", String.class);
    	struct.put("criteria",  ArrayList.class);
    	struct.put("alignments", ArrayList.class);
     	struct.put("evidenceType", String.class); 	
     	struct.put("categories", ArrayList.class); 	
     	struct.put("tags", ArrayList.class);
     	struct.put("milestones", ArrayList.class);
     	struct.put("additionalProperties",HashMap.class);

     	return struct;

    }
    
	@JsonProperty("id")
    private Integer id;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("name")
    private String name;
    @JsonProperty("strapline")
    private String strapline;
    @JsonProperty("earnerDescription")
    private String earnerDescription;
    @JsonProperty("consumerDescription")
    private String consumerDescription;
    @JsonProperty("issuerUrl")
    private String issuerUrl;
    @JsonProperty("rubricUrl")
    private String rubricUrl;
    @JsonProperty("timeValue")
    private Integer timeValue;
    @JsonProperty("timeUnits")
    private String timeUnits;
    @JsonProperty("limit")
    private Integer limit;
    @JsonProperty("unique")
    private Integer unique;
    @JsonProperty("created")
    private String created;
    @JsonProperty("imageUrl")
    private String imageUrl;
    @JsonProperty("type")
    private String type;
    @JsonProperty("archived")
    private Boolean archived;
    @JsonProperty("system")
    private System system;
    @JsonProperty("criteriaUrl")
    private String criteriaUrl;
    @JsonProperty("criteria")
    private List<Criterium> criteria = new ArrayList<Criterium>();
    @JsonProperty("alignments")
    private List<Object> alignments = new ArrayList<Object>();
    @JsonProperty("evidenceType")
    private String evidenceType;
    @JsonProperty("categories")
    private List<String> categories = new ArrayList<String>();
    @JsonProperty("tags")
    private List<Tag> tags = new ArrayList<Tag>();
    @JsonProperty("milestones")
    private List<Object> milestones = new ArrayList<Object>();
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
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The strapline
     */
    @JsonProperty("strapline")
    public String getStrapline() {
        return strapline;
    }

    /**
     * 
     * @param strapline
     *     The strapline
     */
    @JsonProperty("strapline")
    public void setStrapline(String strapline) {
        this.strapline = strapline;
    }

    /**
     * 
     * @return
     *     The earnerDescription
     */
    @JsonProperty("earnerDescription")
    public String getEarnerDescription() {
        return earnerDescription;
    }

    /**
     * 
     * @param earnerDescription
     *     The earnerDescription
     */
    @JsonProperty("earnerDescription")
    public void setEarnerDescription(String earnerDescription) {
        this.earnerDescription = earnerDescription;
    }

    /**
     * 
     * @return
     *     The consumerDescription
     */
    @JsonProperty("consumerDescription")
    public String getConsumerDescription() {
        return consumerDescription;
    }

    /**
     * 
     * @param consumerDescription
     *     The consumerDescription
     */
    @JsonProperty("consumerDescription")
    public void setConsumerDescription(String consumerDescription) {
        this.consumerDescription = consumerDescription;
    }

    /**
     * 
     * @return
     *     The issuerUrl
     */
    @JsonProperty("issuerUrl")
    public String getIssuerUrl() {
        return issuerUrl;
    }

    /**
     * 
     * @param issuerUrl
     *     The issuerUrl
     */
    @JsonProperty("issuerUrl")
    public void setIssuerUrl(String issuerUrl) {
        this.issuerUrl = issuerUrl;
    }

    /**
     * 
     * @return
     *     The rubricUrl
     */
    @JsonProperty("rubricUrl")
    public String getRubricUrl() {
        return rubricUrl;
    }

    /**
     * 
     * @param rubricUrl
     *     The rubricUrl
     */
    @JsonProperty("rubricUrl")
    public void setRubricUrl(String rubricUrl) {
        this.rubricUrl = rubricUrl;
    }

    /**
     * 
     * @return
     *     The timeValue
     */
    @JsonProperty("timeValue")
    public Integer getTimeValue() {
        return timeValue;
    }

    /**
     * 
     * @param timeValue
     *     The timeValue
     */
    @JsonProperty("timeValue")
    public void setTimeValue(Integer timeValue) {
        this.timeValue = timeValue;
    }

    /**
     * 
     * @return
     *     The timeUnits
     */
    @JsonProperty("timeUnits")
    public String getTimeUnits() {
        return timeUnits;
    }

    /**
     * 
     * @param timeUnits
     *     The timeUnits
     */
    @JsonProperty("timeUnits")
    public void setTimeUnits(String timeUnits) {
        this.timeUnits = timeUnits;
    }

    /**
     * 
     * @return
     *     The limit
     */
    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    /**
     * 
     * @param limit
     *     The limit
     */
    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * 
     * @return
     *     The unique
     */
    @JsonProperty("unique")
    public Integer getUnique() {
        return unique;
    }

    /**
     * 
     * @param unique
     *     The unique
     */
    @JsonProperty("unique")
    public void setUnique(Integer unique) {
        this.unique = unique;
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
     *     The imageUrl
     */
    @JsonProperty("imageUrl")
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 
     * @param imageUrl
     *     The imageUrl
     */
    @JsonProperty("imageUrl")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The archived
     */
    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    /**
     * 
     * @param archived
     *     The archived
     */
    @JsonProperty("archived")
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    /**
     * 
     * @return
     *     The system
     */
    @JsonProperty("system")
    public System getSystem() {
        return system;
    }

    /**
     * 
     * @param system
     *     The system
     */
    @JsonProperty("system")
    public void setSystem(System system) {
        this.system = system;
    }

    /**
     * 
     * @return
     *     The criteriaUrl
     */
    @JsonProperty("criteriaUrl")
    public String getCriteriaUrl() {
        return criteriaUrl;
    }

    /**
     * 
     * @param criteriaUrl
     *     The criteriaUrl
     */
    @JsonProperty("criteriaUrl")
    public void setCriteriaUrl(String criteriaUrl) {
        this.criteriaUrl = criteriaUrl;
    }

    /**
     * 
     * @return
     *     The criteria
     */
    @JsonProperty("criteria")
    public List<Criterium> getCriteria() {
        return criteria;
    }

    /**
     * 
     * @param criteria
     *     The criteria
     */
    @JsonProperty("criteria")
    public void setCriteria(List<Criterium> criteria) {
        this.criteria = criteria;
    }

    /**
     * 
     * @return
     *     The alignments
     */
    @JsonProperty("alignments")
    public List<Object> getAlignments() {
        return alignments;
    }

    /**
     * 
     * @param alignments
     *     The alignments
     */
    @JsonProperty("alignments")
    public void setAlignments(List<Object> alignments) {
        this.alignments = alignments;
    }

    /**
     * 
     * @return
     *     The evidenceType
     */
    @JsonProperty("evidenceType")
    public String getEvidenceType() {
        return evidenceType;
    }

    /**
     * 
     * @param evidenceType
     *     The evidenceType
     */
    @JsonProperty("evidenceType")
    public void setEvidenceType(String evidenceType) {
        this.evidenceType = evidenceType;
    }

    /**
     * 
     * @return
     *     The categories
     */
    @JsonProperty("categories")
    public List<String> getCategories() {
        return categories;
    }

    /**
     * 
     * @param categories
     *     The categories
     */
    @JsonProperty("categories")
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    /**
     * 
     * @return
     *     The tags
     */
    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    /**
     * 
     * @return
     *     The milestones
     */
    @JsonProperty("milestones")
    public List<Object> getMilestones() {
        return milestones;
    }

    /**
     * 
     * @param milestones
     *     The milestones
     */
    @JsonProperty("milestones")
    public void setMilestones(List<Object> milestones) {
        this.milestones = milestones;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	public Badge(String slug, String name, String strapline,
			String earnerDescription, String consumerDescription,
			String issuerUrl, String rubricUrl, Integer timeValue,
			String timeUnits, Integer limit, Integer unique, String created,
			String imageUrl, String type, Boolean archived, System system,
			String criteriaUrl, List<Criterium> criteria,
			List<Object> alignments, String evidenceType,
			List<String> categories, List<Tag> tags, List<Object> milestones,
			Map<String, Object> additionalProperties) {
		super();
		this.slug = slug;
		this.name = name;
		this.strapline = strapline;
		this.earnerDescription = earnerDescription;
		this.consumerDescription = consumerDescription;
		this.issuerUrl = issuerUrl;
		this.rubricUrl = rubricUrl;
		this.timeValue = timeValue;
		this.timeUnits = timeUnits;
		this.limit = limit;
		this.unique = unique;
		this.created = created;
		this.imageUrl = imageUrl;
		this.type = type;
		this.archived = archived;
		this.system = system;
		this.criteriaUrl = criteriaUrl;
		this.criteria = criteria;
		this.alignments = alignments;
		this.evidenceType = evidenceType;
		this.categories = categories;
		this.tags = tags;
		this.milestones = milestones;
		this.additionalProperties = additionalProperties;
	}

	public Badge() {
		super();
	}
    
    
}
