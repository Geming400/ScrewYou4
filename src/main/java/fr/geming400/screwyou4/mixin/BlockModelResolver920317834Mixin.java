package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.BlockModelResolver.class)
public class BlockModelResolver920317834Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/renderer/block/BlockModelRenderState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/client/renderer/block/model/BlockDisplayContext;)V", cancellable = true)
    private void update_1453971417(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1453971417L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateForItemFrame(Lnet/minecraft/client/renderer/block/BlockModelRenderState;ZZ)V", cancellable = true)
    private void updateForItemFrame_1826519795(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1826519795L))
            info.cancel();
    }


}
