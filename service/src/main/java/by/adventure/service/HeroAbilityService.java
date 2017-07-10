package by.adventure.service;

import by.adventure.entity.HeroAbility;
import by.adventure.service.common.BaseService;

public interface HeroAbilityService extends BaseService<HeroAbility> {
    HeroAbility changeName(HeroAbility ability, String name);

    HeroAbility changePicture(HeroAbility ability, String src);

    HeroAbility changeVideo(HeroAbility ability, String src);

    HeroAbility getByName(String name);
}
