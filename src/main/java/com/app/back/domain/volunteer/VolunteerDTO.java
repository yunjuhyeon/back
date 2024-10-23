package com.app.back.domain.volunteer;



import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class VolunteerDTO {
    private Long id;
    private int recruitmentCount;
    private String postTitle;
    private String postContent;
    private String vtSDate;
    private String vtEDate;
    private String memberNickName;
    private int postViewCount;
    private String postType;
    private String postSummary;
    private LocalDate createdDate;
    private String attachmentFileName;
    private String attachmentFilePath;
    private String attachmentFileSize;
    private String attachmentFiletype;


public VolunteerVO toVO(){return new VolunteerVO(id,recruitmentCount,postTitle,postContent,
        vtSDate, vtEDate, memberNickName,postViewCount,postType,postSummary,createdDate,
        attachmentFileName, attachmentFilePath, attachmentFileSize, attachmentFiletype);}}
