package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.equine.Horse.class)
public class Horse_1491721617Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_1328629211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1328629211L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/world/entity/animal/equine/Variant;", cancellable = true)
    private void getVariant__1981124519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1981124519L))
            info.setReturnValue(net.minecraft.world.entity.animal.equine.Variant.BROWN);
    }

    @Inject(at = @At("HEAD"), method = "canUseSlot(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void canUseSlot__1807877819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1807877819L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_249075572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(249075572L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canMate(Lnet/minecraft/world/entity/animal/Animal;)Z", cancellable = true)
    private void canMate_2053785122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2053785122L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__1205586058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1205586058L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1186419838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1186419838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__954513742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-954513742L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMarkings()Lnet/minecraft/world/entity/animal/equine/Markings;", cancellable = true)
    private void getMarkings__2110060330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110060330L))
            info.setReturnValue(net.minecraft.world.entity.animal.equine.Markings.BLACK_DOTS);
    }


}
