package org.offer.common.entity;

import java.io.File;
import java.util.HashMap;
import java.util.Map;


/**
* @ClassName: EmailEntity
* @Description: mail 发见信息
* @author wangdada
* @date 2017年6月24日
*
*/
public class EmailEntity {
	
	
	/**
	* @Fields 发件人邮箱
	*/
	private String sendMail;
	
	/**
	* @Fields 发件人姓名
	*/
	private String sendName;
	
	
	/**
	* @Fields 发件人手机号
	*/
	private String sendPhone;
	
	
	/**
	* @Fields 收件人邮箱
	*/
	private String acceptMail;
	
	
	/**
	* @Fields 收件人名称
	*/
	private String acceptName;
	
	
	/**
	* @Fields 附件
	*/
	private Map<String,File> files;


	
	/**
	* @Title: getSendMail
	* @Description: 获取发件人email
	* @param @return    发件人email
	* @return String    返回类型
	* @throws
	*/
	public String getSendMail() {
		return sendMail;
	}


	
	/**
	* @Title: setSendMail
	* @Description: 设置发件人email
	* @param @param sendMail 发件人email
	* @return void    返回类型
	* @throws
	*/
	public void setSendMail(String sendMail) {
		this.sendMail = sendMail;
	}


	
	/**
	* @Title: getSendName
	* @Description: 获取发件人姓名
	* @param @return    发件人姓名
	* @return String    返回类型
	* @throws
	*/
	public String getSendName() {
		return sendName;
	}


	
	/**
	* @Title: setSendName
	* @Description: 设置发件人姓名
	* @param @param sendName   发件人姓名
	* @return void    返回类型
	* @throws
	*/
	public void setSendName(String sendName) {
		this.sendName = sendName;
	}


	
	/**
	* @Title: getSendPhone
	* @Description: 获取发件人手机号
	* @param @return    参数 发件人手机号
	* @return String    返回类型
	* @throws
	*/
	public String getSendPhone() {
		return sendPhone;
	}


	
	/**
	* @Title: setSendPhone
	* @Description: 设置发件人手机号码
	* @param @param sendPhone    发件人手机号码
	* @return void    返回类型
	* @throws
	*/
	public void setSendPhone(String sendPhone) {
		this.sendPhone = sendPhone;
	}


	
	/**
	* @Title: getAcceptMail
	* @Description: 获取收件人邮箱
	* @param @return    收件人邮箱
	* @return String    返回类型 
	* @throws
	*/
	public String getAcceptMail() {
		return acceptMail;
	}


	
	/**
	* @Title: setAcceptMail
	* @Description: 设置收件人邮箱
	* @param @param acceptMail    收件人邮箱
	* @return void    返回类型
	* @throws
	*/
	public void setAcceptMail(String acceptMail) {
		this.acceptMail = acceptMail;
	}


	
	/**
	* @Title: getAcceptName
	* @Description: 获取收件人姓名
	* @param @return    收件人姓名
	* @return String    返回类型
	* @throws
	*/
	public String getAcceptName() {
		return acceptName;
	}


	
	/**
	* @Title: setAcceptName
	* @Description: 设置收件人姓名
	* @param @param acceptName    收件人姓名
	* @return void    返回类型
	* @throws
	*/
	public void setAcceptName(String acceptName) {
		this.acceptName = acceptName;
	}


	
	/**
	* @Title: getFiles
	* @Description: 获取附件map集合
	* @param @return    参数
	* @return Map<String,File>    返回类型
	* @throws
	*/
	public Map<String,File> getFiles() {
		return files;
	}


	
	/**
	* @Title: setFiles
	* @Description: 设置附件集合  key 邮件标注名称
	* @param @param files    附件集合
	* @return void    返回类型
	* @throws
	*/
	public void setFiles(Map<String,File> files) {
		this.files = files;
	}
	
	
	/**
	* @Title: addFile
	* @Description: 设置附件  key 邮件标注名称
	* @param @param key  邮件标注名称
	* @param @param file 附件
	* @return void    返回类型
	* @throws
	*/
	public void addFile(String key, File file) {
		if(this.files == null){
			this.files = new HashMap<String, File>();
		}
		this.files.put(key, file);
	}
	
	
}
