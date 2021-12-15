package org.example.student;

import java.util.function.BiFunction;
import org.example.student.CampaingFilter.EnumCampaingFilter;

class CampaingFilter {
  enum EnumCampaingFilter {
    NON_VF(CampaingFilterService::nonVodafoneFilter),
    OTHER_FILTER(CampaingFilterService::otherFilter);
    public final BiFunction<CampaingFilterService, Integer, Boolean> isFiltered;

    EnumCampaingFilter(BiFunction<CampaingFilterService, Integer, Boolean> isFiltered) {
      this.isFiltered = isFiltered;
    }
  }

  EnumCampaingFilter type;

  public CampaingFilter(EnumCampaingFilter type) {
    this.type = type;
  }
}


// @Service
class CampaingFilterService {
    /*
    * You can use @Autowired Here
    * private final CartService cartService
    * */

  public boolean checkFilter(EnumCampaingFilter enumCampaingFilter, int marketUser) {
    return enumCampaingFilter.isFiltered.apply(this,marketUser);
  }


    public boolean nonVodafoneFilter(int marketUser) {
    return false;
  }

  public boolean otherFilter(int marketUser) {
    return true;
  }

}



public class Example {
  public static void main(String[] args) {

  }
}