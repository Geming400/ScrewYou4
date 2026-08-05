package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.WorldGenerationContext.class)
public class WorldGenerationContext_856478293Mixin {
        @Inject(at = @At("HEAD"), method = "getGenDepth()I", cancellable = true)
    private void getGenDepth_1805083409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1805083409L))
            info.setReturnValue(1214157673);
    }

    @Inject(at = @At("HEAD"), method = "getMinGenY()I", cancellable = true)
    private void getMinGenY_1407505173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1407505173L))
            info.setReturnValue(1244693692);
    }


}
