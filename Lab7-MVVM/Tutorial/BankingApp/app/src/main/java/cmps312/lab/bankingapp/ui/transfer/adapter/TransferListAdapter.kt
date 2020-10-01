package cmps312.lab.bankingapp.ui.transfer.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import androidx.recyclerview.widget.RecyclerView
import cmps312.lab.bankingapp.R
import cmps312.lab.bankingapp.databinding.ListItemTransferBinding

import cmps312.lab.bankingapp.model.Transfer
import kotlinx.android.synthetic.main.list_item_transfer.view.*

class TransferListAdapter(private val itemSelectedListener: (Transfer) -> Unit) :
    RecyclerView.Adapter<TransferListAdapter.TransferViewHolder>() {

    var transfers : List<Transfer>? = null
    set(transfers) {
        field = transfers
        notifyDataSetChanged()
    }

    inner class TransferViewHolder(private val binding : ListItemTransferBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(transfer: Transfer) {
            binding.transfer = transfer
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransferViewHolder {

        val binding : ListItemTransferBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.list_item_transfer, parent, false
        )
        return TransferViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TransferViewHolder, position: Int) =
        holder.bind(transfers!![position])

    override fun getItemCount() = transfers?.size ?: 0
}