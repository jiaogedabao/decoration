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
   id                   bigint not null comment '��������',
   user_id              bigint comment '�û�id',
   name                 varchar(50) comment '������Ŀ����',
   unit                 varchar(10) comment '������Ŀ��λ',
   des_construction     varchar(200) comment 'ʩ������',
   des_stuff            varchar(200) comment '��������',
   price                decimal comment '�۸�',
   remarks              varchar(200) comment '�۸�',
   primary key (id)
);

alter table dic_project comment '������Ŀ��';

/*==============================================================*/
/* Table: quo_modular                                           */
/*==============================================================*/
create table quo_modular
(
   id                   bigint not null comment '��������',
   quo_id               bigint comment '���۵�id',
   mod_namer            varchar(50) comment 'ģ������',
   mod_price            decimal comment '�ϼƼ۸�',
   mod_order            integer comment '����',
   primary key (id)
);

alter table quo_modular comment '���۵���ģ��';

/*==============================================================*/
/* Table: quotation                                             */
/*==============================================================*/
create table quotation
(
   id                   bigint not null comment '��������',
   user_id              bigint comment '�û�id',
   name                 varchar(50) comment '���۵�����',
   cust_name            varchar(50) comment '�ͻ�����',
   cust_phone           varchar(20) comment '�ͻ��ֻ���',
   cust_email           varchar(50) comment '�ͻ�email',
   total_price          decimal comment 'ͳ�Ƽ۸�',
   descripton           varchar(200) comment '���۵�����',
   is_send              tinyint comment '�Ƿ���',
   create_dt            datetime comment '����ʱ��',
   send_dt              datetime comment '����ʱ��',
   is_delete            tinyint comment '���ɾ��',
   primary key (id)
);

alter table quotation comment '���۵�';

/*==============================================================*/
/* Table: quotation_info                                        */
/*==============================================================*/
create table quotation_info
(
   id                   bigint not null comment '��������',
   mod_id               bigint comment '��ģ��id',
   pro_sup_name         varchar(50) comment '��Ŀ��Ĳ�����',
   unit                 varchar(10) comment '��Ŀ��λ',
   unit_price           decimal comment '��Ŀ�۸�',
   num                  integer comment '����',
   des_construction     varchar(200) comment 'ʩ������',
   des_stuff            varchar(200) comment '��������',
   remarks              varchar(200) comment '��ע',
   primary key (id)
);

alter table quotation_info comment '���۵�����';

/*==============================================================*/
/* Table: quotation_template                                    */
/*==============================================================*/
create table quotation_template
(
   id                   bigint not null comment '��������',
   user_id              bigint comment '�û�id',
   tem_name             varchar(50) comment 'ģ������',
   total_price          decimal comment 'ͳ�Ƽ۸�',
   tem_des              varchar(200) comment 'ģ������',
   primary key (id)
);

alter table quotation_template comment '���۵�ģ��';

/*==============================================================*/
/* Table: supplies                                              */
/*==============================================================*/
create table supplies
(
   id                   bigint not null comment '��������',
   user_id              bigint comment '�û�id',
   name                 varchar(50) comment '�Ĳ�����',
   price                decimal comment '�Ĳļ۸�',
   remarks              varchar(200) comment '��ע',
   primary key (id)
);

alter table supplies comment '�Ĳı�';

/*==============================================================*/
/* Table: template_info                                         */
/*==============================================================*/
create table template_info
(
   id                   bigint not null comment '��������',
   mod_id               bigint comment '��ģ��id',
   pro_sup_name         varchar(50) comment '��Ŀ��Ĳ�����',
   unit                 varchar(10) comment '��Ŀ��λ',
   unit_price           decimal comment '��Ŀ�۸�',
   num                  integer comment '����',
   des_construction     varchar(200) comment 'ʩ������',
   des_stuff            varchar(200) comment '��������',
   remarks              varchar(200) comment '��ע',
   primary key (id)
);

alter table template_info comment 'ģ������';

/*==============================================================*/
/* Table: template_modular                                      */
/*==============================================================*/
create table template_modular
(
   id                   bigint not null comment '��������',
   tem_id               bigint comment 'ģ��id',
   mod_namer            varchar(50) comment 'ģ������',
   mod_price            decimal comment '�ϼƼ۸�',
   mod_order            integer comment '����',
   primary key (id)
);

alter table template_modular comment 'ģ����ģ��';

/*==============================================================*/
/* Table: userinfo                                              */
/*==============================================================*/
create table userinfo
(
   id                   bigint not null comment '��������',
   login_name           varchar(20) comment '��¼��',
   login_pwd            varchar(20) comment '��¼����',
   real_name            varchar(20) comment '����',
   phone                varchar(20) comment '�ֻ���',
   email                varchar(50) comment 'Email',
   type                 numeric(2) comment '�û�����',
   pro_year             numeric(2) comment 'ְҵ���',
   company              varchar(50) comment '������˾',
   status               varchar(5) comment '״̬',
   primary key (id)
);

alter table userinfo comment 'ϵͳ�û���';

