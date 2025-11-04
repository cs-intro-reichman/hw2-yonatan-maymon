public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minToAdd = Integer.parseInt(args[1]);
        int TotalMinutes = (hours * 60) + minutes + minToAdd;
        int TotalHours = TotalMinutes / 60;
        int NewHours = TotalHours % 24;
        int NewMinutes = TotalMinutes - (TotalHours * 60);
        String NewHoursStr = Integer.toString(NewHours);
        String NewMinutesStr = Integer.toString(NewMinutes);
        if (NewHours < 10){
            NewHoursStr = "0" + NewHoursStr;
        }
        if (NewMinutes < 10) {
            NewMinutesStr = "0" + NewMinutesStr;
        }
        System.out.println(NewHoursStr + ":" + NewMinutesStr);
    }
}
