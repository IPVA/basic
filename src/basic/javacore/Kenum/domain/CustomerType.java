package basic.javacore.Kenum.domain;

public enum CustomerType {
    COMPANY(1, "Company"),
    INDIVIDUAL(2, "Individual"),
    START_UP(3, "Start-up");

    private final int dbValue;
    private final String reportValue;

    CustomerType(int dbValue, String reportValue) {
        this.dbValue = dbValue;
         this.reportValue = reportValue;

    }

    public static CustomerType getByReportValue(String reportValue ) {
        for (CustomerType customerType : values()) {
            if (customerType.getReportValue().equalsIgnoreCase(reportValue)){
                return customerType;
            }
        }

        return null;
    }


    public int getDbValue() {
        return this.dbValue;
    }

    public String getReportValue() {
        return reportValue;
    }


}
