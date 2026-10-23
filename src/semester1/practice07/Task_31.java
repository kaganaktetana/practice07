package semester1.practice07;

import java.util.UUID;

public class Task_31 {
    public static void main(String[] args) {
        GameSession s1 = GameSession.createSession("Player1");
        GameSession s2 = GameSession.createSession("Player2");
        GameSession s3 = GameSession.createSession("Player3");
        GameSession s4 = GameSession.createSession("Player4");

        System.out.println(s1 != null);
        System.out.println(s2 != null);
        System.out.println(s3 != null);
        System.out.println(s4 == null);

        if (s1 != null) {
            s1.terminate();
        }

        GameSession s5 = GameSession.createSession("Player5");
        System.out.println(s5 != null);
    }
}

class GameSession {
    private String sessionToken;
    private String hostPlayer;
    private boolean isActive;

    private static int activeSessionsCount = 0;
    public static final int MAX_SESSIONS = 3;

    private GameSession(String host) {
        this.hostPlayer = host;
        this.sessionToken = UUID.randomUUID().toString();
        this.isActive = true;
    }

    public static GameSession createSession(String host) {
        if (activeSessionsCount >= MAX_SESSIONS) {
            System.out.println("Помилка: усі сервера перевантажені!");
            return null;
        }

        activeSessionsCount++;
        return new GameSession(host);
    }

    public void terminate() {
        if (isActive) {
            isActive = false;
            activeSessionsCount--;
        }
    }
}
