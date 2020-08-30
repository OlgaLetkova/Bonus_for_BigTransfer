public class Main {
    public static void main(String[] args) {
        int transfer = 2200_00;
        int bonusAmount = 100_00;
        int limit = 1000_00;
        //Значения переменных Transfer,BonusAmount и Limit берется с копейками. Последние два знака - это копейки.
        int totalBonus;
        if (transfer > limit){
            totalBonus = transfer / bonusAmount;
        } else {
            totalBonus = 0;
        }
        System.out.println(totalBonus);
    }
}
