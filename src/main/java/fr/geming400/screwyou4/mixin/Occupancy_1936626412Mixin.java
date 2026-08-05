package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.village.poi.PoiManager.Occupancy.class)
public class Occupancy_1936626412Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;", cancellable = true)
    private static void values__1590992056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1590992056L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;", cancellable = true)
    private static void valueOf__10029361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-10029361L))
            info.setReturnValue(net.minecraft.world.entity.ai.village.poi.PoiManager.Occupancy.ANY);
    }

    @Inject(at = @At("HEAD"), method = "getTest()Ljava/util/function/Predicate;", cancellable = true)
    private void getTest__682456895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-682456895L))
            info.setReturnValue(null);
    }


}
