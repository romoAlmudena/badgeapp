package com.example.badgeapp.classes;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;




@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "url",
    "mediaType",
    "reflection"
})
public class Evidence {

    @Override
	public String toString() {
		return "Evidence [url=" + url + ", mediaType=" + mediaType
				+ ", reflection=" + reflection + ", additionalProperties="
				+ additionalProperties + "]";
	}

	@JsonProperty("url")
    private Object url;
    @JsonProperty("mediaType")
    private Object mediaType;
    @JsonProperty("reflection")
    private String reflection;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The url
     */
    @JsonProperty("url")
    public Object getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    @JsonProperty("url")
    public void setUrl(Object url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The mediaType
     */
    @JsonProperty("mediaType")
    public Object getMediaType() {
        return mediaType;
    }

    /**
     * 
     * @param mediaType
     *     The mediaType
     */
    @JsonProperty("mediaType")
    public void setMediaType(Object mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * 
     * @return
     *     The reflection
     */
    @JsonProperty("reflection")
    public String getReflection() {
        return reflection;
    }

    /**
     * 
     * @param reflection
     *     The reflection
     */
    @JsonProperty("reflection")
    public void setReflection(String reflection) {
        this.reflection = reflection;
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
