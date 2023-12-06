package strings


/**
 * Variable [stringYangDiberikan] berisi kata:
 * Chargoggagoggmanchauggagoggchaubunagungamaugg
 *
 * Coba buat program untuk mengambil huruf 'r' dalam kata tersebut
 */
fun stringToChar(stringYangDiberikan: String): String {

    var hasil = stringYangDiberikan
    val stringYangDiberikan = "Chargoggagoggmanchauggagoggchaubunagungamaugg"
    hasil = "${stringYangDiberikan[3]}"
    return hasil

}