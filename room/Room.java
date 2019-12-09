package room;

import java.util.Scanner;

class Room {
    private boolean AC_ON, HOME_THEATRE_ON, FAN_ON, LIGHT_ON;
    private int limit = 2000;
    private int ac = 1200;
    private int ht = 600;
    private int fan = 400;
    private int light = 100;
    private int power = 0;

    public void ac(String s) {
        if (s.equals("ON")) {
            if (AC_ON) {
                System.out.println("Already ON");
            } else if (power + ac > limit) {
                System.out.println("OVERLOAD!");
            } else {
                System.out.println("AC ON Task Performed");
                power = power + ac;
                AC_ON = true;
            }
        } else if (s.equals("OFF")) {
            if (!AC_ON) {
                System.out.println("Already OFF");
            } else {
                System.out.println("AC OFF Task Performed");
                power = power - ac;
                AC_ON = false;
            }
        } else {
            System.out.println("Invalid input!");
        }
    }

    public void hometheatre(String s) {
        if (s.equals("ON")) {
            if (HOME_THEATRE_ON) {
                System.out.println("Already ON");
            } else if (power + ht > limit) {
                System.out.println("OVERLOAD!");
            } else {
                System.out.println("HOME THEATRE ON Task Performed");
                power = power + ht;
                HOME_THEATRE_ON = true;
            }
        } else if (s.equals("OFF")) {
            if (!HOME_THEATRE_ON) {
                System.out.println("Already OFF");
            } else {
                System.out.println("HOME THEATRE	 OFF Task Performed");
                power = power - ht;
                HOME_THEATRE_ON = false;
            }
        } else {
            System.out.println("Invalid input!");
        }
    }

    public void fan(String s) {
        if (s.equals("ON")) {
            if (FAN_ON) {
                System.out.println("Already ON");
            } else if (power + fan > limit) {
                System.out.println("OVERLOAD!");
            } else {
                System.out.println("FAN ON Task Performed");
                power = power + fan;
                FAN_ON = true;
            }
        } else if (s.equals("OFF")) {
            if (!FAN_ON) {
                System.out.println("Already OFF");
            } else {
                System.out.println("FAN OFF Task Performed");
                power = power - fan;
                FAN_ON = false;
            }
        } else {
            System.out.println("Invalid input!");
        }
    }

    public void light(String s) {
        if (s.equals("ON")) {
            if (LIGHT_ON) {
                System.out.println("Already ON");
            } else if (power + light > limit) {
                System.out.println("OVERLOAD!");
            } else {
                System.out.println("LIGHT ON Task Performed");
                power = power + light;
                LIGHT_ON = true;
            }
        } else if (s.equals("OFF")) {
            if (!LIGHT_ON) {
                System.out.println("Already OFF");
            } else {
                System.out.println("LIGHT OFF Task Performed");
                power = power - light;
                LIGHT_ON = false;
            }
        } else {
            System.out.println("Invalid input!");
        }
    }


}

class Menu {
    public static void main(String[] args) {
        boolean flag = true;
        Room obj = new Room();
        Scanner s = new Scanner(System.in);
        while (flag) {
            System.out.println("Entre the appliance name(AC/HOME_THEATRE/LIGHT/FAN)");
            String app = s.next();
            if (app.equals("AC")) {
                System.out.println("Entre the operation(ON/OFF) you want to perform on " + app);
                obj.ac(s.next());
            } else if (app.equals("HOME_THEATRE")) {
                System.out.println("Entre the operation(ON/OFF) you want to perform on " + app);
                obj.hometheatre(s.next());
            } else if (app.equals("LIGHT")) {
                System.out.println("Entre the operation(ON/OFF) you want to perform on " + app);
                obj.light(s.next());
            } else if (app.equals("FAN")) {
                System.out.println("Entre the operation(ON/OFF) you want to perform on " + app);
                obj.fan(s.next());
            } else {
                System.out.println("Invalid input!");
            }
            System.out.println("Do you want to perform more opearation\nEnter (TRUE/FALSE)");
            try {
                flag = s.nextBoolean();
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
        }
    }
}
