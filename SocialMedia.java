abstract class Post {
    protected String author;
    protected int likes;
    public Post(String author) {
        this.author = author;
        this.likes = 0;
    }
    public void likePost() {
        likes++;
    }
    public abstract void displayContent();
}

class TextPost extends Post {
    private String text;
    public TextPost(String author, String text) {
        super(author);
        this.text = text;
    }
    @Override
    public void displayContent() {
        System.out.println("Text Post by " + author + ": " + text);
        System.out.println("Likes: " + likes);
    }
}
class ImagePost extends Post {
    private String imageUrl;
    private String caption;
    public ImagePost(String author, String imageUrl, String caption) {
        super(author);
        this.imageUrl = imageUrl;
        this.caption = caption;
    }
    @Override
    public void displayContent() {
        System.out.println("Image Post by " + author);
        System.out.println("Image URL: " + imageUrl);
        System.out.println("Caption: " + caption);
        System.out.println("Likes: " + likes);
    }
}
class VideoPost extends Post {
    private String videoUrl;
    private int duration;
    public VideoPost(String author, String videoUrl, int duration) {
        super(author);
        this.videoUrl = videoUrl;
        this.duration = duration;
    }
    @Override
    public void displayContent() {
        System.out.println("Video Post by " + author);
        System.out.println("Video URL: " + videoUrl);
        System.out.println("Duration: " + duration + " seconds");
        System.out.println("Likes: " + likes);
    }
}
public class SocialMedia {
    public static void main(String[] args) {
        Post[] posts = new Post[3];
        posts[0] = new TextPost("Alice", "Hello, world!");
        posts[1] = new ImagePost("Bob", "http://example.com/image.jpg", "Sunset view");
        posts[2] = new VideoPost("Charlie", "http://example.com/video.mp4", 120);
        for (Post post : posts) {
            post.likePost();
            post.displayContent();
            System.out.println("---------------------");
        }
    }
}
