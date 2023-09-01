package searchengine.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;





@Table(name = "site")
@Entity(name = "site")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SitePage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int id;
    @Enumerated(EnumType.STRING)
    @NotNull
    private Status status;
    @Column(name = "status_time")
    private LocalDateTime statusTime;
    @Column(name = "last_error")
    private String lastError = null;
    @NotNull
    @Column(columnDefinition = "VARCHAR(255)")
    private String url;
    @NotNull
    @Column(columnDefinition = "VARCHAR(255)")
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "site_id")
    private List<Page> pages;
    @OneToMany
    @JoinColumn(name = "site_id")
    private List<Lemma> lemmas;


}

