package com.ford.entity.user;

import java.util.ArrayList;
import java.util.List;

public class FordUserinfoExamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FordUserinfoExamExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("OPENID is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("OPENID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("OPENID =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("OPENID <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("OPENID >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("OPENID >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("OPENID <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("OPENID <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("OPENID like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("OPENID not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("OPENID in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("OPENID not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("OPENID between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("OPENID not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andQ1IsNull() {
            addCriterion("Q1 is null");
            return (Criteria) this;
        }

        public Criteria andQ1IsNotNull() {
            addCriterion("Q1 is not null");
            return (Criteria) this;
        }

        public Criteria andQ1EqualTo(String value) {
            addCriterion("Q1 =", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1NotEqualTo(String value) {
            addCriterion("Q1 <>", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1GreaterThan(String value) {
            addCriterion("Q1 >", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1GreaterThanOrEqualTo(String value) {
            addCriterion("Q1 >=", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1LessThan(String value) {
            addCriterion("Q1 <", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1LessThanOrEqualTo(String value) {
            addCriterion("Q1 <=", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1Like(String value) {
            addCriterion("Q1 like", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1NotLike(String value) {
            addCriterion("Q1 not like", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1In(List<String> values) {
            addCriterion("Q1 in", values, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1NotIn(List<String> values) {
            addCriterion("Q1 not in", values, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1Between(String value1, String value2) {
            addCriterion("Q1 between", value1, value2, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1NotBetween(String value1, String value2) {
            addCriterion("Q1 not between", value1, value2, "q1");
            return (Criteria) this;
        }

        public Criteria andQ2IsNull() {
            addCriterion("Q2 is null");
            return (Criteria) this;
        }

        public Criteria andQ2IsNotNull() {
            addCriterion("Q2 is not null");
            return (Criteria) this;
        }

        public Criteria andQ2EqualTo(String value) {
            addCriterion("Q2 =", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2NotEqualTo(String value) {
            addCriterion("Q2 <>", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2GreaterThan(String value) {
            addCriterion("Q2 >", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2GreaterThanOrEqualTo(String value) {
            addCriterion("Q2 >=", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2LessThan(String value) {
            addCriterion("Q2 <", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2LessThanOrEqualTo(String value) {
            addCriterion("Q2 <=", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2Like(String value) {
            addCriterion("Q2 like", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2NotLike(String value) {
            addCriterion("Q2 not like", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2In(List<String> values) {
            addCriterion("Q2 in", values, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2NotIn(List<String> values) {
            addCriterion("Q2 not in", values, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2Between(String value1, String value2) {
            addCriterion("Q2 between", value1, value2, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2NotBetween(String value1, String value2) {
            addCriterion("Q2 not between", value1, value2, "q2");
            return (Criteria) this;
        }

        public Criteria andQ3IsNull() {
            addCriterion("Q3 is null");
            return (Criteria) this;
        }

        public Criteria andQ3IsNotNull() {
            addCriterion("Q3 is not null");
            return (Criteria) this;
        }

        public Criteria andQ3EqualTo(String value) {
            addCriterion("Q3 =", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3NotEqualTo(String value) {
            addCriterion("Q3 <>", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3GreaterThan(String value) {
            addCriterion("Q3 >", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3GreaterThanOrEqualTo(String value) {
            addCriterion("Q3 >=", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3LessThan(String value) {
            addCriterion("Q3 <", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3LessThanOrEqualTo(String value) {
            addCriterion("Q3 <=", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3Like(String value) {
            addCriterion("Q3 like", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3NotLike(String value) {
            addCriterion("Q3 not like", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3In(List<String> values) {
            addCriterion("Q3 in", values, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3NotIn(List<String> values) {
            addCriterion("Q3 not in", values, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3Between(String value1, String value2) {
            addCriterion("Q3 between", value1, value2, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3NotBetween(String value1, String value2) {
            addCriterion("Q3 not between", value1, value2, "q3");
            return (Criteria) this;
        }

        public Criteria andQ4IsNull() {
            addCriterion("Q4 is null");
            return (Criteria) this;
        }

        public Criteria andQ4IsNotNull() {
            addCriterion("Q4 is not null");
            return (Criteria) this;
        }

        public Criteria andQ4EqualTo(String value) {
            addCriterion("Q4 =", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4NotEqualTo(String value) {
            addCriterion("Q4 <>", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4GreaterThan(String value) {
            addCriterion("Q4 >", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4GreaterThanOrEqualTo(String value) {
            addCriterion("Q4 >=", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4LessThan(String value) {
            addCriterion("Q4 <", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4LessThanOrEqualTo(String value) {
            addCriterion("Q4 <=", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4Like(String value) {
            addCriterion("Q4 like", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4NotLike(String value) {
            addCriterion("Q4 not like", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4In(List<String> values) {
            addCriterion("Q4 in", values, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4NotIn(List<String> values) {
            addCriterion("Q4 not in", values, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4Between(String value1, String value2) {
            addCriterion("Q4 between", value1, value2, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4NotBetween(String value1, String value2) {
            addCriterion("Q4 not between", value1, value2, "q4");
            return (Criteria) this;
        }

        public Criteria andQ5IsNull() {
            addCriterion("Q5 is null");
            return (Criteria) this;
        }

        public Criteria andQ5IsNotNull() {
            addCriterion("Q5 is not null");
            return (Criteria) this;
        }

        public Criteria andQ5EqualTo(String value) {
            addCriterion("Q5 =", value, "q5");
            return (Criteria) this;
        }

        public Criteria andQ5NotEqualTo(String value) {
            addCriterion("Q5 <>", value, "q5");
            return (Criteria) this;
        }

        public Criteria andQ5GreaterThan(String value) {
            addCriterion("Q5 >", value, "q5");
            return (Criteria) this;
        }

        public Criteria andQ5GreaterThanOrEqualTo(String value) {
            addCriterion("Q5 >=", value, "q5");
            return (Criteria) this;
        }

        public Criteria andQ5LessThan(String value) {
            addCriterion("Q5 <", value, "q5");
            return (Criteria) this;
        }

        public Criteria andQ5LessThanOrEqualTo(String value) {
            addCriterion("Q5 <=", value, "q5");
            return (Criteria) this;
        }

        public Criteria andQ5Like(String value) {
            addCriterion("Q5 like", value, "q5");
            return (Criteria) this;
        }

        public Criteria andQ5NotLike(String value) {
            addCriterion("Q5 not like", value, "q5");
            return (Criteria) this;
        }

        public Criteria andQ5In(List<String> values) {
            addCriterion("Q5 in", values, "q5");
            return (Criteria) this;
        }

        public Criteria andQ5NotIn(List<String> values) {
            addCriterion("Q5 not in", values, "q5");
            return (Criteria) this;
        }

        public Criteria andQ5Between(String value1, String value2) {
            addCriterion("Q5 between", value1, value2, "q5");
            return (Criteria) this;
        }

        public Criteria andQ5NotBetween(String value1, String value2) {
            addCriterion("Q5 not between", value1, value2, "q5");
            return (Criteria) this;
        }

        public Criteria andQ6IsNull() {
            addCriterion("Q6 is null");
            return (Criteria) this;
        }

        public Criteria andQ6IsNotNull() {
            addCriterion("Q6 is not null");
            return (Criteria) this;
        }

        public Criteria andQ6EqualTo(String value) {
            addCriterion("Q6 =", value, "q6");
            return (Criteria) this;
        }

        public Criteria andQ6NotEqualTo(String value) {
            addCriterion("Q6 <>", value, "q6");
            return (Criteria) this;
        }

        public Criteria andQ6GreaterThan(String value) {
            addCriterion("Q6 >", value, "q6");
            return (Criteria) this;
        }

        public Criteria andQ6GreaterThanOrEqualTo(String value) {
            addCriterion("Q6 >=", value, "q6");
            return (Criteria) this;
        }

        public Criteria andQ6LessThan(String value) {
            addCriterion("Q6 <", value, "q6");
            return (Criteria) this;
        }

        public Criteria andQ6LessThanOrEqualTo(String value) {
            addCriterion("Q6 <=", value, "q6");
            return (Criteria) this;
        }

        public Criteria andQ6Like(String value) {
            addCriterion("Q6 like", value, "q6");
            return (Criteria) this;
        }

        public Criteria andQ6NotLike(String value) {
            addCriterion("Q6 not like", value, "q6");
            return (Criteria) this;
        }

        public Criteria andQ6In(List<String> values) {
            addCriterion("Q6 in", values, "q6");
            return (Criteria) this;
        }

        public Criteria andQ6NotIn(List<String> values) {
            addCriterion("Q6 not in", values, "q6");
            return (Criteria) this;
        }

        public Criteria andQ6Between(String value1, String value2) {
            addCriterion("Q6 between", value1, value2, "q6");
            return (Criteria) this;
        }

        public Criteria andQ6NotBetween(String value1, String value2) {
            addCriterion("Q6 not between", value1, value2, "q6");
            return (Criteria) this;
        }

        public Criteria andQ7IsNull() {
            addCriterion("Q7 is null");
            return (Criteria) this;
        }

        public Criteria andQ7IsNotNull() {
            addCriterion("Q7 is not null");
            return (Criteria) this;
        }

        public Criteria andQ7EqualTo(String value) {
            addCriterion("Q7 =", value, "q7");
            return (Criteria) this;
        }

        public Criteria andQ7NotEqualTo(String value) {
            addCriterion("Q7 <>", value, "q7");
            return (Criteria) this;
        }

        public Criteria andQ7GreaterThan(String value) {
            addCriterion("Q7 >", value, "q7");
            return (Criteria) this;
        }

        public Criteria andQ7GreaterThanOrEqualTo(String value) {
            addCriterion("Q7 >=", value, "q7");
            return (Criteria) this;
        }

        public Criteria andQ7LessThan(String value) {
            addCriterion("Q7 <", value, "q7");
            return (Criteria) this;
        }

        public Criteria andQ7LessThanOrEqualTo(String value) {
            addCriterion("Q7 <=", value, "q7");
            return (Criteria) this;
        }

        public Criteria andQ7Like(String value) {
            addCriterion("Q7 like", value, "q7");
            return (Criteria) this;
        }

        public Criteria andQ7NotLike(String value) {
            addCriterion("Q7 not like", value, "q7");
            return (Criteria) this;
        }

        public Criteria andQ7In(List<String> values) {
            addCriterion("Q7 in", values, "q7");
            return (Criteria) this;
        }

        public Criteria andQ7NotIn(List<String> values) {
            addCriterion("Q7 not in", values, "q7");
            return (Criteria) this;
        }

        public Criteria andQ7Between(String value1, String value2) {
            addCriterion("Q7 between", value1, value2, "q7");
            return (Criteria) this;
        }

        public Criteria andQ7NotBetween(String value1, String value2) {
            addCriterion("Q7 not between", value1, value2, "q7");
            return (Criteria) this;
        }

        public Criteria andQ8IsNull() {
            addCriterion("Q8 is null");
            return (Criteria) this;
        }

        public Criteria andQ8IsNotNull() {
            addCriterion("Q8 is not null");
            return (Criteria) this;
        }

        public Criteria andQ8EqualTo(String value) {
            addCriterion("Q8 =", value, "q8");
            return (Criteria) this;
        }

        public Criteria andQ8NotEqualTo(String value) {
            addCriterion("Q8 <>", value, "q8");
            return (Criteria) this;
        }

        public Criteria andQ8GreaterThan(String value) {
            addCriterion("Q8 >", value, "q8");
            return (Criteria) this;
        }

        public Criteria andQ8GreaterThanOrEqualTo(String value) {
            addCriterion("Q8 >=", value, "q8");
            return (Criteria) this;
        }

        public Criteria andQ8LessThan(String value) {
            addCriterion("Q8 <", value, "q8");
            return (Criteria) this;
        }

        public Criteria andQ8LessThanOrEqualTo(String value) {
            addCriterion("Q8 <=", value, "q8");
            return (Criteria) this;
        }

        public Criteria andQ8Like(String value) {
            addCriterion("Q8 like", value, "q8");
            return (Criteria) this;
        }

        public Criteria andQ8NotLike(String value) {
            addCriterion("Q8 not like", value, "q8");
            return (Criteria) this;
        }

        public Criteria andQ8In(List<String> values) {
            addCriterion("Q8 in", values, "q8");
            return (Criteria) this;
        }

        public Criteria andQ8NotIn(List<String> values) {
            addCriterion("Q8 not in", values, "q8");
            return (Criteria) this;
        }

        public Criteria andQ8Between(String value1, String value2) {
            addCriterion("Q8 between", value1, value2, "q8");
            return (Criteria) this;
        }

        public Criteria andQ8NotBetween(String value1, String value2) {
            addCriterion("Q8 not between", value1, value2, "q8");
            return (Criteria) this;
        }

        public Criteria andQ9IsNull() {
            addCriterion("Q9 is null");
            return (Criteria) this;
        }

        public Criteria andQ9IsNotNull() {
            addCriterion("Q9 is not null");
            return (Criteria) this;
        }

        public Criteria andQ9EqualTo(String value) {
            addCriterion("Q9 =", value, "q9");
            return (Criteria) this;
        }

        public Criteria andQ9NotEqualTo(String value) {
            addCriterion("Q9 <>", value, "q9");
            return (Criteria) this;
        }

        public Criteria andQ9GreaterThan(String value) {
            addCriterion("Q9 >", value, "q9");
            return (Criteria) this;
        }

        public Criteria andQ9GreaterThanOrEqualTo(String value) {
            addCriterion("Q9 >=", value, "q9");
            return (Criteria) this;
        }

        public Criteria andQ9LessThan(String value) {
            addCriterion("Q9 <", value, "q9");
            return (Criteria) this;
        }

        public Criteria andQ9LessThanOrEqualTo(String value) {
            addCriterion("Q9 <=", value, "q9");
            return (Criteria) this;
        }

        public Criteria andQ9Like(String value) {
            addCriterion("Q9 like", value, "q9");
            return (Criteria) this;
        }

        public Criteria andQ9NotLike(String value) {
            addCriterion("Q9 not like", value, "q9");
            return (Criteria) this;
        }

        public Criteria andQ9In(List<String> values) {
            addCriterion("Q9 in", values, "q9");
            return (Criteria) this;
        }

        public Criteria andQ9NotIn(List<String> values) {
            addCriterion("Q9 not in", values, "q9");
            return (Criteria) this;
        }

        public Criteria andQ9Between(String value1, String value2) {
            addCriterion("Q9 between", value1, value2, "q9");
            return (Criteria) this;
        }

        public Criteria andQ9NotBetween(String value1, String value2) {
            addCriterion("Q9 not between", value1, value2, "q9");
            return (Criteria) this;
        }

        public Criteria andQ10IsNull() {
            addCriterion("Q10 is null");
            return (Criteria) this;
        }

        public Criteria andQ10IsNotNull() {
            addCriterion("Q10 is not null");
            return (Criteria) this;
        }

        public Criteria andQ10EqualTo(String value) {
            addCriterion("Q10 =", value, "q10");
            return (Criteria) this;
        }

        public Criteria andQ10NotEqualTo(String value) {
            addCriterion("Q10 <>", value, "q10");
            return (Criteria) this;
        }

        public Criteria andQ10GreaterThan(String value) {
            addCriterion("Q10 >", value, "q10");
            return (Criteria) this;
        }

        public Criteria andQ10GreaterThanOrEqualTo(String value) {
            addCriterion("Q10 >=", value, "q10");
            return (Criteria) this;
        }

        public Criteria andQ10LessThan(String value) {
            addCriterion("Q10 <", value, "q10");
            return (Criteria) this;
        }

        public Criteria andQ10LessThanOrEqualTo(String value) {
            addCriterion("Q10 <=", value, "q10");
            return (Criteria) this;
        }

        public Criteria andQ10Like(String value) {
            addCriterion("Q10 like", value, "q10");
            return (Criteria) this;
        }

        public Criteria andQ10NotLike(String value) {
            addCriterion("Q10 not like", value, "q10");
            return (Criteria) this;
        }

        public Criteria andQ10In(List<String> values) {
            addCriterion("Q10 in", values, "q10");
            return (Criteria) this;
        }

        public Criteria andQ10NotIn(List<String> values) {
            addCriterion("Q10 not in", values, "q10");
            return (Criteria) this;
        }

        public Criteria andQ10Between(String value1, String value2) {
            addCriterion("Q10 between", value1, value2, "q10");
            return (Criteria) this;
        }

        public Criteria andQ10NotBetween(String value1, String value2) {
            addCriterion("Q10 not between", value1, value2, "q10");
            return (Criteria) this;
        }

        public Criteria andQ11IsNull() {
            addCriterion("Q11 is null");
            return (Criteria) this;
        }

        public Criteria andQ11IsNotNull() {
            addCriterion("Q11 is not null");
            return (Criteria) this;
        }

        public Criteria andQ11EqualTo(String value) {
            addCriterion("Q11 =", value, "q11");
            return (Criteria) this;
        }

        public Criteria andQ11NotEqualTo(String value) {
            addCriterion("Q11 <>", value, "q11");
            return (Criteria) this;
        }

        public Criteria andQ11GreaterThan(String value) {
            addCriterion("Q11 >", value, "q11");
            return (Criteria) this;
        }

        public Criteria andQ11GreaterThanOrEqualTo(String value) {
            addCriterion("Q11 >=", value, "q11");
            return (Criteria) this;
        }

        public Criteria andQ11LessThan(String value) {
            addCriterion("Q11 <", value, "q11");
            return (Criteria) this;
        }

        public Criteria andQ11LessThanOrEqualTo(String value) {
            addCriterion("Q11 <=", value, "q11");
            return (Criteria) this;
        }

        public Criteria andQ11Like(String value) {
            addCriterion("Q11 like", value, "q11");
            return (Criteria) this;
        }

        public Criteria andQ11NotLike(String value) {
            addCriterion("Q11 not like", value, "q11");
            return (Criteria) this;
        }

        public Criteria andQ11In(List<String> values) {
            addCriterion("Q11 in", values, "q11");
            return (Criteria) this;
        }

        public Criteria andQ11NotIn(List<String> values) {
            addCriterion("Q11 not in", values, "q11");
            return (Criteria) this;
        }

        public Criteria andQ11Between(String value1, String value2) {
            addCriterion("Q11 between", value1, value2, "q11");
            return (Criteria) this;
        }

        public Criteria andQ11NotBetween(String value1, String value2) {
            addCriterion("Q11 not between", value1, value2, "q11");
            return (Criteria) this;
        }

        public Criteria andQ12IsNull() {
            addCriterion("Q12 is null");
            return (Criteria) this;
        }

        public Criteria andQ12IsNotNull() {
            addCriterion("Q12 is not null");
            return (Criteria) this;
        }

        public Criteria andQ12EqualTo(String value) {
            addCriterion("Q12 =", value, "q12");
            return (Criteria) this;
        }

        public Criteria andQ12NotEqualTo(String value) {
            addCriterion("Q12 <>", value, "q12");
            return (Criteria) this;
        }

        public Criteria andQ12GreaterThan(String value) {
            addCriterion("Q12 >", value, "q12");
            return (Criteria) this;
        }

        public Criteria andQ12GreaterThanOrEqualTo(String value) {
            addCriterion("Q12 >=", value, "q12");
            return (Criteria) this;
        }

        public Criteria andQ12LessThan(String value) {
            addCriterion("Q12 <", value, "q12");
            return (Criteria) this;
        }

        public Criteria andQ12LessThanOrEqualTo(String value) {
            addCriterion("Q12 <=", value, "q12");
            return (Criteria) this;
        }

        public Criteria andQ12Like(String value) {
            addCriterion("Q12 like", value, "q12");
            return (Criteria) this;
        }

        public Criteria andQ12NotLike(String value) {
            addCriterion("Q12 not like", value, "q12");
            return (Criteria) this;
        }

        public Criteria andQ12In(List<String> values) {
            addCriterion("Q12 in", values, "q12");
            return (Criteria) this;
        }

        public Criteria andQ12NotIn(List<String> values) {
            addCriterion("Q12 not in", values, "q12");
            return (Criteria) this;
        }

        public Criteria andQ12Between(String value1, String value2) {
            addCriterion("Q12 between", value1, value2, "q12");
            return (Criteria) this;
        }

        public Criteria andQ12NotBetween(String value1, String value2) {
            addCriterion("Q12 not between", value1, value2, "q12");
            return (Criteria) this;
        }

        public Criteria andQ13IsNull() {
            addCriterion("Q13 is null");
            return (Criteria) this;
        }

        public Criteria andQ13IsNotNull() {
            addCriterion("Q13 is not null");
            return (Criteria) this;
        }

        public Criteria andQ13EqualTo(String value) {
            addCriterion("Q13 =", value, "q13");
            return (Criteria) this;
        }

        public Criteria andQ13NotEqualTo(String value) {
            addCriterion("Q13 <>", value, "q13");
            return (Criteria) this;
        }

        public Criteria andQ13GreaterThan(String value) {
            addCriterion("Q13 >", value, "q13");
            return (Criteria) this;
        }

        public Criteria andQ13GreaterThanOrEqualTo(String value) {
            addCriterion("Q13 >=", value, "q13");
            return (Criteria) this;
        }

        public Criteria andQ13LessThan(String value) {
            addCriterion("Q13 <", value, "q13");
            return (Criteria) this;
        }

        public Criteria andQ13LessThanOrEqualTo(String value) {
            addCriterion("Q13 <=", value, "q13");
            return (Criteria) this;
        }

        public Criteria andQ13Like(String value) {
            addCriterion("Q13 like", value, "q13");
            return (Criteria) this;
        }

        public Criteria andQ13NotLike(String value) {
            addCriterion("Q13 not like", value, "q13");
            return (Criteria) this;
        }

        public Criteria andQ13In(List<String> values) {
            addCriterion("Q13 in", values, "q13");
            return (Criteria) this;
        }

        public Criteria andQ13NotIn(List<String> values) {
            addCriterion("Q13 not in", values, "q13");
            return (Criteria) this;
        }

        public Criteria andQ13Between(String value1, String value2) {
            addCriterion("Q13 between", value1, value2, "q13");
            return (Criteria) this;
        }

        public Criteria andQ13NotBetween(String value1, String value2) {
            addCriterion("Q13 not between", value1, value2, "q13");
            return (Criteria) this;
        }

        public Criteria andQ14IsNull() {
            addCriterion("Q14 is null");
            return (Criteria) this;
        }

        public Criteria andQ14IsNotNull() {
            addCriterion("Q14 is not null");
            return (Criteria) this;
        }

        public Criteria andQ14EqualTo(String value) {
            addCriterion("Q14 =", value, "q14");
            return (Criteria) this;
        }

        public Criteria andQ14NotEqualTo(String value) {
            addCriterion("Q14 <>", value, "q14");
            return (Criteria) this;
        }

        public Criteria andQ14GreaterThan(String value) {
            addCriterion("Q14 >", value, "q14");
            return (Criteria) this;
        }

        public Criteria andQ14GreaterThanOrEqualTo(String value) {
            addCriterion("Q14 >=", value, "q14");
            return (Criteria) this;
        }

        public Criteria andQ14LessThan(String value) {
            addCriterion("Q14 <", value, "q14");
            return (Criteria) this;
        }

        public Criteria andQ14LessThanOrEqualTo(String value) {
            addCriterion("Q14 <=", value, "q14");
            return (Criteria) this;
        }

        public Criteria andQ14Like(String value) {
            addCriterion("Q14 like", value, "q14");
            return (Criteria) this;
        }

        public Criteria andQ14NotLike(String value) {
            addCriterion("Q14 not like", value, "q14");
            return (Criteria) this;
        }

        public Criteria andQ14In(List<String> values) {
            addCriterion("Q14 in", values, "q14");
            return (Criteria) this;
        }

        public Criteria andQ14NotIn(List<String> values) {
            addCriterion("Q14 not in", values, "q14");
            return (Criteria) this;
        }

        public Criteria andQ14Between(String value1, String value2) {
            addCriterion("Q14 between", value1, value2, "q14");
            return (Criteria) this;
        }

        public Criteria andQ14NotBetween(String value1, String value2) {
            addCriterion("Q14 not between", value1, value2, "q14");
            return (Criteria) this;
        }

        public Criteria andQ15IsNull() {
            addCriterion("Q15 is null");
            return (Criteria) this;
        }

        public Criteria andQ15IsNotNull() {
            addCriterion("Q15 is not null");
            return (Criteria) this;
        }

        public Criteria andQ15EqualTo(String value) {
            addCriterion("Q15 =", value, "q15");
            return (Criteria) this;
        }

        public Criteria andQ15NotEqualTo(String value) {
            addCriterion("Q15 <>", value, "q15");
            return (Criteria) this;
        }

        public Criteria andQ15GreaterThan(String value) {
            addCriterion("Q15 >", value, "q15");
            return (Criteria) this;
        }

        public Criteria andQ15GreaterThanOrEqualTo(String value) {
            addCriterion("Q15 >=", value, "q15");
            return (Criteria) this;
        }

        public Criteria andQ15LessThan(String value) {
            addCriterion("Q15 <", value, "q15");
            return (Criteria) this;
        }

        public Criteria andQ15LessThanOrEqualTo(String value) {
            addCriterion("Q15 <=", value, "q15");
            return (Criteria) this;
        }

        public Criteria andQ15Like(String value) {
            addCriterion("Q15 like", value, "q15");
            return (Criteria) this;
        }

        public Criteria andQ15NotLike(String value) {
            addCriterion("Q15 not like", value, "q15");
            return (Criteria) this;
        }

        public Criteria andQ15In(List<String> values) {
            addCriterion("Q15 in", values, "q15");
            return (Criteria) this;
        }

        public Criteria andQ15NotIn(List<String> values) {
            addCriterion("Q15 not in", values, "q15");
            return (Criteria) this;
        }

        public Criteria andQ15Between(String value1, String value2) {
            addCriterion("Q15 between", value1, value2, "q15");
            return (Criteria) this;
        }

        public Criteria andQ15NotBetween(String value1, String value2) {
            addCriterion("Q15 not between", value1, value2, "q15");
            return (Criteria) this;
        }

        public Criteria andQ16IsNull() {
            addCriterion("Q16 is null");
            return (Criteria) this;
        }

        public Criteria andQ16IsNotNull() {
            addCriterion("Q16 is not null");
            return (Criteria) this;
        }

        public Criteria andQ16EqualTo(String value) {
            addCriterion("Q16 =", value, "q16");
            return (Criteria) this;
        }

        public Criteria andQ16NotEqualTo(String value) {
            addCriterion("Q16 <>", value, "q16");
            return (Criteria) this;
        }

        public Criteria andQ16GreaterThan(String value) {
            addCriterion("Q16 >", value, "q16");
            return (Criteria) this;
        }

        public Criteria andQ16GreaterThanOrEqualTo(String value) {
            addCriterion("Q16 >=", value, "q16");
            return (Criteria) this;
        }

        public Criteria andQ16LessThan(String value) {
            addCriterion("Q16 <", value, "q16");
            return (Criteria) this;
        }

        public Criteria andQ16LessThanOrEqualTo(String value) {
            addCriterion("Q16 <=", value, "q16");
            return (Criteria) this;
        }

        public Criteria andQ16Like(String value) {
            addCriterion("Q16 like", value, "q16");
            return (Criteria) this;
        }

        public Criteria andQ16NotLike(String value) {
            addCriterion("Q16 not like", value, "q16");
            return (Criteria) this;
        }

        public Criteria andQ16In(List<String> values) {
            addCriterion("Q16 in", values, "q16");
            return (Criteria) this;
        }

        public Criteria andQ16NotIn(List<String> values) {
            addCriterion("Q16 not in", values, "q16");
            return (Criteria) this;
        }

        public Criteria andQ16Between(String value1, String value2) {
            addCriterion("Q16 between", value1, value2, "q16");
            return (Criteria) this;
        }

        public Criteria andQ16NotBetween(String value1, String value2) {
            addCriterion("Q16 not between", value1, value2, "q16");
            return (Criteria) this;
        }

        public Criteria andQ17IsNull() {
            addCriterion("Q17 is null");
            return (Criteria) this;
        }

        public Criteria andQ17IsNotNull() {
            addCriterion("Q17 is not null");
            return (Criteria) this;
        }

        public Criteria andQ17EqualTo(String value) {
            addCriterion("Q17 =", value, "q17");
            return (Criteria) this;
        }

        public Criteria andQ17NotEqualTo(String value) {
            addCriterion("Q17 <>", value, "q17");
            return (Criteria) this;
        }

        public Criteria andQ17GreaterThan(String value) {
            addCriterion("Q17 >", value, "q17");
            return (Criteria) this;
        }

        public Criteria andQ17GreaterThanOrEqualTo(String value) {
            addCriterion("Q17 >=", value, "q17");
            return (Criteria) this;
        }

        public Criteria andQ17LessThan(String value) {
            addCriterion("Q17 <", value, "q17");
            return (Criteria) this;
        }

        public Criteria andQ17LessThanOrEqualTo(String value) {
            addCriterion("Q17 <=", value, "q17");
            return (Criteria) this;
        }

        public Criteria andQ17Like(String value) {
            addCriterion("Q17 like", value, "q17");
            return (Criteria) this;
        }

        public Criteria andQ17NotLike(String value) {
            addCriterion("Q17 not like", value, "q17");
            return (Criteria) this;
        }

        public Criteria andQ17In(List<String> values) {
            addCriterion("Q17 in", values, "q17");
            return (Criteria) this;
        }

        public Criteria andQ17NotIn(List<String> values) {
            addCriterion("Q17 not in", values, "q17");
            return (Criteria) this;
        }

        public Criteria andQ17Between(String value1, String value2) {
            addCriterion("Q17 between", value1, value2, "q17");
            return (Criteria) this;
        }

        public Criteria andQ17NotBetween(String value1, String value2) {
            addCriterion("Q17 not between", value1, value2, "q17");
            return (Criteria) this;
        }

        public Criteria andQ18IsNull() {
            addCriterion("Q18 is null");
            return (Criteria) this;
        }

        public Criteria andQ18IsNotNull() {
            addCriterion("Q18 is not null");
            return (Criteria) this;
        }

        public Criteria andQ18EqualTo(String value) {
            addCriterion("Q18 =", value, "q18");
            return (Criteria) this;
        }

        public Criteria andQ18NotEqualTo(String value) {
            addCriterion("Q18 <>", value, "q18");
            return (Criteria) this;
        }

        public Criteria andQ18GreaterThan(String value) {
            addCriterion("Q18 >", value, "q18");
            return (Criteria) this;
        }

        public Criteria andQ18GreaterThanOrEqualTo(String value) {
            addCriterion("Q18 >=", value, "q18");
            return (Criteria) this;
        }

        public Criteria andQ18LessThan(String value) {
            addCriterion("Q18 <", value, "q18");
            return (Criteria) this;
        }

        public Criteria andQ18LessThanOrEqualTo(String value) {
            addCriterion("Q18 <=", value, "q18");
            return (Criteria) this;
        }

        public Criteria andQ18Like(String value) {
            addCriterion("Q18 like", value, "q18");
            return (Criteria) this;
        }

        public Criteria andQ18NotLike(String value) {
            addCriterion("Q18 not like", value, "q18");
            return (Criteria) this;
        }

        public Criteria andQ18In(List<String> values) {
            addCriterion("Q18 in", values, "q18");
            return (Criteria) this;
        }

        public Criteria andQ18NotIn(List<String> values) {
            addCriterion("Q18 not in", values, "q18");
            return (Criteria) this;
        }

        public Criteria andQ18Between(String value1, String value2) {
            addCriterion("Q18 between", value1, value2, "q18");
            return (Criteria) this;
        }

        public Criteria andQ18NotBetween(String value1, String value2) {
            addCriterion("Q18 not between", value1, value2, "q18");
            return (Criteria) this;
        }

        public Criteria andQ19IsNull() {
            addCriterion("Q19 is null");
            return (Criteria) this;
        }

        public Criteria andQ19IsNotNull() {
            addCriterion("Q19 is not null");
            return (Criteria) this;
        }

        public Criteria andQ19EqualTo(String value) {
            addCriterion("Q19 =", value, "q19");
            return (Criteria) this;
        }

        public Criteria andQ19NotEqualTo(String value) {
            addCriterion("Q19 <>", value, "q19");
            return (Criteria) this;
        }

        public Criteria andQ19GreaterThan(String value) {
            addCriterion("Q19 >", value, "q19");
            return (Criteria) this;
        }

        public Criteria andQ19GreaterThanOrEqualTo(String value) {
            addCriterion("Q19 >=", value, "q19");
            return (Criteria) this;
        }

        public Criteria andQ19LessThan(String value) {
            addCriterion("Q19 <", value, "q19");
            return (Criteria) this;
        }

        public Criteria andQ19LessThanOrEqualTo(String value) {
            addCriterion("Q19 <=", value, "q19");
            return (Criteria) this;
        }

        public Criteria andQ19Like(String value) {
            addCriterion("Q19 like", value, "q19");
            return (Criteria) this;
        }

        public Criteria andQ19NotLike(String value) {
            addCriterion("Q19 not like", value, "q19");
            return (Criteria) this;
        }

        public Criteria andQ19In(List<String> values) {
            addCriterion("Q19 in", values, "q19");
            return (Criteria) this;
        }

        public Criteria andQ19NotIn(List<String> values) {
            addCriterion("Q19 not in", values, "q19");
            return (Criteria) this;
        }

        public Criteria andQ19Between(String value1, String value2) {
            addCriterion("Q19 between", value1, value2, "q19");
            return (Criteria) this;
        }

        public Criteria andQ19NotBetween(String value1, String value2) {
            addCriterion("Q19 not between", value1, value2, "q19");
            return (Criteria) this;
        }

        public Criteria andQ20IsNull() {
            addCriterion("Q20 is null");
            return (Criteria) this;
        }

        public Criteria andQ20IsNotNull() {
            addCriterion("Q20 is not null");
            return (Criteria) this;
        }

        public Criteria andQ20EqualTo(String value) {
            addCriterion("Q20 =", value, "q20");
            return (Criteria) this;
        }

        public Criteria andQ20NotEqualTo(String value) {
            addCriterion("Q20 <>", value, "q20");
            return (Criteria) this;
        }

        public Criteria andQ20GreaterThan(String value) {
            addCriterion("Q20 >", value, "q20");
            return (Criteria) this;
        }

        public Criteria andQ20GreaterThanOrEqualTo(String value) {
            addCriterion("Q20 >=", value, "q20");
            return (Criteria) this;
        }

        public Criteria andQ20LessThan(String value) {
            addCriterion("Q20 <", value, "q20");
            return (Criteria) this;
        }

        public Criteria andQ20LessThanOrEqualTo(String value) {
            addCriterion("Q20 <=", value, "q20");
            return (Criteria) this;
        }

        public Criteria andQ20Like(String value) {
            addCriterion("Q20 like", value, "q20");
            return (Criteria) this;
        }

        public Criteria andQ20NotLike(String value) {
            addCriterion("Q20 not like", value, "q20");
            return (Criteria) this;
        }

        public Criteria andQ20In(List<String> values) {
            addCriterion("Q20 in", values, "q20");
            return (Criteria) this;
        }

        public Criteria andQ20NotIn(List<String> values) {
            addCriterion("Q20 not in", values, "q20");
            return (Criteria) this;
        }

        public Criteria andQ20Between(String value1, String value2) {
            addCriterion("Q20 between", value1, value2, "q20");
            return (Criteria) this;
        }

        public Criteria andQ20NotBetween(String value1, String value2) {
            addCriterion("Q20 not between", value1, value2, "q20");
            return (Criteria) this;
        }

        public Criteria andQ21IsNull() {
            addCriterion("Q21 is null");
            return (Criteria) this;
        }

        public Criteria andQ21IsNotNull() {
            addCriterion("Q21 is not null");
            return (Criteria) this;
        }

        public Criteria andQ21EqualTo(String value) {
            addCriterion("Q21 =", value, "q21");
            return (Criteria) this;
        }

        public Criteria andQ21NotEqualTo(String value) {
            addCriterion("Q21 <>", value, "q21");
            return (Criteria) this;
        }

        public Criteria andQ21GreaterThan(String value) {
            addCriterion("Q21 >", value, "q21");
            return (Criteria) this;
        }

        public Criteria andQ21GreaterThanOrEqualTo(String value) {
            addCriterion("Q21 >=", value, "q21");
            return (Criteria) this;
        }

        public Criteria andQ21LessThan(String value) {
            addCriterion("Q21 <", value, "q21");
            return (Criteria) this;
        }

        public Criteria andQ21LessThanOrEqualTo(String value) {
            addCriterion("Q21 <=", value, "q21");
            return (Criteria) this;
        }

        public Criteria andQ21Like(String value) {
            addCriterion("Q21 like", value, "q21");
            return (Criteria) this;
        }

        public Criteria andQ21NotLike(String value) {
            addCriterion("Q21 not like", value, "q21");
            return (Criteria) this;
        }

        public Criteria andQ21In(List<String> values) {
            addCriterion("Q21 in", values, "q21");
            return (Criteria) this;
        }

        public Criteria andQ21NotIn(List<String> values) {
            addCriterion("Q21 not in", values, "q21");
            return (Criteria) this;
        }

        public Criteria andQ21Between(String value1, String value2) {
            addCriterion("Q21 between", value1, value2, "q21");
            return (Criteria) this;
        }

        public Criteria andQ21NotBetween(String value1, String value2) {
            addCriterion("Q21 not between", value1, value2, "q21");
            return (Criteria) this;
        }

        public Criteria andQ22IsNull() {
            addCriterion("Q22 is null");
            return (Criteria) this;
        }

        public Criteria andQ22IsNotNull() {
            addCriterion("Q22 is not null");
            return (Criteria) this;
        }

        public Criteria andQ22EqualTo(String value) {
            addCriterion("Q22 =", value, "q22");
            return (Criteria) this;
        }

        public Criteria andQ22NotEqualTo(String value) {
            addCriterion("Q22 <>", value, "q22");
            return (Criteria) this;
        }

        public Criteria andQ22GreaterThan(String value) {
            addCriterion("Q22 >", value, "q22");
            return (Criteria) this;
        }

        public Criteria andQ22GreaterThanOrEqualTo(String value) {
            addCriterion("Q22 >=", value, "q22");
            return (Criteria) this;
        }

        public Criteria andQ22LessThan(String value) {
            addCriterion("Q22 <", value, "q22");
            return (Criteria) this;
        }

        public Criteria andQ22LessThanOrEqualTo(String value) {
            addCriterion("Q22 <=", value, "q22");
            return (Criteria) this;
        }

        public Criteria andQ22Like(String value) {
            addCriterion("Q22 like", value, "q22");
            return (Criteria) this;
        }

        public Criteria andQ22NotLike(String value) {
            addCriterion("Q22 not like", value, "q22");
            return (Criteria) this;
        }

        public Criteria andQ22In(List<String> values) {
            addCriterion("Q22 in", values, "q22");
            return (Criteria) this;
        }

        public Criteria andQ22NotIn(List<String> values) {
            addCriterion("Q22 not in", values, "q22");
            return (Criteria) this;
        }

        public Criteria andQ22Between(String value1, String value2) {
            addCriterion("Q22 between", value1, value2, "q22");
            return (Criteria) this;
        }

        public Criteria andQ22NotBetween(String value1, String value2) {
            addCriterion("Q22 not between", value1, value2, "q22");
            return (Criteria) this;
        }

        public Criteria andQ23IsNull() {
            addCriterion("Q23 is null");
            return (Criteria) this;
        }

        public Criteria andQ23IsNotNull() {
            addCriterion("Q23 is not null");
            return (Criteria) this;
        }

        public Criteria andQ23EqualTo(String value) {
            addCriterion("Q23 =", value, "q23");
            return (Criteria) this;
        }

        public Criteria andQ23NotEqualTo(String value) {
            addCriterion("Q23 <>", value, "q23");
            return (Criteria) this;
        }

        public Criteria andQ23GreaterThan(String value) {
            addCriterion("Q23 >", value, "q23");
            return (Criteria) this;
        }

        public Criteria andQ23GreaterThanOrEqualTo(String value) {
            addCriterion("Q23 >=", value, "q23");
            return (Criteria) this;
        }

        public Criteria andQ23LessThan(String value) {
            addCriterion("Q23 <", value, "q23");
            return (Criteria) this;
        }

        public Criteria andQ23LessThanOrEqualTo(String value) {
            addCriterion("Q23 <=", value, "q23");
            return (Criteria) this;
        }

        public Criteria andQ23Like(String value) {
            addCriterion("Q23 like", value, "q23");
            return (Criteria) this;
        }

        public Criteria andQ23NotLike(String value) {
            addCriterion("Q23 not like", value, "q23");
            return (Criteria) this;
        }

        public Criteria andQ23In(List<String> values) {
            addCriterion("Q23 in", values, "q23");
            return (Criteria) this;
        }

        public Criteria andQ23NotIn(List<String> values) {
            addCriterion("Q23 not in", values, "q23");
            return (Criteria) this;
        }

        public Criteria andQ23Between(String value1, String value2) {
            addCriterion("Q23 between", value1, value2, "q23");
            return (Criteria) this;
        }

        public Criteria andQ23NotBetween(String value1, String value2) {
            addCriterion("Q23 not between", value1, value2, "q23");
            return (Criteria) this;
        }

        public Criteria andQ24IsNull() {
            addCriterion("Q24 is null");
            return (Criteria) this;
        }

        public Criteria andQ24IsNotNull() {
            addCriterion("Q24 is not null");
            return (Criteria) this;
        }

        public Criteria andQ24EqualTo(String value) {
            addCriterion("Q24 =", value, "q24");
            return (Criteria) this;
        }

        public Criteria andQ24NotEqualTo(String value) {
            addCriterion("Q24 <>", value, "q24");
            return (Criteria) this;
        }

        public Criteria andQ24GreaterThan(String value) {
            addCriterion("Q24 >", value, "q24");
            return (Criteria) this;
        }

        public Criteria andQ24GreaterThanOrEqualTo(String value) {
            addCriterion("Q24 >=", value, "q24");
            return (Criteria) this;
        }

        public Criteria andQ24LessThan(String value) {
            addCriterion("Q24 <", value, "q24");
            return (Criteria) this;
        }

        public Criteria andQ24LessThanOrEqualTo(String value) {
            addCriterion("Q24 <=", value, "q24");
            return (Criteria) this;
        }

        public Criteria andQ24Like(String value) {
            addCriterion("Q24 like", value, "q24");
            return (Criteria) this;
        }

        public Criteria andQ24NotLike(String value) {
            addCriterion("Q24 not like", value, "q24");
            return (Criteria) this;
        }

        public Criteria andQ24In(List<String> values) {
            addCriterion("Q24 in", values, "q24");
            return (Criteria) this;
        }

        public Criteria andQ24NotIn(List<String> values) {
            addCriterion("Q24 not in", values, "q24");
            return (Criteria) this;
        }

        public Criteria andQ24Between(String value1, String value2) {
            addCriterion("Q24 between", value1, value2, "q24");
            return (Criteria) this;
        }

        public Criteria andQ24NotBetween(String value1, String value2) {
            addCriterion("Q24 not between", value1, value2, "q24");
            return (Criteria) this;
        }

        public Criteria andQ25IsNull() {
            addCriterion("Q25 is null");
            return (Criteria) this;
        }

        public Criteria andQ25IsNotNull() {
            addCriterion("Q25 is not null");
            return (Criteria) this;
        }

        public Criteria andQ25EqualTo(String value) {
            addCriterion("Q25 =", value, "q25");
            return (Criteria) this;
        }

        public Criteria andQ25NotEqualTo(String value) {
            addCriterion("Q25 <>", value, "q25");
            return (Criteria) this;
        }

        public Criteria andQ25GreaterThan(String value) {
            addCriterion("Q25 >", value, "q25");
            return (Criteria) this;
        }

        public Criteria andQ25GreaterThanOrEqualTo(String value) {
            addCriterion("Q25 >=", value, "q25");
            return (Criteria) this;
        }

        public Criteria andQ25LessThan(String value) {
            addCriterion("Q25 <", value, "q25");
            return (Criteria) this;
        }

        public Criteria andQ25LessThanOrEqualTo(String value) {
            addCriterion("Q25 <=", value, "q25");
            return (Criteria) this;
        }

        public Criteria andQ25Like(String value) {
            addCriterion("Q25 like", value, "q25");
            return (Criteria) this;
        }

        public Criteria andQ25NotLike(String value) {
            addCriterion("Q25 not like", value, "q25");
            return (Criteria) this;
        }

        public Criteria andQ25In(List<String> values) {
            addCriterion("Q25 in", values, "q25");
            return (Criteria) this;
        }

        public Criteria andQ25NotIn(List<String> values) {
            addCriterion("Q25 not in", values, "q25");
            return (Criteria) this;
        }

        public Criteria andQ25Between(String value1, String value2) {
            addCriterion("Q25 between", value1, value2, "q25");
            return (Criteria) this;
        }

        public Criteria andQ25NotBetween(String value1, String value2) {
            addCriterion("Q25 not between", value1, value2, "q25");
            return (Criteria) this;
        }

        public Criteria andQ26IsNull() {
            addCriterion("Q26 is null");
            return (Criteria) this;
        }

        public Criteria andQ26IsNotNull() {
            addCriterion("Q26 is not null");
            return (Criteria) this;
        }

        public Criteria andQ26EqualTo(String value) {
            addCriterion("Q26 =", value, "q26");
            return (Criteria) this;
        }

        public Criteria andQ26NotEqualTo(String value) {
            addCriterion("Q26 <>", value, "q26");
            return (Criteria) this;
        }

        public Criteria andQ26GreaterThan(String value) {
            addCriterion("Q26 >", value, "q26");
            return (Criteria) this;
        }

        public Criteria andQ26GreaterThanOrEqualTo(String value) {
            addCriterion("Q26 >=", value, "q26");
            return (Criteria) this;
        }

        public Criteria andQ26LessThan(String value) {
            addCriterion("Q26 <", value, "q26");
            return (Criteria) this;
        }

        public Criteria andQ26LessThanOrEqualTo(String value) {
            addCriterion("Q26 <=", value, "q26");
            return (Criteria) this;
        }

        public Criteria andQ26Like(String value) {
            addCriterion("Q26 like", value, "q26");
            return (Criteria) this;
        }

        public Criteria andQ26NotLike(String value) {
            addCriterion("Q26 not like", value, "q26");
            return (Criteria) this;
        }

        public Criteria andQ26In(List<String> values) {
            addCriterion("Q26 in", values, "q26");
            return (Criteria) this;
        }

        public Criteria andQ26NotIn(List<String> values) {
            addCriterion("Q26 not in", values, "q26");
            return (Criteria) this;
        }

        public Criteria andQ26Between(String value1, String value2) {
            addCriterion("Q26 between", value1, value2, "q26");
            return (Criteria) this;
        }

        public Criteria andQ26NotBetween(String value1, String value2) {
            addCriterion("Q26 not between", value1, value2, "q26");
            return (Criteria) this;
        }

        public Criteria andJoinidIsNull() {
            addCriterion("JOINID is null");
            return (Criteria) this;
        }

        public Criteria andJoinidIsNotNull() {
            addCriterion("JOINID is not null");
            return (Criteria) this;
        }

        public Criteria andJoinidEqualTo(String value) {
            addCriterion("JOINID =", value, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidNotEqualTo(String value) {
            addCriterion("JOINID <>", value, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidGreaterThan(String value) {
            addCriterion("JOINID >", value, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidGreaterThanOrEqualTo(String value) {
            addCriterion("JOINID >=", value, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidLessThan(String value) {
            addCriterion("JOINID <", value, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidLessThanOrEqualTo(String value) {
            addCriterion("JOINID <=", value, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidLike(String value) {
            addCriterion("JOINID like", value, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidNotLike(String value) {
            addCriterion("JOINID not like", value, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidIn(List<String> values) {
            addCriterion("JOINID in", values, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidNotIn(List<String> values) {
            addCriterion("JOINID not in", values, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidBetween(String value1, String value2) {
            addCriterion("JOINID between", value1, value2, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidNotBetween(String value1, String value2) {
            addCriterion("JOINID not between", value1, value2, "joinid");
            return (Criteria) this;
        }

        public Criteria andTimetakenIsNull() {
            addCriterion("TIMETAKEN is null");
            return (Criteria) this;
        }

        public Criteria andTimetakenIsNotNull() {
            addCriterion("TIMETAKEN is not null");
            return (Criteria) this;
        }

        public Criteria andTimetakenEqualTo(String value) {
            addCriterion("TIMETAKEN =", value, "timetaken");
            return (Criteria) this;
        }

        public Criteria andTimetakenNotEqualTo(String value) {
            addCriterion("TIMETAKEN <>", value, "timetaken");
            return (Criteria) this;
        }

        public Criteria andTimetakenGreaterThan(String value) {
            addCriterion("TIMETAKEN >", value, "timetaken");
            return (Criteria) this;
        }

        public Criteria andTimetakenGreaterThanOrEqualTo(String value) {
            addCriterion("TIMETAKEN >=", value, "timetaken");
            return (Criteria) this;
        }

        public Criteria andTimetakenLessThan(String value) {
            addCriterion("TIMETAKEN <", value, "timetaken");
            return (Criteria) this;
        }

        public Criteria andTimetakenLessThanOrEqualTo(String value) {
            addCriterion("TIMETAKEN <=", value, "timetaken");
            return (Criteria) this;
        }

        public Criteria andTimetakenLike(String value) {
            addCriterion("TIMETAKEN like", value, "timetaken");
            return (Criteria) this;
        }

        public Criteria andTimetakenNotLike(String value) {
            addCriterion("TIMETAKEN not like", value, "timetaken");
            return (Criteria) this;
        }

        public Criteria andTimetakenIn(List<String> values) {
            addCriterion("TIMETAKEN in", values, "timetaken");
            return (Criteria) this;
        }

        public Criteria andTimetakenNotIn(List<String> values) {
            addCriterion("TIMETAKEN not in", values, "timetaken");
            return (Criteria) this;
        }

        public Criteria andTimetakenBetween(String value1, String value2) {
            addCriterion("TIMETAKEN between", value1, value2, "timetaken");
            return (Criteria) this;
        }

        public Criteria andTimetakenNotBetween(String value1, String value2) {
            addCriterion("TIMETAKEN not between", value1, value2, "timetaken");
            return (Criteria) this;
        }

        public Criteria andSubmittimeIsNull() {
            addCriterion("SUBMITTIME is null");
            return (Criteria) this;
        }

        public Criteria andSubmittimeIsNotNull() {
            addCriterion("SUBMITTIME is not null");
            return (Criteria) this;
        }

        public Criteria andSubmittimeEqualTo(String value) {
            addCriterion("SUBMITTIME =", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeNotEqualTo(String value) {
            addCriterion("SUBMITTIME <>", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeGreaterThan(String value) {
            addCriterion("SUBMITTIME >", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeGreaterThanOrEqualTo(String value) {
            addCriterion("SUBMITTIME >=", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeLessThan(String value) {
            addCriterion("SUBMITTIME <", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeLessThanOrEqualTo(String value) {
            addCriterion("SUBMITTIME <=", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeLike(String value) {
            addCriterion("SUBMITTIME like", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeNotLike(String value) {
            addCriterion("SUBMITTIME not like", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeIn(List<String> values) {
            addCriterion("SUBMITTIME in", values, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeNotIn(List<String> values) {
            addCriterion("SUBMITTIME not in", values, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeBetween(String value1, String value2) {
            addCriterion("SUBMITTIME between", value1, value2, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeNotBetween(String value1, String value2) {
            addCriterion("SUBMITTIME not between", value1, value2, "submittime");
            return (Criteria) this;
        }

        public Criteria andTotalvalueIsNull() {
            addCriterion("TOTALVALUE is null");
            return (Criteria) this;
        }

        public Criteria andTotalvalueIsNotNull() {
            addCriterion("TOTALVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalvalueEqualTo(String value) {
            addCriterion("TOTALVALUE =", value, "totalvalue");
            return (Criteria) this;
        }

        public Criteria andTotalvalueNotEqualTo(String value) {
            addCriterion("TOTALVALUE <>", value, "totalvalue");
            return (Criteria) this;
        }

        public Criteria andTotalvalueGreaterThan(String value) {
            addCriterion("TOTALVALUE >", value, "totalvalue");
            return (Criteria) this;
        }

        public Criteria andTotalvalueGreaterThanOrEqualTo(String value) {
            addCriterion("TOTALVALUE >=", value, "totalvalue");
            return (Criteria) this;
        }

        public Criteria andTotalvalueLessThan(String value) {
            addCriterion("TOTALVALUE <", value, "totalvalue");
            return (Criteria) this;
        }

        public Criteria andTotalvalueLessThanOrEqualTo(String value) {
            addCriterion("TOTALVALUE <=", value, "totalvalue");
            return (Criteria) this;
        }

        public Criteria andTotalvalueLike(String value) {
            addCriterion("TOTALVALUE like", value, "totalvalue");
            return (Criteria) this;
        }

        public Criteria andTotalvalueNotLike(String value) {
            addCriterion("TOTALVALUE not like", value, "totalvalue");
            return (Criteria) this;
        }

        public Criteria andTotalvalueIn(List<String> values) {
            addCriterion("TOTALVALUE in", values, "totalvalue");
            return (Criteria) this;
        }

        public Criteria andTotalvalueNotIn(List<String> values) {
            addCriterion("TOTALVALUE not in", values, "totalvalue");
            return (Criteria) this;
        }

        public Criteria andTotalvalueBetween(String value1, String value2) {
            addCriterion("TOTALVALUE between", value1, value2, "totalvalue");
            return (Criteria) this;
        }

        public Criteria andTotalvalueNotBetween(String value1, String value2) {
            addCriterion("TOTALVALUE not between", value1, value2, "totalvalue");
            return (Criteria) this;
        }

        public Criteria andActivityIsNull() {
            addCriterion("ACTIVITY is null");
            return (Criteria) this;
        }

        public Criteria andActivityIsNotNull() {
            addCriterion("ACTIVITY is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEqualTo(String value) {
            addCriterion("ACTIVITY =", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotEqualTo(String value) {
            addCriterion("ACTIVITY <>", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThan(String value) {
            addCriterion("ACTIVITY >", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY >=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThan(String value) {
            addCriterion("ACTIVITY <", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY <=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLike(String value) {
            addCriterion("ACTIVITY like", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotLike(String value) {
            addCriterion("ACTIVITY not like", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityIn(List<String> values) {
            addCriterion("ACTIVITY in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotIn(List<String> values) {
            addCriterion("ACTIVITY not in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityBetween(String value1, String value2) {
            addCriterion("ACTIVITY between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY not between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andSojumpparmIsNull() {
            addCriterion("SOJUMPPARM is null");
            return (Criteria) this;
        }

        public Criteria andSojumpparmIsNotNull() {
            addCriterion("SOJUMPPARM is not null");
            return (Criteria) this;
        }

        public Criteria andSojumpparmEqualTo(String value) {
            addCriterion("SOJUMPPARM =", value, "sojumpparm");
            return (Criteria) this;
        }

        public Criteria andSojumpparmNotEqualTo(String value) {
            addCriterion("SOJUMPPARM <>", value, "sojumpparm");
            return (Criteria) this;
        }

        public Criteria andSojumpparmGreaterThan(String value) {
            addCriterion("SOJUMPPARM >", value, "sojumpparm");
            return (Criteria) this;
        }

        public Criteria andSojumpparmGreaterThanOrEqualTo(String value) {
            addCriterion("SOJUMPPARM >=", value, "sojumpparm");
            return (Criteria) this;
        }

        public Criteria andSojumpparmLessThan(String value) {
            addCriterion("SOJUMPPARM <", value, "sojumpparm");
            return (Criteria) this;
        }

        public Criteria andSojumpparmLessThanOrEqualTo(String value) {
            addCriterion("SOJUMPPARM <=", value, "sojumpparm");
            return (Criteria) this;
        }

        public Criteria andSojumpparmLike(String value) {
            addCriterion("SOJUMPPARM like", value, "sojumpparm");
            return (Criteria) this;
        }

        public Criteria andSojumpparmNotLike(String value) {
            addCriterion("SOJUMPPARM not like", value, "sojumpparm");
            return (Criteria) this;
        }

        public Criteria andSojumpparmIn(List<String> values) {
            addCriterion("SOJUMPPARM in", values, "sojumpparm");
            return (Criteria) this;
        }

        public Criteria andSojumpparmNotIn(List<String> values) {
            addCriterion("SOJUMPPARM not in", values, "sojumpparm");
            return (Criteria) this;
        }

        public Criteria andSojumpparmBetween(String value1, String value2) {
            addCriterion("SOJUMPPARM between", value1, value2, "sojumpparm");
            return (Criteria) this;
        }

        public Criteria andSojumpparmNotBetween(String value1, String value2) {
            addCriterion("SOJUMPPARM not between", value1, value2, "sojumpparm");
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