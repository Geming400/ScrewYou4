package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.raid.Raid.class)
public class Raid492110634Mixin {
        @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_530385373(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(530385373L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isStarted()Z", cancellable = true)
    private void isStarted_530389217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530389217L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isActive()Z", cancellable = true)
    private void isActive_530389217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530389217L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void tick__486298706(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-486298706L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isStopped()Z", cancellable = true)
    private void isStopped_530389217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530389217L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBannerComponentPatch(Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/core/component/DataComponentPatch;", cancellable = true)
    private static void getBannerComponentPatch_3045703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(3045703L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasFirstWaveSpawned()Z", cancellable = true)
    private void hasFirstWaveSpawned_530389217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530389217L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isBetweenWaves()Z", cancellable = true)
    private void isBetweenWaves_530389217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530389217L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getOminousBannerInstance(Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void getOminousBannerInstance__1569541822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1569541822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCenter()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getCenter__1401276245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1401276245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRaidOmenLevel()I", cancellable = true)
    private void getRaidOmenLevel_530372880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530372880L))
            info.setReturnValue(1119889145);
    }

    @Inject(at = @At("HEAD"), method = "getMaxRaidOmenLevel()I", cancellable = true)
    private void getMaxRaidOmenLevel_530372880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530372880L))
            info.setReturnValue(1119889145);
    }

    @Inject(at = @At("HEAD"), method = "isOver()Z", cancellable = true)
    private void isOver_530389217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530389217L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setLeader(ILnet/minecraft/world/entity/raid/Raider;)V", cancellable = true)
    private void setLeader_319661988(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(319661988L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "joinRaid(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/entity/raid/Raider;Lnet/minecraft/core/BlockPos;Z)V", cancellable = true)
    private void joinRaid__209158359(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-209158359L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLeader(I)Lnet/minecraft/world/entity/raid/Raider;", cancellable = true)
    private void getLeader__210005346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-210005346L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addWaveMob(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/entity/raid/Raider;Z)Z", cancellable = true)
    private void addWaveMob_1446736021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1446736021L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isLoss()Z", cancellable = true)
    private void isLoss_530389217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530389217L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAllRaiders()Ljava/util/Set;", cancellable = true)
    private void getAllRaiders__1336924852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1336924852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRaidOmenLevel(I)V", cancellable = true)
    private void setRaidOmenLevel_1706027606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1706027606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTotalHealth()F", cancellable = true)
    private void getTotalHealth_530369997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530369997L))
            info.setReturnValue(7.471114E8F);
    }

    @Inject(at = @At("HEAD"), method = "getTotalRaidersAlive()I", cancellable = true)
    private void getTotalRaidersAlive_530372880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530372880L))
            info.setReturnValue(1119889145);
    }

    @Inject(at = @At("HEAD"), method = "getHealthOfLivingRaiders()F", cancellable = true)
    private void getHealthOfLivingRaiders_530369997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530369997L))
            info.setReturnValue(7.471114E8F);
    }

    @Inject(at = @At("HEAD"), method = "getOminousBannerTemplate(Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private static void getOminousBannerTemplate_2100783976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2100783976L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGroupsSpawned()I", cancellable = true)
    private void getGroupsSpawned_530372880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530372880L))
            info.setReturnValue(1119889145);
    }

    @Inject(at = @At("HEAD"), method = "removeLeader(I)V", cancellable = true)
    private void removeLeader_1706027606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1706027606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeFromRaid(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/raid/Raider;Z)V", cancellable = true)
    private void removeFromRaid_354825896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(354825896L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addHeroOfTheVillage(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void addHeroOfTheVillage_40385974(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(40385974L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateBossbar()V", cancellable = true)
    private void updateBossbar_530385373(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(530385373L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEnchantOdds()F", cancellable = true)
    private void getEnchantOdds_530369997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530369997L))
            info.setReturnValue(7.656373E8F);
    }

    @Inject(at = @At("HEAD"), method = "getNumGroups(Lnet/minecraft/world/Difficulty;)I", cancellable = true)
    private void getNumGroups_85191987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(85191987L))
            info.setReturnValue(-1483177686);
    }

    @Inject(at = @At("HEAD"), method = "absorbRaidOmen(Lnet/minecraft/server/level/ServerPlayer;)Z", cancellable = true)
    private void absorbRaidOmen__277447375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-277447375L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isVictory()Z", cancellable = true)
    private void isVictory_530389217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530389217L))
            info.setReturnValue(false);
    }


}
