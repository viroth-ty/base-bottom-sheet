package com.viroth.lib.base_bottom_sheet.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.LinearLayoutCompat
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.viroth.lib.base_bottom_sheet.R
import com.viroth.lib.base_bottom_sheet.databinding.FragmentBaseBottomSheetBinding

abstract class BaseBottomSheetFragment : BottomSheetDialogFragment() {


    private var _binding: FragmentBaseBottomSheetBinding? = null
    private val binding get() = _binding!!
    private lateinit var bottomSheetBehavior: BottomSheetBehavior<LinearLayoutCompat>

    abstract fun layoutId(): Int
    abstract fun style(): BaseBottomStyle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBaseBottomSheetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun getTheme(): Int = R.style.ThemeOverlay_App_BottomSheetDialog

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpView()
    }

    private fun setUpView() {
        binding.ViewStub.apply {
            layoutResource = layoutId()
            inflate()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}