package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.LivingEntityRenderState.class)
public class LivingEntityRenderState2146918689Mixin {
        @Inject(at = @At("HEAD"), method = "hasPose(Lnet/minecraft/world/entity/Pose;)Z", cancellable = true)
    private void hasPose_226599694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(226599694L))
            info.setReturnValue(false);
    }


}
