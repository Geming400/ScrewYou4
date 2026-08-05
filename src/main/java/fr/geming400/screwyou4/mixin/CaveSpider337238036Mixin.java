package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.spider.CaveSpider.class)
public class CaveSpider337238036Mixin {
        @Inject(at = @At("HEAD"), method = "createCaveSpider()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createCaveSpider__362980409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-362980409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVehicleAttachmentPoint(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getVehicleAttachmentPoint__1672900570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1672900570L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget_1981277747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1981277747L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__2108997322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2108997322L))
            info.setReturnValue(null);
    }


}
