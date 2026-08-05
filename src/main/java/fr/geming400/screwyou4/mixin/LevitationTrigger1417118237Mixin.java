package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.LevitationTrigger.class)
public class LevitationTrigger1417118237Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/phys/Vec3;I)V", cancellable = true)
    private void trigger__1235331899(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1235331899L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__387591303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-387591303L))
            info.setReturnValue(null);
    }


}
