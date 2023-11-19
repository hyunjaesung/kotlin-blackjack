package blackjack.model

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

internal class CardDealerTest : BehaviorSpec({
    Given("카드 딜러") {
        val cardDeck = CardDeck()
        val initSize = cardDeck.cards.size
        val cardDealer = CardDealer(cardDeck)
        When("카드 딜러가 카드를 2장 나눠줄때") {
            val cards = cardDealer.getCards(2)
            Then("카드를 2장 나눠준다") {
                cards.size shouldBe 2
            }
            Then("카드덱은 사이즈가 2 줄어든다") {
                cards.size shouldBe initSize - 2
            }
        }
    }
})
