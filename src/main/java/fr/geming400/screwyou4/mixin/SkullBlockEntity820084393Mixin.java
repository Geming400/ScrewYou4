package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.SkullBlockEntity.class)
public class SkullBlockEntity820084393Mixin {
        @Inject(at = @At("HEAD"), method = "getOwnerProfile()Lnet/minecraft/world/item/component/ResolvableProfile;", cancellable = true)
    private void getOwnerProfile__1777859734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1777859734L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAnimation(F)F", cancellable = true)
    private void getAnimation_1121262992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1121262992L))
            info.setReturnValue(6.541856E8F);
    }

    @Inject(at = @At("HEAD"), method = "animation(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/SkullBlockEntity;)V", cancellable = true)
    private static void animation_1405649818(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1405649818L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket_286690004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(286690004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__1302689476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1302689476L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag_241944514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(241944514L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "removeComponentsFromTag(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void removeComponentsFromTag_707256135(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(707256135L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNoteBlockSound()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getNoteBlockSound_918906618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(918906618L))
            info.setReturnValue(null);
    }


}
