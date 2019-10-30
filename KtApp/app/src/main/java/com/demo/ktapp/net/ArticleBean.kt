package com.demo.ktapp.net

/**
 * ArticleBean
 *
 * @author differ
 * @date 2019-10-30
 */

/*{
    "children": [],
    "courseId": 13,
    "id": 408,
    "name": "鸿洋",
    "order": 190000,
    "parentChapterId": 407,
    "userControlSetTop": false,
    "visible": 1
}*/

data class ArticleBean(
    var children: Any?,
    var courseId: Long?,
    var id: Long?,
    var name: String?,
    var order: Long?,
    var parentChapterId: Long?,
    var userControlSetTop: Boolean?,
    var visible: Byte?
)