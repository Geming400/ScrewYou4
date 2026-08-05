package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.raid.Raids.class)
public class Raids1774638619Mixin {
        @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/world/entity/raid/Raid;", cancellable = true)
    private void get_824800838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(824800838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/raid/Raids;", cancellable = true)
    private static void load_473797097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(473797097L))
            info.setReturnValue(new net.minecraft.world.entity.raid.Raids());
    }

    @Inject(at = @At("HEAD"), method = "getId(Lnet/minecraft/world/entity/raid/Raid;)Ljava/util/OptionalInt;", cancellable = true)
    private void getId__538576966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-538576966L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void tick__1591695326(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1591695326L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNearbyRaid(Lnet/minecraft/core/BlockPos;I)Lnet/minecraft/world/entity/raid/Raid;", cancellable = true)
    private void getNearbyRaid_2104486351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2104486351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createOrExtendRaid(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/entity/raid/Raid;", cancellable = true)
    private void createOrExtendRaid__758516652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-758516652L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canJoinRaid(Lnet/minecraft/world/entity/raid/Raider;)Z", cancellable = true)
    private static void canJoinRaid_1868405204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868405204L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getRaidCentersInChunk(Lnet/minecraft/world/level/ChunkPos;)Ljava/util/List;", cancellable = true)
    private void getRaidCentersInChunk_445712041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(445712041L))
            info.setReturnValue(null);
    }


}
