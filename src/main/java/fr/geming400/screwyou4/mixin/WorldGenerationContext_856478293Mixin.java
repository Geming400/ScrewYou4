package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.WorldGenerationContext.class)
public class WorldGenerationContext_856478293Mixin {
        @Inject(at = @At("HEAD"), method = "getMinGenY()I", cancellable = true)
    private void getMinGenY_894740538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(894740538L))
            info.setReturnValue(347285755);
    }

    @Inject(at = @At("HEAD"), method = "getGenDepth()I", cancellable = true)
    private void getGenDepth_894740538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(894740538L))
            info.setReturnValue(347285755);
    }


}
