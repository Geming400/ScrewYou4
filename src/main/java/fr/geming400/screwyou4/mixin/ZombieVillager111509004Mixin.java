package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.zombie.ZombieVillager.class)
public class ZombieVillager111509004Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_1778216237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1778216237L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick__18174654(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-18174654L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setVillagerConversionTime(I)V", cancellable = true)
    private void setVillagerConversionTime__908265501(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-908265501L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHurtSound(Lnet/minecraft/world/damagesource/DamageSource;)Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getHurtSound__1990316399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1990316399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDeathSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getDeathSound__2082824739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2082824739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVoicePitch()F", cancellable = true)
    private void getVoicePitch_852870667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(852870667L))
            info.setReturnValue(6.098955E8F);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_1106720296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1106720296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_865257120(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(865257120L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStepSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getStepSound_426471265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(426471265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract_2120664532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2120664532L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAmbientSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getAmbientSound__1613412735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1613412735L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway__547020706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-547020706L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getVillagerDataFinalized()Z", cancellable = true)
    private void getVillagerDataFinalized_1563114915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1563114915L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setVillagerDataFinalized(Z)V", cancellable = true)
    private void setVillagerDataFinalized__1954573731(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1954573731L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVillagerData()Lnet/minecraft/world/entity/npc/villager/VillagerData;", cancellable = true)
    private void getVillagerData_1402699536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1402699536L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTradeOffers(Lnet/minecraft/world/item/trading/MerchantOffers;)V", cancellable = true)
    private void setTradeOffers__217324905(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-217324905L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVillagerXp()I", cancellable = true)
    private void getVillagerXp_1046445470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1046445470L))
            info.setReturnValue(1632357605);
    }

    @Inject(at = @At("HEAD"), method = "setVillagerData(Lnet/minecraft/world/entity/npc/villager/VillagerData;)V", cancellable = true)
    private void setVillagerData_1443282348(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1443282348L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setVillagerXp(I)V", cancellable = true)
    private void setVillagerXp_1808795160(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1808795160L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isConverting()Z", cancellable = true)
    private void isConverting__1427913398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1427913398L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_861607313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(861607313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setGossips(Lnet/minecraft/world/entity/ai/gossip/GossipContainer;)V", cancellable = true)
    private void setGossips_917373870(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(917373870L))
            info.cancel();
    }


}
