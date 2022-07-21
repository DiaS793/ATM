import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtmTest {
    @Test
    public void shouldHaveADefaultBalanceof50(){
        //Arrange
        Atm underTest = new Atm(50);
        //Act
        int actualBalance = underTest.getBalance();
        //Assert
        assertEquals(50,actualBalance);
    }

    @Test
    public void shouldHaveADefaultBalanceOf100(){
        //Arrange
        Atm underTest = new Atm(100);
        //Act
        int actualBalance = underTest.getBalance();
        //Assert
        assertEquals(100,actualBalance);

    }

    @Test
    public void depositOf50ShouldIncreaseQAnInitialBalanceOf50To100(){
        Atm underTest = new Atm(50);
        underTest.deposit(50);
        int actualBalance = underTest.getBalance();
        assertEquals(100, actualBalance);
    }
}
