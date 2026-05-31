package function

import java.awt.SplashScreen

enum class ProvideCode(val code: String){
    PURSAT("001"),
    KOMPONGTHOM("002"),
    PHNOMPENH("003"),
    KOMPOT("004")
}

data class ElectronicDevic(
    val cpu: String,
    val memory: String,
    val screen: String,
    val resolution: String,
    val releaseDate: String,
    val price: Double,
    val currencyCode: String,
    val size: Double,
    val portCount: String,
    val model: String,
    val serialNumber: String,
    val keywordType: String,
    val chargeSpeed: Double,
    val batteryLevel: Double,
    val brand: String,
)

fun main(){

//    val cityCode = ProvideCode.PHNOMPENH
//
//    val drinks = listOf<String>("Tea", "Latte", "London", "Capuchhino","green tea")
//    val cityName = cityCodeToName(cityCode)
//    println(cityName)
//
//    val priceOfLatte = getPriceDrink(drinks)
//    println("Price is :  $priceOfLatte")

    println("${cityCodeToNameExpression(ProvideCode.KOMPONGTHOM)}")

    val electronicDevices = listOf(
        ElectronicDevic(
            cpu = "Intel Core i5",
            memory = "8GB",
            screen = "LED",
            resolution = "1920x1080",
            releaseDate = "2024-01-15",
            price = 799.99,
            currencyCode = "USD",
            size = 15.6,
            portCount = "4",
            model = "HP Pavilion 15",
            serialNumber = "HP001245",
            keywordType = "Laptop",
            chargeSpeed = 65.0,
            batteryLevel = 100.0,
            brand = "HP"
        ),
        ElectronicDevic(
            cpu = "Apple M2",
            memory = "16GB",
            screen = "Retina",
            resolution = "2560x1600",
            releaseDate = "2024-02-10",
            price = 1299.99,
            currencyCode = "USD",
            size = 13.3,
            portCount = "2",
            model = "MacBook Air",
            serialNumber = "APL88991",
            keywordType = "Laptop",
            chargeSpeed = 70.0,
            batteryLevel = 95.0,
            brand = "Apple"
        ),
        ElectronicDevic(
            cpu = "Snapdragon 8 Gen 3",
            memory = "12GB",
            screen = "AMOLED",
            resolution = "2400x1080",
            releaseDate = "2025-01-05",
            price = 999.99,
            currencyCode = "USD",
            size = 6.7,
            portCount = "1",
            model = "Galaxy S25",
            serialNumber = "SMS25888",
            keywordType = "Smartphone",
            chargeSpeed = 45.0,
            batteryLevel = 88.0,
            brand = "Samsung"
        ),
        ElectronicDevic(
            cpu = "Intel Core i7",
            memory = "16GB",
            screen = "OLED",
            resolution = "3840x2160",
            releaseDate = "2024-06-20",
            price = 1599.50,
            currencyCode = "USD",
            size = 17.0,
            portCount = "5",
            model = "Dell XPS 17",
            serialNumber = "DLXPS1701",
            keywordType = "Laptop",
            chargeSpeed = 90.0,
            batteryLevel = 78.0,
            brand = "Dell"
        ),
        ElectronicDevic(
            cpu = "AMD Ryzen 7",
            memory = "32GB",
            screen = "IPS",
            resolution = "2560x1440",
            releaseDate = "2023-11-11",
            price = 1899.99,
            currencyCode = "USD",
            size = 16.0,
            portCount = "6",
            model = "ROG Zephyrus",
            serialNumber = "ASUS7788",
            keywordType = "Gaming Laptop",
            chargeSpeed = 120.0,
            batteryLevel = 66.0,
            brand = "Asus"
        ),
        ElectronicDevic(
            cpu = "Apple A18 Pro",
            memory = "8GB",
            screen = "Super Retina XDR",
            resolution = "2796x1290",
            releaseDate = "2025-03-01",
            price = 1199.99,
            currencyCode = "USD",
            size = 6.9,
            portCount = "1",
            model = "iPhone 16 Pro Max",
            serialNumber = "IPH16PM01",
            keywordType = "Smartphone",
            chargeSpeed = 35.0,
            batteryLevel = 91.0,
            brand = "Apple"
        ),
        ElectronicDevic(
            cpu = "MediaTek Dimensity 9300",
            memory = "12GB",
            screen = "OLED",
            resolution = "2712x1220",
            releaseDate = "2024-12-12",
            price = 699.99,
            currencyCode = "USD",
            size = 6.8,
            portCount = "1",
            model = "Xiaomi 14",
            serialNumber = "XI141111",
            keywordType = "Smartphone",
            chargeSpeed = 120.0,
            batteryLevel = 74.0,
            brand = "Xiaomi"
        ),
        ElectronicDevic(
            cpu = "Intel Core Ultra 9",
            memory = "64GB",
            screen = "Mini LED",
            resolution = "3840x2400",
            releaseDate = "2025-02-15",
            price = 2499.99,
            currencyCode = "USD",
            size = 18.0,
            portCount = "7",
            model = "Lenovo Legion Pro",
            serialNumber = "LEG999000",
            keywordType = "Gaming Laptop",
            chargeSpeed = 140.0,
            batteryLevel = 85.0,
            brand = "Lenovo"
        ),
        ElectronicDevic(
            cpu = "Snapdragon 8 Gen 2",
            memory = "8GB",
            screen = "Dynamic AMOLED",
            resolution = "2340x1080",
            releaseDate = "2024-05-05",
            price = 849.99,
            currencyCode = "USD",
            size = 6.4,
            portCount = "1",
            model = "Galaxy S24",
            serialNumber = "SAM240022",
            keywordType = "Smartphone",
            chargeSpeed = 25.0,
            batteryLevel = 92.0,
            brand = "Samsung"
        ),
        ElectronicDevic(
            cpu = "Intel Pentium Gold",
            memory = "4GB",
            screen = "LCD",
            resolution = "1366x768",
            releaseDate = "2023-08-18",
            price = 349.99,
            currencyCode = "USD",
            size = 14.0,
            portCount = "3",
            model = "Acer Aspire 3",
            serialNumber = "ACR330099",
            keywordType = "Laptop",
            chargeSpeed = 45.0,
            batteryLevel = 54.0,
            brand = "Acer"
        ),
        ElectronicDevic(
            cpu = "AMD Ryzen 5",
            memory = "16GB",
            screen = "IPS",
            resolution = "1920x1080",
            releaseDate = "2024-09-01",
            price = 899.99,
            currencyCode = "USD",
            size = 15.6,
            portCount = "4",
            model = "MSI Modern 15",
            serialNumber = "MSI159922",
            keywordType = "Laptop",
            chargeSpeed = 65.0,
            batteryLevel = 81.0,
            brand = "MSI"
        ),
        ElectronicDevic(
            cpu = "Apple M3",
            memory = "24GB",
            screen = "Liquid Retina",
            resolution = "3024x1964",
            releaseDate = "2025-01-20",
            price = 2199.99,
            currencyCode = "USD",
            size = 14.2,
            portCount = "3",
            model = "MacBook Pro 14",
            serialNumber = "MBP14M300",
            keywordType = "Laptop",
            chargeSpeed = 96.0,
            batteryLevel = 99.0,
            brand = "Apple"
        ),
        ElectronicDevic(
            cpu = "Snapdragon 7 Gen 1",
            memory = "6GB",
            screen = "OLED",
            resolution = "2400x1080",
            releaseDate = "2023-12-30",
            price = 499.99,
            currencyCode = "USD",
            size = 6.5,
            portCount = "1",
            model = "OnePlus Nord 4",
            serialNumber = "OPN40009",
            keywordType = "Smartphone",
            chargeSpeed = 80.0,
            batteryLevel = 69.0,
            brand = "OnePlus"
        ),
        ElectronicDevic(
            cpu = "Intel Core i9",
            memory = "32GB",
            screen = "OLED",
            resolution = "3840x2160",
            releaseDate = "2024-10-10",
            price = 2799.99,
            currencyCode = "USD",
            size = 16.0,
            portCount = "6",
            model = "Razer Blade 16",
            serialNumber = "RZRBLD160",
            keywordType = "Gaming Laptop",
            chargeSpeed = 130.0,
            batteryLevel = 73.0,
            brand = "Razer"
        ),
        ElectronicDevic(
            cpu = "Google Tensor G4",
            memory = "12GB",
            screen = "LTPO OLED",
            resolution = "2992x1344",
            releaseDate = "2025-04-02",
            price = 1099.00,
            currencyCode = "USD",
            size = 6.8,
            portCount = "1",
            model = "Pixel 10 Pro",
            serialNumber = "PXL10PR01",
            keywordType = "Smartphone",
            chargeSpeed = 37.0,
            batteryLevel = 83.0,
            brand = "Google"
        ),
        ElectronicDevic(
            cpu = "AMD Ryzen 9",
            memory = "64GB",
            screen = "QLED",
            resolution = "3840x2160",
            releaseDate = "2025-03-15",
            price = 3200.00,
            currencyCode = "USD",
            size = 17.3,
            portCount = "8",
            model = "Alienware X17",
            serialNumber = "ALN171234",
            keywordType = "Gaming Laptop",
            chargeSpeed = 180.0,
            batteryLevel = 61.0,
            brand = "Dell"
        ),
        ElectronicDevic(
            cpu = "Snapdragon 8+ Gen 1",
            memory = "8GB",
            screen = "AMOLED",
            resolution = "2412x1080",
            releaseDate = "2024-07-07",
            price = 749.99,
            currencyCode = "USD",
            size = 6.6,
            portCount = "1",
            model = "Realme GT 6",
            serialNumber = "RLMGT6007",
            keywordType = "Smartphone",
            chargeSpeed = 150.0,
            batteryLevel = 77.0,
            brand = "Realme"
        ),
        ElectronicDevic(
            cpu = "Intel Core i3",
            memory = "8GB",
            screen = "TN",
            resolution = "1920x1080",
            releaseDate = "2023-06-06",
            price = 499.50,
            currencyCode = "USD",
            size = 15.0,
            portCount = "3",
            model = "Lenovo IdeaPad 3",
            serialNumber = "LNVIP3001",
            keywordType = "Laptop",
            chargeSpeed = 45.0,
            batteryLevel = 58.0,
            brand = "Lenovo"
        ),
        ElectronicDevic(
            cpu = "Apple A17",
            memory = "6GB",
            screen = "Super Retina",
            resolution = "2556x1179",
            releaseDate = "2024-09-09",
            price = 899.00,
            currencyCode = "USD",
            size = 6.1,
            portCount = "1",
            model = "iPhone 15",
            serialNumber = "APL151515",
            keywordType = "Smartphone",
            chargeSpeed = 27.0,
            batteryLevel = 89.0,
            brand = "Apple"
        ),
        ElectronicDevic(
            cpu = "MediaTek Helio G99",
            memory = "8GB",
            screen = "IPS LCD",
            resolution = "2460x1080",
            releaseDate = "2024-11-11",
            price = 299.99,
            currencyCode = "USD",
            size = 6.7,
            portCount = "1",
            model = "Redmi Note 14",
            serialNumber = "RDM141111",
            keywordType = "Smartphone",
            chargeSpeed = 67.0,
            batteryLevel = 72.0,
            brand = "Xiaomi"
        )
    )

    println(filterBrand(electronicDevices,"dell"))

}

