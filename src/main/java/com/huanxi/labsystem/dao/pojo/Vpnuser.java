package com.huanxi.labsystem.dao.pojo;

public class Vpnuser {
    private Integer vpnId;

    private Integer userId;

    private Long send;

    private Long recv;

    private Long maxFlow;

    private Long endTime;

    private Long createTime;

    private String username;

    private String password;

    private String status;

    public Integer getVpnId() {
        return vpnId;
    }

    public void setVpnId(Integer vpnId) {
        this.vpnId = vpnId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getSend() {
        return send;
    }

    public void setSend(Long send) {
        this.send = send;
    }

    public Long getRecv() {
        return recv;
    }

    public void setRecv(Long recv) {
        this.recv = recv;
    }

    public Long getMaxFlow() {
        return maxFlow;
    }

    public void setMaxFlow(Long maxFlow) {
        this.maxFlow = maxFlow;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}