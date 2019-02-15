package com.cloud.microblog.scheduler.quartz.dao.model;

import java.util.Date;

public class QuartzJob {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quartz_job.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quartz_job.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quartz_job.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quartz_job.cron
     *
     * @mbggenerated
     */
    private String cron;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quartz_job.job_class
     *
     * @mbggenerated
     */
    private String jobClass;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quartz_job.job_group
     *
     * @mbggenerated
     */
    private String jobGroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quartz_job.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quartz_job.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quartz_job.create_by
     *
     * @mbggenerated
     */
    private String createBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quartz_job.finish_time
     *
     * @mbggenerated
     */
    private Date finishTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quartz_job.finish_by
     *
     * @mbggenerated
     */
    private String finishBy;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quartz_job.id
     *
     * @return the value of quartz_job.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quartz_job.id
     *
     * @param id the value for quartz_job.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quartz_job.name
     *
     * @return the value of quartz_job.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quartz_job.name
     *
     * @param name the value for quartz_job.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quartz_job.description
     *
     * @return the value of quartz_job.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quartz_job.description
     *
     * @param description the value for quartz_job.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quartz_job.cron
     *
     * @return the value of quartz_job.cron
     *
     * @mbggenerated
     */
    public String getCron() {
        return cron;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quartz_job.cron
     *
     * @param cron the value for quartz_job.cron
     *
     * @mbggenerated
     */
    public void setCron(String cron) {
        this.cron = cron;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quartz_job.job_class
     *
     * @return the value of quartz_job.job_class
     *
     * @mbggenerated
     */
    public String getJobClass() {
        return jobClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quartz_job.job_class
     *
     * @param jobClass the value for quartz_job.job_class
     *
     * @mbggenerated
     */
    public void setJobClass(String jobClass) {
        this.jobClass = jobClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quartz_job.job_group
     *
     * @return the value of quartz_job.job_group
     *
     * @mbggenerated
     */
    public String getJobGroup() {
        return jobGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quartz_job.job_group
     *
     * @param jobGroup the value for quartz_job.job_group
     *
     * @mbggenerated
     */
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quartz_job.status
     *
     * @return the value of quartz_job.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quartz_job.status
     *
     * @param status the value for quartz_job.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quartz_job.create_time
     *
     * @return the value of quartz_job.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quartz_job.create_time
     *
     * @param createTime the value for quartz_job.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quartz_job.create_by
     *
     * @return the value of quartz_job.create_by
     *
     * @mbggenerated
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quartz_job.create_by
     *
     * @param createBy the value for quartz_job.create_by
     *
     * @mbggenerated
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quartz_job.finish_time
     *
     * @return the value of quartz_job.finish_time
     *
     * @mbggenerated
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quartz_job.finish_time
     *
     * @param finishTime the value for quartz_job.finish_time
     *
     * @mbggenerated
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quartz_job.finish_by
     *
     * @return the value of quartz_job.finish_by
     *
     * @mbggenerated
     */
    public String getFinishBy() {
        return finishBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quartz_job.finish_by
     *
     * @param finishBy the value for quartz_job.finish_by
     *
     * @mbggenerated
     */
    public void setFinishBy(String finishBy) {
        this.finishBy = finishBy;
    }
}