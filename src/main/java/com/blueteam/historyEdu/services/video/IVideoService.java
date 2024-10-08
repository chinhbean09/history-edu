package com.blueteam.historyEdu.services.video;

import com.blueteam.historyEdu.dtos.VideoDTO;
import com.blueteam.historyEdu.exceptions.DataNotFoundException;
import com.blueteam.historyEdu.exceptions.PermissionDenyException;
import com.blueteam.historyEdu.responses.CourseResponse;
import com.blueteam.historyEdu.responses.VideoResponse;

public interface IVideoService {

    CourseResponse createVideo(Long lessonId,VideoDTO videoDTO) throws DataNotFoundException, PermissionDenyException;

    CourseResponse updateVideo(Long videoId, VideoDTO videoDTO) throws DataNotFoundException, PermissionDenyException;

    void deleteVideo(Long videoId) throws DataNotFoundException;

    VideoResponse getVideo(Long videoId) throws DataNotFoundException;
}
