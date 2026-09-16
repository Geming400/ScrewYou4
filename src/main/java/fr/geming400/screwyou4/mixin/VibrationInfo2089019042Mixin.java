package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.vibrations.VibrationInfo.class)
public class VibrationInfo2089019042Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1180392774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1180392774L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1435524729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1435524729L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1648596163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1648596163L))
            info.setReturnValue(-2080644014);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void pos_272726471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(272726471L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distance()F", cancellable = true)
    private void distance_1475106416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1475106416L))
            info.setReturnValue(4.33332E7F);
    }

    @Inject(at = @At("HEAD"), method = "gameEvent()Lnet/minecraft/core/Holder;", cancellable = true)
    private void gameEvent__475183146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-475183146L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uuid()Ljava/util/UUID;", cancellable = true)
    private void uuid__1023403792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1023403792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Lnet/minecraft/server/level/ServerLevel;)Ljava/util/Optional;", cancellable = true)
    private void getEntity__2000496200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2000496200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void entity_2087442661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2087442661L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "projectileOwnerUuid()Ljava/util/UUID;", cancellable = true)
    private void projectileOwnerUuid_1250525530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1250525530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getProjectileOwner(Lnet/minecraft/server/level/ServerLevel;)Ljava/util/Optional;", cancellable = true)
    private void getProjectileOwner__573354253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-573354253L))
            info.setReturnValue(null);
    }


}
