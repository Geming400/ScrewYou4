package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.nautilus.ZombieNautilus.class)
public class ZombieNautilus108302327Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_1775009560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1775009560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getVariant_1937142212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1937142212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setVariant(Lnet/minecraft/core/Holder;)V", cancellable = true)
    private void setVariant__1062357956(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1062357956L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1483404317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1483404317L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed__1839769787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1839769787L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain__77599599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-77599599L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/nautilus/ZombieNautilus;", cancellable = true)
    private void getBreedOffspring_1980963392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1980963392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_248186427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(248186427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_858400636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(858400636L))
            info.setReturnValue(null);
    }


}
