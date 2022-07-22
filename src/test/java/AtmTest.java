import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtmTest {

        //Arrange
        Atm underTest = new Atm(50, "1234");

    @Test
    public void shouldHaveADefaultBalanceOf50(){
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
        underTest.deposit(50);
        int actualBalance = underTest.getBalance();
        assertEquals(100, actualBalance);
    }

    @Test
    public void withdrawOf50ShouldDecreaseAnInitialBalanceOf50To0(){
        underTest.withdraw(50);
        int actualBalance = underTest.getBalance();
        assertEquals(0,actualBalance);
    }

    @Test
    public void withdrawOf51ShouldReturnOriginalBalanceOf50(){
        underTest.withdraw(51);
        int actualBalance = underTest.getBalance();
        assertEquals(50,actualBalance);
    }
    @Test
    public void shouldAllowUserAccessWithCorrectPin(){
        Atm underTest
    }
}
