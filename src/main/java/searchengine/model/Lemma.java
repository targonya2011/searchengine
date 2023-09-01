package searchengine.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "lemma", uniqueConstraints = @UniqueConstraint(columnNames = "lemma"))
@Entity(name = "lemma")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lemma {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private int frequency;
    @NotNull
    @Column(columnDefinition = "VARCHAR(255)")
    private String lemma;
    @NotNull
    @Column(name = "site_id")
    private int siteId;
    @ManyToOne
    @JoinColumn(name = "site_id", insertable = false, updatable = false, nullable = false)
    private SitePage sitePage;





}
