package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundLightUpdatePacketData.class)
public class ClientboundLightUpdatePacketData2064203040Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write_635216382(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(635216382L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSkyYMask()Ljava/util/BitSet;", cancellable = true)
    private void getSkyYMask__2127140973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2127140973L))
            info.setReturnValue(new java.util.BitSet());
    }

    @Inject(at = @At("HEAD"), method = "getBlockYMask()Ljava/util/BitSet;", cancellable = true)
    private void getBlockYMask__1157712089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1157712089L))
            info.setReturnValue(new java.util.BitSet());
    }

    @Inject(at = @At("HEAD"), method = "getBlockUpdates()Ljava/util/List;", cancellable = true)
    private void getBlockUpdates__1952108093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1952108093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEmptySkyYMask()Ljava/util/BitSet;", cancellable = true)
    private void getEmptySkyYMask__1506354156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1506354156L))
            info.setReturnValue(new java.util.BitSet());
    }

    @Inject(at = @At("HEAD"), method = "getEmptyBlockYMask()Ljava/util/BitSet;", cancellable = true)
    private void getEmptyBlockYMask__1582035096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1582035096L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSkyUpdates()Ljava/util/List;", cancellable = true)
    private void getSkyUpdates_1373430319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1373430319L))
            info.setReturnValue(null);
    }


}
