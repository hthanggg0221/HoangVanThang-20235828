import java.util.Scanner;
import java.time.LocalDate;

class TransactionLog {
    private LocalDate date;
    private double amount;
    private String typeOfTrans;
    private int n;
    public TransactionLog(int n, String typeOfTrans, double amount, LocalDate date){
        this.typeOfTrans = typeOfTrans;
        this.date = date;
        this.amount = amount;
        this.n = n;
    }
    public void TransactionLogFormat(){
        System.out.printf("%d. %s - %.0f VND - %s%n", n, typeOfTrans, amount, date);
    }

}

class BankAccount{
    Scanner keyboard = new Scanner(System.in);
    private String accountHolder;
    private double balance;
    private double monthlyInterestRate = 0.005;
    private int withdrawalInThisMonth;
    private int number = 0;
    private int transSize = 0;
    private TransactionLog log[] = new TransactionLog[1000000];
    public BankAccount(String accountHolder, double initialBalance){
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.log = new TransactionLog[1000000];
        this.withdrawalInThisMonth = 0;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.printf("Da gui %.0f VND%n", amount);
            number++;
            log[transSize] = new TransactionLog(number, "Deposit", amount, LocalDate.now());
            transSize++;
        }
    }

    public void withdrawal(double amount){
        switch (withdrawalInThisMonth) {
            case 0:
            case 1:
                if (amount > 0 && balance >= amount){
                    balance -= amount;
                    withdrawalInThisMonth++;
                    System.out.printf("Da rut %.0f VND%n", amount);
                    number++;
                    log[transSize] = new TransactionLog(number, "Withdraw", amount, LocalDate.now());
                    transSize++;
                } else {
                    System.out.println("So tien ban nhap khong hop le hoac so du trong tai khoan cua ban khong du!");
                }
                break;
            case 2:
                System.out.println("Ban chi con 1 lan rut tien nua trong thang nay. Ban co muon thay doi so tien muon rut khong?");
                System.out.println("1. Co\n2. Khong");
                int choice = keyboard.nextInt();
                if (choice == 1){
                    System.out.println("Nhap so tien ma ban muon rut: ");
                    amount = keyboard.nextDouble();
                    if (amount > 0 && balance >= amount){
                        balance -= amount;
                        withdrawalInThisMonth++;
                        System.out.printf("Da rut %.0f VND%n", amount);
                        number++;
                        log[transSize] = new TransactionLog(number, "Withdraw", amount, LocalDate.now());
                        transSize++;
                    } else {
                        System.out.println("So tien ban nhap khong hop le hoac so du trong tai khoan cua ban khong du!");
                    }
                } else if (choice == 2) {
                    if (amount > 0 && balance >= amount){
                        balance -= amount;
                        withdrawalInThisMonth++;
                        System.out.printf("Da rut %.0f VND%n", amount);
                        number++;
                        log[transSize] = new TransactionLog(number, "Withdraw", amount, LocalDate.now());
                        transSize++;
                    } else {
                        System.out.println("So tien ban nhap khong hop le hoac so du trong tai khoan cua ban khong du!");
                    }
                }
                break;
            default:
                System.out.printf("Rut %.0f VND - Loi: Ban da dat gioi han rut tien thang nay.%n", amount);
                break;
        }
    }

    public void MonthlyInterest(int n){
        double expectedAmount = balance;
        for (int i = 0; i < n; ++i){
            double temp = expectedAmount * monthlyInterestRate;
            expectedAmount += temp;
        }
        System.out.printf("So tien du kien sau %d thang la: %.0f VND%n", n, expectedAmount);
    }

    public void currentBalance(){
        System.out.printf("So du hien tai: %.0f VND.%n", balance);
    }

    public String getAccountHolderName(){
        return accountHolder;
    }

    public double getBalance(){
        return balance;
    }

    public void TransactionHistory(){
        for (int i = 0; i < transSize; ++i){
            log[i].TransactionLogFormat();
        }
    }
}

public class Main {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Tao tai khoan ten: ");
        String strName = keyboard.nextLine();
        System.out.print("Voi so du ban dau la: ");
        int initialBalance = keyboard.nextInt();
        BankAccount account = new BankAccount(strName, initialBalance);
        System.out.printf("Tai khoan da duoc tao thanh cong! Ten tai khoan: %s. So du ban dau: %.0f VND.%n", account.getAccountHolderName(), account.getBalance());
        System.out.println("Epilogue Bank");
        int choice;
        do {
            System.out.println("\nDanh sach tinh nang:");
            System.out.println("1. Nap tien\n2. Rut tien\n3. Hien thi so du hien tai\n4. Lich su giao dich\n5. So du du kien sau n thang (sau khi cong lai)\n6. Logout");
            System.out.print("Tinh nang ban muon su dung: ");
            choice = keyboard.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhap so tien ma ban muon gui vao tai khoan: ");
                    double amount = keyboard.nextDouble();
                    account.deposit(amount);
                    break;
                case 2:
                    System.out.print("Nhap so tien ma ban muon rut khoi tai khoan: ");
                    double amt = keyboard.nextDouble();
                    account.withdrawal(amt);
                    break;
                case 3:
                    account.currentBalance();
                    break;
                case 4:
                    System.out.println("Lich su giao dich");
                    account.TransactionHistory();
                    break;
                case 5:
                    System.out.print("Ban muon biet so du sau bao nhieu thang: ");
                    int month = keyboard.nextInt();
                    if (month > 0){
                        account.MonthlyInterest(month);
                    }
                    else {
                        System.out.println("Ban da nhap sai. Hay thu lai!");
                    }
                    break;
                case 6:
                    System.out.println("Cam on quy khach da su dung dich vu cua chung toi");
                    break;
                default:
                    System.out.println("Khong tim thay tinh nang. Hay thu lai!");
                    break;
            }
        } while(choice != 6);
        keyboard.close();
    }
}
