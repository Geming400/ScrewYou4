package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider.class)
public class SimpleStateProvider2002443266Mixin {
        @Inject(at = @At("HEAD"), method = "getState(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getState_1023085236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1023085236L))
            info.setReturnValue(null);
    }


}
