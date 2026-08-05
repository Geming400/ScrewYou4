package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ConstructBeaconTrigger.TriggerInstance.class)
public class TriggerInstance130997348Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1516509607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1516509607L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1004462627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1004462627L))
            info.setReturnValue("@j\u51ADR>hPV@ mTM |?hz0@-:z\u7E6FKx`9\uC3EE");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_169260090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(169260090L))
            info.setReturnValue(1413057235);
    }

    @Inject(at = @At("HEAD"), method = "matches(I)Z", cancellable = true)
    private void matches_1344918164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1344918164L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void level__20237710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-20237710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_376458770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(376458770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "constructedBeacon(Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void constructedBeacon_2040498604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2040498604L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "constructedBeacon()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void constructedBeacon_1404748747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1404748747L))
            info.setReturnValue(null);
    }


}
