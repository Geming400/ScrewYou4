package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSetCreativeModeSlotPacket.class)
public class ServerboundSetCreativeModeSlotPacket_515822735Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_671690324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(671690324L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__392803534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-392803534L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1286246259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1286246259L))
            info.setReturnValue(" &Ym {=w\u868F*0FZNly\u3F84JBU*zc'BZHgr<\u2728%!^=63OswVBa}B'%HiKr{X5K\uBE63V\u700Cp[W]H-jx\uBACCdiSZSrSA\u257F+R{a{\u6B5B>\u8DE8+%P");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1073174825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1073174825L))
            info.setReturnValue(-1563739573);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_220110871(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(220110871L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1153182908(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1153182908L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "itemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void itemStack__2073378073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2073378073L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slotNum()S", cancellable = true)
    private void slotNum_251582550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(251582550L))
            info.setReturnValue((short) 22369);
    }


}
