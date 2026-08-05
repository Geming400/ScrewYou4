package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.village.poi.PoiTypes.class)
public class PoiTypes_1928799169Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/world/entity/ai/village/poi/PoiType;", cancellable = true)
    private static void bootstrap__1926736808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1926736808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forState(Lnet/minecraft/world/level/block/state/BlockState;)Ljava/util/Optional;", cancellable = true)
    private static void forState_1789901343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1789901343L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasPoi(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void hasPoi__943615410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943615410L))
            info.setReturnValue(true);
    }


}
