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

        public Criteria andSendIsNull() {
            addCriterion("send is null");
            return (Criteria) this;
        }

        public Criteria andSendIsNotNull() {
            addCriterion("send is not null");
            return (Criteria) this;
        }

        public Criteria andSendEqualTo(Long value) {
            addCriterion("send =", value, "send");
            return (Criteria) this;
        }

        public Criteria andSendNotEqualTo(Long value) {
            addCriterion("send <>", value, "send");
            return (Criteria) this;
        }

        public Criteria andSendGreaterThan(Long value) {
            addCriterion("send >", value, "send");
            return (Criteria) this;
        }

        public Criteria andSendGreaterThanOrEqualTo(Long value) {
            addCriterion("send >=", value, "send");
            return (Criteria) this;
        }

        public Criteria andSendLessThan(Long value) {
            addCriterion("send <", value, "send");
            return (Criteria) this;
        }

        public Criteria andSendLessThanOrEqualTo(Long value) {
            addCriterion("send <=", value, "send");
            return (Criteria) this;
        }

        public Criteria andSendIn(List<Long> values) {
            addCriterion("send in", values, "send");
            return (Criteria) this;
        }

        public Criteria andSendNotIn(List<Long> values) {
            addCriterion("send not in", values, "send");
            return (Criteria) this;
        }

        public Criteria andSendBetween(Long value1, Long value2) {
            addCriterion("send between", value1, value2, "send");
            return (Criteria) this;
        }

        public Criteria andSendNotBetween(Long value1, Long value2) {
            addCriterion("send not between", value1, value2, "send");
            return (Criteria) this;
        }

        public Criteria andRecvIsNull() {
            addCriterion("recv is null");
            return (Criteria) this;
        }

        public Criteria andRecvIsNotNull() {
            addCriterion("recv is not null");
            return (Criteria) this;
        }

        public Criteria andRecvEqualTo(Long value) {
            addCriterion("recv =", value, "recv");
            return (Criteria) this;
        }

        public Criteria andRecvNotEqualTo(Long value) {
            addCriterion("recv <>", value, "recv");
            return (Criteria) this;
        }

        public Criteria andRecvGreaterThan(Long value) {
            addCriterion("recv >", value, "recv");
            return (Criteria) this;
        }

        public Criteria andRecvGreaterThanOrEqualTo(Long value) {
            addCriterion("recv >=", value, "recv");
            return (Criteria) this;
        }

        public Criteria andRecvLessThan(Long value) {
            addCriterion("recv <", value, "recv");
            return (Criteria) this;
        }

        public Criteria andRecvLessThanOrEqualTo(Long value) {
            addCriterion("recv <=", value, "recv");
            return (Criteria) this;
        }

        public Criteria andRecvIn(List<Long> values) {
            addCriterion("recv in", values, "recv");
            return (Criteria) this;
        }

        public Criteria andRecvNotIn(List<Long> values) {
            addCriterion("recv not in", values, "recv");
            return (Criteria) this;
        }

        public Criteria andRecvBetween(Long value1, Long value2) {
            addCriterion("recv between", value1, value2, "recv");
            return (Criteria) this;
        }

        public Criteria andRecvNotBetween(Long value1, Long value2) {
            addCriterion("recv not between", value1, value2, "recv");
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

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Long value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Long value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Long value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Long value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Long value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Long> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Long> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Long value1, Long value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Long value1, Long value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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