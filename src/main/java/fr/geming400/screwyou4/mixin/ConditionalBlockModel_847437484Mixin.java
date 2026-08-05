package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.model.ConditionalBlockModel.class)
public class ConditionalBlockModel_847437484Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/renderer/block/BlockModelRenderState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/client/renderer/block/model/BlockDisplayContext;J)V", cancellable = true)
    private void update_1458320325(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1458320325L))
            info.cancel();
    }


}
