package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.EndPlatformFeature.class)
public class EndPlatformFeature1922349694Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__1657359866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1657359866L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createEndPlatform(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/core/BlockPos;Z)V", cancellable = true)
    private static void createEndPlatform_461647402(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(461647402L))
            info.cancel();
    }


}
