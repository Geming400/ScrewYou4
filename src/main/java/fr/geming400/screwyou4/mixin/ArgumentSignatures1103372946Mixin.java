package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ArgumentSignatures.class)
public class ArgumentSignatures1103372946Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1806082091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1806082091L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__32087029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-32087029L))
            info.setReturnValue("M2r<E]\u94FAmo -%!d\"5c}3\u3F41avo' \u89CFn\u2403gy7r:W#>'\u027EE&=h/e+X\uA35C+");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1141635688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1141635688L))
            info.setReturnValue(-182638637);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write_749879825(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(749879825L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries__1565257534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1565257534L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "signCommand(Lnet/minecraft/network/chat/SignableCommand;Lnet/minecraft/commands/arguments/ArgumentSignatures$Signer;)Lnet/minecraft/commands/arguments/ArgumentSignatures;", cancellable = true)
    private static void signCommand__949033940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-949033940L))
            info.setReturnValue(null);
    }


}