fun cityCodeToName(code: ProvideCode): String{
    return when(code){
        ProvideCode.PHNOMPENH -> "Phnom Penh"
        ProvideCode.KOMPONGTHOM -> "Kompong Thom"
        ProvideCode.KOMPOT -> "Kompot"
        ProvideCode.PURSAT -> "Purs"

    }
}

fun cityCodeToNameExpression(code: ProvideCode): String = when(code){
    ProvideCode.PHNOMPENH -> "Phnom Penh"
    ProvideCode.KOMPONGTHOM -> "Kompong Thom"
    ProvideCode.KOMPOT -> "Kompot"
    ProvideCode.PURSAT -> "Purs"

}

fun cityCodeToNameIfExpression(code: ProvideCode): String =
    if(code==ProvideCode.PHNOMPENH) "Phnom Penh"
    else if(code==ProvideCode.KOMPOT) "Kompot"
    else if(code==ProvideCode.PURSAT) "Purs"
    else ""



fun getPriceDrink(list: List<String>): Double{
    list.forEach {
        if (it.lowercase() == "latte") {
            return 1.0
        }
    }
    return 0.0
}

fun filterBrand(list: List<ElectronicDevic>, brand: String): List<ElectronicDevic>{
    val result = list.filter { it.brand.equals(brand, ignoreCase = true) }
    return result
}