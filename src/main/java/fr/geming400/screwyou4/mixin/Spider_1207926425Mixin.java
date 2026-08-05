package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.spider.Spider.class)
public class Spider_1207926425Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1246201163(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1246201163L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isClimbing()Z", cancellable = true)
    private void isClimbing_1246205007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1246205007L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getVehicleAttachmentPoint(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getVehicleAttachmentPoint__802212182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-802212182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeStuckInBlock(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void makeStuckInBlock__1768418744(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1768418744L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClimbable()Z", cancellable = true)
    private void onClimbable_1246205007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1246205007L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_507707979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(507707979L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "canBeAffected(Lnet/minecraft/world/effect/MobEffectInstance;)Z", cancellable = true)
    private void canBeAffected_1363798501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1363798501L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setClimbing(Z)V", cancellable = true)
    private void setClimbing__1857424043(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1857424043L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1238308934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1238308934L))
            info.setReturnValue(null);
    }


}
