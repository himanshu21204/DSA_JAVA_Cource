package Greedy;
// https://leetcode.com/problems/lemonade-change/
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for(int i : bills){
            if(i==5) five++;
            else if(i==10)
                if(five == 0) return false;
                else{
                    five--;
                    ten++;
                }
            else
            if(five == 0|| (five < 3 && ten == 0)) return false;
            else
            if(ten == 0) five -= 3;
            else{
                five--;
                ten--;
            }
        }
        return true;
    }
    public boolean lemonadeChange1(int[] bills) {
        int five = 0;
        int ten = 0;

        for(int bill : bills){
            if(bill == 5){
                five++;
            }else if(bill == 10){
                ten++;
                five--;
            }else if(ten > 0) {
                ten--;
                five--;
            }else {
                five -= 3;
            }

            if(five < 0) return false;
        }
        return true;
    }
}
