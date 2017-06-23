package ${package.ServiceImpl};

import com.camelot.openplatform.common.bean.Pager;
import ${package.Entity}.${entity};
import ${package.Mapper}.${table.mapperName};
import ${package.Service}.${table.serviceName};
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
/**
 * <p>Description: [${table.comment}服务实现]</p>
 * Copyright (c) 2017 北京柯莱特科技有限公司
 * Created on: ${date}
 * @author  <a href="mailto: ${cfg.email}">${author}</a>
 * @version 1.0 
 */
@Service("${table.serviceName?uncap_first}")
public class ${table.serviceImplName} implements ${table.serviceName} {

   /**
    * <p>Discription:[日志对象]</p>
    */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

   /**
    * <p>[${table.comment}Dao]</p>
    **/
    @Autowired
    private ${table.mapperName}  ${table.mapperName?uncap_first} ;

   /**
    * <p>Discription: [分页查询${table.comment}] </p>
    * Created on: ${date}
    * @param pager 分页信息
    * @return Pager<${entity}> ${table.comment}分页结果
    * @author [${author}]
    */
    public Pager<${entity}> selectPage(Pager<${entity}> pager, ${entity} ${table.viewName}) {
         try {
             List<${entity}> ${table.viewName}List = ${table.viewName}Dao.selectPage(${table.viewName}, pager);
             Long count = ${table.viewName}Dao.selectCount(${table.viewName});
             pager.setRecords(${table.viewName}List);
             pager.setTotal(count);
         } catch (Exception e){
             e.printStackTrace();
             logger.error("分页查询失败：", e);
         }
         return pager;
     }

   /**
    * <p>Discription: [条件查询${table.comment}] </p>
    * Created on: ${date}
    * @return  List<${entity}> ${table.comment}集合
    * @author [${author}]
    */
    public List<${entity}> selectList(${entity} ${table.viewName}) {
     List<${entity}> ${table.viewName}List = Collections.emptyList();
     try {
          ${table.viewName}List = ${table.viewName}Dao.selectList(${table.viewName});
         } catch (Exception e){
          e.printStackTrace();
          logger.error("条件查询失败：", e);
     }
     return ${table.viewName}List;
    }
}
