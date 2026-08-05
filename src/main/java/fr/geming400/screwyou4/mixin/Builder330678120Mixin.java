package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EntityType.Builder.class)
public class Builder330678120Mixin {
        @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/entity/EntityType$EntityFactory;Lnet/minecraft/world/entity/MobCategory;)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private static void of_1247858909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1247858909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/entity/EntityType;", cancellable = true)
    private void build__461182888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-461182888L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attach(Lnet/minecraft/world/entity/EntityAttachment;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void attach__1664921229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1664921229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attach(Lnet/minecraft/world/entity/EntityAttachment;FFF)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void attach__480243683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-480243683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "notInPeaceful()Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void notInPeaceful__1177101923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1177101923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vehicleAttachment(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void vehicleAttachment_1557353129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1557353129L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "passengerAttachments([F)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void passengerAttachments_21954984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(21954984L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "passengerAttachments([Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void passengerAttachments__712668034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-712668034L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nameTagOffset(F)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void nameTagOffset__839092973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-839092973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNothing(Lnet/minecraft/world/entity/MobCategory;)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private static void createNothing_827007265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(827007265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ridingOffset(F)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void ridingOffset__839092973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-839092973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fireImmune()Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void fireImmune__1177101923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1177101923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "eyeHeight(F)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void eyeHeight__839092973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-839092973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noSave()Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void noSave__1177101923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1177101923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSpawnFarFromPlayer()Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void canSpawnFarFromPlayer__1177101923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1177101923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clientTrackingRange(I)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void clientTrackingRange__1734488490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1734488490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateInterval(I)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void updateInterval__1734488490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1734488490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnDimensionsScale(F)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void spawnDimensionsScale__839092973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-839092973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noLootTable()Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void noLootTable__1177101923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1177101923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiredFeatures([Lnet/minecraft/world/flag/FeatureFlag;)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void requiredFeatures__1212937241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1212937241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sized(FF)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void sized_1049249885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1049249885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noSummon()Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void noSummon__1177101923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1177101923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "immuneTo(Lnet/minecraft/tags/TagKey;)Lnet/minecraft/world/entity/EntityType$Builder;", cancellable = true)
    private void immuneTo_530318285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530318285L))
            info.setReturnValue(null);
    }


}
