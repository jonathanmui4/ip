package duke.task;

public class Events extends Task{
    protected String at;

    public Events(String description, String at) {
        super(description);
        this.at = at;
    }

    @Override
    public String toString() {
        return "[E]" + getStatusIcon() + description + " (at:" + at + ")";
    }

    @Override
    public String convertToCSV() { return ("E," + getStatusIcon() + "," + description + "," + at); }
}
