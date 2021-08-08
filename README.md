# Android Shimmer Effect 

Youtube link : [Format Angka Ke Rupiah Dengan Kotlin Pada Aplikasi Android](https://youtu.be/asaCu0CuGO4)

## Description

Cara mengubah format angka menjadi format mata uang rupiah
```
val localeID = Locale("in", "ID")
val formatter = NumberFormat.getCurrencyInstance(localeID)

val hasilFormat = formatter.format(1000)
// output => Rp1.000,00
```
