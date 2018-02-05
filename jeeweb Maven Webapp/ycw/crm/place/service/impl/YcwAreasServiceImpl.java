package cn.ycw.crm.place.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.ycw.crm.place.entity.YcwAreas;
import cn.ycw.crm.place.service.IYcwAreasService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 选择地区
 * @Description: 地区选择
 * @author jeeweb
 * @date 2018-02-05 15:34:07
 * @version V1.0   
 *
 */
@Transactional
@Service("ycwAreasService")
public class YcwAreasServiceImpl  extends CommonServiceImpl<YcwAreas> implements  IYcwAreasService {

}
