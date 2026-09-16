package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EntityType.Builder.class)
public class Builder330678120Mixin {
        @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/entity/EntityType$EntityFactory;Lnet/minecraft/world/entity/MobCategory;)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private static void of__1212424012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1212424012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/entity/EntityType;", cancellable = true)
    private void build_1220911814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1220911814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attach(Lnet/minecraft/world/entity/EntityAttachment;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void attach_1617843854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1617843854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attach(Lnet/minecraft/world/entity/EntityAttachment;FFF)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void attach__615892040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-615892040L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "eyeHeight(F)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void eyeHeight__33953845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-33953845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fireImmune()Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void fireImmune_255899300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(255899300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiredFeatures([Lnet/minecraft/world/flag/FeatureFlag;)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void requiredFeatures_347868643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(347868643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sized(FF)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void sized_195687354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(195687354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noSummon()Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void noSummon_1706502235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1706502235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noLootTable()Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void noLootTable_671509560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(671509560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noSave()Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void noSave__532283905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-532283905L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "immuneTo(Lnet/minecraft/tags/TagKey;)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void immuneTo__1066223189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1066223189L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateInterval(I)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void updateInterval_744233988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(744233988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSpawnFarFromPlayer()Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void canSpawnFarFromPlayer__2147119514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2147119514L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clientTrackingRange(I)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void clientTrackingRange__672188015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-672188015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnDimensionsScale(F)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void spawnDimensionsScale_1803307157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1803307157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNothing(Lnet/minecraft/world/entity/MobCategory;)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private static void createNothing__943478960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943478960L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nameTagOffset(F)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void nameTagOffset_1192124053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1192124053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "passengerAttachments([Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void passengerAttachments_2027506184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2027506184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "passengerAttachments([F)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void passengerAttachments__1683477326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1683477326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vehicleAttachment(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void vehicleAttachment__1679934888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1679934888L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ridingOffset(F)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void ridingOffset_2056588731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2056588731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "notInPeaceful()Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void notInPeaceful__1340506506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1340506506L))
            info.setReturnValue(null);
    }


}
