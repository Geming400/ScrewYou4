package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ServerList.class)
public class ServerList_1471071971Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/client/multiplayer/ServerData;)V", cancellable = true)
    private void remove_1416682270(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1416682270L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1914803559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1914803559L))
            info.setReturnValue(-515483988);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/client/multiplayer/ServerData;", cancellable = true)
    private void get_761830307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(761830307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/ServerData;", cancellable = true)
    private void get_1947077832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947077832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "load()V", cancellable = true)
    private void load__1487329169(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1487329169L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "replace(ILnet/minecraft/client/multiplayer/ServerData;)V", cancellable = true)
    private void replace_865744013(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(865744013L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/client/multiplayer/ServerData;Z)V", cancellable = true)
    private void add__1660690951(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1660690951L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "save()V", cancellable = true)
    private void save_1602187832(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1602187832L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "swap(II)V", cancellable = true)
    private void swap_765751234(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(765751234L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unhide(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/ServerData;", cancellable = true)
    private void unhide_139891363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(139891363L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "saveSingleServer(Lnet/minecraft/client/multiplayer/ServerData;)V", cancellable = true)
    private static void saveSingleServer__1835133350(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1835133350L))
            info.cancel();
    }


}
