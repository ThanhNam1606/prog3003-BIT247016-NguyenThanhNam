
package com.nam.bai2;

public class Bai2{

    
    static class Computer {

        private final int hdd; 
        private final int ram; 

        private final boolean isBluetoothEnabled;
        private final String  graphicsCard;
        private final int     screenSize;

        private Computer(ComputerBuilder builder) {
            this.hdd                = builder.hdd;
            this.ram                = builder.ram;
            this.isBluetoothEnabled = builder.isBluetoothEnabled;
            this.graphicsCard       = builder.graphicsCard;
            this.screenSize         = builder.screenSize;
        }

        @Override
        public String toString() {
            return "Computer {\n"
                 + "  HDD           = " + hdd + " GB\n"
                 + "  RAM           = " + ram + " GB\n"
                 + "  Bluetooth     = " + (isBluetoothEnabled ? "Enabled" : "Disabled") + "\n"
                 + "  Graphics Card = " + (graphicsCard != null ? graphicsCard : "Integrated") + "\n"
                 + "  Screen Size   = " + screenSize + " inch\n"
                 + "}";
        }

        static class ComputerBuilder {

            private final int hdd;
            private final int ram;

            private boolean isBluetoothEnabled = false;
            private String  graphicsCard       = null;
            private int     screenSize         = 15;

            public ComputerBuilder(int hdd, int ram) {
                this.hdd = hdd;
                this.ram = ram;
            }

            public ComputerBuilder bluetooth(boolean value) {
                this.isBluetoothEnabled = value;
                return this;
            }

            public ComputerBuilder graphicsCard(String card) {
                this.graphicsCard = card;
                return this;
            }

            public ComputerBuilder screenSize(int size) {
                this.screenSize = size;
                return this;
            }

            public Computer build() {
                return new Computer(this);
            }
        }
    }

    public static void main(String[] args) {

        Computer gamingPC = new Computer.ComputerBuilder(1000, 32)
                .bluetooth(true)
                .graphicsCard("NVIDIA RTX 4070")
                .screenSize(27)
                .build();

        Computer officePC = new Computer.ComputerBuilder(512, 8)
                .screenSize(15)
                .build();

        System.out.println("=== Gaming PC ===");
        System.out.println(gamingPC);

        System.out.println("\n=== Office PC ===");
        System.out.println(officePC);
    }
}
