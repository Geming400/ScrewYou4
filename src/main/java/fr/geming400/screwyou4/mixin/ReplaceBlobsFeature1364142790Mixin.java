package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.ReplaceBlobsFeature.class)
public class ReplaceBlobsFeature1364142790Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place_2079400526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2079400526L))
            info.setReturnValue(null);
    }


}
