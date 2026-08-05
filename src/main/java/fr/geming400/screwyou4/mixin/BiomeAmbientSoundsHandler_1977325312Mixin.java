package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.BiomeAmbientSoundsHandler.class)
public class BiomeAmbientSoundsHandler_1977325312Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1847641653(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1847641653L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMoodiness()F", cancellable = true)
    private void getMoodiness__413263217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-413263217L))
            info.setReturnValue(5.17118E7F);
    }


}
