package npo.kib

import core.Banknote
import crypto.Crypto
import org.junit.Assert
import kotlin.test.Test

class WalletTest {
    @Test
    fun testRoot() {
        val bankPair = Crypto.initPair()
        val BOK = bankPair.first
        val BPK = bankPair.second
        val BIN = 1111

        val banknote500 = Banknote.init(bpk = BPK, bin = BIN, amount = 500)
        Assert.assertTrue(banknote500.verify(bok = BOK))

        val banknote100 = Banknote.init(bpk = BPK, bin = BIN, amount = 100)
        Assert.assertTrue(banknote100.verify(bok = BOK))
    }
}
