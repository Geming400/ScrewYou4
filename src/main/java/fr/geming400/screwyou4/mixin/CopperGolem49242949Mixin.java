package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.golem.CopperGolem.class)
public class CopperGolem49242949Mixin {
        @Inject(at = @At("HEAD"), method = "getState()Lnet/minecraft/world/entity/animal/golem/CopperGolemState;", cancellable = true)
    private void getState__984154246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-984154246L))
            info.setReturnValue(net.minecraft.world.entity.animal.golem.CopperGolemState.IDLE);
    }

    @Inject(at = @At("HEAD"), method = "setState(Lnet/minecraft/world/entity/animal/golem/CopperGolemState;)V", cancellable = true)
    private void setState_361215150(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(361215150L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_87517688(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(87517688L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shear(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/sounds/SoundSource;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void shear_526866058(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(526866058L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "thunderHit(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LightningBolt;)V", cancellable = true)
    private void thunderHit__880777068(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-880777068L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain_1642219807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1642219807L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1897974887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897974887L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readAdditionalSaveData(Lnet/minecraft/world/level/storage/ValueInput;)V", cancellable = true)
    private void readAdditionalSaveData_280479582(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(280479582L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addAdditionalSaveData(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void addAdditionalSaveData__1169888403(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1169888403L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasContainerOpen(Lnet/minecraft/world/level/block/entity/ContainerOpenersCounter;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void hasContainerOpen_1369821556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1369821556L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__650975496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-650975496L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "getContainerInteractionRange()D", cancellable = true)
    private void getContainerInteractionRange_87500390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(87500390L))
            info.setReturnValue(5.694795002709293E8D);
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset_1146972478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1146972478L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInteractionGetNoItemAnimationState()Lnet/minecraft/world/entity/AnimationState;", cancellable = true)
    private void getInteractionGetNoItemAnimationState__1313954047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1313954047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInteractionDropItemAnimationState()Lnet/minecraft/world/entity/AnimationState;", cancellable = true)
    private void getInteractionDropItemAnimationState__1313954047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1313954047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInteractionDropNoItemAnimationState()Lnet/minecraft/world/entity/AnimationState;", cancellable = true)
    private void getInteractionDropNoItemAnimationState__1313954047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1313954047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInteractionGetItemAnimationState()Lnet/minecraft/world/entity/AnimationState;", cancellable = true)
    private void getInteractionGetItemAnimationState__1313954047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1313954047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readyForShearing()Z", cancellable = true)
    private void readyForShearing_87521532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(87521532L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getWeatherState()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getWeatherState_636426861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(636426861L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.UNAFFECTED);
    }

    @Inject(at = @At("HEAD"), method = "setOpenedChestPos(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setOpenedChestPos_218009548(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(218009548L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWeatherState(Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;)V", cancellable = true)
    private void setWeatherState_303076723(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(303076723L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playSpawnSound()V", cancellable = true)
    private void playSpawnSound_87517688(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(87517688L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearOpenedChestPos()V", cancellable = true)
    private void clearOpenedChestPos_87517688(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(87517688L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getIdleAnimationState()Lnet/minecraft/world/entity/AnimationState;", cancellable = true)
    private void getIdleAnimationState__1313954047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1313954047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract_1666068791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1666068791L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;)V", cancellable = true)
    private void spawn_303076723(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(303076723L))
            info.cancel();
    }


}
