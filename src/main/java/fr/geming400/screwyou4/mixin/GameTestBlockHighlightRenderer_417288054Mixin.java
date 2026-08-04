package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.debug.GameTestBlockHighlightRenderer.class)
public class GameTestBlockHighlightRenderer_417288054Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_455562792(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(455562792L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "highlightPos(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void highlightPos_1750308520(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1750308520L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "emitGizmos()V", cancellable = true)
    private void emitGizmos_455562792(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(455562792L))
            info.cancel();
    }


}
