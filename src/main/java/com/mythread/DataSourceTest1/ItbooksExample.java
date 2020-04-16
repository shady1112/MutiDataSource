package com.mythread.DataSourceTest1;

import java.util.ArrayList;
import java.util.List;

public class ItbooksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItbooksExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBooknameIsNull() {
            addCriterion("bookname is null");
            return (Criteria) this;
        }

        public Criteria andBooknameIsNotNull() {
            addCriterion("bookname is not null");
            return (Criteria) this;
        }

        public Criteria andBooknameEqualTo(String value) {
            addCriterion("bookname =", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotEqualTo(String value) {
            addCriterion("bookname <>", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThan(String value) {
            addCriterion("bookname >", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThanOrEqualTo(String value) {
            addCriterion("bookname >=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThan(String value) {
            addCriterion("bookname <", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThanOrEqualTo(String value) {
            addCriterion("bookname <=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLike(String value) {
            addCriterion("bookname like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotLike(String value) {
            addCriterion("bookname not like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameIn(List<String> values) {
            addCriterion("bookname in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotIn(List<String> values) {
            addCriterion("bookname not in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameBetween(String value1, String value2) {
            addCriterion("bookname between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotBetween(String value1, String value2) {
            addCriterion("bookname not between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andBookimageIsNull() {
            addCriterion("bookimage is null");
            return (Criteria) this;
        }

        public Criteria andBookimageIsNotNull() {
            addCriterion("bookimage is not null");
            return (Criteria) this;
        }

        public Criteria andBookimageEqualTo(String value) {
            addCriterion("bookimage =", value, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookimageNotEqualTo(String value) {
            addCriterion("bookimage <>", value, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookimageGreaterThan(String value) {
            addCriterion("bookimage >", value, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookimageGreaterThanOrEqualTo(String value) {
            addCriterion("bookimage >=", value, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookimageLessThan(String value) {
            addCriterion("bookimage <", value, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookimageLessThanOrEqualTo(String value) {
            addCriterion("bookimage <=", value, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookimageLike(String value) {
            addCriterion("bookimage like", value, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookimageNotLike(String value) {
            addCriterion("bookimage not like", value, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookimageIn(List<String> values) {
            addCriterion("bookimage in", values, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookimageNotIn(List<String> values) {
            addCriterion("bookimage not in", values, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookimageBetween(String value1, String value2) {
            addCriterion("bookimage between", value1, value2, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookimageNotBetween(String value1, String value2) {
            addCriterion("bookimage not between", value1, value2, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookpriceIsNull() {
            addCriterion("bookprice is null");
            return (Criteria) this;
        }

        public Criteria andBookpriceIsNotNull() {
            addCriterion("bookprice is not null");
            return (Criteria) this;
        }

        public Criteria andBookpriceEqualTo(Integer value) {
            addCriterion("bookprice =", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceNotEqualTo(Integer value) {
            addCriterion("bookprice <>", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceGreaterThan(Integer value) {
            addCriterion("bookprice >", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookprice >=", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceLessThan(Integer value) {
            addCriterion("bookprice <", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceLessThanOrEqualTo(Integer value) {
            addCriterion("bookprice <=", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceIn(List<Integer> values) {
            addCriterion("bookprice in", values, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceNotIn(List<Integer> values) {
            addCriterion("bookprice not in", values, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceBetween(Integer value1, Integer value2) {
            addCriterion("bookprice between", value1, value2, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("bookprice not between", value1, value2, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBooklinkIsNull() {
            addCriterion("booklink is null");
            return (Criteria) this;
        }

        public Criteria andBooklinkIsNotNull() {
            addCriterion("booklink is not null");
            return (Criteria) this;
        }

        public Criteria andBooklinkEqualTo(String value) {
            addCriterion("booklink =", value, "booklink");
            return (Criteria) this;
        }

        public Criteria andBooklinkNotEqualTo(String value) {
            addCriterion("booklink <>", value, "booklink");
            return (Criteria) this;
        }

        public Criteria andBooklinkGreaterThan(String value) {
            addCriterion("booklink >", value, "booklink");
            return (Criteria) this;
        }

        public Criteria andBooklinkGreaterThanOrEqualTo(String value) {
            addCriterion("booklink >=", value, "booklink");
            return (Criteria) this;
        }

        public Criteria andBooklinkLessThan(String value) {
            addCriterion("booklink <", value, "booklink");
            return (Criteria) this;
        }

        public Criteria andBooklinkLessThanOrEqualTo(String value) {
            addCriterion("booklink <=", value, "booklink");
            return (Criteria) this;
        }

        public Criteria andBooklinkLike(String value) {
            addCriterion("booklink like", value, "booklink");
            return (Criteria) this;
        }

        public Criteria andBooklinkNotLike(String value) {
            addCriterion("booklink not like", value, "booklink");
            return (Criteria) this;
        }

        public Criteria andBooklinkIn(List<String> values) {
            addCriterion("booklink in", values, "booklink");
            return (Criteria) this;
        }

        public Criteria andBooklinkNotIn(List<String> values) {
            addCriterion("booklink not in", values, "booklink");
            return (Criteria) this;
        }

        public Criteria andBooklinkBetween(String value1, String value2) {
            addCriterion("booklink between", value1, value2, "booklink");
            return (Criteria) this;
        }

        public Criteria andBooklinkNotBetween(String value1, String value2) {
            addCriterion("booklink not between", value1, value2, "booklink");
            return (Criteria) this;
        }

        public Criteria andBookinfoIsNull() {
            addCriterion("bookinfo is null");
            return (Criteria) this;
        }

        public Criteria andBookinfoIsNotNull() {
            addCriterion("bookinfo is not null");
            return (Criteria) this;
        }

        public Criteria andBookinfoEqualTo(String value) {
            addCriterion("bookinfo =", value, "bookinfo");
            return (Criteria) this;
        }

        public Criteria andBookinfoNotEqualTo(String value) {
            addCriterion("bookinfo <>", value, "bookinfo");
            return (Criteria) this;
        }

        public Criteria andBookinfoGreaterThan(String value) {
            addCriterion("bookinfo >", value, "bookinfo");
            return (Criteria) this;
        }

        public Criteria andBookinfoGreaterThanOrEqualTo(String value) {
            addCriterion("bookinfo >=", value, "bookinfo");
            return (Criteria) this;
        }

        public Criteria andBookinfoLessThan(String value) {
            addCriterion("bookinfo <", value, "bookinfo");
            return (Criteria) this;
        }

        public Criteria andBookinfoLessThanOrEqualTo(String value) {
            addCriterion("bookinfo <=", value, "bookinfo");
            return (Criteria) this;
        }

        public Criteria andBookinfoLike(String value) {
            addCriterion("bookinfo like", value, "bookinfo");
            return (Criteria) this;
        }

        public Criteria andBookinfoNotLike(String value) {
            addCriterion("bookinfo not like", value, "bookinfo");
            return (Criteria) this;
        }

        public Criteria andBookinfoIn(List<String> values) {
            addCriterion("bookinfo in", values, "bookinfo");
            return (Criteria) this;
        }

        public Criteria andBookinfoNotIn(List<String> values) {
            addCriterion("bookinfo not in", values, "bookinfo");
            return (Criteria) this;
        }

        public Criteria andBookinfoBetween(String value1, String value2) {
            addCriterion("bookinfo between", value1, value2, "bookinfo");
            return (Criteria) this;
        }

        public Criteria andBookinfoNotBetween(String value1, String value2) {
            addCriterion("bookinfo not between", value1, value2, "bookinfo");
            return (Criteria) this;
        }
    }

    /**
     */
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