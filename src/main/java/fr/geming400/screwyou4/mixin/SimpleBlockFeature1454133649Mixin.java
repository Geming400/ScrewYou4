package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.SimpleBlockFeature.class)
public class SimpleBlockFeature1454133649Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__2125575911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2125575911L))
            info.setReturnValue(true);
    }


}
