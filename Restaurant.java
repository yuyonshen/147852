public class Restaurant {
    private Cook cook=new Cook();
    public void takeOrder(String dish){
        cook.cooking(dish);
        System.out.println("你的菜好了，请慢用。");
    }
    public String saySorry(){
        return "抱歉，餐厅不提供此项服务";
    }

    public static void main(String[] args) {
        Restaurant waiter=new Restaurant();
        System.out.println("请厨师为我做一份香辣肉丝。");
        waiter.takeOrder("香辣肉丝");
        System.out.println("你们厨师叫什么名字？");
        System.out.println(waiter.saySorry());
        System.out.println("请让厨师为我切点葱花。");
        System.out.println(waiter.saySorry());
    }

    class Cook{
        private     String name;
        public Cook(){
            this.name="Tom Cruise";

        }
        private void cutOnion(){
            System.out.println(name+"切葱花");
        }
        private void washVegetavles(){
            System.out.println(name+"洗蔬菜");
        }
        void cooking(String dish){
            washVegetavles();
            cutOnion();
            System.out.println(name+"开始烹饪"+dish);
        }
    }

}
