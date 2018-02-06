package cn.ycw.crm.place.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import cn.jeeweb.core.common.entity.AbstractEntity;

/**   
 * @Title: 选择地区
 * @Description: 地区选择
 * @author jeeweb
 * @date 2018-02-05 15:34:07
 * @version V1.0   
 *
 */
@Entity
@Table(name = "ycw_areas")
@DynamicUpdate(false)
@DynamicInsert(false)
@SuppressWarnings("serial")
public class YcwAreas extends AbstractEntity<String> {

    /**主键*/
	private Integer id;
    /**城市外键*/
	private Integer cityid;
    /**区名*/
	private String area;
	/**
	 * 获取  id
	 *@return: Integer  主键
	 */
	
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="id",nullable=false,length=10,scale=0)
	public Integer getId(){
		return this.id;
	}

	/**
	 * 设置  id
	 *@param: id  主键
	 */
	public void setId(Integer id){
		this.id = id;
	}
	/**
	 * 获取  cityid
	 *@return: Integer  城市外键
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cityid")
	public Integer getCityid(){
		return this.cityid;
	}

	/**
	 * 设置  cityid
	 *@param: cityid  城市外键
	 */
	public void setCityid(Integer cityid){
		this.cityid = cityid;
	}
	/**
	 * 获取  area
	 *@return: String  区名
	 */
	@Column(name ="area",nullable=false,length=50,scale=0)
	public String getArea(){
		return this.area;
	}

	/**
	 * 设置  area
	 *@param: area  区名
	 */
	public void setArea(String area){
		this.area = area;
	}
	
}
