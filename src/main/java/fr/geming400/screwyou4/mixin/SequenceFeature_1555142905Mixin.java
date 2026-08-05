package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.SequenceFeature.class)
public class SequenceFeature_1555142905Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__1165952039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1165952039L))
            info.setReturnValue(true);
    }


}
