import spock.lang.Specification

class MoneySpec extends Specification {

    def 金額の掛け算() {
        setup:
        Money five = Money.dollar(5)

        expect:
        five.times(2) == Money.dollar(10)
        five.times(3) == Money.dollar(15)
    }

    def testEquality() {
        expect:
        Money.dollar(5) == Money.dollar(5)
        Money.dollar(5) != Money.dollar(6)
        Money.yen(5) == Money.yen(5)
        Money.yen(5) != Money.yen(6)
        Money.dollar(5) != Money.yen(5)
    }

    def 日本円の掛け算() {
        def five = Money.yen(5)
        expect:
        five.times(2) == Money.yen(10)
        five.times(3) == Money.yen(15)
    }
}
