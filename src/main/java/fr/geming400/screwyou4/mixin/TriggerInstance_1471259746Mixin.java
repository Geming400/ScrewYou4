package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.LevitationTrigger.TriggerInstance.class)
public class TriggerInstance_1471259746Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1438195292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1438195292L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_335799770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(335799770L))
            info.setReturnValue("e y}G.ELXUTw'=MBulsP4v=ᐖEFME>@kZo䳵Zⲣ3q{A9N㟍9^#KNJ劙漗%YXRsBymg55>U?mEjKx;M@aNL\"i@}!%k=d/2쑿z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1509522487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1509522487L))
            info.setReturnValue(1754471939);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/phys/Vec3;I)Z", cancellable = true)
    private void matches__981249451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-981249451L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "duration()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void duration_1320024687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1320024687L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distance()Ljava/util/Optional;", cancellable = true)
    private void distance_1716721167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1716721167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1716721167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1716721167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "levitated(Lnet/minecraft/advancements/predicates/DistancePredicate;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void levitated__216476472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-216476472L))
            info.setReturnValue(null);
    }


}
