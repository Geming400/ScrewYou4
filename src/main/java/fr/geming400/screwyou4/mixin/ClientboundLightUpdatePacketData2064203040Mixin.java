package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundLightUpdatePacketData.class)
public class ClientboundLightUpdatePacketData2064203040Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write_1710709919(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1710709919L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlockUpdates()Ljava/util/List;", cancellable = true)
    private void getBlockUpdates__604427440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-604427440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockYMask()Ljava/util/BitSet;", cancellable = true)
    private void getBlockYMask__1838091463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1838091463L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSkyYMask()Ljava/util/BitSet;", cancellable = true)
    private void getSkyYMask__1838091463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1838091463L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEmptyBlockYMask()Ljava/util/BitSet;", cancellable = true)
    private void getEmptyBlockYMask__1838091463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1838091463L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEmptySkyYMask()Ljava/util/BitSet;", cancellable = true)
    private void getEmptySkyYMask__1838091463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1838091463L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSkyUpdates()Ljava/util/List;", cancellable = true)
    private void getSkyUpdates__604427440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-604427440L))
            info.setReturnValue(null);
    }


}
