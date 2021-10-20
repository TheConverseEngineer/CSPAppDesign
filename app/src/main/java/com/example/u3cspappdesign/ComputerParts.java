package com.example.u3cspappdesign;

/** This Enumerator stores the info used by the various screens in our app.
 * Computer Parts stored: CPU, GPU, Memory, Cooling
 * Info stored for each computer part: Name, Image, Description, and Purchase Options
 */
public enum ComputerParts {
    CPU(    "Central Processing Unit (CPU)",
            "",
            "CPU stands for the Central Processing Unit. The CPU is one of the major parts of a computer. It is considered the brain of the computer. The CPU allows the computer to work. It takes the data from the entire computer and then decides what needs to be processed or displayed on the screen. ",
            "Ryzen 7 5800 - $469.99 \n" + "Ryzen 5 5600 - $269.99 \n" + "Intel 9 10900k - $499.00\n" + "Intel 7 10700k - $384.00"),

    GPU(    "Graphical Processing Unit (GPU)",
            "",
            "GPU stands for Graphics Processing Unit. A major part of computers especially for gaming computers. It provides the clarity of the game to the monitor. Allowing more frames and better gameplay.",
            "Geforce RTX 3090 - $2,269.99\n" +
                         "Geforce RTX 3080 -  $1,199.99\n" +
                         "Geforce RTX 3070 - $599.99\n"),

    MEMORY( "The Memory",
            "",
            " The two major memory devices are SSD (Solid-state drive) and HDD (Hard-disk drive), which store large, long term files. SSD is a faster at retrieving data, but HDD can store more data overall. The small memory storage device is Ram (Random Access Memory), and stores data that the computer is currently using.",
            "Ram: TEAM XTREEM ARGB 16GB DDR4-3600MHz C14 - $159.99\n" +
                         "SSD: CORSAIR MP400 Gen3 PCIe x4 NVMe M.2 SSD - $1,454.99\n" +
                         "HDD : Seagate IronWolf Pro 18TB 3.5\" SATA 7200RPM Internal Hard Drive ST18000NE000 - $587.00"),

    COOLING("The Cooling System",
            "",
            "It cools down the entire PC and hase separate cooling for specific parts that is needed. Avoiding overheating a PC can extend life of the PC and increase the working rate of it.",
            "Corsair CX-9070005-WW RGB Custom Cooling Kit - $549.99");

    /** The name of this component*/
    public String name;

    /** The image source of this component*/
    public String imageSource;

    /** The description of this component*/
    public String description;

    /** The purchase options for this component */
    public String purchaseOptions;

    /** Private assigning constructor for Enum */
    private ComputerParts(String name, String imageSource, String description, String purchaseOptions) {
        this.name = name;
        this.imageSource = imageSource;
        this.description = description;
        this.purchaseOptions = purchaseOptions;
    }
}