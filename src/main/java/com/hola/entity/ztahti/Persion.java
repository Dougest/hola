package com.hola.entity.ztahti;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author ztahti
 *
 * 2017年4月26日 下午2:35:08
 */

public class Persion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 612765164125847647L;
	private Long id;
	private Account account;
	private String realName;
	private String nickName;
	private String address;
	private String bloodType;
	private String hobby;
	private String job;
	private String education;
	private String school;
	private Date birthday;
	private Date createTime;
	private Date updateTime;
}
