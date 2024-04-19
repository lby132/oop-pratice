package org.example.gradeCalculator;

import java.util.List;

public class GradeCalculator {

    private final Courses courses;

    // 일급 컬렉션 사용 방법1
    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    // 일급 컬렉션 사용 방법2
    public GradeCalculator(Courses courses) {
        this.courses = courses;
    }

    /**
     * 요구사항
     * 평균학점 계산 방법 = (학점수x교과목 평점)의 합계/수강신청 총학점
     * 일급 컬렉션 사용
     */
    public double calculateGrade() {
        // (학점수x교과목 평점)의 합계
        double totalMultipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();

        // 수강신청 총 학점 수
        final int totalCompletedCredit = courses.calculateTotalCompletedCredit();

        return totalMultipliedCreditAndCourseGrade / totalCompletedCredit;
    }
}
