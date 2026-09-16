package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.npc.villager.Villager.class)
public class Villager_1159264876Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__1468995188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1468995188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1029581217(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1029581217L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "die(Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void die__1011593353(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1011593353L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopSleeping()V", cancellable = true)
    private void stopSleeping_395389297(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(395389297L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1760600431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1760600431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1913012991(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1913012991L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__2140491129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2140491129L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLastHurtByMob(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void setLastHurtByMob__1006690960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1006690960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setVillagerDataFinalized(Z)V", cancellable = true)
    private void setVillagerDataFinalized__906817860(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-906817860L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVillagerData()Lnet/minecraft/world/entity/npc/villager/VillagerData;", cancellable = true)
    private void getVillagerData__1844511889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1844511889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setVillagerXp(I)V", cancellable = true)
    private void setVillagerXp__1438416265(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1438416265L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVillagerDataFinalized()Z", cancellable = true)
    private void getVillagerDataFinalized__1684096510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1684096510L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getVillagerXp()I", cancellable = true)
    private void getVillagerXp_2094201341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2094201341L))
            info.setReturnValue(1130352682);
    }

    @Inject(at = @At("HEAD"), method = "setVillagerData(Lnet/minecraft/world/entity/npc/villager/VillagerData;)V", cancellable = true)
    private void setVillagerData__1803929077(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1803929077L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canRestock()Z", cancellable = true)
    private void canRestock_1878318383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1878318383L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain_973362949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(973362949L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "gossip(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/npc/villager/Villager;J)V", cancellable = true)
    private void gossip__1083284243(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1083284243L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onReputationEventFrom(Lnet/minecraft/world/entity/ai/village/ReputationEventType;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void onReputationEventFrom_1297246336(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1297246336L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/npc/villager/Villager;", cancellable = true)
    private void getBreedOffspring_1232065969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1232065969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1299148975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1299148975L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1126546893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1126546893L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wantsToPickUp(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void wantsToPickUp_1804044382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1804044382L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway_500735165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(500735165L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1909363184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1909363184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBreed()Z", cancellable = true)
    private void canBreed__279292130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-279292130L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setTradingPlayer(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void setTradingPlayer__114911879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-114911879L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "refreshBrain(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void refreshBrain__113806860(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-113806860L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "wantsToSpawnGolem(J)Z", cancellable = true)
    private void wantsToSpawnGolem__1175698645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1175698645L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "spawnGolemIfNeeded(Lnet/minecraft/server/level/ServerLevel;JI)V", cancellable = true)
    private void spawnGolemIfNeeded__1937895349(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1937895349L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayerReputation(Lnet/minecraft/world/entity/player/Player;)I", cancellable = true)
    private void getPlayerReputation__436656356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-436656356L))
            info.setReturnValue(241563862);
    }

    @Inject(at = @At("HEAD"), method = "createDefaultVillagerData()Lnet/minecraft/world/entity/npc/villager/VillagerData;", cancellable = true)
    private static void createDefaultVillagerData_1073559414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1073559414L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "eatAndDigestFood()V", cancellable = true)
    private void eatAndDigestFood_707088573(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(707088573L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRestock(Lnet/minecraft/server/level/ServerLevel;)Z", cancellable = true)
    private void shouldRestock__420403101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-420403101L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "playWorkSound()V", cancellable = true)
    private void playWorkSound_1924200372(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1924200372L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasExcessFood()Z", cancellable = true)
    private void hasExcessFood_888134293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(888134293L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasFarmSeeds()Z", cancellable = true)
    private void hasFarmSeeds__204339376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-204339376L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setGossips(Lnet/minecraft/world/entity/ai/gossip/GossipContainer;)V", cancellable = true)
    private void setGossips_1965129741(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1965129741L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getGossips()Lnet/minecraft/world/entity/ai/gossip/GossipContainer;", cancellable = true)
    private void getGossips__59721047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-59721047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "restock()V", cancellable = true)
    private void restock__1795608005(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1795608005L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "releasePoi(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)V", cancellable = true)
    private void releasePoi__88825489(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-88825489L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setOffers(Lnet/minecraft/world/item/trading/MerchantOffers;)V", cancellable = true)
    private void setOffers__227899082(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-227899082L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "wantsMoreFood()Z", cancellable = true)
    private void wantsMoreFood_1146837772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1146837772L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "thunderHit(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LightningBolt;)V", cancellable = true)
    private void thunderHit_258192075(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(258192075L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assignProfessionWhenSpawned()Z", cancellable = true)
    private void assignProfessionWhenSpawned_1706143949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1706143949L))
            info.setReturnValue(true);
    }


}
