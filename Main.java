import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Booking det = new Booking();
        ArrayList r1 = new ArrayList();

        r1.add(new Room(101, 4, Type.Duplex, 1500, AC.Non_A_C));
        Object ref1 = r1.get(0);
        Room room1 = (Room) ref1;

        r1.add(new Room(102, 4, Type.Duplex, 1500, AC.Non_A_C));
        Object ref2 = r1.get(1);
        Room room2 = (Room) ref2;

        r1.add(new Room(103, 5, Type.Duplex, 2000, AC.A_C));
        Object ref3 = r1.get(2);
        Room room3 = (Room) ref3;

        r1.add(new Room(201, 8, Type.Resort, 3000, AC.Non_A_C));
        Object ref4 = r1.get(3);
        Room room4 = (Room) ref4;

        r1.add(new Room(202, 8, Type.Resort, 3000, AC.Non_A_C));
        Object ref5 = r1.get(4);
        Room room5 = (Room) ref5;

        r1.add(new Room(203, 10, Type.Resort, 4000, AC.A_C));
        Object ref6 = r1.get(5);
        Room room6 = (Room) ref6;

        r1.add(new Room(301, 12, Type.Suit_Room, 6000, AC.A_C));
        Object ref7 = r1.get(6);
        Room room7 = (Room) ref7;

        r1.add(new Room(302, 12, Type.Suit_Room, 6000, AC.A_C));
        Object ref8 = r1.get(7);
        Room room8 = (Room) ref8;

        System.out.println("Welcome to AW Inn");
        System.out.println("Please Enter Your Name");
        String name = s.nextLine();
        Thread.sleep(2000);
        boolean wh0=true;
        while (wh0)
    {
            System.out.println("Please select \n1.Booking\n2.Cancelling");
            int wh1 = s.nextInt();
            switch (wh1) {
                case 1: {
                    boolean rep = true;
                    while (rep) {
                        System.out.println("Please enter no of Days that U want to Book ");
                        int days = s.nextInt();
                        Thread.sleep(2000);
                        System.out.println("Kindly view our rooms");
                        System.out.println("***********************");
                        System.out.println("1.Duplex \n2.Resort \n3.Suit_Room");
                        Thread.sleep(2000);
                        int roomType = s.nextInt();
                        if (roomType == 1) {
                            System.out.println("Enter no of persons");
                            int count = s.nextInt();
                            Thread.sleep(2000);
                            if (count != 0 && count <= 5) {
                                System.out.println("Please Select the room\n************\n101\n102\n103");
                                int duRoom = s.nextInt();
                                switch (duRoom) {
                                    case 1: {
                                        if (count <= 4) {
                                            System.out.println("Checking the room Availability..\n Please wait");
                                            Thread.sleep(2000);
                                            if (room1.isRoomAvai()) {
                                                System.out.println("Sorry The room wasBooked already");
                                            } else {

                                                System.out.println("Your Room is free now \n Kindly Look at the features");
                                                System.out.println("Room No: " + room1.getrID() + "\nRoom Capacity: " + room1.getrCap() + "\nRoom Type: " + room1.getrType() + "\nRoom amount: " + room1.getrAmount() + "\nA/c Availability: " + room1.getaC());
                                                double res = Math.random() * 9999 + 9999;
                                                int otp = (int) res;
                                                System.out.println(otp);
                                                System.out.println("Enter the Booking ID");
                                                int eOtp = s.nextInt();
                                                if (otp == eOtp) {
                                                    Booking bDet = new Booking(eOtp, name, count, room1.getrID());
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
                                                                int amt = room1.getrAmount() * days;
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
                                                                            room1.setRoomAvai(true);
                                                                            room1.setrBook(true);
                                                                            room1.setRoomCode(bDet.getbID());
                                                                            System.out.println("Use to Vacate: "+room1.getRoomCode());

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
                                                                            room1.setRoomAvai(true);
                                                                            room1.setrBook(true);
                                                                            room1.setRoomCode(bDet.getbID());
                                                                            System.out.println("Use to Vacate: "+room1.getRoomCode());
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

                                       // Check.check(room1.getrID(),room1.getrCap(),room1.getrType(),room1.getrAmount(),room1.getaC(),room1.isRoomAvai(),room1.isrBook(),room1.getRoomCode(),count,name,days);

                                        break;
                                    }

                                    case 2: {
                                        if (count <= 4) {
                                            System.out.println("Checking the room Availability..\n Please wait");
                                            Thread.sleep(2000);
                                            if (room2.isRoomAvai()) {
                                                System.out.println("Sorry The room wasBooked already");
                                            } else {

                                                System.out.println("Your Room is free now \n Kindly Look at the features");
                                                System.out.println("Room No: " + room2.getrID() + "\nRoom Capacity: " + room2.getrCap() + "\nRoom Type: " + room2.getrType() + "\nRoom amount: " + room2.getrAmount() + "\nA/c Availability: " + room2.getaC());
                                                double res = Math.random() * 9999 + 9999;
                                                int otp = (int) res;
                                                System.out.println(otp);
                                                System.out.println("Enter the Booking ID");
                                                int eOtp = s.nextInt();
                                                if (otp == eOtp) {
                                                    Booking bDet = new Booking(eOtp, name, count, room2.getrID());
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
                                                                int amt = room2.getrAmount() * days;
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
                                                                            room2.setRoomAvai(true);
                                                                            room2.setrBook(true);
                                                                            room2.setRoomCode(bDet.getbID());
                                                                            System.out.println("Use to Vacate: "+room2.getRoomCode());

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
                                                                            room2.setRoomAvai(true);
                                                                            room2.setrBook(true);
                                                                            room2.setRoomCode(bDet.getbID());
                                                                            System.out.println("Use to Vacate: "+room2.getRoomCode());
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
                                        break;
                                    }

                                    case 3: {
                                        if (count <= 5) {
                                            System.out.println("Checking the room Availability..\n Please wait");
                                            Thread.sleep(2000);
                                            if (room3.isRoomAvai()) {
                                                System.out.println("Sorry The room wasBooked already");
                                            } else {

                                                System.out.println("Your Room is free now \n Kindly Look at the features");
                                                System.out.println("Room No: " + room3.getrID() + "\nRoom Capacity: " + room3.getrCap() + "\nRoom Type: " + room3.getrType() + "\nRoom amount: " + room3.getrAmount() + "\nA/c Availability: " + room3.getaC());
                                                double res = Math.random() * 9999 + 9999;
                                                int otp = (int) res;
                                                System.out.println(otp);
                                                System.out.println("Enter the Booking ID");
                                                int eOtp = s.nextInt();
                                                if (otp == eOtp) {
                                                    Booking bDet = new Booking(eOtp, name, count, room3.getrID());
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
                                                                int amt = room3.getrAmount() * days;
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
                                                                            room3.setRoomAvai(true);
                                                                            room3.setrBook(true);
                                                                            room3.setRoomCode(bDet.getbID());
                                                                            System.out.println("Use to Vacate: "+room3.getRoomCode());

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
                                                                            room3.setRoomAvai(true);
                                                                            room3.setrBook(true);
                                                                            room3.setRoomCode(bDet.getbID());
                                                                            System.out.println("Use to Vacate: "+room3.getRoomCode());
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
                                            System.out.println("Sorry capacity is full \n Try Another type Resort or Suit Room");
                                        }
                                        break;
                                    }
                                }
                            } else {
                                System.out.println("Sry Try the Other two");
                            }
                        } else if (roomType == 2) {
                            System.out.println("Enter no of persons");
                            int count = s.nextInt();
                            Thread.sleep(2000);
                            if (count != 0 && count <= 10) {
                                System.out.println("Please select the room\n************\n201\n202\n203");
                                int duRoom = s.nextInt();
                                switch (duRoom) {
                                    case 1: {
                                        if (count <= 8) {
                                            System.out.println("Checking the room Availability..\n Please wait");
                                            Thread.sleep(2000);
                                            if (room4.isRoomAvai()) {
                                                System.out.println("Sorry The room wasBooked already");
                                            } else {

                                                System.out.println("Your Room is free now \n Kindly Look at the features");
                                                System.out.println("Room No: " + room4.getrID() + "\nRoom Capacity: " + room4.getrCap() + "\nRoom Type: " + room4.getrType() + "\nRoom amount: " + room4.getrAmount() + "\nA/c Availability: " + room4.getaC());
                                                double res = Math.random() * 9999 + 9999;
                                                int otp = (int) res;
                                                System.out.println(otp);
                                                System.out.println("Enter the Booking ID");
                                                int eOtp = s.nextInt();
                                                if (otp == eOtp) {
                                                    Booking bDet = new Booking(eOtp, name, count, room4.getrID());
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
                                                                int amt = room1.getrAmount() * days;
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
                                                                            room4.setRoomAvai(true);
                                                                            room4.setrBook(true);
                                                                            room4.setRoomCode(bDet.getbID());
                                                                            System.out.println("Use to Vacate: "+room4.getRoomCode());

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
                                                                            room4.setRoomAvai(true);
                                                                            room4.setrBook(true);
                                                                            room4.setRoomCode(bDet.getbID());
                                                                            System.out.println("Use to Vacate: "+room4.getRoomCode());
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
                                            System.out.println("Sorry capacity is full \n Try another room 203");
                                        }
                                        break;
                                    }

                                    case 2: {
                                        if (count <= 8) {
                                            System.out.println("Checking the room Availability..\n Please wait");
                                            Thread.sleep(2000);
                                            if (room5.isRoomAvai()) {
                                                System.out.println("Sorry The room wasBooked already");
                                            } else {

                                                System.out.println("Your Room is free now \n Kindly Look at the features");
                                                System.out.println("Room No: " + room5.getrID() + "\nRoom Capacity: " + room5.getrCap() + "\nRoom Type: " + room5.getrType() + "\nRoom amount: " + room5.getrAmount() + "\nA/c Availability: " + room5.getaC());
                                                double res = Math.random() * 9999 + 9999;
                                                int otp = (int) res;
                                                System.out.println(otp);
                                                System.out.println("Enter the Booking ID");
                                                int eOtp = s.nextInt();
                                                if (otp == eOtp) {
                                                    Booking bDet = new Booking(eOtp, name, count, room5.getrID());
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
                                                                int amt = room5.getrAmount() * days;
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
                                                                            room5.setRoomAvai(true);
                                                                            room5.setrBook(true);
                                                                            room5.setRoomCode(bDet.getbID());
                                                                            System.out.println("Use to Vacate: "+room5.getRoomCode());

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
                                                                            room5.setRoomAvai(true);
                                                                            room5.setrBook(true);
                                                                            room5.setRoomCode(bDet.getbID());
                                                                            System.out.println("Use to Vacate: "+room5.getRoomCode());
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
                                            System.out.println("Sorry capacity is full \n Try another room 203");
                                        }
                                        break;
                                    }

                                    case 3: {
                                        if (count <= 10) {
                                            System.out.println("Checking the room Availability..\n Please wait");
                                            Thread.sleep(2000);
                                            if (room6.isRoomAvai()) {
                                                System.out.println("Sorry The room wasBooked already");
                                            } else {

                                                System.out.println("Your Room is free now \n Kindly Look at the features");
                                                System.out.println("Room No: " + room6.getrID() + "\nRoom Capacity: " + room6.getrCap() + "\nRoom Type: " + room6.getrType() + "\nRoom amount: " + room6.getrAmount() + "\nA/c Availability: " + room6.getaC());
                                                double res = Math.random() * 9999 + 9999;
                                                int otp = (int) res;
                                                System.out.println(otp);
                                                System.out.println("Enter the Booking ID");
                                                int eOtp = s.nextInt();
                                                if (otp == eOtp) {
                                                    Booking bDet = new Booking(eOtp, name, count, room6.getrID());
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
                                                                int amt = room6.getrAmount() * days;
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
                                                                            room6.setRoomAvai(true);
                                                                            room6.setrBook(true);
                                                                            room6.setRoomCode(bDet.getbID());
                                                                            System.out.println("Use to Vacate: "+room6.getRoomCode());

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
                                                                            room6.setRoomAvai(true);
                                                                            room6.setrBook(true);
                                                                            room6.setRoomCode(bDet.getbID());
                                                                            System.out.println("Use to Vacate: "+room6.getRoomCode());
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
                                            System.out.println("Sorry capacity is full \n Try Suit Room");
                                        }
                                        break;
                                    }
                                }
                            } else {
                                System.out.println("Sry Try the Suit_Room");
                            }
                        } else if (roomType == 3) {
                            System.out.println("Enter no of persons");
                            int count = s.nextInt();
                            Thread.sleep(2000);
                            if (count != 0 && count <= 12) {
                                System.out.println("Please select the room\n************\n301\n302");
                                int duRoom = s.nextInt();
                                switch (duRoom) {
                                    case 1: {
                                        if (count <= 12) {
                                            System.out.println("Checking the room Availability..\n Please wait");
                                            Thread.sleep(2000);
                                            if (room7.isRoomAvai()) {
                                                System.out.println("Sorry The room wasBooked already");
                                            } else {

                                                System.out.println("Your Room is free now \n Kindly Look at the features");
                                                System.out.println("Room No: " + room7.getrID() + "\nRoom Capacity: " + room7.getrCap() + "\nRoom Type: " + room7.getrType() + "\nRoom amount: " + room7.getrAmount() + "\nA/c Availability: " + room7.getaC());
                                                double res = Math.random() * 9999 + 9999;
                                                int otp = (int) res;
                                                System.out.println(otp);
                                                System.out.println("Enter the Booking ID");
                                                int eOtp = s.nextInt();
                                                if (otp == eOtp) {
                                                    Booking bDet = new Booking(eOtp, name, count, room7.getrID());
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
                                                                int amt = room7.getrAmount() * days;
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
                                                                            room7.setRoomAvai(true);
                                                                            room7.setrBook(true);
                                                                            room7.setRoomCode(bDet.getbID());
                                                                            System.out.println("Use to Vacate: "+room7.getRoomCode());

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
                                                                            room7.setRoomAvai(true);
                                                                            room7.setrBook(true);
                                                                            room7.setRoomCode(bDet.getbID());
                                                                            System.out.println("Use to Vacate: "+room7.getRoomCode());
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
                                            System.out.println("Sorry capacity is full \n More than 12 was not allowed to stay in Single Room");
                                        }
                                        break;
                                    }

                                    case 2: {
                                        if (count <= 12) {
                                            System.out.println("Checking the room Availability..\n Please wait");
                                            Thread.sleep(2000);
                                            if (room8.isRoomAvai()) {
                                                System.out.println("Sorry The room wasBooked already");
                                            } else {

                                                System.out.println("Your Room is free now \n Kindly Look at the features");
                                                System.out.println("Room No: " + room8.getrID() + "\nRoom Capacity: " + room8.getrCap() + "\nRoom Type: " + room8.getrType() + "\nRoom amount: " + room8.getrAmount() + "\nA/c Availability: " + room8.getaC());
                                                double res = Math.random() * 9999 + 9999;
                                                int otp = (int) res;
                                                System.out.println(otp);
                                                System.out.println("Enter the Booking ID");
                                                int eOtp = s.nextInt();
                                                if (otp == eOtp) {
                                                    Booking bDet = new Booking(eOtp, name, count, room8.getrID());
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
                                                                int amt = room8.getrAmount() * days;
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
                                                                            room8.setRoomAvai(true);
                                                                            room8.setrBook(true);
                                                                            room8.setRoomCode(bDet.getbID());
                                                                            System.out.println("Use to Vacate: "+room8.getRoomCode());

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
                                                                            room8.setRoomAvai(true);
                                                                            room8.setrBook(true);
                                                                            room8.setRoomCode(bDet.getbID());
                                                                            System.out.println("Use to Vacate: "+room8.getRoomCode());
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
                                            System.out.println("Sorry capacity is full \n More than 12 was not allowed to stay in Single Room");
                                        }
                                        break;
                                    }
                                }
                            } else {
                                System.out.println("Sry more than 12 not allowed to stay in single room try booking another room");
                            }
                        } else {
                            System.out.println("Sry more than 12 not allowed to stay in single room try booking another room");
                        }


                        System.out.println("Thank You If u Wanna Continue Booking \n 1.Yes \n 2.No");
                        int rep1 = s.nextInt();
                        if (rep1 == 1) {
                            System.out.println("Please follow the previous Procedure Asap");
                        } else {
                            System.out.println("Thank You for using AW Booking");
                            rep = false;
                        }

                    }
                    break;
                }


                case 2: {
                    boolean vac0 = true;
                    while (vac0) {
                        System.out.println("Do you want to vacate your Room\n1. yes\n2. No");
                        int vac = s.nextInt();
                        if (vac == 1) {
                            System.out.println("Please enter the number you have Booked\n1.101\n2.102\n3.103\n4.201\n5.202\n6.203\n7.301\n8.302");
                            int vac1 = s.nextInt();
                            switch (vac1) {
                                case 1: {
                                    System.out.println("Enter the Room code");

                                    int vac2 = s.nextInt();
                                    if (room1.getRoomCode() == 0) {
                                        System.out.println("The room you entered was not booked yet");
                                    } else if (room1.getRoomCode() == vac2) {
                                        room1.setRoomCode(0);
                                        room1.setRoomAvai(false);
                                        room1.setrBook(false);
                                        System.out.println("You have Vacated the Room Successfully");

                                    } else {
                                        System.out.println("Your Code was incorrect Please Try again");
                                    }
                                    break;
                                }

                                case 2: {
                                    System.out.println("Enter the Room code");

                                    int vac2 = s.nextInt();
                                    if (room2.getRoomCode() == 0) {
                                        System.out.println("The room you entered was not booked yet");
                                    } else if (room2.getRoomCode() == vac2) {
                                        room2.setRoomCode(0);
                                        room2.setRoomAvai(false);
                                        room2.setrBook(false);
                                        System.out.println("You have Vacated the Room Successfully");

                                    } else {
                                        System.out.println("Your Code was incorrect Please Try again");
                                    }
                                    break;
                                }
                                case 3: {
                                    System.out.println("Enter the Room code");

                                    int vac2 = s.nextInt();
                                    if (room3.getRoomCode() == 0) {
                                        System.out.println("The room you entered was not booked yet");
                                    } else if (room3.getRoomCode() == vac2) {
                                        room3.setRoomCode(0);
                                        room3.setRoomAvai(false);
                                        room3.setrBook(false);
                                        System.out.println("You have Vacated the Room Successfully");

                                    } else {
                                        System.out.println("Your Code was incorrect Please Try again");
                                    }
                                    break;
                                }
                                case 4: {
                                    System.out.println("Enter the Room code");

                                    int vac2 = s.nextInt();
                                    if (room4.getRoomCode() == 0) {
                                        System.out.println("The room you entered was not booked yet");
                                    } else if (room4.getRoomCode() == vac2) {
                                        room4.setRoomCode(0);
                                        room4.setRoomAvai(false);
                                        room4.setrBook(false);
                                        System.out.println("You have Vacated the Room Successfully");

                                    } else {
                                        System.out.println("Your Code was incorrect Please Try again");
                                    }
                                    break;
                                }

                                case 5: {
                                    System.out.println("Enter the Room code");

                                    int vac2 = s.nextInt();
                                    if (room5.getRoomCode() == 0) {
                                        System.out.println("The room you entered was not booked yet");
                                    } else if (room5.getRoomCode() == vac2) {
                                        room5.setRoomCode(0);
                                        room5.setRoomAvai(false);
                                        room5.setrBook(false);
                                        System.out.println("You have Vacated the Room Successfully");

                                    } else {
                                        System.out.println("Your Code was incorrect Please Try again");
                                    }
                                    break;
                                }
                                case 6: {
                                    System.out.println("Enter the Room code");

                                    int vac2 = s.nextInt();
                                    if (room6.getRoomCode() == 0) {
                                        System.out.println("The room you entered was not booked yet");
                                    } else if (room6.getRoomCode() == vac2) {
                                        room6.setRoomCode(0);
                                        room6.setRoomAvai(false);
                                        room6.setrBook(false);
                                        System.out.println("You have Vacated the Room Successfully");

                                    } else {
                                        System.out.println("Your Code was incorrect Please Try again");
                                    }
                                    break;
                                }
                                case 7: {
                                    System.out.println("Enter the Room code");

                                    int vac2 = s.nextInt();
                                    if (room7.getRoomCode() == 0) {
                                        System.out.println("The room you entered was not booked yet");
                                    } else if (room7.getRoomCode() == vac2) {
                                        room7.setRoomCode(0);
                                        room7.setRoomAvai(false);
                                        room7.setrBook(false);
                                        System.out.println("You have Vacated the Room Successfully");

                                    } else {
                                        System.out.println("Your Code was incorrect Please Try again");
                                    }
                                    break;
                                }
                                case 8: {
                                    System.out.println("Enter the Room code");

                                    int vac2 = s.nextInt();
                                    if (room8.getRoomCode() == 0) {
                                        System.out.println("The room you entered was not booked yet");
                                    } else if (room8.getRoomCode() == vac2) {
                                        room8.setRoomCode(0);
                                        room8.setRoomAvai(false);
                                        room8.setrBook(false);
                                        System.out.println("You have Vacated the Room Successfully");

                                    } else {
                                        System.out.println("Your Code was incorrect Please Try again");
                                    }
                                    break;
                                }
                            }
                        }
                        System.out.println("If you want to Vacate more than one room you room? \n1.Yes\n2.No ");
                        int vac4 = s.nextInt();
                        if (vac4 == 1) {
                            System.out.println("Please follow the procedures as before");
                        } else {
                            System.out.println("Thank You Visit Again");
                            vac0 = false;
                        }
                    }
                    break;
                }
            }
            System.out.println("Do You Want to quit\n1.yes\n2.No");
            int qui=s.nextInt();
            if (qui==1){
                System.out.println("Thank you visit Again");
                wh0=false;
            }else {
                System.out.println("Please follow the Procedures Asap");
            }
        }
    }
}
