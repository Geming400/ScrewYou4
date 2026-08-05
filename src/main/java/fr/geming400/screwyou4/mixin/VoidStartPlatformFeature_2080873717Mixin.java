package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.VoidStartPlatformFeature.class)
public class VoidStartPlatformFeature_2080873717Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__640221227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-640221227L))
            info.setReturnValue(false);
    }


}
