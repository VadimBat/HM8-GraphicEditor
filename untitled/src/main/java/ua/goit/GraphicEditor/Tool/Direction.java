package ua.goit.GraphicEditor.Tool;

public enum Direction {
        TOP("top"),
        BOTTOM("bottom"),
        LEFT("left"),
        RIGHT("right");

        private String direction;

        Direction(String direction) {
            this.direction = direction;
        }

        @Override
        public String toString() {
            return direction;
        }

        public String getColor() {
            return direction;
        }

}
