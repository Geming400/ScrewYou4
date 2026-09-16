package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.dimension.DimensionType.class)
public class DimensionType1830188514Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_921562246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(921562246L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1694355257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1694355257L))
            info.setReturnValue("\uCC77_0:\u290C!R \u78E9lOg\u6723.6\u477E]!sf09%\u275E{p6;Z26=28\u32D9-\u801B|1r-m)l+Tw\"RP*[T:68(JcnyJL0<I2MNN;=eD|Q");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1907426691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1907426691L))
            info.setReturnValue(1544199508);
    }

    @Inject(at = @At("HEAD"), method = "attributes()Lnet/minecraft/world/attribute/EnvironmentAttributeMap;", cancellable = true)
    private void attributes_423054720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(423054720L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minY()I", cancellable = true)
    private void minY_2125052897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2125052897L))
            info.setReturnValue(-820111108);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_744839937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(744839937L))
            info.setReturnValue(448213180);
    }

    @Inject(at = @At("HEAD"), method = "monsterSpawnBlockLightLimit()I", cancellable = true)
    private void monsterSpawnBlockLightLimit_682643383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(682643383L))
            info.setReturnValue(734505822);
    }

    @Inject(at = @At("HEAD"), method = "getTeleportationScale(Lnet/minecraft/world/level/dimension/DimensionType;Lnet/minecraft/world/level/dimension/DimensionType;)D", cancellable = true)
    private static void getTeleportationScale_1282264069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1282264069L))
            info.setReturnValue(6.5856600913585E7D);
    }

    @Inject(at = @At("HEAD"), method = "infiniburn()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void infiniburn__174153816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-174153816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasCeiling()Z", cancellable = true)
    private void hasCeiling_824841398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(824841398L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasEnderDragonFight()Z", cancellable = true)
    private void hasEnderDragonFight__1927377814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1927377814L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "logicalHeight()I", cancellable = true)
    private void logicalHeight_185382712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(185382712L))
            info.setReturnValue(-1936970168);
    }

    @Inject(at = @At("HEAD"), method = "ambientLight()F", cancellable = true)
    private void ambientLight_1499937255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1499937255L))
            info.setReturnValue(6.58566E7F);
    }

    @Inject(at = @At("HEAD"), method = "hasFixedTime()Z", cancellable = true)
    private void hasFixedTime__621144814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621144814L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "defaultClock()Ljava/util/Optional;", cancellable = true)
    private void defaultClock_424470237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(424470237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasSkyLight()Z", cancellable = true)
    private void hasSkyLight__433348662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-433348662L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "monsterSpawnLightTest()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void monsterSpawnLightTest__1772185596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1772185596L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "coordinateScale()D", cancellable = true)
    private void coordinateScale__630044271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-630044271L))
            info.setReturnValue(6.585660092354284E7D);
    }

    @Inject(at = @At("HEAD"), method = "monsterSettings()Lnet/minecraft/world/level/dimension/DimensionType$MonsterSettings;", cancellable = true)
    private void monsterSettings__1266293739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1266293739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStorageFolder(Lnet/minecraft/resources/ResourceKey;Ljava/nio/file/Path;)Ljava/nio/file/Path;", cancellable = true)
    private static void getStorageFolder__1418590398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1418590398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cardinalLightType()Lnet/minecraft/world/level/CardinalLighting$Type;", cancellable = true)
    private void cardinalLightType_533996192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(533996192L))
            info.setReturnValue(net.minecraft.world.level.CardinalLighting.Type.DEFAULT);
    }

    @Inject(at = @At("HEAD"), method = "hasEndFlashes()Z", cancellable = true)
    private void hasEndFlashes__1940764612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1940764612L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "skybox()Lnet/minecraft/world/level/dimension/DimensionType$Skybox;", cancellable = true)
    private void skybox_1268975463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1268975463L))
            info.setReturnValue(net.minecraft.world.level.dimension.DimensionType.Skybox.OVERWORLD);
    }

    @Inject(at = @At("HEAD"), method = "timelines()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void timelines_814160712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(814160712L))
            info.setReturnValue(null);
    }


}
