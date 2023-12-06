package strings

/**
 *
 * Disediakan [string1] dan [string2]
 *
 * Coba gabungkan 2 string tersebut dengan spasi
 *
 * ```
 * Misal:
 *
 * string1 = "Mamang"
 * string2 = "Sumamang"
 *
 * hasilAkhir = "Mamang Sumamang"
 * ```
 *
 * GAMPANG INI MAH
 *
 */

fun truncateString(
    string1: String,
    string2: String
): String {

    var hasilAkhir = ""



    hasilAkhir = string1 + " " + string2
    return hasilAkhir
}