package com.blueteam.historyEdu.dtos;

import com.blueteam.historyEdu.entities.Chapter;
import com.blueteam.historyEdu.entities.Course;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChapterDTO {
    @JsonProperty("chapterName")
    private String chapterName;

    @JsonProperty("courseId") // Add this to ensure course is associated
    private Long courseId;

    public Chapter toEntity(Course course) {
        return Chapter.builder()
                .chapterName(chapterName)
                .course(course) // Ensure course is set in the entity
                .build();
    }
}
