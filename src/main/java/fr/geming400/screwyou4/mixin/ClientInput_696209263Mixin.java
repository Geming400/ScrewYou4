package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.player.ClientInput.class)
public class ClientInput_696209263Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_566525604(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(566525604L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "makeJump()V", cancellable = true)
    private void makeJump__615992219(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-615992219L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMoveVector()Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private void getMoveVector_1746753630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1746753630L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasForwardImpulse()Z", cancellable = true)
    private void hasForwardImpulse_760832955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(760832955L))
            info.setReturnValue(false);
    }


}
