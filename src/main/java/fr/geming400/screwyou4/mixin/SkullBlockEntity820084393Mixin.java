package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.SkullBlockEntity.class)
public class SkullBlockEntity820084393Mixin {
        @Inject(at = @At("HEAD"), method = "getOwnerProfile()Lnet/minecraft/world/item/component/ResolvableProfile;", cancellable = true)
    private void getOwnerProfile_1616289918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1616289918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAnimation(F)F", cancellable = true)
    private void getAnimation_2031215426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2031215426L))
            info.setReturnValue(9.216475E8F);
    }

    @Inject(at = @At("HEAD"), method = "removeComponentsFromTag(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void removeComponentsFromTag__399046959(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-399046959L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag__346537155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-346537155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket__176767379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-176767379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__194468669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-194468669L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNoteBlockSound()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getNoteBlockSound__1622982160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1622982160L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animation(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/SkullBlockEntity;)V", cancellable = true)
    private static void animation__1373294826(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1373294826L))
            info.cancel();
    }


}
