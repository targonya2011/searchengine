package searchengine.model;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "page",
        indexes = {@javax.persistence.Index(columnList = "path", name = "path_index")})
@Entity(name = "page")
@Data
@NoArgsConstructor
public class Page {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "page_sequence"
    )
    @SequenceGenerator(
            name = "page_sequence",
            allocationSize = 100
    )
    @Column(name = "id", nullable = false)
    private int id;

    public Page(int siteId, String path, int code, String content, SitePage sitePage) {
        this.siteId = siteId;
        this.path = path;
        this.code = code;
        this.content = content;
        this.sitePage = sitePage;
    }

    @NotNull
    @Column(name = "site_id")
    private int siteId;

    @Column(name = "path", columnDefinition = "VARCHAR(255)", nullable = false)
    private String path;

    @Column(name = "code", nullable = false)
    private int code;

    @Column(name = "content", columnDefinition = "MEDIUMTEXT")
    private String content;

    @ManyToOne
    @JoinColumn(name = "site_id", nullable = false, insertable = false, updatable = false)
    private SitePage sitePage;

}
