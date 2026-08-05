package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.VisGraph.class)
public class VisGraph1788979414Mixin {
        @Inject(at = @At("HEAD"), method = "resolve()Lnet/minecraft/client/renderer/chunk/VisibilitySet;", cancellable = true)
    private void resolve__833476036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-833476036L))
            info.setReturnValue(new net.minecraft.client.renderer.chunk.VisibilitySet());
    }

    @Inject(at = @At("HEAD"), method = "setOpaque(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setOpaque_688564160(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(688564160L))
            info.cancel();
    }


}
