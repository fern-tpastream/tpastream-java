package com.tpastream.api.client;

import com.tpastream.api.client.claims.ClaimsServiceClient;
import com.tpastream.api.client.employers.EmployersServiceClient;
import com.tpastream.api.client.key.PublicKeyServiceClient;
import java.lang.String;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

public final class TpastreamApiClient {
  private final Supplier<ClaimsServiceClient> claimsServiceClient;

  private final Supplier<EmployersServiceClient> employersServiceClient;

  private final Supplier<PublicKeyServiceClient> publicKeyServiceClient;

  public TpastreamApiClient(String url) {
    this.publicKeyServiceClient = memoize(() -> new PublicKeyServiceClient(url));
    this.claimsServiceClient = memoize(() -> new ClaimsServiceClient(url));
    this.employersServiceClient = memoize(() -> new EmployersServiceClient(url));
  }

  public TpastreamApiClient(String url, Authorization auth) {
    this.publicKeyServiceClient = memoize(() -> new PublicKeyServiceClient(url, auth));
    this.claimsServiceClient = memoize(() -> new ClaimsServiceClient(url, auth));
    this.employersServiceClient = memoize(() -> new EmployersServiceClient(url, auth));
  }

  public final ClaimsServiceClient claims() {
    return this.claimsServiceClient.get();
  }

  public final EmployersServiceClient employers() {
    return this.employersServiceClient.get();
  }

  public final PublicKeyServiceClient key() {
    return this.publicKeyServiceClient.get();
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
