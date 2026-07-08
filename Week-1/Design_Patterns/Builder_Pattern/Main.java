class Main{
    public static void main(String args[]){

        Computer gaming_pc = new Computer.Builder()
                .setCpu("Intel i9")
                .setStorage("1TB SDD")
                .setRam("32GB")
                .setGpu("NVIDIA RTX 4080")
                .build();

        Computer office_pc = new Computer.Builder()
                .setCpu("Intel i5")
                .setStorage("500GB HDD")
                .setRam("8GB")
                .build();

        System.out.println("Gaming PC Specifications:\n" + gaming_pc);
        System.out.println("Office PC Specifications:\n" + office_pc);

    }
}