package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="\"tidslinje\"", schema = "\"schematest\"")
public class Tidslinje  implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "\"id\"")
    private Integer id;
    @Column(name = "\"user\"")
    private String user;
    @Column(name = "\"timestampcreated\"")
    private Long timestampCreated;
    @Column(name = "\"timestampchanged\"")
    private Long timestampChanged;
    @Column(name = "\"start\"")
    private Integer start;
    @Column(name = "\"end\"")
    private Integer end;
    @Column(name = "\"text\"")
    private String text;
    @Column(name = "\"like\"")
    private Boolean like;
    @Column(name = "\"dislike\"")
    private Boolean dislike;
    @Column(name = "\"isdeleted\"")
    private Boolean isdeleted;

    public Integer getTexttocommentid() {
        return texttocommentid;
    }

    public void setTexttocommentid(Integer texttocommentid) {
        this.texttocommentid = texttocommentid;
    }

    @Column(name = "\"texttocommentid\"")
    private Integer texttocommentid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"texttocommentid\"",updatable = false,insertable = false)
    @JsonIgnore
    transient textToComment texttocommentfield;

    public Tidslinje(Integer id, String user, Long timestampCreated, Long timestampChanged, Integer start, Integer end, String text, Boolean like, Boolean dislike, Boolean isdeleted, Integer texttocommentid) {
        this.id = id;
        this.user = user;
        this.timestampCreated = timestampCreated;
        this.timestampChanged = timestampChanged;
        this.start = start;
        this.end = end;
        this.text = text;
        this.like = like;
        this.dislike = dislike;
        this.isdeleted = isdeleted;
        this.texttocommentid = texttocommentid;
    }

    public Tidslinje() {

    }

    @Override
    public String toString() {
        return "Tidslinje{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", timestampCreated=" + timestampCreated +
                ", timestampChanged=" + timestampChanged +
                ", start=" + start +
                ", end=" + end +
                ", text='" + text + '\'' +
                ", like=" + like +
                ", dislike=" + dislike +
                ", isdeleted=" + isdeleted +
                ", texttocommentid=" + texttocommentid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tidslinje)) return false;
        Tidslinje tidslinje = (Tidslinje) o;
        return Objects.equals(id, tidslinje.id) && Objects.equals(user, tidslinje.user) && Objects.equals(timestampCreated, tidslinje.timestampCreated) && Objects.equals(timestampChanged, tidslinje.timestampChanged) && Objects.equals(start, tidslinje.start) && Objects.equals(end, tidslinje.end) && Objects.equals(text, tidslinje.text) && Objects.equals(like, tidslinje.like) && Objects.equals(dislike, tidslinje.dislike) && Objects.equals(isdeleted, tidslinje.isdeleted) && Objects.equals(texttocommentid, tidslinje.texttocommentid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, timestampCreated, timestampChanged, start, end, text, like, dislike, isdeleted, texttocommentid);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Long getTimestampCreated() {
        return timestampCreated;
    }

    public void setTimestampCreated(Long timestampCreated) {
        this.timestampCreated = timestampCreated;
    }

    public Long getTimestampChanged() {
        return timestampChanged;
    }

    public void setTimestampChanged(Long timestampChanged) {
        this.timestampChanged = timestampChanged;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getLike() {
        return like;
    }

    public void setLike(Boolean like) {
        this.like = like;
    }

    public Boolean getDislike() {
        return dislike;
    }

    public void setDislike(Boolean dislike) {
        this.dislike = dislike;
    }

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }
}
