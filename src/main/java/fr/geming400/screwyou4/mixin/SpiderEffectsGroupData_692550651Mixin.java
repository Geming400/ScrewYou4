package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.spider.Spider.SpiderEffectsGroupData.class)
public class SpiderEffectsGroupData_692550651Mixin {
        @Inject(at = @At("HEAD"), method = "setRandomEffect(Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void setRandomEffect__1014464435(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1014464435L))
            info.cancel();
    }


}
