package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.BiomeAmbientSoundsHandler.class)
public class BiomeAmbientSoundsHandler_1977325312Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_2015600050(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2015600050L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMoodiness()F", cancellable = true)
    private void getMoodiness_2015584674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015584674L))
            info.setReturnValue(7.911586E8F);
    }


}
