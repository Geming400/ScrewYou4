package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ServerList.class)
public class ServerList_1471071971Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/client/multiplayer/ServerData;)V", cancellable = true)
    private void remove_1511558042(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1511558042L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1509334216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1509334216L))
            info.setReturnValue(152043118);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/client/multiplayer/ServerData;", cancellable = true)
    private void get__1454584371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1454584371L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/ServerData;", cancellable = true)
    private void get_2059613150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2059613150L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "load()V", cancellable = true)
    private void load_1509346709(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1509346709L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "replace(ILnet/minecraft/client/multiplayer/ServerData;)V", cancellable = true)
    private void replace_246651841(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(246651841L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/client/multiplayer/ServerData;Z)V", cancellable = true)
    private void add__1525727174(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1525727174L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "save()V", cancellable = true)
    private void save_1509346709(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1509346709L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "swap(II)V", cancellable = true)
    private void swap_475192501(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(475192501L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveSingleServer(Lnet/minecraft/client/multiplayer/ServerData;)V", cancellable = true)
    private static void saveSingleServer_1511558290(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1511558290L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unhide(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/ServerData;", cancellable = true)
    private void unhide_2059613150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2059613150L))
            info.setReturnValue(null);
    }


}
