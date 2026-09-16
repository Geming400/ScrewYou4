package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.TheEndGatewayBlockEntity.class)
public class TheEndGatewayBlockEntity_1688217876Mixin {
        @Inject(at = @At("HEAD"), method = "triggerEvent(II)Z", cancellable = true)
    private void triggerEvent_295858152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(295858152L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderFace(Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void shouldRenderFace_1193541616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1193541616L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "triggerCooldown(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/TheEndGatewayBlockEntity;)V", cancellable = true)
    private static void triggerCooldown_1779895136(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1779895136L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSpawnPercent(F)F", cancellable = true)
    private void getSpawnPercent_351357036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(351357036L))
            info.setReturnValue(5.552729E8F);
    }

    @Inject(at = @At("HEAD"), method = "isCoolingDown()Z", cancellable = true)
    private void isCoolingDown__66667335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-66667335L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getParticleAmount()I", cancellable = true)
    private void getParticleAmount_1217596421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1217596421L))
            info.setReturnValue(1744966652);
    }

    @Inject(at = @At("HEAD"), method = "beamAnimationTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/TheEndGatewayBlockEntity;)V", cancellable = true)
    private static void beamAnimationTick_1877541039(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1877541039L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setExitPosition(Lnet/minecraft/core/BlockPos;Z)V", cancellable = true)
    private void setExitPosition__1053811213(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1053811213L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPortalPosition(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getPortalPosition__63031014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-63031014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCooldownPercent(F)F", cancellable = true)
    private void getCooldownPercent__1233483056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1233483056L))
            info.setReturnValue(5.567803E8F);
    }

    @Inject(at = @At("HEAD"), method = "portalTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/TheEndGatewayBlockEntity;)V", cancellable = true)
    private static void portalTick__2032438842(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2032438842L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSpawning()Z", cancellable = true)
    private void isSpawning_519758745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(519758745L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__434555994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-434555994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket_1154823486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1154823486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag_1110077996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1110077996L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }


}
