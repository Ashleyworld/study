class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        for(int i = 1; i<count+1; i++){
            sum += price * i;
        }
        if(sum > money) {
            answer = sum - money;
        }

        return answer;
    }
}


참고2.
class Solution {
    public long solution(long price, long money, long count) {
        long temp = 0;
        for(int i = 1; i <= count; i++)
        {
            temp += i * price;
        }

        if (temp > money)
            return temp-money;

        else return 0;

    }
}