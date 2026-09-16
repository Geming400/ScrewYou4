package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.CubeMobPredicate.class)
public class CubeMobPredicate1644926674Mixin {
        @Inject(at = @At("HEAD"), method = "size()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void size__1428390785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1428390785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_736300406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(736300406L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1879617097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1879617097L))
            info.setReturnValue("\u8526(*0ntzxCu\u9AC9{(scP2|#p&\u531Do\u90EEx6_X9k^xI,Od\u842Ar; yC#7uQU!<m|)|v^{zQ.VYNDV$ttD\u0DA0PN\u52D0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2092688531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2092688531L))
            info.setReturnValue(-907205435);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__1299731688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1299731688L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "sized(Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/predicates/entity/CubeMobPredicate;", cancellable = true)
    private static void sized__889415291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-889415291L))
            info.setReturnValue(null);
    }


}
