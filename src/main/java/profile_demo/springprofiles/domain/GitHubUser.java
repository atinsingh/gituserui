package profile_demo.springprofiles.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class GitHubUser {
    private Long id;
    private String login;
    private String avatar_url;
    private String name;
    private Long followers;
}

