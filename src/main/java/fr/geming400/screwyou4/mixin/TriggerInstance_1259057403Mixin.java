package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.UsedEnderEyeTrigger.TriggerInstance.class)
public class TriggerInstance_1259057403Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_350431134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(350431134L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2029480927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2029480927L))
            info.setReturnValue(">PNJ&.\u24FE\u8E3D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1816409493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1816409493L))
            info.setReturnValue(-1936933085);
    }

    @Inject(at = @At("HEAD"), method = "matches(D)Z", cancellable = true)
    private void matches__162412392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-162412392L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "distance()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void distance__1994402483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1994402483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_28404361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(28404361L))
            info.setReturnValue(null);
    }


}
