package com.mardi2020.votedogcommon.Dog.Util;

import lombok.Data;

@Data
final public class KafkaTopic {

    public static final String VOTE_BEFORE = "vote-before";

    public static final String VOTE_AFTER = "vote-after";
}
