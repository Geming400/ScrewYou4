package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.BlockModelResolver.class)
public class BlockModelResolver920317834Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/renderer/block/BlockModelRenderState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/client/renderer/block/model/BlockDisplayContext;)V", cancellable = true)
    private void update_800562736(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(800562736L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateForItemFrame(Lnet/minecraft/client/renderer/block/BlockModelRenderState;ZZ)V", cancellable = true)
    private void updateForItemFrame__755391699(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-755391699L))
            info.cancel();
    }


}
