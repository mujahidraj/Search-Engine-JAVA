class OpenWordFile {

    public static void main(String args[]) {

        try {
            Runtime rt = Runtime.getRuntime();
            rt.exec("cmd.exe /C start sample-terms-conditions-agreement.doc");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Exception occured" + ex);
        }

    }
}