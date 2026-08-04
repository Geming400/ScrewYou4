package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.PotDecorations.class)
public class PotDecorations_943203980Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1966251058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1966251058L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__192255996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-192255996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_981466721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(981466721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "left()Ljava/util/Optional;", cancellable = true)
    private void left_1188665401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1188665401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "right()Ljava/util/Optional;", cancellable = true)
    private void right_1188665401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1188665401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "front()Ljava/util/Optional;", cancellable = true)
    private void front_1188665401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1188665401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "back()Ljava/util/Optional;", cancellable = true)
    private void back_1188665401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1188665401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ordered()Ljava/util/List;", cancellable = true)
    private void ordered__1725426501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1725426501L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1599514411(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1599514411L))
            info.cancel();
    }


}
