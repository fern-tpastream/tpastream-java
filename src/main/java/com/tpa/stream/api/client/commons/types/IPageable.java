package com.tpa.stream.api.client.commons.types;

import java.lang.Integer;
import java.util.Optional;

public interface IPageable {
  boolean getHasNext();

  boolean getHasPrev();

  Optional<Integer> getNextNum();

  Optional<Integer> getPage();

  Optional<Integer> getPages();

  Optional<Integer> getPerPage();

  Optional<Integer> getPrevNum();

  Optional<Integer> getTotal();
}
