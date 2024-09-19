package com.blueteam.historyEdu.responses;

import com.blueteam.historyEdu.entities.Chapter;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChapterResponse {

    private Long id;
    private String chapterName;
    private List<VideoResponse> videos;

    public static ChapterResponse fromChapter(Chapter chapter) {
        // Handle potential null videos
        List<VideoResponse> videos = (chapter.getVideos() != null) ?
                chapter.getVideos().stream().map(VideoResponse::fromVideo).toList() :
                new ArrayList<>();

        return ChapterResponse.builder()
                .id(chapter.getId())
                .chapterName(chapter.getChapterName())
                .videos(videos)
                .build();
    }
}
