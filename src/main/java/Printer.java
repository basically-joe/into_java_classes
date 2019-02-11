public class Printer {
    private int paper;
    private int toner;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaperVolume() {
        return this.paper;
    }


    public int getTonerVolume() {
        return this.toner;
    }

    public boolean print(int pages, int copies) {
        if(pages * copies <= this.paper && pages * copies <= this.toner) {
            this.paper -= pages * copies;
            this.toner -= pages * copies;
            return true;
        } else {
            return false;
        }
    }

    public int refillPaper() {
        int contents = this.getPaperVolume();
        int toBeFilled = 100 - contents;
        return this.getPaperVolume() + toBeFilled;
    }



}