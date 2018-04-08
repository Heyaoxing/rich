package comr.ich.common.utils;

import org.springframework.util.StringUtils;

import java.text.MessageFormat;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/3/30 19:13
 */


public class PermsUtil {
    /**
     * 默认premission字符串
     */
    public static final String PREMISSION_STRING = "permsAuthc[{0}]";

    /**
     * uri转换为shio permission 如 uri: /user/add 转换后 perm[user:add]
     * @param uri
     * @return
     */
    public static String uriToPerms(String uri) {
        if (!StringUtils.hasText(uri)) {
            return null;
        }
        String permission = uriToPermStr(uri);
        return MessageFormat.format(PREMISSION_STRING, permission);
    }

    /**
     * uri转换为权限标识， 如 uri: /user/add 转换后 user:add
     * @param uri
     * @return
     */
    public static String uriToPermStr(String uri) {
        String permission = null;
        if (uri.startsWith("/")) {
            permission = uri.substring(1);
        }
        if (uri.endsWith("/")) {
            permission = uri.substring(0, uri.length() - 1);
        }
        permission = permission.replaceAll("/", ":");
        return permission;
    }

}
