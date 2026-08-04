package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.status.ServerStatus.Players.class)
public class Players1912414877Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__997040160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-997040160L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_776954902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776954902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1950677619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1950677619L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "max()I", cancellable = true)
    private void max_1950677123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1950677123L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "online()I", cancellable = true)
    private void online_1950677123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1950677123L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample()Ljava/util/List;", cancellable = true)
    private void sample__756215603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-756215603L))
            info.setReturnValue(null);
    }


}
