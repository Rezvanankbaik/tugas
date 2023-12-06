package tutorial

/**
 * Budi memiliki uang 5000, ia ingin membeli makaroni dan pisang.
 * Berikut harga nya:
 * Makaroni: 1000
 * Pisang: 3000
 *
 * Berapakah sisa uang budi setelah membeli keduanya?
 */
fun testSoal(uangBudi: Int): Int {
    var hasilAkhir = uangBudi
    val makaroni = 1000
    val pisang = 3000
    hasilAkhir -= makaroni + pisang

    return hasilAkhir
}