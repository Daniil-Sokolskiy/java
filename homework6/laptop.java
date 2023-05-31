package homework6;

/*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

Класс сделать в отдельном файле

приветствие
Выбор параметра
выбор конкретнее
вывод подходящих */
public class laptop {
    private String brand;
    private String model;
    private String OS;
    private Integer RAM;
    private Integer SSD;
    private String videocard = "Нет";
    private Double diagonal;
    private String processor;

    public laptop(String brand, String model, String OS, String processor, String videocard,
            Integer RAM, Integer SSD, Double diagonal) {
        this.brand = brand;
        this.model = model;
        this.OS = OS;
        this.RAM = RAM;
        this.SSD = SSD;
        this.videocard = videocard;
        this.diagonal = diagonal;
        this.processor = processor;
    }

    public laptop(String brand, String model, String OS, String processor, Integer RAM, Integer SSD, Double diagonal) {
        this.brand = brand;
        this.model = model;
        this.OS = OS;
        this.RAM = RAM;
        this.SSD = SSD;
        this.diagonal = diagonal;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return String.format(
                "Brand: %s\nModel: %s\nOS: %s\nProcessor: %s\nVideocard: %s\nRAM: %d Gb\nSSD: %d Gb\nDiagonal: %.01f''\n",
                brand, model, OS, processor, videocard, RAM, SSD, diagonal);
    }

    public String getBrand(String requestUserForSearch) {
        return brand;
    }

    public String findBrands() {
        return String.format(brand);
    }

    public String getBrand() {
        return getBrand(null);
    }

    public String getModel(String requestUserForSearch) {
        return model;
    }

    public String getModel() {
        return getModel(null);
    }

    public String findModels() {
        return String.format(model);
    }

    public String getOS(String requestUserForSearch) {
        return OS;
    }

    public String getOS() {
        return getOS(null);
    }

    public String findOSs() {
        return String.format(OS);
    }

    public String getProcessor(String requestUserForSearch) {
        return processor;
    }

    public String getProcessor() {
        return getProcessor(null);
    }

    public String findProcessors() {
        return String.format(processor);
    }

    public String getVideocard(String requestUserForSearch) {
        return videocard;
    }

    public String getVideocard() {
        return getVideocard(null);
    }

    public String findVideocards() {
        return String.format(videocard);
    }

    public Integer getRAM(String requestUserForSearch) {
        return RAM;
    }

    public Integer getRAM() {
        return getRAM(null);
    }

    public String findRAMs() {
        return String.format(Integer.toString(RAM));
    }

    public Integer getSSD(String requestUserForSearch) {
        return SSD;
    }

    public Integer getSSD() {
        return getSSD(null);
    }

    public String findSSDs() {
        return String.format(Integer.toString(SSD));
    }

    public Double getDiagonal(String requestUserForSearch) {
        return diagonal;
    }

    public Double getDiagonal() {
        return getDiagonal(null);
    }

    public String findDiagonals() {
        return String.format(Double.toString(diagonal));
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOS(String oS) {
        OS = oS;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRAM(Integer rAM) {
        RAM = rAM;
    }

    public void setVideocard(String videocard) {
        this.videocard = videocard;
    }

    public void setSSD(Integer sSD) {
        SSD = sSD;
    }

    public void setDiagonal(Double diagonal) {
        this.diagonal = diagonal;
    }
}
