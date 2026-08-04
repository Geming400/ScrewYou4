package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.player.ClientInput.class)
public class ClientInput_696209263Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_734484001(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(734484001L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMoveVector()Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private void getMoveVector_1793909000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1793909000L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasForwardImpulse()Z", cancellable = true)
    private void hasForwardImpulse_734487845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(734487845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeJump()V", cancellable = true)
    private void makeJump_734484001(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(734484001L))
            info.cancel();
    }


}
