import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import Books.Loan;

public class LoanTest {

    //VG
    @Test
    public void testDueDate() {

        LocalDate startDate = LocalDate.of(2023, 10, 1);
        int durationInDays = 30; // 30 days loan duration
        Loan loan = new Loan(startDate, durationInDays);

        // Act
        LocalDate expectedDueDate = startDate.plusDays(durationInDays);
        LocalDate actualDueDate = loan.getDueDate();

        // Assert
        assertEquals(expectedDueDate, actualDueDate, "The due date should be 30 days after the start date.");
    }
}