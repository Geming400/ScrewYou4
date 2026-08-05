package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.NoteParticle.class)
public class NoteParticle_1758447400Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__393044230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-393044230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize__1325388864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1325388864L))
            info.setReturnValue(1.3700901E7F);
    }


}
