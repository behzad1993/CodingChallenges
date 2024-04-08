import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        String[] deployments = {
                "{\"deployment_id\": \"d-123456abcd\", \"status\": \"Success\"}",
                "{\"deployment_id\": \"d-098765efgh\", \"status\": \"Fail\"}"
        };

        int[] results = evaluateDeployments(deployments);
        System.out.println("Number of successful deployments: " + results[0]);
        System.out.println("Number of failed deployments: " + results[1]);
        System.out.println("Number of errors parsing deployments: " + results[2]);
    }

    public static int[] evaluateDeployments(String[] deployments) {
        int successful = 0;
        int failed = 0;
        int parsingErrors = 0;

        for (String deployment : deployments) {
            try {
                JsonReader reader = Json.createReader(new StringReader(deployment));
                JsonObject jsonObject = reader.readObject();
                reader.close();

                if (isValidDeployment(jsonObject)) {
                    String status = jsonObject.getString("status");
                    if (status.equals("Success")) {
                        successful++;
                    } else if (status.equals("Fail")) {
                        failed++;
                    }
                } else {
                    parsingErrors++;
                }
            } catch (Exception e) {
                parsingErrors++;
            }
        }

        return new int[]{successful, failed, parsingErrors};
    }

    public static boolean isValidDeployment(JsonObject jsonObject) {
        if (jsonObject.containsKey("deployment_id")) {
            String deploymentId = jsonObject.getString("deployment_id");
            if (deploymentId.startsWith("d-") && deploymentId.length() == 12) {
                if (jsonObject.containsKey("status")) {
                    String status = jsonObject.getString("status");
                    return status.equals("Success") || status.equals("Fail");
                }
            }
        }
        return false;
    }
}
