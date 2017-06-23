package ${package.Service};

import ${package.Entity}.${entity};
import com.camelot.openplatform.common.bean.Pager;

import java.util.List;

/** 
 * <p>Description: [${table.comment}服务]</p>
 * Copyright (c) 2017 北京柯莱特科技有限公司
 * Created on ${date}
 * @author  <a href="mailto: ${cfg.email}">${author}</a>
 * @version 1.0 
 */
public interface ${table.serviceName} {

    /**
    * <p>Discription: [分页查询${table.comment}] </p>
    * Created on: ${date}
    * @param pager 分页信息
    * @return Pager<${entity}> ${table.comment}分页结果
    * @author [${author}]
    */
    Pager<${entity}> selectPage(Pager<${entity}> pager, ${entity} ${table.viewName});

    /**
    * <p>Discription: [条件查询${table.comment}] </p>
    * Created on: ${date}
    * @return  List<${entity}> ${table.comment}集合
    * @author [${author}]
    */
    List<${entity}> selectList(${entity} ${table.viewName});
}
