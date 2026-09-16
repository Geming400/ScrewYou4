package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.DistancePredicate.class)
public class DistancePredicate_674785724Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__233840545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-233840545L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1445209248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1445209248L))
            info.setReturnValue("s\u8928Z\u6E36\u940F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1232137814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1232137814L))
            info.setReturnValue(1706577904);
    }

    @Inject(at = @At("HEAD"), method = "matches(DDDDDD)Z", cancellable = true)
    private void matches_1467843551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1467843551L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "x()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void x_1886743185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1886743185L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "z()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void z_200563347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(200563347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void y__1103830382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1103830382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "absolute(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/DistancePredicate;", cancellable = true)
    private static void absolute_915368488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(915368488L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "absolute()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void absolute__1160839280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1160839280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vertical(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/DistancePredicate;", cancellable = true)
    private static void vertical__1388269303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1388269303L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "horizontal(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/DistancePredicate;", cancellable = true)
    private static void horizontal_1210856475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1210856475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "horizontal()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void horizontal__839412163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-839412163L))
            info.setReturnValue(null);
    }


}
