package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.raid.Raids.class)
public class Raids1774638619Mixin {
        @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/world/entity/raid/Raid;", cancellable = true)
    private void get_1031995228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1031995228L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/raid/Raids;", cancellable = true)
    private static void load__78289789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-78289789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId(Lnet/minecraft/world/entity/raid/Raid;)Ljava/util/OptionalInt;", cancellable = true)
    private void getId__1042437973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1042437973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void tick_796229279(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(796229279L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createOrExtendRaid(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/entity/raid/Raid;", cancellable = true)
    private void createOrExtendRaid_1330288433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1330288433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNearbyRaid(Lnet/minecraft/core/BlockPos;I)Lnet/minecraft/world/entity/raid/Raid;", cancellable = true)
    private void getNearbyRaid__795662800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-795662800L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canJoinRaid(Lnet/minecraft/world/entity/raid/Raider;)Z", cancellable = true)
    private static void canJoinRaid_1981306648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1981306648L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRaidCentersInChunk(Lnet/minecraft/world/level/ChunkPos;)Ljava/util/List;", cancellable = true)
    private void getRaidCentersInChunk__1062571809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1062571809L))
            info.setReturnValue(null);
    }


}
