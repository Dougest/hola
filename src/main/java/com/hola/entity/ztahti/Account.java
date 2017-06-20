package com.hola.entity.ztahti;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author ztahti
 *
 * 2017年4月26日 下午2:34:57
 */

public class Account implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2906235613185562006L;
	private Long id;
	private Persion persion;
	private String username;
	private String password;
	private String problem1;
	private String answer1;
	private String problem2;
	private String answer2;
	private String problem3;
	private String answer3;
	private String email;
	private String phone;
	private Date createTime;
	private Date updateTime;
}
