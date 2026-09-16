package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.raid.Raid.class)
public class Raid492110634Mixin {
        @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_2069213979(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2069213979L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isStarted()Z", cancellable = true)
    private void isStarted_276427594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(276427594L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isActive()Z", cancellable = true)
    private void isActive__2022266351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2022266351L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void tick_1420743985(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1420743985L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isStopped()Z", cancellable = true)
    private void isStopped__1536126594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1536126594L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getOminousBannerTemplate(Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private static void getOminousBannerTemplate__226254578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-226254578L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBannerComponentPatch(Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/core/component/DataComponentPatch;", cancellable = true)
    private static void getBannerComponentPatch_1304497556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1304497556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCenter()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getCenter__2043109696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2043109696L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTotalRaidersAlive()I", cancellable = true)
    private void getTotalRaidersAlive__805853391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-805853391L))
            info.setReturnValue(1505019031);
    }

    @Inject(at = @At("HEAD"), method = "getHealthOfLivingRaiders()F", cancellable = true)
    private void getHealthOfLivingRaiders_1165317539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1165317539L))
            info.setReturnValue(3.89405E7F);
    }

    @Inject(at = @At("HEAD"), method = "getTotalHealth()F", cancellable = true)
    private void getTotalHealth__691329405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-691329405L))
            info.setReturnValue(3.89405E7F);
    }

    @Inject(at = @At("HEAD"), method = "getAllRaiders()Ljava/util/Set;", cancellable = true)
    private void getAllRaiders_268063995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(268063995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRaidOmenLevel(I)V", cancellable = true)
    private void setRaidOmenLevel__679589721(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-679589721L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOminousBannerInstance(Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void getOminousBannerInstance_265906989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(265906989L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxRaidOmenLevel()I", cancellable = true)
    private void getMaxRaidOmenLevel__1668732053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1668732053L))
            info.setReturnValue(1447698535);
    }

    @Inject(at = @At("HEAD"), method = "getRaidOmenLevel()I", cancellable = true)
    private void getRaidOmenLevel__1390056813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1390056813L))
            info.setReturnValue(1258606329);
    }

    @Inject(at = @At("HEAD"), method = "getNumGroups(Lnet/minecraft/world/Difficulty;)I", cancellable = true)
    private void getNumGroups_1563205999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1563205999L))
            info.setReturnValue(-1897317930);
    }

    @Inject(at = @At("HEAD"), method = "getEnchantOdds()F", cancellable = true)
    private void getEnchantOdds__110822842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-110822842L))
            info.setReturnValue(3.89405E7F);
    }

    @Inject(at = @At("HEAD"), method = "getGroupsSpawned()I", cancellable = true)
    private void getGroupsSpawned_1430291936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1430291936L))
            info.setReturnValue(858559783);
    }

    @Inject(at = @At("HEAD"), method = "removeFromRaid(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/raid/Raider;Z)V", cancellable = true)
    private void removeFromRaid_340850592(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(340850592L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateBossbar()V", cancellable = true)
    private void updateBossbar_1351829376(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1351829376L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeLeader(I)V", cancellable = true)
    private void removeLeader_79309635(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(79309635L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addHeroOfTheVillage(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void addHeroOfTheVillage__552150845(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-552150845L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isOver()Z", cancellable = true)
    private void isOver_850330243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(850330243L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setLeader(ILnet/minecraft/world/entity/raid/Raider;)V", cancellable = true)
    private void setLeader__1309611921(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1309611921L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLeader(I)Lnet/minecraft/world/entity/raid/Raider;", cancellable = true)
    private void getLeader__1362256641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1362256641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "joinRaid(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/entity/raid/Raider;Lnet/minecraft/core/BlockPos;Z)V", cancellable = true)
    private void joinRaid_2076136701(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2076136701L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addWaveMob(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/entity/raid/Raider;Z)Z", cancellable = true)
    private void addWaveMob__934934417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-934934417L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isLoss()Z", cancellable = true)
    private void isLoss__2063232620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2063232620L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isVictory()Z", cancellable = true)
    private void isVictory__1627923367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1627923367L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isBetweenWaves()Z", cancellable = true)
    private void isBetweenWaves_481420965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(481420965L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasFirstWaveSpawned()Z", cancellable = true)
    private void hasFirstWaveSpawned_601458102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(601458102L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "absorbRaidOmen(Lnet/minecraft/server/level/ServerPlayer;)Z", cancellable = true)
    private void absorbRaidOmen_1262724783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262724783L))
            info.setReturnValue(false);
    }


}
