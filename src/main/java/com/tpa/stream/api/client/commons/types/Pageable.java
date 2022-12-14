package com.tpa.stream.api.client.commons.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = Pageable.Builder.class
)
public final class Pageable implements IPageable {
  private final boolean hasNext;

  private final boolean hasPrev;

  private final Optional<Integer> nextNum;

  private final Optional<Integer> page;

  private final Optional<Integer> pages;

  private final Optional<Integer> perPage;

  private final Optional<Integer> prevNum;

  private final Optional<Integer> total;

  private int _cachedHashCode;

  Pageable(boolean hasNext, boolean hasPrev, Optional<Integer> nextNum, Optional<Integer> page,
      Optional<Integer> pages, Optional<Integer> perPage, Optional<Integer> prevNum,
      Optional<Integer> total) {
    this.hasNext = hasNext;
    this.hasPrev = hasPrev;
    this.nextNum = nextNum;
    this.page = page;
    this.pages = pages;
    this.perPage = perPage;
    this.prevNum = prevNum;
    this.total = total;
  }

  @JsonProperty("has_next")
  @Override
  public boolean getHasNext() {
    return hasNext;
  }

  @JsonProperty("has_prev")
  @Override
  public boolean getHasPrev() {
    return hasPrev;
  }

  @JsonProperty("next_num")
  @Override
  public Optional<Integer> getNextNum() {
    return nextNum;
  }

  @JsonProperty("page")
  @Override
  public Optional<Integer> getPage() {
    return page;
  }

  @JsonProperty("pages")
  @Override
  public Optional<Integer> getPages() {
    return pages;
  }

  @JsonProperty("per_page")
  @Override
  public Optional<Integer> getPerPage() {
    return perPage;
  }

  @JsonProperty("prev_num")
  @Override
  public Optional<Integer> getPrevNum() {
    return prevNum;
  }

  @JsonProperty("total")
  @Override
  public Optional<Integer> getTotal() {
    return total;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Pageable && equalTo((Pageable) other);
  }

  private boolean equalTo(Pageable other) {
    return hasNext == other.hasNext && hasPrev == other.hasPrev && nextNum.equals(other.nextNum) && page.equals(other.page) && pages.equals(other.pages) && perPage.equals(other.perPage) && prevNum.equals(other.prevNum) && total.equals(other.total);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.hasNext, this.hasPrev, this.nextNum, this.page, this.pages, this.perPage, this.prevNum, this.total);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Pageable{" + "hasNext: " + hasNext + ", hasPrev: " + hasPrev + ", nextNum: " + nextNum + ", page: " + page + ", pages: " + pages + ", perPage: " + perPage + ", prevNum: " + prevNum + ", total: " + total + "}";
  }

  public static HasNextStage builder() {
    return new Builder();
  }

  public interface HasNextStage {
    HasPrevStage hasNext(boolean hasNext);

    Builder from(Pageable other);
  }

  public interface HasPrevStage {
    _FinalStage hasPrev(boolean hasPrev);
  }

  public interface _FinalStage {
    Pageable build();

    _FinalStage nextNum(Optional<Integer> nextNum);

    _FinalStage nextNum(Integer nextNum);

    _FinalStage page(Optional<Integer> page);

    _FinalStage page(Integer page);

    _FinalStage pages(Optional<Integer> pages);

    _FinalStage pages(Integer pages);

    _FinalStage perPage(Optional<Integer> perPage);

    _FinalStage perPage(Integer perPage);

    _FinalStage prevNum(Optional<Integer> prevNum);

    _FinalStage prevNum(Integer prevNum);

    _FinalStage total(Optional<Integer> total);

    _FinalStage total(Integer total);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  static final class Builder implements HasNextStage, HasPrevStage, _FinalStage {
    private boolean hasNext;

    private boolean hasPrev;

    private Optional<Integer> total = Optional.empty();

    private Optional<Integer> prevNum = Optional.empty();

    private Optional<Integer> perPage = Optional.empty();

    private Optional<Integer> pages = Optional.empty();

    private Optional<Integer> page = Optional.empty();

    private Optional<Integer> nextNum = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(Pageable other) {
      hasNext(other.getHasNext());
      hasPrev(other.getHasPrev());
      nextNum(other.getNextNum());
      page(other.getPage());
      pages(other.getPages());
      perPage(other.getPerPage());
      prevNum(other.getPrevNum());
      total(other.getTotal());
      return this;
    }

    @Override
    @JsonSetter("has_next")
    public HasPrevStage hasNext(boolean hasNext) {
      this.hasNext = hasNext;
      return this;
    }

    @Override
    @JsonSetter("has_prev")
    public _FinalStage hasPrev(boolean hasPrev) {
      this.hasPrev = hasPrev;
      return this;
    }

    @Override
    public _FinalStage total(Integer total) {
      this.total = Optional.of(total);
      return this;
    }

    @Override
    @JsonSetter(
        value = "total",
        nulls = Nulls.SKIP
    )
    public _FinalStage total(Optional<Integer> total) {
      this.total = total;
      return this;
    }

    @Override
    public _FinalStage prevNum(Integer prevNum) {
      this.prevNum = Optional.of(prevNum);
      return this;
    }

    @Override
    @JsonSetter(
        value = "prev_num",
        nulls = Nulls.SKIP
    )
    public _FinalStage prevNum(Optional<Integer> prevNum) {
      this.prevNum = prevNum;
      return this;
    }

    @Override
    public _FinalStage perPage(Integer perPage) {
      this.perPage = Optional.of(perPage);
      return this;
    }

    @Override
    @JsonSetter(
        value = "per_page",
        nulls = Nulls.SKIP
    )
    public _FinalStage perPage(Optional<Integer> perPage) {
      this.perPage = perPage;
      return this;
    }

    @Override
    public _FinalStage pages(Integer pages) {
      this.pages = Optional.of(pages);
      return this;
    }

    @Override
    @JsonSetter(
        value = "pages",
        nulls = Nulls.SKIP
    )
    public _FinalStage pages(Optional<Integer> pages) {
      this.pages = pages;
      return this;
    }

    @Override
    public _FinalStage page(Integer page) {
      this.page = Optional.of(page);
      return this;
    }

    @Override
    @JsonSetter(
        value = "page",
        nulls = Nulls.SKIP
    )
    public _FinalStage page(Optional<Integer> page) {
      this.page = page;
      return this;
    }

    @Override
    public _FinalStage nextNum(Integer nextNum) {
      this.nextNum = Optional.of(nextNum);
      return this;
    }

    @Override
    @JsonSetter(
        value = "next_num",
        nulls = Nulls.SKIP
    )
    public _FinalStage nextNum(Optional<Integer> nextNum) {
      this.nextNum = nextNum;
      return this;
    }

    @Override
    public Pageable build() {
      return new Pageable(hasNext, hasPrev, nextNum, page, pages, perPage, prevNum, total);
    }
  }
}
