package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.NbtAccounter.class)
public class NbtAccounter842415628Mixin {
        @Inject(at = @At("HEAD"), method = "create(J)Lnet/minecraft/nbt/NbtAccounter;", cancellable = true)
    private static void create__1314100229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1314100229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDepth()I", cancellable = true)
    private void getDepth_880677874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(880677874L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultQuota()Lnet/minecraft/nbt/NbtAccounter;", cancellable = true)
    private static void defaultQuota_789439285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(789439285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "accountBytes(J)V", cancellable = true)
    private void accountBytes_2057256121(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2057256121L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accountBytes(JJ)V", cancellable = true)
    private void accountBytes__123911169(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-123911169L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "uncompressedQuota()Lnet/minecraft/nbt/NbtAccounter;", cancellable = true)
    private static void uncompressedQuota_789439285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(789439285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlimitedHeap()Lnet/minecraft/nbt/NbtAccounter;", cancellable = true)
    private static void unlimitedHeap_789439285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(789439285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUsage()J", cancellable = true)
    private void getUsage_880678835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(880678835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "popDepth()V", cancellable = true)
    private void popDepth_880690367(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(880690367L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pushDepth()V", cancellable = true)
    private void pushDepth_880690367(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(880690367L))
            info.cancel();
    }


}
