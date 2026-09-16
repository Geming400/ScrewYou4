package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.NbtAccounter.class)
public class NbtAccounter842415628Mixin {
        @Inject(at = @At("HEAD"), method = "create(J)Lnet/minecraft/nbt/NbtAccounter;", cancellable = true)
    private static void create__1667434369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1667434369L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDepth()I", cancellable = true)
    private void getDepth_717046533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(717046533L))
            info.setReturnValue(-1115527798);
    }

    @Inject(at = @At("HEAD"), method = "accountBytes(JJ)V", cancellable = true)
    private void accountBytes_1389185025(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1389185025L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accountBytes(J)V", cancellable = true)
    private void accountBytes_1413329015(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1413329015L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "uncompressedQuota()Lnet/minecraft/nbt/NbtAccounter;", cancellable = true)
    private static void uncompressedQuota_1202608115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1202608115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlimitedHeap()Lnet/minecraft/nbt/NbtAccounter;", cancellable = true)
    private static void unlimitedHeap_1001009954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1001009954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultQuota()Lnet/minecraft/nbt/NbtAccounter;", cancellable = true)
    private static void defaultQuota__1035776916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1035776916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pushDepth()V", cancellable = true)
    private void pushDepth_2012130966(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2012130966L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUsage()J", cancellable = true)
    private void getUsage__1269125464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1269125464L))
            info.setReturnValue(-2846802072630551051L);
    }

    @Inject(at = @At("HEAD"), method = "popDepth()V", cancellable = true)
    private void popDepth__2034870003(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2034870003L))
            info.cancel();
    }


}
