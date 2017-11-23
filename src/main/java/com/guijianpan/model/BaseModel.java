package com.guijianpan.model;

import java.io.Serializable;

/** 
 * 
 * @author yzChen
 * @date 2017年5月22日 上午10:19:10 
 */
public class BaseModel implements Serializable {

	private static final long serialVersionUID = -6475244092744999457L;

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
