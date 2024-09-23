package com.blueteam.historyEdu.dtos;

import com.blueteam.historyEdu.entities.Question;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDTO {
    private Long id;
    private String text;
    private String correctAnswer;
    private List<String> answers;

    public static QuestionDTO fromQuestion(Question question) {
        return new QuestionDTO(
                question.getId(),
                question.getText(),
                question.getCorrectAnswer(),
                question.getAnswers()
        );
    }
}

