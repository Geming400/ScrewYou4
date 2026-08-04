package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.InputPredicate.class)
public class InputPredicate1712220865Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1197234172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1197234172L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_576760890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(576760890L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1750483607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1750483607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/player/Input;)Z", cancellable = true)
    private void matches__1772213704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1772213704L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "left()Ljava/util/Optional;", cancellable = true)
    private void left_1957682287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1957682287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "right()Ljava/util/Optional;", cancellable = true)
    private void right_1957682287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1957682287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "jump()Ljava/util/Optional;", cancellable = true)
    private void jump_1957682287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1957682287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forward()Ljava/util/Optional;", cancellable = true)
    private void forward_1957682287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1957682287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprint()Ljava/util/Optional;", cancellable = true)
    private void sprint_1957682287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1957682287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sneak()Ljava/util/Optional;", cancellable = true)
    private void sneak_1957682287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1957682287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "backward()Ljava/util/Optional;", cancellable = true)
    private void backward_1957682287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1957682287L))
            info.setReturnValue(null);
    }


}
