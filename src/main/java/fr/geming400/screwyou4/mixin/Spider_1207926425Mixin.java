package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.spider.Spider.class)
public class Spider_1207926425Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1078242766(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1078242766L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClimbable()Z", cancellable = true)
    private void onClimbable_1914102751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1914102751L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1711938882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1711938882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeAffected(Lnet/minecraft/world/effect/MobEffectInstance;)Z", cancellable = true)
    private void canBeAffected__407420226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-407420226L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getVehicleAttachmentPoint(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getVehicleAttachmentPoint__1480241727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1480241727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeStuckInBlock(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void makeStuckInBlock_880466178(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(880466178L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setClimbing(Z)V", cancellable = true)
    private void setClimbing_213042596(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(213042596L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1958024733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1958024733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isClimbing()Z", cancellable = true)
    private void isClimbing_611660376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(611660376L))
            info.setReturnValue(true);
    }


}
