package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.tags.TagNetworkSerialization.NetworkPayload.class)
public class NetworkPayload383261784Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_826993373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(826993373L))
            info.setReturnValue(-1438053887);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1442378156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1442378156L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/core/Registry;)Lnet/minecraft/tags/TagLoader$LoadResult;", cancellable = true)
    private void resolve_1036880074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1036880074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write__1045724874(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1045724874L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/tags/TagNetworkSerialization$NetworkPayload;", cancellable = true)
    private static void read_1042475564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042475564L))
            info.setReturnValue(null);
    }


}
