package ru.mdimension.dto;


import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by aefimov on 21/04/2017.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"code",
		"lang",
		"text"
})
public class Translate {

	@JsonProperty("code")
	private Integer code;
	@JsonProperty("lang")
	private String lang;
	@JsonProperty("text")
	private List<String> text = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("code")
	public Integer getCode() {
		return code;
	}

	@JsonProperty("code")
	public void setCode(Integer code) {
		this.code = code;
	}

	@JsonProperty("lang")
	public String getLang() {
		return lang;
	}

	@JsonProperty("lang")
	public void setLang(String lang) {
		this.lang = lang;
	}

	@JsonProperty("text")
	public List<String> getText() {
		return text;
	}

	@JsonProperty("text")
	public void setText(List<String> text) {
		this.text = text;
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