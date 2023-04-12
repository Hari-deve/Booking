import java.util.Scanner;

public class Check {
    static int getrID;static int getrCap;static Type getrType;static int getrAmount;static AC getaC;static boolean isRoomAvai;static boolean isrBook;static int getRoomCode;static int count;static String name;static int days;
    static Scanner s=new Scanner(System.in);
    public static void check(int getrID,int getrCap,Type getrType,int getrAmount,AC getaC,boolean isRoomAvai,boolean isrBook,int getRoomCode,int count,String name,int days) throws Exception {
        if (count <= 4) {
            System.out.println("Checking the room Availability..\n Please wait");
            Thread.sleep(2000);
            if (isRoomAvai) {
                System.out.println("Sorry The room wasBooked already");
            } else {

                System.out.println("Your Room is free now \n Kindly Look at the features");
                System.out.println("Room No: " + getrID + "\nRoom Capacity: " + getrCap + "\nRoom Type: " + getrType + "\nRoom amount: " + getrAmount + "\nA/c Availability: " + getaC);
                double res = Math.random() * 9999 + 9999;
                int otp = (int) res;
                System.out.println(otp);
                System.out.println("Enter the Booking ID");
                int eOtp = s.nextInt();
                if (otp == eOtp) {
                    Booking bDet = new Booking(eOtp, name, count,getrID);
                    System.out.println("Your Booking ID: " + bDet.getbID() + "\n" + "Name: " + bDet.getbName() + "\n" + "No of Persons: " + bDet.getbCount() + "\n" + "Your Room No: " + bDet.getbRoom());
                    System.out.println("Please confirm your booking\n 1. Yes \n 2.No");
                    int con = s.nextInt();
                    Thread.sleep(2000);
                    if (con == 1) {
                        boolean pay_con = true;
                        while (pay_con) {
                            System.out.println("Please check our Payment Options \n1.Yes \n2.No");
                            int can = s.nextInt();
                            if (can == 1) {
                                int amt = getrAmount * days;
                                System.out.println("Your Bill amount to Pay: " + amt);
                                Thread.sleep(2000);
                                System.out.println("Select the Payment options \n1.UPI \n2.Net Banking");
                                int pay = s.nextInt();
                                if (pay == 1) {
                                    System.out.println("Please enter the pin");
                                    int user_pin = 1234;
                                    boolean u_pay1 = true;
                                    while (u_pay1) {
                                        int pin1 = s.nextInt();
                                        if (user_pin == pin1) {
                                            System.out.println("Payment Successful\nThank You \n Have a pleasant day");
                                            u_pay1 = false;
                                            pay_con = false;
                                            isRoomAvai =true;
                                            isrBook =true;
                                            getRoomCode =bDet.getbID();
                                            System.out.println("Use to Vacate: "+getRoomCode);

                                        } else {
                                            System.out.println("Payment Failure please try again");
                                        }
                                    }

                                } else if (pay == 2) {

                                    boolean cas_pay = true;
                                    while (cas_pay) {
                                        System.out.println("Please Enter the OTP ");
                                        double oTP = Math.random() * 9999 + 9999;
                                        int oTP1 = (int) oTP;
                                        System.out.println(oTP1);
                                        int u_OTP = s.nextInt();
                                        if (oTP1 == u_OTP) {
                                            System.out.println("Amount Paid successfully\nThank you ");
                                            cas_pay = false;
                                            pay_con = false;
                                            isRoomAvai =true;
                                            isrBook =true;
                                            getRoomCode =bDet.getbID();
                                            System.out.println("Use to Vacate: "+getRoomCode);
                                        } else {
                                            System.out.println("Incorrect OTP try again");
                                        }
                                    }
                                    System.out.println("Your Room Booked Successfully");
                                }
                            } else {
                                System.out.println("Sorry Choose correct Payment option");
                            }
                        }
                    } else {
                        System.out.println("Sorry you Cancelled the Booking");
                    }

                } else {
                    System.out.println("Entered a wrong Booking ID Please Try Again");
                }
            }
        } else {
            System.out.println("Sorry capacity is full \n Try another room 103");
        }

    }
    public static void vacate(){
        System.out.println("Enter the Room code");

        int vac2 = s.nextInt();
        if (getRoomCode == 0) {
            System.out.println("The room you entered was not booked yet");
        } else if (getRoomCode == vac2) {
            getRoomCode=0;
            isRoomAvai=false;
            isrBook=false;
            System.out.println("You have Vacated the Room Successfully");

        } else {
            System.out.println("Your Code was incorrect Please Try again");
        }
    }

}
