package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.spider.CaveSpider.class)
public class CaveSpider337238036Mixin {
        @Inject(at = @At("HEAD"), method = "getVehicleAttachmentPoint(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getVehicleAttachmentPoint_1944037181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1944037181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget_1252897182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1252897182L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createCaveSpider()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createCaveSpider_1131294901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1131294901L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1087336345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1087336345L))
            info.setReturnValue(null);
    }


}
