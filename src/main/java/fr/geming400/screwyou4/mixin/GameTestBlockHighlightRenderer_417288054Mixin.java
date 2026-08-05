package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.debug.GameTestBlockHighlightRenderer.class)
public class GameTestBlockHighlightRenderer_417288054Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear__368539653(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-368539653L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "highlightPos(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void highlightPos_1353020840(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1353020840L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "emitGizmos()V", cancellable = true)
    private void emitGizmos_528396220(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(528396220L))
            info.cancel();
    }


}
