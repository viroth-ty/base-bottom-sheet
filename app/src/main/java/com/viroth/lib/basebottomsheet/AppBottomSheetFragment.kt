package com.viroth.lib.basebottomsheet

import com.viroth.lib.base_bottom_sheet.view.BaseBottomSheetFragment
import com.viroth.lib.base_bottom_sheet.view.BaseBottomStyle

class AppBottomSheetFragment : BaseBottomSheetFragment() {

    override fun layoutId() = R.layout.layout_app_bottom_sheet
    override fun style(): BaseBottomStyle = BaseBottomStyle.OUTSIDE_INDICATOR

}