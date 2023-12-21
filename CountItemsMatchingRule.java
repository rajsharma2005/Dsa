import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CountItemsMatchingRule {
    //https://leetcode.com/problems/count-items-matching-a-rule/description/
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (Objects.equals(ruleKey, "type")){
                if (Objects.equals(items.get(i).get(0), ruleValue)){
                    count++;
                }
            } else if (Objects.equals(ruleKey, "color")) {
                if (Objects.equals(items.get(i).get(1), ruleValue)){
                    count++;
                }
            }else {
                if (Objects.equals(items.get(i).get(2), ruleValue)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();

        // Adding the lists to the outer list
        List<String> phone1 = new ArrayList<>(List.of("phone", "blue", "pixel"));
        List<String> computer = new ArrayList<>(List.of("computer", "silver", "lenovo"));
        List<String> phone2 = new ArrayList<>(List.of("phone", "gold", "iphone"));

        items.add(phone1);
        items.add(computer);
        items.add(phone2);

        System.out.println(items);

        System.out.println(countMatches(items , "color" , "silver"));

    }
}
