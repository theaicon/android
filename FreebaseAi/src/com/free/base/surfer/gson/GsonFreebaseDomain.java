package com.free.base.surfer.gson;

import android.text.Html;

import com.google.gson.annotations.SerializedName;

public class GsonFreebaseDomain implements Comparable<GsonFreebaseDomain> {

	@SerializedName("type")
	private String type;

	@SerializedName("id")
	private String id;

	@SerializedName("name")
	private String name;

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return Html.fromHtml(name).toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GsonFreebaseDomain other = (GsonFreebaseDomain) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(GsonFreebaseDomain another) {

		return this.getName().compareTo(another.getName());
	}

}
