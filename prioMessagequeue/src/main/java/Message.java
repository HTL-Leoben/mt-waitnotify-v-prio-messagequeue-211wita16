public class Message {
    private boolean isPriority;
    private String content;

    public Message(boolean isPriority, String content) {
        this.isPriority = isPriority;
        this.content = content;
    }

    public boolean isPriority() {
        return isPriority;
    }

    public void setPriority(boolean priority) {
        isPriority = priority;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "[Priority: " + isPriority + ", Content: " + content + "]";
    }
}
