package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.LightningBoltPredicate.class)
public class LightningBoltPredicate_108045602Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1493557860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1493557860L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1027414374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1027414374L))
            info.setReturnValue(".Cm7/\u66C3q\u50F1wQ-'_\uA0F5s\u7587@^xYs\u47E2p'X[?fHhF4M3StG|\uFF41\uBB34V1(UJW\u4ED4z\u233F\u1DD7\u5889ZI!\uB056*5M\u50C0\u39FCjdP\u0E43\u0801}-vQ!$judYlK*KC,Y$*rX");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_146308343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(146308343L))
            info.setReturnValue(1165360352);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__1846146310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1846146310L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "blocksSetOnFire()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void blocksSetOnFire__43189457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-43189457L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityStruck()Ljava/util/Optional;", cancellable = true)
    private void entityStruck_353507023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(353507023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockSetOnFire(Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/predicates/entity/LightningBoltPredicate;", cancellable = true)
    private static void blockSetOnFire__1701982843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1701982843L))
            info.setReturnValue(null);
    }


}
