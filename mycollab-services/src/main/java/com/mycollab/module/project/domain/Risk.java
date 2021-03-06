/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
/*Domain class of table m_prj_risk*/
package com.mycollab.module.project.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_prj_risk")
public class Risk extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.id
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.name
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Length(max=400, message="Field value is too long")
    @Column("name")
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.projectId
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Column("projectId")
    private Integer projectid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.createdUser
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("createdUser")
    private String createduser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.assignUser
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("assignUser")
    private String assignuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.consequence
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("consequence")
    private String consequence;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.probalitity
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("probalitity")
    private String probalitity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.status
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("status")
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.dateraised
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Column("dateraised")
    private Date dateraised;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.dueDate
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Column("dueDate")
    private Date duedate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.response
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Length(max=255, message="Field value is too long")
    @Column("response")
    private String response;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.resolution
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Length(max=4000, message="Field value is too long")
    @Column("resolution")
    private String resolution;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.source
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("source")
    private String source;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.createdTime
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Column("createdTime")
    private Date createdtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.lastUpdatedTime
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Column("lastUpdatedTime")
    private Date lastupdatedtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.sAccountId
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Column("sAccountId")
    private Integer saccountid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.startDate
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Column("startDate")
    private Date startdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.endDate
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Column("endDate")
    private Date enddate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.milestoneId
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Column("milestoneId")
    private Integer milestoneid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.ganttIndex
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Column("ganttIndex")
    private Integer ganttindex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.percentagecomplete
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Column("percentagecomplete")
    private Double percentagecomplete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.priority
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("priority")
    private String priority;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.remainEstimate
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Column("remainEstimate")
    private Double remainestimate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_risk.description
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    @Length(max=16777215, message="Field value is too long")
    @Column("description")
    private String description;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        Risk item = (Risk)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(145, 1833).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.id
     *
     * @return the value of m_prj_risk.id
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.id
     *
     * @param id the value for m_prj_risk.id
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.name
     *
     * @return the value of m_prj_risk.name
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.name
     *
     * @param name the value for m_prj_risk.name
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.projectId
     *
     * @return the value of m_prj_risk.projectId
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.projectId
     *
     * @param projectid the value for m_prj_risk.projectId
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.createdUser
     *
     * @return the value of m_prj_risk.createdUser
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public String getCreateduser() {
        return createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.createdUser
     *
     * @param createduser the value for m_prj_risk.createdUser
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.assignUser
     *
     * @return the value of m_prj_risk.assignUser
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public String getAssignuser() {
        return assignuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.assignUser
     *
     * @param assignuser the value for m_prj_risk.assignUser
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setAssignuser(String assignuser) {
        this.assignuser = assignuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.consequence
     *
     * @return the value of m_prj_risk.consequence
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public String getConsequence() {
        return consequence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.consequence
     *
     * @param consequence the value for m_prj_risk.consequence
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setConsequence(String consequence) {
        this.consequence = consequence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.probalitity
     *
     * @return the value of m_prj_risk.probalitity
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public String getProbalitity() {
        return probalitity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.probalitity
     *
     * @param probalitity the value for m_prj_risk.probalitity
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setProbalitity(String probalitity) {
        this.probalitity = probalitity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.status
     *
     * @return the value of m_prj_risk.status
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.status
     *
     * @param status the value for m_prj_risk.status
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.dateraised
     *
     * @return the value of m_prj_risk.dateraised
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public Date getDateraised() {
        return dateraised;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.dateraised
     *
     * @param dateraised the value for m_prj_risk.dateraised
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setDateraised(Date dateraised) {
        this.dateraised = dateraised;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.dueDate
     *
     * @return the value of m_prj_risk.dueDate
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public Date getDuedate() {
        return duedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.dueDate
     *
     * @param duedate the value for m_prj_risk.dueDate
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.response
     *
     * @return the value of m_prj_risk.response
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public String getResponse() {
        return response;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.response
     *
     * @param response the value for m_prj_risk.response
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setResponse(String response) {
        this.response = response;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.resolution
     *
     * @return the value of m_prj_risk.resolution
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.resolution
     *
     * @param resolution the value for m_prj_risk.resolution
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.source
     *
     * @return the value of m_prj_risk.source
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.source
     *
     * @param source the value for m_prj_risk.source
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.createdTime
     *
     * @return the value of m_prj_risk.createdTime
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.createdTime
     *
     * @param createdtime the value for m_prj_risk.createdTime
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.lastUpdatedTime
     *
     * @return the value of m_prj_risk.lastUpdatedTime
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.lastUpdatedTime
     *
     * @param lastupdatedtime the value for m_prj_risk.lastUpdatedTime
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.sAccountId
     *
     * @return the value of m_prj_risk.sAccountId
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.sAccountId
     *
     * @param saccountid the value for m_prj_risk.sAccountId
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.startDate
     *
     * @return the value of m_prj_risk.startDate
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public Date getStartdate() {
        return startdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.startDate
     *
     * @param startdate the value for m_prj_risk.startDate
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.endDate
     *
     * @return the value of m_prj_risk.endDate
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.endDate
     *
     * @param enddate the value for m_prj_risk.endDate
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.milestoneId
     *
     * @return the value of m_prj_risk.milestoneId
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public Integer getMilestoneid() {
        return milestoneid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.milestoneId
     *
     * @param milestoneid the value for m_prj_risk.milestoneId
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setMilestoneid(Integer milestoneid) {
        this.milestoneid = milestoneid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.ganttIndex
     *
     * @return the value of m_prj_risk.ganttIndex
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public Integer getGanttindex() {
        return ganttindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.ganttIndex
     *
     * @param ganttindex the value for m_prj_risk.ganttIndex
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setGanttindex(Integer ganttindex) {
        this.ganttindex = ganttindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.percentagecomplete
     *
     * @return the value of m_prj_risk.percentagecomplete
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public Double getPercentagecomplete() {
        return percentagecomplete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.percentagecomplete
     *
     * @param percentagecomplete the value for m_prj_risk.percentagecomplete
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setPercentagecomplete(Double percentagecomplete) {
        this.percentagecomplete = percentagecomplete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.priority
     *
     * @return the value of m_prj_risk.priority
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public String getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.priority
     *
     * @param priority the value for m_prj_risk.priority
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.remainEstimate
     *
     * @return the value of m_prj_risk.remainEstimate
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public Double getRemainestimate() {
        return remainestimate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.remainEstimate
     *
     * @param remainestimate the value for m_prj_risk.remainEstimate
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setRemainestimate(Double remainestimate) {
        this.remainestimate = remainestimate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_risk.description
     *
     * @return the value of m_prj_risk.description
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_risk.description
     *
     * @param description the value for m_prj_risk.description
     *
     * @mbg.generated Tue Oct 18 22:31:59 ICT 2016
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public enum Field {
        id,
        name,
        projectid,
        createduser,
        assignuser,
        consequence,
        probalitity,
        status,
        dateraised,
        duedate,
        response,
        resolution,
        source,
        createdtime,
        lastupdatedtime,
        saccountid,
        startdate,
        enddate,
        milestoneid,
        ganttindex,
        percentagecomplete,
        priority,
        remainestimate,
        description;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}