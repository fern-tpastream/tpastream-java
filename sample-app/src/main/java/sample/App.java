package sample;

import com.tpa.stream.api.client.BasicAuth;
import com.tpa.stream.api.client.TpaStreamApiClient;
import com.tpa.stream.api.client.claims.endpoints.GetClaim;
import com.tpa.stream.api.client.claims.exceptions.GetClaimException;
import com.tpa.stream.api.client.claims.types.Claim;

public class App {

    public static void main(String... args) {

        String username = System.getenv("TPA_STREAM_USERNAME");
        String password = System.getenv("TPA_STREAM_PASSWORD");

        BasicAuth auth = BasicAuth.of(username, password);

        TpaStreamApiClient tpastreamApiClient =
                new TpaStreamApiClient("https://app.tpastream.com/api/", auth);

        try {
            Claim claim = tpastreamApiClient.claims().getClaim(GetClaim.Request.builder()
                    .claimMedicalId(01234)
                    .build());
            System.out.println("Successfully fetched claim with id" + claim.getId());
        } catch (GetClaimException e) {
            System.out.println("Encountered error while fetching claim" + e.getMessage());
        }
    }
}
