package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityPredicate.Builder.class)
public class Builder2023598981Mixin {
        @Inject(at = @At("HEAD"), method = "put(Lcom/mojang/serialization/Codec;Lnet/minecraft/advancements/predicates/entity/EntitySubPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void put__1658934732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1658934732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flags(Lnet/minecraft/advancements/predicates/entity/EntityFlagsPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void flags__859989859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-859989859L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/tags/TagKey;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void of_289224189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(289224189L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/world/entity/EntityType;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void of_548684238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(548684238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slots(Lnet/minecraft/advancements/predicates/SlotsPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void slots__1918340569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1918340569L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distance(Lnet/minecraft/advancements/predicates/DistancePredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void distance_1381530793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1381530793L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/entity/EntityPredicate;", cancellable = true)
    private void build__461094432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-461094432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components(Lnet/minecraft/core/component/DataComponentExactPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void components_924355031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(924355031L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components(Ljava/util/Map;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void components__1978322610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978322610L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components(Lnet/minecraft/advancements/predicates/DataComponentMatchers;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void components_597276539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(597276539L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "entity()Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private static void entity_1786111649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1786111649L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "player(Lnet/minecraft/advancements/predicates/entity/PlayerPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void player__531369073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-531369073L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "nbt(Lnet/minecraft/advancements/predicates/NbtPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void nbt_2143628540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2143628540L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "team(Ljava/lang/String;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void team_1007914975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1007914975L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equipment(Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void equipment__969941706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-969941706L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "equipment(Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void equipment__917120993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-917120993L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "passenger(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void passenger_960740964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(960740964L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "vehicle(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void vehicle_960740964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(960740964L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "effects(Lnet/minecraft/advancements/predicates/MobEffectsPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void effects__1683604109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1683604109L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "entityType(Lnet/minecraft/advancements/predicates/entity/EntityTypePredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void entityType__1883680333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1883680333L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "moving(Lnet/minecraft/advancements/predicates/entity/MovementPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void moving__871540159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-871540159L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "raider(Lnet/minecraft/advancements/predicates/entity/RaiderPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void raider_913806585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(913806585L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "lightingBolt(Lnet/minecraft/advancements/predicates/entity/LightningBoltPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void lightingBolt_2083254091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2083254091L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "movementAffectedBy(Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void movementAffectedBy__1746670592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1746670592L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "fishingHook(Lnet/minecraft/advancements/predicates/entity/FishingHookPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void fishingHook_334363005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(334363005L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "cubeMob(Lnet/minecraft/advancements/predicates/entity/CubeMobPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void cubeMob__2018021505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2018021505L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "sheep(Lnet/minecraft/advancements/predicates/entity/SheepPredicate;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void sheep__1411389969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1411389969L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "targetedEntity(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void targetedEntity_960740964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(960740964L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "periodicTick(I)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void periodicTick__432230192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-432230192L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "located(Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void located__1746670592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1746670592L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "steppingOn(Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;", cancellable = true)
    private void steppingOn__1746670592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1746670592L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.EntityPredicate$Builder());
    }


}
