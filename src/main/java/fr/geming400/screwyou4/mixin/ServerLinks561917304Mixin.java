package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ServerLinks.class)
public class ServerLinks561917304Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1947429563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947429563L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__573542671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-573542671L))
            info.setReturnValue("i3퐅+^f36C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_600180046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(600180046L))
            info.setReturnValue(2086766768);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_600195887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(600195887L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries__2106713176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2106713176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "untrust()Ljava/util/List;", cancellable = true)
    private void untrust__2106713176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2106713176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findKnownType(Lnet/minecraft/server/ServerLinks$KnownLinkType;)Ljava/util/Optional;", cancellable = true)
    private void findKnownType__776112792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-776112792L))
            info.setReturnValue(null);
    }


}
