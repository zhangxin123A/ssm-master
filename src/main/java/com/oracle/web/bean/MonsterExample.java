package com.oracle.web.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MonsterExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table monster
     *
     * @mbg.generated Tue Apr 23 11:11:09 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table monster
     *
     * @mbg.generated Tue Apr 23 11:11:09 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table monster
     *
     * @mbg.generated Tue Apr 23 11:11:09 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated Tue Apr 23 11:11:09 CST 2019
     */
    public MonsterExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated Tue Apr 23 11:11:09 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated Tue Apr 23 11:11:09 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated Tue Apr 23 11:11:09 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated Tue Apr 23 11:11:09 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated Tue Apr 23 11:11:09 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated Tue Apr 23 11:11:09 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated Tue Apr 23 11:11:09 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated Tue Apr 23 11:11:09 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated Tue Apr 23 11:11:09 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated Tue Apr 23 11:11:09 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table monster
     *
     * @mbg.generated Tue Apr 23 11:11:09 CST 2019
     */
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andMonsterIdIsNull() {
            addCriterion("MONSTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMonsterIdIsNotNull() {
            addCriterion("MONSTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMonsterIdEqualTo(Integer value) {
            addCriterion("MONSTER_ID =", value, "monsterId");
            return (Criteria) this;
        }

        public Criteria andMonsterIdNotEqualTo(Integer value) {
            addCriterion("MONSTER_ID <>", value, "monsterId");
            return (Criteria) this;
        }

        public Criteria andMonsterIdGreaterThan(Integer value) {
            addCriterion("MONSTER_ID >", value, "monsterId");
            return (Criteria) this;
        }

        public Criteria andMonsterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MONSTER_ID >=", value, "monsterId");
            return (Criteria) this;
        }

        public Criteria andMonsterIdLessThan(Integer value) {
            addCriterion("MONSTER_ID <", value, "monsterId");
            return (Criteria) this;
        }

        public Criteria andMonsterIdLessThanOrEqualTo(Integer value) {
            addCriterion("MONSTER_ID <=", value, "monsterId");
            return (Criteria) this;
        }

        public Criteria andMonsterIdIn(List<Integer> values) {
            addCriterion("MONSTER_ID in", values, "monsterId");
            return (Criteria) this;
        }

        public Criteria andMonsterIdNotIn(List<Integer> values) {
            addCriterion("MONSTER_ID not in", values, "monsterId");
            return (Criteria) this;
        }

        public Criteria andMonsterIdBetween(Integer value1, Integer value2) {
            addCriterion("MONSTER_ID between", value1, value2, "monsterId");
            return (Criteria) this;
        }

        public Criteria andMonsterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MONSTER_ID not between", value1, value2, "monsterId");
            return (Criteria) this;
        }

        public Criteria andMonsternameIsNull() {
            addCriterion("MONSTERNAME is null");
            return (Criteria) this;
        }

        public Criteria andMonsternameIsNotNull() {
            addCriterion("MONSTERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMonsternameEqualTo(String value) {
            addCriterion("MONSTERNAME =", value, "monstername");
            return (Criteria) this;
        }

        public Criteria andMonsternameNotEqualTo(String value) {
            addCriterion("MONSTERNAME <>", value, "monstername");
            return (Criteria) this;
        }

        public Criteria andMonsternameGreaterThan(String value) {
            addCriterion("MONSTERNAME >", value, "monstername");
            return (Criteria) this;
        }

        public Criteria andMonsternameGreaterThanOrEqualTo(String value) {
            addCriterion("MONSTERNAME >=", value, "monstername");
            return (Criteria) this;
        }

        public Criteria andMonsternameLessThan(String value) {
            addCriterion("MONSTERNAME <", value, "monstername");
            return (Criteria) this;
        }

        public Criteria andMonsternameLessThanOrEqualTo(String value) {
            addCriterion("MONSTERNAME <=", value, "monstername");
            return (Criteria) this;
        }

        public Criteria andMonsternameLike(String value) {
            addCriterion("MONSTERNAME like", value, "monstername");
            return (Criteria) this;
        }

        public Criteria andMonsternameNotLike(String value) {
            addCriterion("MONSTERNAME not like", value, "monstername");
            return (Criteria) this;
        }

        public Criteria andMonsternameIn(List<String> values) {
            addCriterion("MONSTERNAME in", values, "monstername");
            return (Criteria) this;
        }

        public Criteria andMonsternameNotIn(List<String> values) {
            addCriterion("MONSTERNAME not in", values, "monstername");
            return (Criteria) this;
        }

        public Criteria andMonsternameBetween(String value1, String value2) {
            addCriterion("MONSTERNAME between", value1, value2, "monstername");
            return (Criteria) this;
        }

        public Criteria andMonsternameNotBetween(String value1, String value2) {
            addCriterion("MONSTERNAME not between", value1, value2, "monstername");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andEntrydayIsNull() {
            addCriterion("ENTRYDAY is null");
            return (Criteria) this;
        }

        public Criteria andEntrydayIsNotNull() {
            addCriterion("ENTRYDAY is not null");
            return (Criteria) this;
        }

        public Criteria andEntrydayEqualTo(Date value) {
            addCriterionForJDBCDate("ENTRYDAY =", value, "entryday");
            return (Criteria) this;
        }

        public Criteria andEntrydayNotEqualTo(Date value) {
            addCriterionForJDBCDate("ENTRYDAY <>", value, "entryday");
            return (Criteria) this;
        }

        public Criteria andEntrydayGreaterThan(Date value) {
            addCriterionForJDBCDate("ENTRYDAY >", value, "entryday");
            return (Criteria) this;
        }

        public Criteria andEntrydayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENTRYDAY >=", value, "entryday");
            return (Criteria) this;
        }

        public Criteria andEntrydayLessThan(Date value) {
            addCriterionForJDBCDate("ENTRYDAY <", value, "entryday");
            return (Criteria) this;
        }

        public Criteria andEntrydayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENTRYDAY <=", value, "entryday");
            return (Criteria) this;
        }

        public Criteria andEntrydayIn(List<Date> values) {
            addCriterionForJDBCDate("ENTRYDAY in", values, "entryday");
            return (Criteria) this;
        }

        public Criteria andEntrydayNotIn(List<Date> values) {
            addCriterionForJDBCDate("ENTRYDAY not in", values, "entryday");
            return (Criteria) this;
        }

        public Criteria andEntrydayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENTRYDAY between", value1, value2, "entryday");
            return (Criteria) this;
        }

        public Criteria andEntrydayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENTRYDAY not between", value1, value2, "entryday");
            return (Criteria) this;
        }

        public Criteria andSchoolFkIsNull() {
            addCriterion("SCHOOL_FK is null");
            return (Criteria) this;
        }

        public Criteria andSchoolFkIsNotNull() {
            addCriterion("SCHOOL_FK is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolFkEqualTo(Integer value) {
            addCriterion("SCHOOL_FK =", value, "schoolFk");
            return (Criteria) this;
        }

        public Criteria andSchoolFkNotEqualTo(Integer value) {
            addCriterion("SCHOOL_FK <>", value, "schoolFk");
            return (Criteria) this;
        }

        public Criteria andSchoolFkGreaterThan(Integer value) {
            addCriterion("SCHOOL_FK >", value, "schoolFk");
            return (Criteria) this;
        }

        public Criteria andSchoolFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("SCHOOL_FK >=", value, "schoolFk");
            return (Criteria) this;
        }

        public Criteria andSchoolFkLessThan(Integer value) {
            addCriterion("SCHOOL_FK <", value, "schoolFk");
            return (Criteria) this;
        }

        public Criteria andSchoolFkLessThanOrEqualTo(Integer value) {
            addCriterion("SCHOOL_FK <=", value, "schoolFk");
            return (Criteria) this;
        }

        public Criteria andSchoolFkIn(List<Integer> values) {
            addCriterion("SCHOOL_FK in", values, "schoolFk");
            return (Criteria) this;
        }

        public Criteria andSchoolFkNotIn(List<Integer> values) {
            addCriterion("SCHOOL_FK not in", values, "schoolFk");
            return (Criteria) this;
        }

        public Criteria andSchoolFkBetween(Integer value1, Integer value2) {
            addCriterion("SCHOOL_FK between", value1, value2, "schoolFk");
            return (Criteria) this;
        }

        public Criteria andSchoolFkNotBetween(Integer value1, Integer value2) {
            addCriterion("SCHOOL_FK not between", value1, value2, "schoolFk");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table monster
     *
     * @mbg.generated do_not_delete_during_merge Tue Apr 23 11:11:09 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table monster
     *
     * @mbg.generated Tue Apr 23 11:11:09 CST 2019
     */
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