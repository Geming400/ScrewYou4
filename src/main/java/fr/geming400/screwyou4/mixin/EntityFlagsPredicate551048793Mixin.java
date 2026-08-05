package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityFlagsPredicate.class)
public class EntityFlagsPredicate551048793Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__357577475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-357577475L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1321472318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1321472318L))
            info.setReturnValue("C>4GCUT$q(Vs'FZZqktJMt\"P=_&ZFp2u6VM'Q%vHZ_SJv$5S2sru|.OUK3kHFu8p<q{}9@ub73k{?)6o");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1108400884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1108400884L))
            info.setReturnValue(-1011955329);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void matches__51004900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-51004900L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches_1901357727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1901357727L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isOnGround()Ljava/util/Optional;", cancellable = true)
    private void isOnGround_1824157591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1824157591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFallFlying()Ljava/util/Optional;", cancellable = true)
    private void isFallFlying__1450461509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450461509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isCrouching()Ljava/util/Optional;", cancellable = true)
    private void isCrouching_340942821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(340942821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSprinting()Ljava/util/Optional;", cancellable = true)
    private void isSprinting_676009861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(676009861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isInWater()Ljava/util/Optional;", cancellable = true)
    private void isInWater_361467503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(361467503L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOnFire()Ljava/util/Optional;", cancellable = true)
    private void isOnFire__1162846842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1162846842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSwimming()Ljava/util/Optional;", cancellable = true)
    private void isSwimming__1926505170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1926505170L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBaby()Ljava/util/Optional;", cancellable = true)
    private void isBaby_47270183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(47270183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFlying()Ljava/util/Optional;", cancellable = true)
    private void isFlying_1553879392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1553879392L))
            info.setReturnValue(null);
    }


}
