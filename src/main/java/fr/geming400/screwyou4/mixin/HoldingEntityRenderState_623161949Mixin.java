package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.HoldingEntityRenderState.class)
public class HoldingEntityRenderState_623161949Mixin {
        @Inject(at = @At("HEAD"), method = "extractHoldingEntityRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/HoldingEntityRenderState;Lnet/minecraft/client/renderer/item/ItemModelResolver;)V", cancellable = true)
    private static void extractHoldingEntityRenderState_1037496638(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1037496638L))
            info.cancel();
    }


}
