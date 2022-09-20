package ch13;

import javax.swing.JOptionPane;

class Exercise13_9 {
    public static void main(String[] args) throws Exception {
        Exercise13_9_1 th1 = new Exercise13_9_1();
        th1.start();
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");
        th1.interrupt(); // 쓰레드에게 작업을 멈추라고 요청한다.
    }
}

class Exercise13_9_1 extends Thread {
    public void run() {
        int i = 10;
        while (i != 0 && !isInterrupted()) {
            System.out.println(i--);
            try {
                Thread.sleep(1000); // 1초 지연
            } catch (InterruptedException e) {
                interrupt();
            }
        }
        System.out.println("카운트가 종료되었습니다.");
    } // main
}