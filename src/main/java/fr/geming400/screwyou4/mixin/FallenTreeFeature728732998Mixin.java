package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.FallenTreeFeature.class)
public class FallenTreeFeature728732998Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place_1443990734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1443990734L))
            info.setReturnValue(false);
    }


}
