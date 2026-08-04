package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.CopperGolemStatueBlockEntity.class)
public class CopperGolemStatueBlockEntity_481977105Mixin {
        @Inject(at = @At("HEAD"), method = "getItem(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/block/CopperGolemStatueBlock$Pose;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem__1369042909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1369042909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__532575958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-532575958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket__514874668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-514874668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createStatue(Lnet/minecraft/world/entity/animal/golem/CopperGolem;)V", cancellable = true)
    private void createStatue__825393694(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-825393694L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeStatue(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/entity/animal/golem/CopperGolem;", cancellable = true)
    private void removeStatue__295646645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-295646645L))
            info.setReturnValue(null);
    }


}
