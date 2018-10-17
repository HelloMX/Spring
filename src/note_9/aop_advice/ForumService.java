package note_9.aop_advice;

/**
 * Created by 马昕 on 2018/10/17.
 */
public class ForumService {
    public void removeForum(){
        throw new RuntimeException("removeForum: Exception....");
    }
    public void updateForum(){
        throw new RuntimeException("updateForum:Exception..... ");
    }
}
