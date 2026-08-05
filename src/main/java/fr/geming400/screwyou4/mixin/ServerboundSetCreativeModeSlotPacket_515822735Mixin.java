package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSetCreativeModeSlotPacket.class)
public class ServerboundSetCreativeModeSlotPacket_515822735Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1163202354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1163202354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1901334993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1901334993L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__619637241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-619637241L))
            info.setReturnValue("ul紱zxe}T+8暝RS'oX0>v왺Lr}|,g{ᨮ[㿕sX6P^悡f(N>CiJ0h)@|Zv$.*櫍> 1f35w_2Z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_554085476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(554085476L))
            info.setReturnValue(617089865);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1193891647(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1193891647L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1352799260(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1352799260L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "slotNum()S", cancellable = true)
    private void slotNum_554094590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(554094590L))
            info.setReturnValue((short) 17677);
    }

    @Inject(at = @At("HEAD"), method = "itemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void itemStack_1039241394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1039241394L))
            info.setReturnValue(null);
    }


}
