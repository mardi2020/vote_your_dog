package com.mardi2020.votedogcommon.Dog.Message;

import com.mardi2020.votedogcommon.Dog.Enum.VoteStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor @Builder
@Data
public class DogVoteUpdate {

    private Long newDogId;

    private Long beforeDogId;

    private VoteStatus status;
}