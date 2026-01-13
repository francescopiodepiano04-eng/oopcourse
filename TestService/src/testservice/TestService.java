/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testservice;

import javafx.concurrent.Service;
import javafx.concurrent.Task;

public class TestService extends Service<String> {

    @Override
    protected Task<String> createTask() {
        return new Task<String>() {
            @Override
            protected String call() throws Exception {
                String msg = "";

                updateMessage("Servizio avviato");

                try {
                    for (int i = 0; i < 10; i++) {
                        Thread.sleep(1000);

                        msg = "Info " + i;

                        updateProgress(i, 9);
                        updateValue(msg);
                    }

                    throw new RuntimeException();
                } catch (Exception e) {
                    updateMessage("Servizio interrotto.");
                }




                return msg;
            }
        };
    }
}