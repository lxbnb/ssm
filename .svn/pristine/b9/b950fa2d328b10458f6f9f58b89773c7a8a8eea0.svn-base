package hdgc.bean;

import java.util.ArrayList;
import java.util.List;

public class PowerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PowerExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPwNameIsNull() {
            addCriterion("pw_name is null");
            return (Criteria) this;
        }

        public Criteria andPwNameIsNotNull() {
            addCriterion("pw_name is not null");
            return (Criteria) this;
        }

        public Criteria andPwNameEqualTo(String value) {
            addCriterion("pw_name =", value, "pwName");
            return (Criteria) this;
        }

        public Criteria andPwNameNotEqualTo(String value) {
            addCriterion("pw_name <>", value, "pwName");
            return (Criteria) this;
        }

        public Criteria andPwNameGreaterThan(String value) {
            addCriterion("pw_name >", value, "pwName");
            return (Criteria) this;
        }

        public Criteria andPwNameGreaterThanOrEqualTo(String value) {
            addCriterion("pw_name >=", value, "pwName");
            return (Criteria) this;
        }

        public Criteria andPwNameLessThan(String value) {
            addCriterion("pw_name <", value, "pwName");
            return (Criteria) this;
        }

        public Criteria andPwNameLessThanOrEqualTo(String value) {
            addCriterion("pw_name <=", value, "pwName");
            return (Criteria) this;
        }

        public Criteria andPwNameLike(String value) {
            addCriterion("pw_name like", value, "pwName");
            return (Criteria) this;
        }

        public Criteria andPwNameNotLike(String value) {
            addCriterion("pw_name not like", value, "pwName");
            return (Criteria) this;
        }

        public Criteria andPwNameIn(List<String> values) {
            addCriterion("pw_name in", values, "pwName");
            return (Criteria) this;
        }

        public Criteria andPwNameNotIn(List<String> values) {
            addCriterion("pw_name not in", values, "pwName");
            return (Criteria) this;
        }

        public Criteria andPwNameBetween(String value1, String value2) {
            addCriterion("pw_name between", value1, value2, "pwName");
            return (Criteria) this;
        }

        public Criteria andPwNameNotBetween(String value1, String value2) {
            addCriterion("pw_name not between", value1, value2, "pwName");
            return (Criteria) this;
        }

        public Criteria andSuperIdIsNull() {
            addCriterion("super_id is null");
            return (Criteria) this;
        }

        public Criteria andSuperIdIsNotNull() {
            addCriterion("super_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuperIdEqualTo(Long value) {
            addCriterion("super_id =", value, "superId");
            return (Criteria) this;
        }

        public Criteria andSuperIdNotEqualTo(Long value) {
            addCriterion("super_id <>", value, "superId");
            return (Criteria) this;
        }

        public Criteria andSuperIdGreaterThan(Long value) {
            addCriterion("super_id >", value, "superId");
            return (Criteria) this;
        }

        public Criteria andSuperIdGreaterThanOrEqualTo(Long value) {
            addCriterion("super_id >=", value, "superId");
            return (Criteria) this;
        }

        public Criteria andSuperIdLessThan(Long value) {
            addCriterion("super_id <", value, "superId");
            return (Criteria) this;
        }

        public Criteria andSuperIdLessThanOrEqualTo(Long value) {
            addCriterion("super_id <=", value, "superId");
            return (Criteria) this;
        }

        public Criteria andSuperIdIn(List<Long> values) {
            addCriterion("super_id in", values, "superId");
            return (Criteria) this;
        }

        public Criteria andSuperIdNotIn(List<Long> values) {
            addCriterion("super_id not in", values, "superId");
            return (Criteria) this;
        }

        public Criteria andSuperIdBetween(Long value1, Long value2) {
            addCriterion("super_id between", value1, value2, "superId");
            return (Criteria) this;
        }

        public Criteria andSuperIdNotBetween(Long value1, Long value2) {
            addCriterion("super_id not between", value1, value2, "superId");
            return (Criteria) this;
        }

        public Criteria andPwActionIsNull() {
            addCriterion("pw_action is null");
            return (Criteria) this;
        }

        public Criteria andPwActionIsNotNull() {
            addCriterion("pw_action is not null");
            return (Criteria) this;
        }

        public Criteria andPwActionEqualTo(String value) {
            addCriterion("pw_action =", value, "pwAction");
            return (Criteria) this;
        }

        public Criteria andPwActionNotEqualTo(String value) {
            addCriterion("pw_action <>", value, "pwAction");
            return (Criteria) this;
        }

        public Criteria andPwActionGreaterThan(String value) {
            addCriterion("pw_action >", value, "pwAction");
            return (Criteria) this;
        }

        public Criteria andPwActionGreaterThanOrEqualTo(String value) {
            addCriterion("pw_action >=", value, "pwAction");
            return (Criteria) this;
        }

        public Criteria andPwActionLessThan(String value) {
            addCriterion("pw_action <", value, "pwAction");
            return (Criteria) this;
        }

        public Criteria andPwActionLessThanOrEqualTo(String value) {
            addCriterion("pw_action <=", value, "pwAction");
            return (Criteria) this;
        }

        public Criteria andPwActionLike(String value) {
            addCriterion("pw_action like", value, "pwAction");
            return (Criteria) this;
        }

        public Criteria andPwActionNotLike(String value) {
            addCriterion("pw_action not like", value, "pwAction");
            return (Criteria) this;
        }

        public Criteria andPwActionIn(List<String> values) {
            addCriterion("pw_action in", values, "pwAction");
            return (Criteria) this;
        }

        public Criteria andPwActionNotIn(List<String> values) {
            addCriterion("pw_action not in", values, "pwAction");
            return (Criteria) this;
        }

        public Criteria andPwActionBetween(String value1, String value2) {
            addCriterion("pw_action between", value1, value2, "pwAction");
            return (Criteria) this;
        }

        public Criteria andPwActionNotBetween(String value1, String value2) {
            addCriterion("pw_action not between", value1, value2, "pwAction");
            return (Criteria) this;
        }

        public Criteria andIsactivedIsNull() {
            addCriterion("isactived is null");
            return (Criteria) this;
        }

        public Criteria andIsactivedIsNotNull() {
            addCriterion("isactived is not null");
            return (Criteria) this;
        }

        public Criteria andIsactivedEqualTo(Boolean value) {
            addCriterion("isactived =", value, "isactived");
            return (Criteria) this;
        }

        public Criteria andIsactivedNotEqualTo(Boolean value) {
            addCriterion("isactived <>", value, "isactived");
            return (Criteria) this;
        }

        public Criteria andIsactivedGreaterThan(Boolean value) {
            addCriterion("isactived >", value, "isactived");
            return (Criteria) this;
        }

        public Criteria andIsactivedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isactived >=", value, "isactived");
            return (Criteria) this;
        }

        public Criteria andIsactivedLessThan(Boolean value) {
            addCriterion("isactived <", value, "isactived");
            return (Criteria) this;
        }

        public Criteria andIsactivedLessThanOrEqualTo(Boolean value) {
            addCriterion("isactived <=", value, "isactived");
            return (Criteria) this;
        }

        public Criteria andIsactivedIn(List<Boolean> values) {
            addCriterion("isactived in", values, "isactived");
            return (Criteria) this;
        }

        public Criteria andIsactivedNotIn(List<Boolean> values) {
            addCriterion("isactived not in", values, "isactived");
            return (Criteria) this;
        }

        public Criteria andIsactivedBetween(Boolean value1, Boolean value2) {
            addCriterion("isactived between", value1, value2, "isactived");
            return (Criteria) this;
        }

        public Criteria andIsactivedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isactived not between", value1, value2, "isactived");
            return (Criteria) this;
        }

        public Criteria andIshaveIsNull() {
            addCriterion("ishave is null");
            return (Criteria) this;
        }

        public Criteria andIshaveIsNotNull() {
            addCriterion("ishave is not null");
            return (Criteria) this;
        }

        public Criteria andIshaveEqualTo(Boolean value) {
            addCriterion("ishave =", value, "ishave");
            return (Criteria) this;
        }

        public Criteria andIshaveNotEqualTo(Boolean value) {
            addCriterion("ishave <>", value, "ishave");
            return (Criteria) this;
        }

        public Criteria andIshaveGreaterThan(Boolean value) {
            addCriterion("ishave >", value, "ishave");
            return (Criteria) this;
        }

        public Criteria andIshaveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ishave >=", value, "ishave");
            return (Criteria) this;
        }

        public Criteria andIshaveLessThan(Boolean value) {
            addCriterion("ishave <", value, "ishave");
            return (Criteria) this;
        }

        public Criteria andIshaveLessThanOrEqualTo(Boolean value) {
            addCriterion("ishave <=", value, "ishave");
            return (Criteria) this;
        }

        public Criteria andIshaveIn(List<Boolean> values) {
            addCriterion("ishave in", values, "ishave");
            return (Criteria) this;
        }

        public Criteria andIshaveNotIn(List<Boolean> values) {
            addCriterion("ishave not in", values, "ishave");
            return (Criteria) this;
        }

        public Criteria andIshaveBetween(Boolean value1, Boolean value2) {
            addCriterion("ishave between", value1, value2, "ishave");
            return (Criteria) this;
        }

        public Criteria andIshaveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ishave not between", value1, value2, "ishave");
            return (Criteria) this;
        }

        public Criteria andFIconIsNull() {
            addCriterion("f_icon is null");
            return (Criteria) this;
        }

        public Criteria andFIconIsNotNull() {
            addCriterion("f_icon is not null");
            return (Criteria) this;
        }

        public Criteria andFIconEqualTo(String value) {
            addCriterion("f_icon =", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconNotEqualTo(String value) {
            addCriterion("f_icon <>", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconGreaterThan(String value) {
            addCriterion("f_icon >", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconGreaterThanOrEqualTo(String value) {
            addCriterion("f_icon >=", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconLessThan(String value) {
            addCriterion("f_icon <", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconLessThanOrEqualTo(String value) {
            addCriterion("f_icon <=", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconLike(String value) {
            addCriterion("f_icon like", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconNotLike(String value) {
            addCriterion("f_icon not like", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconIn(List<String> values) {
            addCriterion("f_icon in", values, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconNotIn(List<String> values) {
            addCriterion("f_icon not in", values, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconBetween(String value1, String value2) {
            addCriterion("f_icon between", value1, value2, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconNotBetween(String value1, String value2) {
            addCriterion("f_icon not between", value1, value2, "fIcon");
            return (Criteria) this;
        }

        public Criteria andIsleftIsNull() {
            addCriterion("isleft is null");
            return (Criteria) this;
        }

        public Criteria andIsleftIsNotNull() {
            addCriterion("isleft is not null");
            return (Criteria) this;
        }

        public Criteria andIsleftEqualTo(Boolean value) {
            addCriterion("isleft =", value, "isleft");
            return (Criteria) this;
        }

        public Criteria andIsleftNotEqualTo(Boolean value) {
            addCriterion("isleft <>", value, "isleft");
            return (Criteria) this;
        }

        public Criteria andIsleftGreaterThan(Boolean value) {
            addCriterion("isleft >", value, "isleft");
            return (Criteria) this;
        }

        public Criteria andIsleftGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isleft >=", value, "isleft");
            return (Criteria) this;
        }

        public Criteria andIsleftLessThan(Boolean value) {
            addCriterion("isleft <", value, "isleft");
            return (Criteria) this;
        }

        public Criteria andIsleftLessThanOrEqualTo(Boolean value) {
            addCriterion("isleft <=", value, "isleft");
            return (Criteria) this;
        }

        public Criteria andIsleftIn(List<Boolean> values) {
            addCriterion("isleft in", values, "isleft");
            return (Criteria) this;
        }

        public Criteria andIsleftNotIn(List<Boolean> values) {
            addCriterion("isleft not in", values, "isleft");
            return (Criteria) this;
        }

        public Criteria andIsleftBetween(Boolean value1, Boolean value2) {
            addCriterion("isleft between", value1, value2, "isleft");
            return (Criteria) this;
        }

        public Criteria andIsleftNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isleft not between", value1, value2, "isleft");
            return (Criteria) this;
        }

        public Criteria andLIconIsNull() {
            addCriterion("l_icon is null");
            return (Criteria) this;
        }

        public Criteria andLIconIsNotNull() {
            addCriterion("l_icon is not null");
            return (Criteria) this;
        }

        public Criteria andLIconEqualTo(String value) {
            addCriterion("l_icon =", value, "lIcon");
            return (Criteria) this;
        }

        public Criteria andLIconNotEqualTo(String value) {
            addCriterion("l_icon <>", value, "lIcon");
            return (Criteria) this;
        }

        public Criteria andLIconGreaterThan(String value) {
            addCriterion("l_icon >", value, "lIcon");
            return (Criteria) this;
        }

        public Criteria andLIconGreaterThanOrEqualTo(String value) {
            addCriterion("l_icon >=", value, "lIcon");
            return (Criteria) this;
        }

        public Criteria andLIconLessThan(String value) {
            addCriterion("l_icon <", value, "lIcon");
            return (Criteria) this;
        }

        public Criteria andLIconLessThanOrEqualTo(String value) {
            addCriterion("l_icon <=", value, "lIcon");
            return (Criteria) this;
        }

        public Criteria andLIconLike(String value) {
            addCriterion("l_icon like", value, "lIcon");
            return (Criteria) this;
        }

        public Criteria andLIconNotLike(String value) {
            addCriterion("l_icon not like", value, "lIcon");
            return (Criteria) this;
        }

        public Criteria andLIconIn(List<String> values) {
            addCriterion("l_icon in", values, "lIcon");
            return (Criteria) this;
        }

        public Criteria andLIconNotIn(List<String> values) {
            addCriterion("l_icon not in", values, "lIcon");
            return (Criteria) this;
        }

        public Criteria andLIconBetween(String value1, String value2) {
            addCriterion("l_icon between", value1, value2, "lIcon");
            return (Criteria) this;
        }

        public Criteria andLIconNotBetween(String value1, String value2) {
            addCriterion("l_icon not between", value1, value2, "lIcon");
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