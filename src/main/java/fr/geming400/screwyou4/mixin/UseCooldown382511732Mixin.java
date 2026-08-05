package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.UseCooldown.class)
public class UseCooldown382511732Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1768023991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1768023991L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__752948243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-752948243L))
            info.setReturnValue("Yu&Lr$\uC8F9n#gI{5\u9C01\u61D1\uC789QZmBKXjB9V+\uB69F\u2ACFTOA\u63EAnsvj@iEU\u4952\uAC52A|!\"+8{z4\u1939\u04F7n\uCBA6|A!\"bsRN$\uA32E$u<ue!\u46B6JTP\u13A3P=E:y2^|{uZ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_420774474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(420774474L))
            info.setReturnValue(191606613);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void apply__514656430(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-514656430L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "seconds()F", cancellable = true)
    private void seconds_420771095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(420771095L))
            info.setReturnValue(5.821713E8F);
    }

    @Inject(at = @At("HEAD"), method = "ticks()I", cancellable = true)
    private void ticks_420773978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(420773978L))
            info.setReturnValue(394754032);
    }

    @Inject(at = @At("HEAD"), method = "cooldownGroup()Ljava/util/Optional;", cancellable = true)
    private void cooldownGroup_627973154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(627973154L))
            info.setReturnValue(null);
    }


}
