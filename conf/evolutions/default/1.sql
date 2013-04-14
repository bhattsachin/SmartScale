# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table bodyweight (
  id                        varchar(255) not null,
  weight                    double,
  email                     varchar(255),
  timestamp                 timestamp,
  constraint pk_bodyweight primary key (id))
;

create table user (
  email_id                  varchar(255) not null,
  pass_word                 varchar(255),
  first_name                varchar(255),
  last_name                 varchar(255),
  constraint pk_user primary key (email_id))
;

create table userdetails (
  email_id                  varchar(255) not null,
  target_weight             bigint,
  start_date                timestamp,
  end_date                  timestamp,
  constraint pk_userdetails primary key (email_id))
;

create table userweight (
  email_id                  varchar(255) not null,
  time_stamp                timestamp,
  weight                    bigint,
  constraint pk_userweight primary key (email_id))
;

create sequence bodyweight_seq;

create sequence user_seq;

create sequence userdetails_seq;

create sequence userweight_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists bodyweight;

drop table if exists user;

drop table if exists userdetails;

drop table if exists userweight;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists bodyweight_seq;

drop sequence if exists user_seq;

drop sequence if exists userdetails_seq;

drop sequence if exists userweight_seq;

