package com.app.back.domain.volunteer;


import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class VolunteerVO {
    private Long id;
    private int recruitmentCount;
    private String postTitle;
    private String postContent;
    private LocalDate vtSDate;
    private LocalDate vtEDate;
    private String memberNickName;
    private int postViewCount;
    private String postType;
    private String postSummary;
    private LocalDate createdDate;
    private String attachmentFileName;
    private String attachmentFilePath;
    private String attachmentFileSize;
    private String attachmentFiletype;

}
