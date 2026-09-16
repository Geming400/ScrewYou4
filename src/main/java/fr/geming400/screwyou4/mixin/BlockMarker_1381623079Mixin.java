package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.BlockMarker.class)
public class BlockMarker_1381623079Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_783279636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(783279636L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize__1248492899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1248492899L))
            info.setReturnValue(6.892743E8F);
    }


}
