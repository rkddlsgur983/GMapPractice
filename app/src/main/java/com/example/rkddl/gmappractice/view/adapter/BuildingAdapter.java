package com.example.rkddl.gmappractice.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.rkddl.gmappractice.R;
import com.example.rkddl.gmappractice.model.Building;

import java.util.ArrayList;

public class BuildingAdapter extends BaseAdapter{

    private TextView txtCompanyName,txtAboutAddress,txtDistance;
    private ArrayList<Building> mItems;

    public BuildingAdapter(){
        mItems = new ArrayList<Building>();
    }

    /* 아이템을 세트로 담기 위한 어레이 */

    public void resetList(){
        mItems.clear();
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Building getItem(int position) {
        return mItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    //TODO: 삭제예정
    public void addDummy(){
        Building dummy = new Building(null, null, 0,null, "상호", "주소", null);
        mItems.add(dummy);
    }

    public void add(Building building){
        mItems.add(building);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Context context = parent.getContext();

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_category, parent, false);
        }

        initGetView(convertView);

        Building myItem = (Building) mItems.get(position);

        setBuildingListText(txtCompanyName, txtAboutAddress, txtDistance, myItem.getName(),myItem.getBuildingAddress(),0);

        return convertView;
    }

    private void setBuildingListText(TextView companyName, TextView address, TextView distance, String strName, String strAddr,int strDist){
        companyName.setText(strName);
        address.setText(strAddr);
        distance.setText(String.valueOf(strDist));
    }

    private void initGetView(View convertView){
        txtCompanyName = (TextView)convertView.findViewById(R.id.txt_company_name_item);
        txtAboutAddress = (TextView)convertView.findViewById(R.id.txt_address_item);
        txtDistance = (TextView)convertView.findViewById(R.id.txt_distance_away_item);
    }
}
