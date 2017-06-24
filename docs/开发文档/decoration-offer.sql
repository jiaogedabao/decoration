/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/6/24 11:12:48                           */
/*==============================================================*/


drop table if exists dic_project;

drop table if exists quo_modular;

drop table if exists quotation;

drop table if exists quotation_info;

drop table if exists quotation_template;

drop table if exists supplies;

drop table if exists template_info;

drop table if exists template_modular;

drop table if exists userinfo;

/*==============================================================*/
/* Table: dic_project                                           */
/*==============================================================*/
create table dic_project
(
   id                   bigint not null comment '自增主键',
   user_id              bigint comment '用户id',
   name                 varchar(50) comment '工程项目名称',
   unit                 varchar(10) comment '工程项目单位',
   des_construction     varchar(200) comment '施工描述',
   des_stuff            varchar(200) comment '材料描述',
   price                decimal comment '价格',
   remarks              varchar(200) comment '价格',
   primary key (id)
);

alter table dic_project comment '工程项目表';

/*==============================================================*/
/* Table: quo_modular                                           */
/*==============================================================*/
create table quo_modular
(
   id                   bigint not null comment '自增主键',
   quo_id               bigint comment '报价单id',
   mod_namer            varchar(50) comment '模块名称',
   mod_price            decimal comment '合计价格',
   mod_order            integer comment '排序',
   primary key (id)
);

alter table quo_modular comment '报价单子模块';

/*==============================================================*/
/* Table: quotation                                             */
/*==============================================================*/
create table quotation
(
   id                   bigint not null comment '自增主键',
   user_id              bigint comment '用户id',
   name                 varchar(50) comment '报价单名称',
   cust_name            varchar(50) comment '客户姓名',
   cust_phone           varchar(20) comment '客户手机号',
   cust_email           varchar(50) comment '客户email',
   total_price          decimal comment '统计价格',
   descripton           varchar(200) comment '报价单描述',
   is_send              tinyint comment '是否发送',
   create_dt            datetime comment '创建时间',
   send_dt              datetime comment '发送时间',
   is_delete            tinyint comment '标记删除',
   primary key (id)
);

alter table quotation comment '报价单';

/*==============================================================*/
/* Table: quotation_info                                        */
/*==============================================================*/
create table quotation_info
(
   id                   bigint not null comment '自增主键',
   mod_id               bigint comment '子模块id',
   pro_sup_name         varchar(50) comment '项目或耗材名称',
   unit                 varchar(10) comment '项目单位',
   unit_price           decimal comment '项目价格',
   num                  integer comment '数量',
   des_construction     varchar(200) comment '施工描述',
   des_stuff            varchar(200) comment '材料描述',
   remarks              varchar(200) comment '备注',
   primary key (id)
);

alter table quotation_info comment '报价单详情';

/*==============================================================*/
/* Table: quotation_template                                    */
/*==============================================================*/
create table quotation_template
(
   id                   bigint not null comment '自增主键',
   user_id              bigint comment '用户id',
   tem_name             varchar(50) comment '模板名称',
   total_price          decimal comment '统计价格',
   tem_des              varchar(200) comment '模板描述',
   primary key (id)
);

alter table quotation_template comment '报价单模板';

/*==============================================================*/
/* Table: supplies                                              */
/*==============================================================*/
create table supplies
(
   id                   bigint not null comment '自增主键',
   user_id              bigint comment '用户id',
   name                 varchar(50) comment '耗材名称',
   price                decimal comment '耗材价格',
   remarks              varchar(200) comment '备注',
   primary key (id)
);

alter table supplies comment '耗材表';

/*==============================================================*/
/* Table: template_info                                         */
/*==============================================================*/
create table template_info
(
   id                   bigint not null comment '自增主键',
   mod_id               bigint comment '子模块id',
   pro_sup_name         varchar(50) comment '项目或耗材名称',
   unit                 varchar(10) comment '项目单位',
   unit_price           decimal comment '项目价格',
   num                  integer comment '数量',
   des_construction     varchar(200) comment '施工描述',
   des_stuff            varchar(200) comment '材料描述',
   remarks              varchar(200) comment '备注',
   primary key (id)
);

alter table template_info comment '模板详情';

/*==============================================================*/
/* Table: template_modular                                      */
/*==============================================================*/
create table template_modular
(
   id                   bigint not null comment '自增主键',
   tem_id               bigint comment '模板id',
   mod_namer            varchar(50) comment '模块名称',
   mod_price            decimal comment '合计价格',
   mod_order            integer comment '排序',
   primary key (id)
);

alter table template_modular comment '模板子模块';

/*==============================================================*/
/* Table: userinfo                                              */
/*==============================================================*/
create table userinfo
(
   id                   bigint not null comment '自增主键',
   login_name           varchar(20) comment '登录名',
   login_pwd            varchar(20) comment '登录密码',
   real_name            varchar(20) comment '姓名',
   phone                varchar(20) comment '手机号',
   email                varchar(50) comment 'Email',
   type                 numeric(2) comment '用户类型',
   pro_year             numeric(2) comment '职业年份',
   company              varchar(50) comment '所属公司',
   status               varchar(5) comment '状态',
   primary key (id)
);

alter table userinfo comment '系统用户表';

