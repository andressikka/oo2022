class StandartHalve{
// https://et.wikipedia.org/wiki/Standardh%C3%A4lve
    public static double average(double[] nums){
        int quantity = nums.length;
        double totalSum = 0;
        double average;

        for (int i = 0; i < quantity; i++){
            totalSum = totalSum + nums[i];
        }
        System.out.println(totalSum);
        average = totalSum/quantity;

        return average;
    }

    public static double standartDeviation(double[] nums, double avg){
        double deviation = 0;
        double quantity = nums.length;
        for (int i = 0; i < quantity; i++){
            deviation += (nums[i] - avg) * (nums[i] - avg);
            System.out.println("V22rtuse h2lve: "+ (nums[i] - avg) * (nums[i] - avg));
        }
        deviation = Math.sqrt(deviation/quantity);


        return deviation;
    }



    public static void main (String[] args){
        double[] nums = new double[args.length];
        for (int i = 0; i < args.length; i++){
            nums[i] = Integer.parseInt(args[i]);
        }
        double avg = average(nums);
        System.out.println("Average: " + avg);
        double strdDev = standartDeviation(nums, avg);
        System.out.println("Deviation: " + strdDev);
    }
}