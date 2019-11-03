package Java_ProjectHobby;

public class hobby_exception extends Exception {
    public hobby_exception() {
    }

    public hobby_exception(String message) {
        super(message);
    }

    public hobby_exception(String message, Throwable cause) {
        super(message, cause);
    }

    public hobby_exception(Throwable cause) {
        super(cause);
    }

    public hobby_exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

