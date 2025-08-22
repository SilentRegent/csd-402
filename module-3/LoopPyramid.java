//Zachary Anderson
//8-22-25
//Mod3.2 Nested Loops
package looppyramid;

public class LoopPyramid {
    public static void main(String[] args) {
        int rows = 7;
        int width = 3;

        // Compute the width of the last row to align @
        String lastRow = buildRow(rows, width);
        int maxRowWidth = (rows - 1) * width + lastRow.length();

        for (int i = 1; i <= rows; i++) {
            StringBuilder row = new StringBuilder();

            // Leading spaces for pyramid shape
            for (int space = rows; space > i; space--) {
                for (int k = 0; k < width; k++) {
                    row.append(" ");
                }
            }

            // Build the row of numbers
            String currentRow = buildRow(i, width);
            row.append(currentRow);

            // Add spaces so @ symbols align in a straight vertical line
            int spacesToAdd = maxRowWidth - ((rows - i) * width + currentRow.length());
            for (int s = 0; s < spacesToAdd; s++) {
                row.append(" ");
            }

            // Print row with aligned @
            System.out.println(row + "@");
        }
    }

    private static String buildRow(int row, int width) {
        StringBuilder sb = new StringBuilder();
        int num = 1;

        // Left side (increasing)
        for (int j = 1; j <= row; j++) {
            sb.append(String.format("%-" + width + "d", num));
            num *= 2;
        }

        // Right side (decreasing)
        num /= 2;
        for (int j = 1; j < row; j++) {
            num /= 2;
            sb.append(String.format("%-" + width + "d", num));
        }

        return sb.toString();
    }
}
