package com.huanxi.labsystem.dao.pojo;

import java.util.ArrayList;
import java.util.List;

public class VpnuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VpnuserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andVpnIdIsNull() {
            addCriterion("vpn_id is null");
            return (Criteria) this;
        }

        public Criteria andVpnIdIsNotNull() {
            addCriterion("vpn_id is not null");
            return (Criteria) this;
        }

        public Criteria andVpnIdEqualTo(Integer value) {
            addCriterion("vpn_id =", value, "vpnId");
            return (Criteria) this;
        }

        public Criteria andVpnIdNotEqualTo(Integer value) {
            addCriterion("vpn_id <>", value, "vpnId");
            return (Criteria) this;
        }

        public Criteria andVpnIdGreaterThan(Integer value) {
            addCriterion("vpn_id >", value, "vpnId");
            return (Criteria) this;
        }

        public Criteria andVpnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vpn_id >=", value, "vpnId");
            return (Criteria) this;
        }

        public Criteria andVpnIdLessThan(Integer value) {
            addCriterion("vpn_id <", value, "vpnId");
            return (Criteria) this;
        }

        public Criteria andVpnIdLessThanOrEqualTo(Integer value) {
            addCriterion("vpn_id <=", value, "vpnId");
            return (Criteria) this;
        }

        public Criteria andVpnIdIn(List<Integer> values) {
            addCriterion("vpn_id in", values, "vpnId");
            return (Criteria) this;
        }

        public Criteria andVpnIdNotIn(List<Integer> values) {
            addCriterion("vpn_id not in", values, "vpnId");
            return (Criteria) this;
        }

        public Criteria andVpnIdBetween(Integer value1, Integer value2) {
            addCriterion("vpn_id between", value1, value2, "vpnId");
            return (Criteria) this;
        }

        public Criteria andVpnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vpn_id not between", value1, value2, "vpnId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andMaxFlowIsNull() {
            addCriterion("max_flow is null");
            return (Criteria) this;
        }

        public Criteria andMaxFlowIsNotNull() {
            addCriterion("max_flow is not null");
            return (Criteria) this;
        }

        public Criteria andMaxFlowEqualTo(Long value) {
            addCriterion("max_flow =", value, "maxFlow");
            return (Criteria) this;
        }

        public Criteria andMaxFlowNotEqualTo(Long value) {
            addCriterion("max_flow <>", value, "maxFlow");
            return (Criteria) this;
        }

        public Criteria andMaxFlowGreaterThan(Long value) {
            addCriterion("max_flow >", value, "maxFlow");
            return (Criteria) this;
        }

        public Criteria andMaxFlowGreaterThanOrEqualTo(Long value) {
            addCriterion("max_flow >=", value, "maxFlow");
            return (Criteria) this;
        }

        public Criteria andMaxFlowLessThan(Long value) {
            addCriterion("max_flow <", value, "maxFlow");
            return (Criteria) this;
        }

        public Criteria andMaxFlowLessThanOrEqualTo(Long value) {
            addCriterion("max_flow <=", value, "maxFlow");
            return (Criteria) this;
        }

        public Criteria andMaxFlowIn(List<Long> values) {
            addCriterion("max_flow in", values, "maxFlow");
            return (Criteria) this;
        }

        public Criteria andMaxFlowNotIn(List<Long> values) {
            addCriterion("max_flow not in", values, "maxFlow");
            return (Criteria) this;
        }

        public Criteria andMaxFlowBetween(Long value1, Long value2) {
            addCriterion("max_flow between", value1, value2, "maxFlow");
            return (Criteria) this;
        }

        public Criteria andMaxFlowNotBetween(Long value1, Long value2) {
            addCriterion("max_flow not between", value1, value2, "maxFlow");
            return (Criteria) this;
        }

        public Criteria andSendFlowIsNull() {
            addCriterion("send_flow is null");
            return (Criteria) this;
        }

        public Criteria andSendFlowIsNotNull() {
            addCriterion("send_flow is not null");
            return (Criteria) this;
        }

        public Criteria andSendFlowEqualTo(Long value) {
            addCriterion("send_flow =", value, "sendFlow");
            return (Criteria) this;
        }

        public Criteria andSendFlowNotEqualTo(Long value) {
            addCriterion("send_flow <>", value, "sendFlow");
            return (Criteria) this;
        }

        public Criteria andSendFlowGreaterThan(Long value) {
            addCriterion("send_flow >", value, "sendFlow");
            return (Criteria) this;
        }

        public Criteria andSendFlowGreaterThanOrEqualTo(Long value) {
            addCriterion("send_flow >=", value, "sendFlow");
            return (Criteria) this;
        }

        public Criteria andSendFlowLessThan(Long value) {
            addCriterion("send_flow <", value, "sendFlow");
            return (Criteria) this;
        }

        public Criteria andSendFlowLessThanOrEqualTo(Long value) {
            addCriterion("send_flow <=", value, "sendFlow");
            return (Criteria) this;
        }

        public Criteria andSendFlowIn(List<Long> values) {
            addCriterion("send_flow in", values, "sendFlow");
            return (Criteria) this;
        }

        public Criteria andSendFlowNotIn(List<Long> values) {
            addCriterion("send_flow not in", values, "sendFlow");
            return (Criteria) this;
        }

        public Criteria andSendFlowBetween(Long value1, Long value2) {
            addCriterion("send_flow between", value1, value2, "sendFlow");
            return (Criteria) this;
        }

        public Criteria andSendFlowNotBetween(Long value1, Long value2) {
            addCriterion("send_flow not between", value1, value2, "sendFlow");
            return (Criteria) this;
        }

        public Criteria andRecvFlowIsNull() {
            addCriterion("recv_flow is null");
            return (Criteria) this;
        }

        public Criteria andRecvFlowIsNotNull() {
            addCriterion("recv_flow is not null");
            return (Criteria) this;
        }

        public Criteria andRecvFlowEqualTo(Long value) {
            addCriterion("recv_flow =", value, "recvFlow");
            return (Criteria) this;
        }

        public Criteria andRecvFlowNotEqualTo(Long value) {
            addCriterion("recv_flow <>", value, "recvFlow");
            return (Criteria) this;
        }

        public Criteria andRecvFlowGreaterThan(Long value) {
            addCriterion("recv_flow >", value, "recvFlow");
            return (Criteria) this;
        }

        public Criteria andRecvFlowGreaterThanOrEqualTo(Long value) {
            addCriterion("recv_flow >=", value, "recvFlow");
            return (Criteria) this;
        }

        public Criteria andRecvFlowLessThan(Long value) {
            addCriterion("recv_flow <", value, "recvFlow");
            return (Criteria) this;
        }

        public Criteria andRecvFlowLessThanOrEqualTo(Long value) {
            addCriterion("recv_flow <=", value, "recvFlow");
            return (Criteria) this;
        }

        public Criteria andRecvFlowIn(List<Long> values) {
            addCriterion("recv_flow in", values, "recvFlow");
            return (Criteria) this;
        }

        public Criteria andRecvFlowNotIn(List<Long> values) {
            addCriterion("recv_flow not in", values, "recvFlow");
            return (Criteria) this;
        }

        public Criteria andRecvFlowBetween(Long value1, Long value2) {
            addCriterion("recv_flow between", value1, value2, "recvFlow");
            return (Criteria) this;
        }

        public Criteria andRecvFlowNotBetween(Long value1, Long value2) {
            addCriterion("recv_flow not between", value1, value2, "recvFlow");
            return (Criteria) this;
        }

        public Criteria andOvUsernameIsNull() {
            addCriterion("ov_username is null");
            return (Criteria) this;
        }

        public Criteria andOvUsernameIsNotNull() {
            addCriterion("ov_username is not null");
            return (Criteria) this;
        }

        public Criteria andOvUsernameEqualTo(String value) {
            addCriterion("ov_username =", value, "ovUsername");
            return (Criteria) this;
        }

        public Criteria andOvUsernameNotEqualTo(String value) {
            addCriterion("ov_username <>", value, "ovUsername");
            return (Criteria) this;
        }

        public Criteria andOvUsernameGreaterThan(String value) {
            addCriterion("ov_username >", value, "ovUsername");
            return (Criteria) this;
        }

        public Criteria andOvUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("ov_username >=", value, "ovUsername");
            return (Criteria) this;
        }

        public Criteria andOvUsernameLessThan(String value) {
            addCriterion("ov_username <", value, "ovUsername");
            return (Criteria) this;
        }

        public Criteria andOvUsernameLessThanOrEqualTo(String value) {
            addCriterion("ov_username <=", value, "ovUsername");
            return (Criteria) this;
        }

        public Criteria andOvUsernameLike(String value) {
            addCriterion("ov_username like", value, "ovUsername");
            return (Criteria) this;
        }

        public Criteria andOvUsernameNotLike(String value) {
            addCriterion("ov_username not like", value, "ovUsername");
            return (Criteria) this;
        }

        public Criteria andOvUsernameIn(List<String> values) {
            addCriterion("ov_username in", values, "ovUsername");
            return (Criteria) this;
        }

        public Criteria andOvUsernameNotIn(List<String> values) {
            addCriterion("ov_username not in", values, "ovUsername");
            return (Criteria) this;
        }

        public Criteria andOvUsernameBetween(String value1, String value2) {
            addCriterion("ov_username between", value1, value2, "ovUsername");
            return (Criteria) this;
        }

        public Criteria andOvUsernameNotBetween(String value1, String value2) {
            addCriterion("ov_username not between", value1, value2, "ovUsername");
            return (Criteria) this;
        }

        public Criteria andOvPasswordIsNull() {
            addCriterion("ov_password is null");
            return (Criteria) this;
        }

        public Criteria andOvPasswordIsNotNull() {
            addCriterion("ov_password is not null");
            return (Criteria) this;
        }

        public Criteria andOvPasswordEqualTo(String value) {
            addCriterion("ov_password =", value, "ovPassword");
            return (Criteria) this;
        }

        public Criteria andOvPasswordNotEqualTo(String value) {
            addCriterion("ov_password <>", value, "ovPassword");
            return (Criteria) this;
        }

        public Criteria andOvPasswordGreaterThan(String value) {
            addCriterion("ov_password >", value, "ovPassword");
            return (Criteria) this;
        }

        public Criteria andOvPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("ov_password >=", value, "ovPassword");
            return (Criteria) this;
        }

        public Criteria andOvPasswordLessThan(String value) {
            addCriterion("ov_password <", value, "ovPassword");
            return (Criteria) this;
        }

        public Criteria andOvPasswordLessThanOrEqualTo(String value) {
            addCriterion("ov_password <=", value, "ovPassword");
            return (Criteria) this;
        }

        public Criteria andOvPasswordLike(String value) {
            addCriterion("ov_password like", value, "ovPassword");
            return (Criteria) this;
        }

        public Criteria andOvPasswordNotLike(String value) {
            addCriterion("ov_password not like", value, "ovPassword");
            return (Criteria) this;
        }

        public Criteria andOvPasswordIn(List<String> values) {
            addCriterion("ov_password in", values, "ovPassword");
            return (Criteria) this;
        }

        public Criteria andOvPasswordNotIn(List<String> values) {
            addCriterion("ov_password not in", values, "ovPassword");
            return (Criteria) this;
        }

        public Criteria andOvPasswordBetween(String value1, String value2) {
            addCriterion("ov_password between", value1, value2, "ovPassword");
            return (Criteria) this;
        }

        public Criteria andOvPasswordNotBetween(String value1, String value2) {
            addCriterion("ov_password not between", value1, value2, "ovPassword");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}