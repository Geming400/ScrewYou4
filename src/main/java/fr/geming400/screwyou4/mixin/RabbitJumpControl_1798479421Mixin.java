package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.rabbit.Rabbit.RabbitJumpControl.class)
public class RabbitJumpControl_1798479421Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1668795762(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1668795762L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "wantJump()Z", cancellable = true)
    private void wantJump_2098596949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2098596949L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canJump()Z", cancellable = true)
    private void canJump_1681626773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681626773L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setCanJump(Z)V", cancellable = true)
    private void setCanJump__435246763(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-435246763L))
            info.cancel();
    }


}
