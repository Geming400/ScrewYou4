package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.TemplateFeature.class)
public class TemplateFeature670388846Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__2050706097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2050706097L))
            info.setReturnValue(true);
    }


}
