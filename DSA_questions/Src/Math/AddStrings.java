package Math;

public class AddStrings {

        public String addStrings(String s1, String s2) {
            StringBuilder sb = new StringBuilder();
            int res = 0;
            int i = s1.length()-1;
            int j = s2.length()-1;
            int carry = 0;
            int sum = 0;
            while(i>=0 || j>=0){
                sum = carry;
                if(i>=0){
                    sum += s1.charAt(i) - '0';
                    i--;
                }

                if(j>=0){
                    sum += s2.charAt(j) - '0';
                    j--;
                }
                carry = sum / 10;

                sb.append(sum % 10);

            }
            if(carry!=0){
                sb.append(carry);
            }
            return sb.reverse().toString();
        }

}
