package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.village.poi.PoiTypes.class)
public class PoiTypes_1928799169Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/world/entity/ai/village/poi/PoiType;", cancellable = true)
    private static void bootstrap_1758361834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758361834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasPoi(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void hasPoi_1783510430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1783510430L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "forState(Lnet/minecraft/world/level/block/state/BlockState;)Ljava/util/Optional;", cancellable = true)
    private static void forState_1504712407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1504712407L))
            info.setReturnValue(null);
    }


}
