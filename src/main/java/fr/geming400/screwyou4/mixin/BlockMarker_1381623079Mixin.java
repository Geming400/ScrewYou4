package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.BlockMarker.class)
public class BlockMarker_1381623079Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__769868551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-769868551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize__1702213185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1702213185L))
            info.setReturnValue(null);
    }


}
