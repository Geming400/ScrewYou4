package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.Input.class)
public class Input_164454548Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1549966806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1549966806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__971005428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-971005428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_202717289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202717289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shift()Z", cancellable = true)
    private void shift_202733130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202733130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "left()Z", cancellable = true)
    private void left_202733130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202733130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "right()Z", cancellable = true)
    private void right_202733130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202733130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "jump()Z", cancellable = true)
    private void jump_202733130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202733130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forward()Z", cancellable = true)
    private void forward_202733130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202733130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "backward()Z", cancellable = true)
    private void backward_202733130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202733130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprint()Z", cancellable = true)
    private void sprint_202733130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202733130L))
            info.setReturnValue(null);
    }


}
