public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public int drink(){
        return this.volume - 10;
    }

    public int empty(){
        return this.volume = 0;
    }

    public int fill(){
        int contents = this.getVolume();
        int toBeFilled = 100 - contents;
                return this.getVolume() + toBeFilled;
    }

}
