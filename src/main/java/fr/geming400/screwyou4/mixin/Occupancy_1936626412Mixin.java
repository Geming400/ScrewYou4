package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.village.poi.PoiManager.Occupancy.class)
public class Occupancy_1936626412Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;", cancellable = true)
    private static void values_400689962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(400689962L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;", cancellable = true)
    private static void valueOf__171277913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-171277913L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTest()Ljava/util/function/Predicate;", cancellable = true)
    private void getTest_1286741433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1286741433L))
            info.setReturnValue(null);
    }


}
