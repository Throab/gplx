package com.example.drivinglicence.utils

import android.content.Context
import com.example.drivinglicence.component.dialog.AlertMessageDialog

const val TITLE_TOOLBAR = "TITLE_TOOLBAR"
const val QUESTION = "QUESTION"
const val QUESTIONS = "QUESTIONS"
const val ANSWERS = "ANSWERS"
const val FLAG = "FLAG"
const val IS_SECOND = "IS_SECOND"
const val LICENSE = "LICENSE"
const val POSITION = "POSITION"
const val LIST_ANSWERS = "LIST_ANSWERS"
const val LIST_ROAD_TRAFFIC = "LIST_ROAD_TRAFFIC"
const val URL_LAW = "https://luatvietnam.vn/hanh-chinh/chinh-sach-moi-ve-giao-thong-co-hieu-luc-thang-2-2024-570-96715-article.html"

fun showDialogDevelopment(context: Context) {
    AlertMessageDialog(context).also {
        it.hideCancelButton()
        it.show(
            "Thông báo",
            "Chức năng hiện tại đang trong giai đoạn phát triển!"
        )
    }
}