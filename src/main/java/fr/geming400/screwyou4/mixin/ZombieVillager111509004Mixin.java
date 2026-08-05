package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.zombie.ZombieVillager.class)
public class ZombieVillager111509004Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__51583401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-51583401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_149783743(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(149783743L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setVillagerConversionTime(I)V", cancellable = true)
    private void setVillagerConversionTime_1325425976(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1325425976L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setGossips(Lnet/minecraft/world/entity/ai/gossip/GossipContainer;)V", cancellable = true)
    private void setGossips_384998416(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(384998416L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setVillagerDataFinalized(Z)V", cancellable = true)
    private void setVillagerDataFinalized_1341125833(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1341125833L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setVillagerData(Lnet/minecraft/world/entity/npc/villager/VillagerData;)V", cancellable = true)
    private void setVillagerData__561778562(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-561778562L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setVillagerXp(I)V", cancellable = true)
    private void setVillagerXp_1325425976(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1325425976L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTradeOffers(Lnet/minecraft/world/item/trading/MerchantOffers;)V", cancellable = true)
    private void setTradeOffers__1207791362(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1207791362L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVillagerXp()I", cancellable = true)
    private void getVillagerXp_149771250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(149771250L))
            info.setReturnValue(-1712511661);
    }

    @Inject(at = @At("HEAD"), method = "getVillagerDataFinalized()Z", cancellable = true)
    private void getVillagerDataFinalized_149787587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(149787587L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getVillagerData()Lnet/minecraft/world/entity/npc/villager/VillagerData;", cancellable = true)
    private void getVillagerData_817004042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(817004042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStepSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getStepSound_1201721902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1201721902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1318961329(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1318961329L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHurtSound(Lnet/minecraft/world/damagesource/DamageSource;)Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getHurtSound__418498553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-418498553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDeathSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getDeathSound_1201721902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1201721902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVoicePitch()F", cancellable = true)
    private void getVoicePitch_149768367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(149768367L))
            info.setReturnValue(1.340326E8F);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1131137040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1131137040L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1960240942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960240942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract_1728334846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1728334846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAmbientSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getAmbientSound_1201721902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1201721902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway_1320812215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1320812215L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isConverting()Z", cancellable = true)
    private void isConverting_149787587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(149787587L))
            info.setReturnValue(false);
    }


}
