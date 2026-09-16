package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.golem.CopperGolem.class)
public class CopperGolem49242949Mixin {
        @Inject(at = @At("HEAD"), method = "getState()Lnet/minecraft/world/entity/animal/golem/CopperGolemState;", cancellable = true)
    private void getState__318239467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-318239467L))
            info.setReturnValue(net.minecraft.world.entity.animal.golem.CopperGolemState.IDLE);
    }

    @Inject(at = @At("HEAD"), method = "setState(Lnet/minecraft/world/entity/animal/golem/CopperGolemState;)V", cancellable = true)
    private void setState__1979399809(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1979399809L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick__80440709(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-80440709L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readAdditionalSaveData(Lnet/minecraft/world/level/storage/ValueInput;)V", cancellable = true)
    private void readAdditionalSaveData__1792587622(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1792587622L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addAdditionalSaveData(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void addAdditionalSaveData_1747395708(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1747395708L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain__136658977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-136658977L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "hasContainerOpen(Lnet/minecraft/world/level/block/entity/ContainerOpenersCounter;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void hasContainerOpen__441191643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-441191643L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1424344939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1424344939L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getContainerInteractionRange()D", cancellable = true)
    private void getContainerInteractionRange_1229166064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1229166064L))
            info.setReturnValue(9.7052310027629E8D);
    }

    @Inject(at = @At("HEAD"), method = "thunderHit(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LightningBolt;)V", cancellable = true)
    private void thunderHit__851829851(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-851829851L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getInteractionDropNoItemAnimationState()Lnet/minecraft/world/entity/AnimationState;", cancellable = true)
    private void getInteractionDropNoItemAnimationState_1086480885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1086480885L))
            info.setReturnValue(new net.minecraft.world.entity.AnimationState());
    }

    @Inject(at = @At("HEAD"), method = "getInteractionGetNoItemAnimationState()Lnet/minecraft/world/entity/AnimationState;", cancellable = true)
    private void getInteractionGetNoItemAnimationState_723199142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(723199142L))
            info.setReturnValue(new net.minecraft.world.entity.AnimationState());
    }

    @Inject(at = @At("HEAD"), method = "getInteractionGetItemAnimationState()Lnet/minecraft/world/entity/AnimationState;", cancellable = true)
    private void getInteractionGetItemAnimationState_1806396391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1806396391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInteractionDropItemAnimationState()Lnet/minecraft/world/entity/AnimationState;", cancellable = true)
    private void getInteractionDropItemAnimationState_1498394870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1498394870L))
            info.setReturnValue(new net.minecraft.world.entity.AnimationState());
    }

    @Inject(at = @At("HEAD"), method = "shear(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/sounds/SoundSource;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void shear__225398775(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-225398775L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract_2058398477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2058398477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset_1589425892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589425892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readyForShearing()Z", cancellable = true)
    private void readyForShearing__486059083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-486059083L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getWeatherState()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getWeatherState_2057769498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2057769498L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.UNAFFECTED);
    }

    @Inject(at = @At("HEAD"), method = "clearOpenedChestPos()V", cancellable = true)
    private void clearOpenedChestPos_200518863(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(200518863L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWeatherState(Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;)V", cancellable = true)
    private void setWeatherState_774228082(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(774228082L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playSpawnSound()V", cancellable = true)
    private void playSpawnSound_1497219664(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1497219664L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setOpenedChestPos(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setOpenedChestPos_1732728938(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1732728938L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getIdleAnimationState()Lnet/minecraft/world/entity/AnimationState;", cancellable = true)
    private void getIdleAnimationState_1640330186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1640330186L))
            info.setReturnValue(new net.minecraft.world.entity.AnimationState());
    }

    @Inject(at = @At("HEAD"), method = "spawn(Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;)V", cancellable = true)
    private void spawn__1308624018(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1308624018L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_799341258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(799341258L))
            info.setReturnValue(null);
    }


}
