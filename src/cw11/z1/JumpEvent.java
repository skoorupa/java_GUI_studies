package cw11.z1;

public class JumpEvent {
    private JumpDirection jumpDirection;
    private long ms;

    public JumpEvent(JumpDirection jumpDirection, long ms) {
        this.jumpDirection = jumpDirection;
        this.ms = ms;
    }

    public JumpDirection getJumpDirection() {
        return jumpDirection;
    }

    public long getMs() {
        return ms;
    }
}

enum JumpDirection {
    LEFT, RIGHT, UP, DOWN
}
