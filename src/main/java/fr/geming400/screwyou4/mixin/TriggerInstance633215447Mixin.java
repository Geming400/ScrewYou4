package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.BrewedPotionTrigger.TriggerInstance.class)
public class TriggerInstance633215447Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2018727706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2018727706L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__502244528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-502244528L))
            info.setReturnValue(",p&H-@H6),y쑣F1ay{B<@헊9f<RJUiI&\"봂.C|톓ゖ戣J99t$]%SnwvG0y-#/Km!urqO$[8kCzF*<$,8}");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_671478189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(671478189L))
            info.setReturnValue(-1610820843);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void matches__2115272867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2115272867L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_878676869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(878676869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "potion()Ljava/util/Optional;", cancellable = true)
    private void potion_878676869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(878676869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "brewedPotion()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void brewedPotion_1906966846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1906966846L))
            info.setReturnValue(null);
    }


}
