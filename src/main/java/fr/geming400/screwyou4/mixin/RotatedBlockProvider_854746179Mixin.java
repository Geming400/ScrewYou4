package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.stateproviders.RotatedBlockProvider.class)
public class RotatedBlockProvider_854746179Mixin {
        @Inject(at = @At("HEAD"), method = "getState(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getState__124611852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-124611852L))
            info.setReturnValue(null);
    }


}
