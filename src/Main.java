public class Main {
    public static void main(String[] args) {
        int Transfer;
        int BonusAmount;
        int Limit;
        //Значения переменных Transfer,BonusAmount и Limit берется с копейками. Последние два знака - это копейки.
        Transfer = 2200_00;
        BonusAmount = 100_00;
        Limit = 1000_00;
        int TotalBonus;
        if (Transfer > Limit){
            TotalBonus = Transfer / BonusAmount;
        } else {
            TotalBonus = 0;
        }
        System.out.println(TotalBonus);
    }
}
