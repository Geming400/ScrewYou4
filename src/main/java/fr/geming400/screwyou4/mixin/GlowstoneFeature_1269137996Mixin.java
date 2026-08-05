package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.GlowstoneFeature.class)
public class GlowstoneFeature_1269137996Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__1451956948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1451956948L))
            info.setReturnValue(false);
    }


}
