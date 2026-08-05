package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.golem.CopperGolemOxidationLevels.class)
public class CopperGolemOxidationLevels1820867501Mixin {
        @Inject(at = @At("HEAD"), method = "getOxidationLevel(Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;)Lnet/minecraft/world/entity/animal/golem/CopperGolemOxidationLevel;", cancellable = true)
    private static void getOxidationLevel_1447244514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1447244514L))
            info.setReturnValue(null);
    }


}
