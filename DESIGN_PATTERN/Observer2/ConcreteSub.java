package Observer2;

public class ConcreteSub extends Sub{

    String file;

    ConcreteSub(String file)
    {
        this.file=file;
    }

    public void update(String file)
    {
        this.file=file;
        notify_all();
    }

    @Override
    public String get_file() {
        return file;
    }
}
