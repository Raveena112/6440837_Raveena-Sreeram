import java.sql.*;
public class MoneyTransfer {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:sqlite:bank.db")) {
            con.setAutoCommit(false);
            try (
                PreparedStatement debit = con.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
                PreparedStatement credit = con.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");
            ) {
                debit.setDouble(1, 500);
                debit.setInt(2, 1);
                debit.executeUpdate();

                credit.setDouble(1, 500);
                credit.setInt(2, 2);
                credit.executeUpdate();

                con.commit();
                System.out.println("Transfer Successful");
            } catch (Exception e) {
                con.rollback();
                System.out.println("Transfer Failed. Rolled back.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
