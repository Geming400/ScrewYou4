package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.CopperGolemStatueBlockEntity.class)
public class CopperGolemStatueBlockEntity_481977105Mixin {
        @Inject(at = @At("HEAD"), method = "getItem(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/block/CopperGolemStatueBlock$Pose;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem__1933465926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1933465926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__1640796765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1640796765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket__51417285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-51417285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createStatue(Lnet/minecraft/world/entity/animal/golem/CopperGolem;)V", cancellable = true)
    private void createStatue_1620323810(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1620323810L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeStatue(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/entity/animal/golem/CopperGolem;", cancellable = true)
    private void removeStatue__170384445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-170384445L))
            info.setReturnValue(null);
    }


}
