package com.tpa.stream.api.client;

import com.tpa.stream.api.client.claim.ClaimsServiceClient;
import com.tpa.stream.api.client.employer.EmployersServiceClient;
import com.tpa.stream.api.client.key.PublicKeyServiceClient;
import com.tpa.stream.api.client.member.MembersServiceClient;
import java.lang.String;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

public final class TpaStreamApiClient {
  private final Supplier<ClaimsServiceClient> claimsServiceClient;

  private final Supplier<EmployersServiceClient> employersServiceClient;

  private final Supplier<PublicKeyServiceClient> publicKeyServiceClient;

  private final Supplier<MembersServiceClient> membersServiceClient;

  public TpaStreamApiClient(String url) {
    this.publicKeyServiceClient = memoize(() -> new PublicKeyServiceClient(url));
    this.membersServiceClient = memoize(() -> new MembersServiceClient(url));
    this.claimsServiceClient = memoize(() -> new ClaimsServiceClient(url));
    this.employersServiceClient = memoize(() -> new EmployersServiceClient(url));
  }

  public TpaStreamApiClient(String url, BasicAuth auth) {
    this.publicKeyServiceClient = memoize(() -> new PublicKeyServiceClient(url, auth));
    this.membersServiceClient = memoize(() -> new MembersServiceClient(url, auth));
    this.claimsServiceClient = memoize(() -> new ClaimsServiceClient(url, auth));
    this.employersServiceClient = memoize(() -> new EmployersServiceClient(url, auth));
  }

  public final ClaimsServiceClient claim() {
    return this.claimsServiceClient.get();
  }

  public final EmployersServiceClient employer() {
    return this.employersServiceClient.get();
  }

  public final PublicKeyServiceClient key() {
    return this.publicKeyServiceClient.get();
  }

  public final MembersServiceClient member() {
    return this.membersServiceClient.get();
  }

  private static <T> Supplier<T> memoize(Supplier<T> delegate) {
    AtomicReference<T> value = new AtomicReference<>();
    return () ->  {
      T val = value.get();
      if (val == null) {
        val = value.updateAndGet(cur -> cur == null ? Objects.requireNonNull(delegate.get()) : cur);
      }
      return val;
    } ;
  }
}
