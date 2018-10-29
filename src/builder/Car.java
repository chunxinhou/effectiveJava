package builder;

/**
 * 用静态Builder 类来初始化类
 * bean中包含了必填项和选填项
 */

public class Car {
    //must
    private final int  tireCount; //轮胎数量
    private final int  engine; //发动机
    //other
    private final int electricSeat; //电动座椅
    private final int headlight; //车灯
    private final int color; //颜色

    public Car(Builder builder) {
        this.tireCount = builder.tireCount;
        this.color = builder.color;
        this.electricSeat = builder.electricSeat;
        this.engine = builder.engine;
        this.headlight = builder.headlight;
    }

    public static class Builder{
        //must
        private final int  tireCount;
        private final int  engine;
        //other  defult 0
        private  int electricSeat = 0 ;
        private  int headlight = 0;
        private  int color = 0 ;

        public  Car build(){
            return new Car(this);
        }

        public Builder(int tireCount, int engine) {
            this.tireCount = tireCount;
            this.engine = engine;
        }

        public Builder electricSeat(int val){
            electricSeat = val;
            return this;
        }

        public Builder headlight(int val){
            headlight = val;
            return this;
        }

        public Builder color(int val){
            color = val;
            return this;
        }

    }

}
