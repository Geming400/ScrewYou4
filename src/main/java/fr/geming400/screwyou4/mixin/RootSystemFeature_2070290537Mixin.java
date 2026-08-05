package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.RootSystemFeature.class)
public class RootSystemFeature_2070290537Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__650804407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-650804407L))
            info.setReturnValue(false);
    }


}
