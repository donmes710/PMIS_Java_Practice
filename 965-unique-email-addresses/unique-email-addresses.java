
import java.util.HashSet;

class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");

            String local = parts[0];
            String domain = parts[1];

            if (local.contains("+")) {
                local = local.substring(0, local.indexOf("+"));
            }


            local = local.replace(".", "");

            String newEmail = local + "@" + domain;

            uniqueEmails.add(newEmail);
        }

        return uniqueEmails.size();
    }
}
