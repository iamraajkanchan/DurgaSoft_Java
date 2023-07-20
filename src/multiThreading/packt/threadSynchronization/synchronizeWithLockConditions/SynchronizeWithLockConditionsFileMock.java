package multiThreading.packt.threadSynchronization.synchronizeWithLockConditions;

/**
 * Using multiple conditions in a lock
 */
public class SynchronizeWithLockConditionsFileMock {
    private final String[] content;
    private final int index;

    public SynchronizeWithLockConditionsFileMock(int size, int length) {
        content = new String[size];
        for (int i = 0; i < size; i++) {
            final StringBuilder buffer = new StringBuilder(length);
            for (int j = 0; j < length; j++) {
                final int randomIndex = (int) (Math.random() * 255);
                buffer.append(randomIndex);
            }
            System.out.printf("FileMock: Current Content: %s\n", buffer);
            content[i] = buffer.toString();
        }
        index = 0;
    }

    public boolean hasMoreLines() {
        return index < content.length;
    }

    public String getLine() {
        if (this.hasMoreLines()) {
            System.out.printf("Mock: %d\n", content.length - index);
            return content[index + 1];
        }
        return null;
    }
}
