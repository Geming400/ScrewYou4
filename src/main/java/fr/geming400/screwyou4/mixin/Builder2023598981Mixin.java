package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityPredicate.Builder.class)
public class Builder2023598981Mixin {
        @Inject(at = @At("HEAD"), method = "put(Lcom/mojang/serialization/Codec;Lnet/minecraft/advancements/predicates/entity/EntitySubPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void put_2090546117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2090546117L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "flags(Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void flags__1065532298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1065532298L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/tags/TagKey;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void of__1808083308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1808083308L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/world/entity/EntityType;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void of__1551190043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1551190043L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "slots(Lnet/minecraft/advancements/predicates/SlotsPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void slots_1868003420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868003420L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "distance(Lnet/minecraft/advancements/predicates/DistancePredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void distance__1522745196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1522745196L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/entity/EntityPredicate;", cancellable = true)
    private void build__1439058738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1439058738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components(Lnet/minecraft/core/component/DataComponentExactPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void components_59912685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(59912685L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "components(Lnet/minecraft/advancements/predicates/DataComponentMatchers;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void components_619253669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(619253669L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "components(Ljava/util/Map;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void components_974447352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(974447352L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "player(Lnet/minecraft/advancements/predicates/entity/PlayerPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void player_566168944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566168944L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "targetedEntity(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void targetedEntity_579224151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(579224151L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "periodicTick(I)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void periodicTick_1985946360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1985946360L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "raider(Lnet/minecraft/advancements/predicates/entity/RaiderPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void raider_1269046192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1269046192L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "nbt(Lnet/minecraft/advancements/predicates/NbtPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void nbt__775150020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-775150020L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "moving(Lnet/minecraft/advancements/predicates/entity/MovementPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void moving__1755145969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1755145969L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "team(Ljava/lang/String;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void team_1550019772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1550019772L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "equipment(Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void equipment_889905233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(889905233L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "equipment(Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void equipment__977628312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-977628312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vehicle(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void vehicle_440186256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(440186256L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "effects(Lnet/minecraft/advancements/predicates/MobEffectsPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void effects__241428559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-241428559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "passenger(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void passenger__1193869570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1193869570L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityType(Lnet/minecraft/advancements/predicates/entity/EntityTypePredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void entityType__134476816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-134476816L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "sheep(Lnet/minecraft/advancements/predicates/entity/SheepPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void sheep__1389786060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1389786060L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cubeMob(Lnet/minecraft/advancements/predicates/entity/CubeMobPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void cubeMob_1929627988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1929627988L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "fishingHook(Lnet/minecraft/advancements/predicates/entity/FishingHookPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void fishingHook__1085798448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1085798448L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "movementAffectedBy(Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void movementAffectedBy_179892166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179892166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightingBolt(Lnet/minecraft/advancements/predicates/entity/LightningBoltPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void lightingBolt__2027136662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2027136662L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "steppingOn(Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void steppingOn__799891677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-799891677L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "located(Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void located_1433618798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1433618798L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "entity()Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private static void entity_405533380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(405533380L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate.Builder());
    }


}
