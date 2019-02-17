package main;

import account.AccountService;
import account.TransferService;
import log.Logger;

public class Main {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        TransferService transferService = new TransferService();

        accountService.deposit("1212121212121212", 3000);
        accountService.withdraw("1212121212121212", 1000);
        transferService.transfer("1212121212121212","1212121212121213",500);
    }
    Logger logger = Logger.getInstance();
}
