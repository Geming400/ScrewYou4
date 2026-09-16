package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.InputPredicate.class)
public class InputPredicate1712220865Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_803594597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(803594597L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1812322906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1812322906L))
            info.setReturnValue("VJZ}U'pjQ8ie#[I\u7A0B8V3L{qs0*<tIU\u8D1D{g'YDzX(kY");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2025394340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2025394340L))
            info.setReturnValue(1655410567);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/player/Input;)Z", cancellable = true)
    private void matches__1983213013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1983213013L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "left()Ljava/util/Optional;", cancellable = true)
    private void left_1280612214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1280612214L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "right()Ljava/util/Optional;", cancellable = true)
    private void right_1439304331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1439304331L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "jump()Ljava/util/Optional;", cancellable = true)
    private void jump__67918179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-67918179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forward()Ljava/util/Optional;", cancellable = true)
    private void forward__1737969612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1737969612L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprint()Ljava/util/Optional;", cancellable = true)
    private void sprint_1171173513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1171173513L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sneak()Ljava/util/Optional;", cancellable = true)
    private void sneak_233371523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(233371523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "backward()Ljava/util/Optional;", cancellable = true)
    private void backward_688779090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(688779090L))
            info.setReturnValue(null);
    }


}
