package booleans


/**
 *
 * Variabel [warnaLampu] berisi [[Merah, Kuning, Hijau, Ungu]]
 *
 * Buat program untuk menentukan jalan/tidaknya kendaraaan dengan if-else.
 *
 *
 * Merah - Berhenti
 *
 * Kuning - Bersiap
 *
 * Hijau - Jalan
 *
 * || Perhatikan kapitalnya yak!
 *
 */

fun lampuLaluLintas(warnaLampu: String): String {

    var keadaanKendaraan = "jalan"

    if (warnaLampu == "Merah") {
        keadaanKendaraan = "Berhenti"
    } else if (warnaLampu == "Kuning") {
        keadaanKendaraan = "Bersiap"
    } else if (warnaLampu == "Hijau") {
        keadaanKendaraan = "Jalan"
    }else
    {
        throw Exception("Ungu")

    }

    return keadaanKendaraan
}