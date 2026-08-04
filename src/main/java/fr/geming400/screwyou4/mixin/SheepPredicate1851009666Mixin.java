package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.SheepPredicate.class)
public class SheepPredicate1851009666Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1058445371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1058445371L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_715549691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(715549691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1889272408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1889272408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__103182245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-103182245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sheared()Ljava/util/Optional;", cancellable = true)
    private void sheared_2096471088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2096471088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasWool()Lnet/minecraft/advancements/predicates/entity/SheepPredicate;", cancellable = true)
    private static void hasWool__1251152735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1251152735L))
            info.setReturnValue(null);
    }


}
