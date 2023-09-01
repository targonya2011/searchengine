package searchengine.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "`index`")
@Entity(name = "`index`")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Index {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Column(name = "page_id")
    private int pageId;
    @NotNull
    @Column(name = "lemma_id")
    private int lemmaId;
    @NotNull
    private int lemmaCount;
    @ManyToOne
    @JoinColumn(name = "page_id", insertable = false, updatable = false, nullable = false)
    private Page page;
    @ManyToOne
    @JoinColumn(name = "lemma_id", insertable = false, updatable = false, nullable = false)
    private Lemma lemma;

}
