package com.huanxi.labsystem.dao.pojo;

public class Vpnuser {
    private Integer vpnId;

    private Integer userId;

    private String status;

    private Long maxFlow;

    private Long sendFlow;

    private Long recvFlow;

    private String ovUsername;

    private String ovPassword;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Long getMaxFlow() {
        return maxFlow;
    }

    public void setMaxFlow(Long maxFlow) {
        this.maxFlow = maxFlow;
    }

    public Long getSendFlow() {
        return sendFlow;
    }

    public void setSendFlow(Long sendFlow) {
        this.sendFlow = sendFlow;
    }

    public Long getRecvFlow() {
        return recvFlow;
    }

    public void setRecvFlow(Long recvFlow) {
        this.recvFlow = recvFlow;
    }

    public String getOvUsername() {
        return ovUsername;
    }

    public void setOvUsername(String ovUsername) {
        this.ovUsername = ovUsername == null ? null : ovUsername.trim();
    }

    public String getOvPassword() {
        return ovPassword;
    }

    public void setOvPassword(String ovPassword) {
        this.ovPassword = ovPassword == null ? null : ovPassword.trim();
    }
}