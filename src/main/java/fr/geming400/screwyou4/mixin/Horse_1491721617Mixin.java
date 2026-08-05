package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.equine.Horse.class)
public class Horse_1491721617Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__1136538447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1136538447L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/world/entity/animal/equine/Variant;", cancellable = true)
    private void getVariant_1286212456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1286212456L))
            info.setReturnValue(net.minecraft.world.entity.animal.equine.Variant.BLACK);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1808034388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1808034388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canUseSlot(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void canUseSlot_1567295088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1567295088L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__794090152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-794090152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1631476756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1631476756L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canMate(Lnet/minecraft/world/entity/animal/Animal;)Z", cancellable = true)
    private void canMate_1120362125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1120362125L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMarkings()Lnet/minecraft/world/entity/animal/equine/Markings;", cancellable = true)
    private void getMarkings_940390338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(940390338L))
            info.setReturnValue(net.minecraft.world.entity.animal.equine.Markings.WHITE_FIELD);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__2053147371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2053147371L))
            info.setReturnValue(null);
    }


}
