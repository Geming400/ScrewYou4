package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.BrewedPotionTrigger.TriggerInstance.class)
public class TriggerInstance633215447Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__275410821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-275410821L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1403638972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1403638972L))
            info.setReturnValue("k)Bw}\"{|amK[A(9]\u1C35*W4FPKbKha");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1190567538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1190567538L))
            info.setReturnValue(-1367791188);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void matches_1101036688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1101036688L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "potion()Ljava/util/Optional;", cancellable = true)
    private void potion__1534981096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1534981096L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "brewedPotion()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void brewedPotion_1455333034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1455333034L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__597437594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-597437594L))
            info.setReturnValue(null);
    }


}
