package cn.ycw.crm.place.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import cn.jeeweb.core.common.entity.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;

/**   
 * @Title: 选择地区
 * @Description: 选择地区
 * @author jeeweb
 * @date 2018-02-05 15:35:53
 * @version V1.0   
 *
 */
@Entity
@Table(name = "ycw_cities")
@DynamicUpdate(false)
@DynamicInsert(false)
@SuppressWarnings("serial")
public class YcwCities extends AbstractEntity<String> {

    /**名称*/
	private String city;
    /**id*/
	private Integer id;
    /**外键*/
	private Integer provinceid;
    /**关联字段，主键*/
	private Integer cityid;
	
	/**
	 * 获取  city
	 *@return: String  名称
	 */
	@Column(name ="city",nullable=false,length=50,scale=0)
	public String getCity(){
		return this.city;
	}

	/**
	 * 设置  city
	 *@param: city  名称
	 */
	public void setCity(String city){
		this.city = city;
	}
	/**
	 * 获取  id
	 *@return: Integer  id
	 */
	@Column(name ="id",nullable=false,length=10,scale=0)
	public Integer getId(){
		return this.id;
	}

	/**
	 * 设置  id
	 *@param: id  id
	 */
	public void setId(Integer id){
		this.id = id;
	}
	/**
	 * 获取  provinceid
	 *@return: Integer  外键
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "provinceid")
	public Integer getProvinceid(){
		return this.provinceid;
	}

	/**
	 * 设置  provinceid
	 *@param: provinceid  外键
	 */
	public void setProvinceid(Integer provinceid){
		this.provinceid = provinceid;
	}
	/**
	 * 获取  cityid
	 *@return: Integer  关联字段，主键
	 */
	
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="cityid",nullable=false,length=10,scale=0)
	public Integer getCityid(){
		return this.cityid;
	}

	/**
	 * 设置  cityid
	 *@param: cityid  关联字段，主键
	 */
	public void setCityid(Integer cityid){
		this.cityid = cityid;
	}
}