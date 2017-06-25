<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${package.Mapper}.${table.mapperName}">
<#if enableCache>
    <!-- 开启二级缓存 -->
    <cache type="org.mybatis.caches.ehcache.LoggingEhcache"/>
</#if>

<#if baseResultMap>
    <!-- 通用查询映射结果 -->
    <resultMap id="BaseResultMap" type="${package.Entity}.${entity}">
		<#list table.fields as field>
			<id column="${field.name}" property="${field.propertyName}" />
		</#list>
    </resultMap>
</#if>

    <!--查询所有字段-->
    <sql id="selectAllColumns">
        select
        <#list table.fields as field><#--##生成普通字段-->
        ${field.name}<#sep>,
        </#list>

        from  ${table.name}
    </sql>

	<!--分页-->
    <sql id="pagination_tail">
        limit ${r'#{'}page.pageOffset} , ${r'#{'}page.rows}
    </sql>

    <!--数量-->
    <sql id="count_Tail">
        select count(*) from ${table.name} record
    </sql>



	<!--查询条件-->
	<sql id="where_fragement">
		<where>
			<if test="entity != null">
			 <#list table.fields as field>
				<if test="entity.${field.propertyName} != null <#if !(cfg.notAppendApostropheTypes?seq_contains(field.propertyType))>and entity.${field.propertyName} != ''</#if>">
					and ${field.name} = ${r'#{entity.'}${field.propertyName}}
				</if>
				 <#if "Date"?contains(field.propertyType) && cfg.rangeDateFileds?seq_contains(field.propertyName)>
				 <if test="entity.${field.propertyName}Start != null and entity.${field.propertyName}Start != ''">
                     <![CDATA[  and ${field.name} >= ${r'#{entity.'}${field.propertyName}Start} ]]>
                 </if>
				 <if test="entity.${field.propertyName}End != null and entity.${field.propertyName}End != ''">
					 <![CDATA[  and ${field.name} <= ${r'#{entity.'}${field.propertyName}End} ]]>
				 </if>
				 </#if>
			 </#list>
			</if>
		</where>
	</sql>


    <insert id="add" useGeneratedKeys="true" keyProperty="id" parameterType="${package.Entity}.${entity}">
        insert into ${table.name}(
            <#list table.fields as field><#--##生成普通字段-->
            ${field.name}<#sep>,
            </#list>

        )values(
            <#list table.fields as field><#--##生成普通字段-->
            ${r'#{'}${field.propertyName}${r'}'}<#sep>,
            </#list>

        )
    </insert>

    <update id="update">
        update  ${table.name}
        <set>
		<#list table.fields as field>
            <if test="${field.propertyName} != null <#if !(cfg.notAppendApostropheTypes?seq_contains(field.propertyType))>and ${field.propertyName} != ''</#if>">
                ${field.name} = ${r'#{'}${field.propertyName}},
            </if>
			<#if "Date"?contains(field.propertyType) && cfg.rangeDateFileds?seq_contains(field.propertyName)>
                <if test="${field.propertyName}Start != null and ${field.propertyName}Start != ''">
                    <![CDATA[ ${field.name} >= ${r'#{'}${field.propertyName}Start} ]]>,
                </if>
                <if test="${field.propertyName}End != null and ${field.propertyName}End != ''">
                    <![CDATA[ ${field.name} <= ${r'#{'}${field.propertyName}End} ]]>,
                </if>
			</#if>
		</#list>
        </set>
        where id = ${r'#{'}id}
    </update>

    <!--根据id删除-->
    <delete id="delete">
        delete from ${table.name} where id = ${r'#{'}id}
    </delete>

    <!--根据id查询-->
    <select id="queryById" resultMap="BaseResultMap" >
        select * from ${table.name}
        where id = ${r'#{'}id}
    </select>

    <!--列表查询-->
	<select id="queryList" resultMap="BaseResultMap">
        <include refid="selectAllColumns"/>
		<include refid="where_fragement" />
        <if test="page!=null">
            <include refid="pagination_tail" />
        </if>
	</select>


    <!--数量查询-->
	<select id="queryCount" resultType="java.lang.Long">
        <include refid="count_Tail"></include>
		<include refid="where_fragement" />
	</select>

</mapper>
