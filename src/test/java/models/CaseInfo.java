package models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CaseInfo {

    String title;
    int severity;
    int priority;
    int type;
    int layer;
    @Expose
    @SerializedName("is_flaky") int isFlaky;
    int behavior;
    int automation;
    int status;
    @Expose
    @SerializedName("milestone_id") int milestone;
    @Expose
    @SerializedName("suite_id") int suite;


}
