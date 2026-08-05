package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.dimension.DimensionType.class)
public class DimensionType1830188514Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1079266523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1079266523L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_694728539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(694728539L))
            info.setReturnValue(".ksf`gRbwn\"JRg+]9m\"g\u6954(VFCd");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1868451256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868451256L))
            info.setReturnValue(1156116400);
    }

    @Inject(at = @At("HEAD"), method = "attributes()Lnet/minecraft/world/attribute/EnvironmentAttributeMap;", cancellable = true)
    private void attributes__453478089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-453478089L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ambientLight()F", cancellable = true)
    private void ambientLight_1868447877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868447877L))
            info.setReturnValue(1.334072E8F);
    }

    @Inject(at = @At("HEAD"), method = "skybox()Lnet/minecraft/world/level/dimension/DimensionType$Skybox;", cancellable = true)
    private void skybox_1094843357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094843357L))
            info.setReturnValue(net.minecraft.world.level.dimension.DimensionType.Skybox.OVERWORLD);
    }

    @Inject(at = @At("HEAD"), method = "timelines()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void timelines__844825738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-844825738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "infiniburn()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void infiniburn__844825738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-844825738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasCeiling()Z", cancellable = true)
    private void hasCeiling_1868467097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868467097L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasFixedTime()Z", cancellable = true)
    private void hasFixedTime_1868467097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868467097L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "defaultClock()Ljava/util/Optional;", cancellable = true)
    private void defaultClock_2075649936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2075649936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasSkyLight()Z", cancellable = true)
    private void hasSkyLight_1868467097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868467097L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasEnderDragonFight()Z", cancellable = true)
    private void hasEnderDragonFight_1868467097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868467097L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "logicalHeight()I", cancellable = true)
    private void logicalHeight_1868450760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868450760L))
            info.setReturnValue(1334639890);
    }

    @Inject(at = @At("HEAD"), method = "minY()I", cancellable = true)
    private void minY_1868450760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868450760L))
            info.setReturnValue(1334639890);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_1868450760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868450760L))
            info.setReturnValue(1334639890);
    }

    @Inject(at = @At("HEAD"), method = "monsterSpawnLightTest()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void monsterSpawnLightTest__639498389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-639498389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTeleportationScale(Lnet/minecraft/world/level/dimension/DimensionType;Lnet/minecraft/world/level/dimension/DimensionType;)D", cancellable = true)
    private static void getTeleportationScale__1921122181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1921122181L))
            info.setReturnValue(1.3340720082050708E8D);
    }

    @Inject(at = @At("HEAD"), method = "monsterSettings()Lnet/minecraft/world/level/dimension/DimensionType$MonsterSettings;", cancellable = true)
    private void monsterSettings__399960878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-399960878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "coordinateScale()D", cancellable = true)
    private void coordinateScale_1868445955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868445955L))
            info.setReturnValue(1.334072004213979E8D);
    }

    @Inject(at = @At("HEAD"), method = "cardinalLightType()Lnet/minecraft/world/level/CardinalLighting$Type;", cancellable = true)
    private void cardinalLightType__1058066736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1058066736L))
            info.setReturnValue(net.minecraft.world.level.CardinalLighting.Type.NETHER);
    }

    @Inject(at = @At("HEAD"), method = "getStorageFolder(Lnet/minecraft/resources/ResourceKey;Ljava/nio/file/Path;)Ljava/nio/file/Path;", cancellable = true)
    private static void getStorageFolder__1786231307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1786231307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasEndFlashes()Z", cancellable = true)
    private void hasEndFlashes_1868467097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868467097L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "monsterSpawnBlockLightLimit()I", cancellable = true)
    private void monsterSpawnBlockLightLimit_1868450760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868450760L))
            info.setReturnValue(1334639890);
    }


}
