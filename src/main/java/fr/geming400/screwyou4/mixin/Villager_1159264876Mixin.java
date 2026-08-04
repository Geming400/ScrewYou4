package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.npc.villager.Villager.class)
public class Villager_1159264876Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_996172470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(996172470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1197539614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1197539614L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canRestock()Z", cancellable = true)
    private void canRestock_1197543458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1197543458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLastHurtByMob(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void setLastHurtByMob_1480928206(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1480928206L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopSleeping()V", cancellable = true)
    private void stopSleeping_1197539614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1197539614L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent__1928250096(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1928250096L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__83381169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-83381169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain__1542725563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1542725563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "die(Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void die_827591415(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(827591415L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "thunderHit(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LightningBolt;)V", cancellable = true)
    private void thunderHit_229244858(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(229244858L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1286970483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1286970483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_459046430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(459046430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVillagerXp()I", cancellable = true)
    private void getVillagerXp_1197527121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1197527121L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setOffers(Lnet/minecraft/world/item/trading/MerchantOffers;)V", cancellable = true)
    private void setOffers__160035491(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-160035491L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "gossip(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/npc/villager/Villager;J)V", cancellable = true)
    private void gossip_1043954814(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1043954814L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVillagerData()Lnet/minecraft/world/entity/npc/villager/VillagerData;", cancellable = true)
    private void getVillagerData_1864759913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1864759913L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onReputationEventFrom(Lnet/minecraft/world/entity/ai/village/ReputationEventType;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void onReputationEventFrom_1269497996(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1269497996L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setGossips(Lnet/minecraft/world/entity/ai/gossip/GossipContainer;)V", cancellable = true)
    private void setGossips_1432754287(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1432754287L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getGossips()Lnet/minecraft/world/entity/ai/gossip/GossipContainer;", cancellable = true)
    private void getGossips_1074684539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1074684539L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "eatAndDigestFood()V", cancellable = true)
    private void eatAndDigestFood_1197539614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1197539614L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnGolemIfNeeded(Lnet/minecraft/server/level/ServerLevel;JI)V", cancellable = true)
    private void spawnGolemIfNeeded__1883809170(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1883809170L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playWorkSound()V", cancellable = true)
    private void playWorkSound_1197539614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1197539614L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRestock(Lnet/minecraft/server/level/ServerLevel;)Z", cancellable = true)
    private void shouldRestock_180859379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(180859379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTradingPlayer(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void setTradingPlayer_2099866521(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2099866521L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayerReputation(Lnet/minecraft/world/entity/player/Player;)I", cancellable = true)
    private void getPlayerReputation_2099854028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2099854028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "releasePoi(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)V", cancellable = true)
    private void releasePoi__597090516(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-597090516L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "restock()V", cancellable = true)
    private void restock_1197539614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1197539614L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "wantsToSpawnGolem(J)Z", cancellable = true)
    private void wantsToSpawnGolem__1920858084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1920858084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assignProfessionWhenSpawned()Z", cancellable = true)
    private void assignProfessionWhenSpawned_1197543458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1197543458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setVillagerDataFinalized(Z)V", cancellable = true)
    private void setVillagerDataFinalized__1906085592(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1906085592L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createDefaultVillagerData()Lnet/minecraft/world/entity/npc/villager/VillagerData;", cancellable = true)
    private static void createDefaultVillagerData_1864760161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1864760161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setVillagerXp(I)V", cancellable = true)
    private void setVillagerXp__1921785449(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1921785449L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVillagerDataFinalized()Z", cancellable = true)
    private void getVillagerDataFinalized_1197543458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1197543458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBreed()Z", cancellable = true)
    private void canBreed_1197543458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1197543458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/npc/villager/Villager;", cancellable = true)
    private void getBreedOffspring_199518479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(199518479L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__1537913839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1537913839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1518876579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1518876579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wantsToPickUp(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void wantsToPickUp__857100392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-857100392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway__1926399210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1926399210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setVillagerData(Lnet/minecraft/world/entity/npc/villager/VillagerData;)V", cancellable = true)
    private void setVillagerData_485977309(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(485977309L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "refreshBrain(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void refreshBrain_180855535(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(180855535L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasFarmSeeds()Z", cancellable = true)
    private void hasFarmSeeds_1197543458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1197543458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasExcessFood()Z", cancellable = true)
    private void hasExcessFood_1197543458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1197543458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wantsMoreFood()Z", cancellable = true)
    private void wantsMoreFood_1197543458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1197543458L))
            info.setReturnValue(null);
    }


}
