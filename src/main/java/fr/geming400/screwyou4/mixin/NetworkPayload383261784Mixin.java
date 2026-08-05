package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.tags.TagNetworkSerialization.NetworkPayload.class)
public class NetworkPayload383261784Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_421524030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(421524030L))
            info.setReturnValue(-217323718);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_421540367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(421540367L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/core/Registry;)Lnet/minecraft/tags/TagLoader$LoadResult;", cancellable = true)
    private void resolve_1984617950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1984617950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write_29768663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(29768663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/tags/TagNetworkSerialization$NetworkPayload;", cancellable = true)
    private static void read_452665622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(452665622L))
            info.setReturnValue(null);
    }


}
