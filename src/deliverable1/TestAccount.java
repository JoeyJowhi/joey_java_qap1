package deliverable1;

public class TestAccount {
    public static void main(String[] args) {
        Account Acc1 = new Account("1", "Acc1", 5000);
        Account Acc2 = new Account("2", "Acc2", 4000);

        System.out.printf("deliverable1.Account 1 Balance: $%d\ndeliverable1.Account 2 Balance: $%d", Acc1.getBalance(), Acc2.getBalance());

        Acc1.transferTo(Acc2, 1000);

        System.out.printf("\n\nAfter Transfer:\ndeliverable1.Account 1 Balance: $%d\ndeliverable1.Account 2 Balance: $%d", Acc1.getBalance(), Acc2.getBalance());
    }
}