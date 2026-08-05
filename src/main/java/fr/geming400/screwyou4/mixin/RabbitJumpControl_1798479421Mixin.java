package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.rabbit.Rabbit.RabbitJumpControl.class)
public class RabbitJumpControl_1798479421Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1836754159(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1836754159L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCanJump(Z)V", cancellable = true)
    private void setCanJump__1266871047(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1266871047L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "wantJump()Z", cancellable = true)
    private void wantJump_1836758003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1836758003L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canJump()Z", cancellable = true)
    private void canJump_1836758003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1836758003L))
            info.setReturnValue(true);
    }


}
