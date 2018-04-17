package hdgc.bean;

import java.util.ArrayList;
import java.util.List;

public class DocumentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocumentExample() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDocumentNameIsNull() {
            addCriterion("Document_Name is null");
            return (Criteria) this;
        }

        public Criteria andDocumentNameIsNotNull() {
            addCriterion("Document_Name is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentNameEqualTo(String value) {
            addCriterion("Document_Name =", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameNotEqualTo(String value) {
            addCriterion("Document_Name <>", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameGreaterThan(String value) {
            addCriterion("Document_Name >", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameGreaterThanOrEqualTo(String value) {
            addCriterion("Document_Name >=", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameLessThan(String value) {
            addCriterion("Document_Name <", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameLessThanOrEqualTo(String value) {
            addCriterion("Document_Name <=", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameLike(String value) {
            addCriterion("Document_Name like", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameNotLike(String value) {
            addCriterion("Document_Name not like", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameIn(List<String> values) {
            addCriterion("Document_Name in", values, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameNotIn(List<String> values) {
            addCriterion("Document_Name not in", values, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameBetween(String value1, String value2) {
            addCriterion("Document_Name between", value1, value2, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameNotBetween(String value1, String value2) {
            addCriterion("Document_Name not between", value1, value2, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentContentIsNull() {
            addCriterion("Document_Content is null");
            return (Criteria) this;
        }

        public Criteria andDocumentContentIsNotNull() {
            addCriterion("Document_Content is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentContentEqualTo(String value) {
            addCriterion("Document_Content =", value, "documentContent");
            return (Criteria) this;
        }

        public Criteria andDocumentContentNotEqualTo(String value) {
            addCriterion("Document_Content <>", value, "documentContent");
            return (Criteria) this;
        }

        public Criteria andDocumentContentGreaterThan(String value) {
            addCriterion("Document_Content >", value, "documentContent");
            return (Criteria) this;
        }

        public Criteria andDocumentContentGreaterThanOrEqualTo(String value) {
            addCriterion("Document_Content >=", value, "documentContent");
            return (Criteria) this;
        }

        public Criteria andDocumentContentLessThan(String value) {
            addCriterion("Document_Content <", value, "documentContent");
            return (Criteria) this;
        }

        public Criteria andDocumentContentLessThanOrEqualTo(String value) {
            addCriterion("Document_Content <=", value, "documentContent");
            return (Criteria) this;
        }

        public Criteria andDocumentContentLike(String value) {
            addCriterion("Document_Content like", value, "documentContent");
            return (Criteria) this;
        }

        public Criteria andDocumentContentNotLike(String value) {
            addCriterion("Document_Content not like", value, "documentContent");
            return (Criteria) this;
        }

        public Criteria andDocumentContentIn(List<String> values) {
            addCriterion("Document_Content in", values, "documentContent");
            return (Criteria) this;
        }

        public Criteria andDocumentContentNotIn(List<String> values) {
            addCriterion("Document_Content not in", values, "documentContent");
            return (Criteria) this;
        }

        public Criteria andDocumentContentBetween(String value1, String value2) {
            addCriterion("Document_Content between", value1, value2, "documentContent");
            return (Criteria) this;
        }

        public Criteria andDocumentContentNotBetween(String value1, String value2) {
            addCriterion("Document_Content not between", value1, value2, "documentContent");
            return (Criteria) this;
        }

        public Criteria andDocumentEvaluationIsNull() {
            addCriterion("Document_Evaluation is null");
            return (Criteria) this;
        }

        public Criteria andDocumentEvaluationIsNotNull() {
            addCriterion("Document_Evaluation is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentEvaluationEqualTo(String value) {
            addCriterion("Document_Evaluation =", value, "documentEvaluation");
            return (Criteria) this;
        }

        public Criteria andDocumentEvaluationNotEqualTo(String value) {
            addCriterion("Document_Evaluation <>", value, "documentEvaluation");
            return (Criteria) this;
        }

        public Criteria andDocumentEvaluationGreaterThan(String value) {
            addCriterion("Document_Evaluation >", value, "documentEvaluation");
            return (Criteria) this;
        }

        public Criteria andDocumentEvaluationGreaterThanOrEqualTo(String value) {
            addCriterion("Document_Evaluation >=", value, "documentEvaluation");
            return (Criteria) this;
        }

        public Criteria andDocumentEvaluationLessThan(String value) {
            addCriterion("Document_Evaluation <", value, "documentEvaluation");
            return (Criteria) this;
        }

        public Criteria andDocumentEvaluationLessThanOrEqualTo(String value) {
            addCriterion("Document_Evaluation <=", value, "documentEvaluation");
            return (Criteria) this;
        }

        public Criteria andDocumentEvaluationLike(String value) {
            addCriterion("Document_Evaluation like", value, "documentEvaluation");
            return (Criteria) this;
        }

        public Criteria andDocumentEvaluationNotLike(String value) {
            addCriterion("Document_Evaluation not like", value, "documentEvaluation");
            return (Criteria) this;
        }

        public Criteria andDocumentEvaluationIn(List<String> values) {
            addCriterion("Document_Evaluation in", values, "documentEvaluation");
            return (Criteria) this;
        }

        public Criteria andDocumentEvaluationNotIn(List<String> values) {
            addCriterion("Document_Evaluation not in", values, "documentEvaluation");
            return (Criteria) this;
        }

        public Criteria andDocumentEvaluationBetween(String value1, String value2) {
            addCriterion("Document_Evaluation between", value1, value2, "documentEvaluation");
            return (Criteria) this;
        }

        public Criteria andDocumentEvaluationNotBetween(String value1, String value2) {
            addCriterion("Document_Evaluation not between", value1, value2, "documentEvaluation");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userId not between", value1, value2, "userid");
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