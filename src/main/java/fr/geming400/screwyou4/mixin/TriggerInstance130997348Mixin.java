package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ConstructBeaconTrigger.TriggerInstance.class)
public class TriggerInstance130997348Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__777628920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-777628920L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_901420873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(901420873L))
            info.setReturnValue("i\u7A50:naNXqi\u14C5\u0E9Ev+*\u0DB79YO\u2368F\u44E7L,$YXSz/<D|vcyOoaHTuwK<4O71nk>t;,|qZH-\uC5FAw70 (]p2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_688349439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(688349439L))
            info.setReturnValue(-211127593);
    }

    @Inject(at = @At("HEAD"), method = "matches(I)Z", cancellable = true)
    private void matches__1285854841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1285854841L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void level_1511064942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1511064942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "constructedBeacon(Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void constructedBeacon_90368326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90368326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "constructedBeacon()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void constructedBeacon_2017440497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017440497L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__1099655693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1099655693L))
            info.setReturnValue(null);
    }


}
