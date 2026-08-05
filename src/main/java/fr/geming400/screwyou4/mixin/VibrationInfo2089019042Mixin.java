package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.vibrations.VibrationInfo.class)
public class VibrationInfo2089019042Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__820435995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-820435995L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_953559067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(953559067L))
            info.setReturnValue("'V洨4oShZ/]骕QDIV)&*#JVG5e:WFNvXwUN7哯sGUS+퇏!o'&q[E:fXg칫sNQW");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2127281784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2127281784L))
            info.setReturnValue(-1168935433);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void pos__1108218725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1108218725L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distance()F", cancellable = true)
    private void distance_2127278405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2127278405L))
            info.setReturnValue(7.881694E8F);
    }

    @Inject(at = @At("HEAD"), method = "entity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void entity__377059800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-377059800L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Lnet/minecraft/server/level/ServerLevel;)Ljava/util/Optional;", cancellable = true)
    private void getEntity_888216287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(888216287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uuid()Ljava/util/UUID;", cancellable = true)
    private void uuid__1794813771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1794813771L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameEvent()Lnet/minecraft/core/Holder;", cancellable = true)
    private void gameEvent__657072482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-657072482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getProjectileOwner(Lnet/minecraft/server/level/ServerLevel;)Ljava/util/Optional;", cancellable = true)
    private void getProjectileOwner_888216287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(888216287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "projectileOwnerUuid()Ljava/util/UUID;", cancellable = true)
    private void projectileOwnerUuid__1794813771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1794813771L))
            info.setReturnValue(null);
    }


}
