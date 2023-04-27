package MateAcademy.Files.Tasks.WorkWithFile;

import java.io.*;

public class ReadAndWrite {
    private static final String SUPPLY_VALUE = "supply";
    private static final String BUY_VALUE = "buy";
    private static final String RESULT_VALUE = "result";
    private static final String SEPARATE_COMA = ",";


    public void getStatistic(String fromFileName, String toFileName) {
        try {
            String contents = readFile(fromFileName);
            String report = generateReport(contents);
            writeToFile(report, toFileName);
        }finally {
            System.out.println("generated statistic");
        }
    }

    private String readFile(String fileName)  {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
            return sb.toString();
        }catch (IOException e){
            throw new RuntimeException("Can`t read file :", e);
        }
    }

    private String generateReport(String contents) {
        int totalSupply = 0;
        int totalBuy = 0;
        String[] lines = contents.trim().split(System.lineSeparator());
        for (String line : lines) {
            String[] parts = line.split(SEPARATE_COMA);
            String operation = parts[0].trim();
            int amount = Integer.parseInt(parts[1].trim());
            switch (operation) {
                case SUPPLY_VALUE:
                    totalSupply += amount;
                    break;
                case BUY_VALUE:
                    totalBuy += amount;
                    break;
                default:
            }
        }
        int result = totalSupply - totalBuy;
        StringBuilder generateOutput = new StringBuilder();
        generateOutput.append(SUPPLY_VALUE).append(SEPARATE_COMA).append(totalSupply).append(System.lineSeparator());
        generateOutput.append(BUY_VALUE).append(SEPARATE_COMA).append(totalBuy).append(System.lineSeparator());
        generateOutput.append(RESULT_VALUE).append(SEPARATE_COMA).append(result);
        return generateOutput.toString();
    }

    private void writeToFile(String report, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(report);
        }catch (IOException e){
            throw new RuntimeException("Can`t write file", e);
        }
    }
}