package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ArgumentSignatures.class)
public class ArgumentSignatures1103372946Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_194746678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(194746678L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1873796471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1873796471L))
            info.setReturnValue("Q[J\uBFE2]>\"<R{v!\u5CFD5\uB005HnD!3x)L\u2341K0?q|h\"\u71332kiXU?_2bM'e:l'cQdrjW=5,%]_icm6\u4354X dkJ\uB28F2 E\u62D2G&\u0869j7\u6214]+Cc$hNx\u9A60|@)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1660725037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1660725037L))
            info.setReturnValue(162795395);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write__325613712(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-325613712L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries_1400286546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1400286546L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "signCommand(Lnet/minecraft/network/chat/SignableCommand;Lnet/minecraft/commands/arguments/ArgumentSignatures$Signer;)Lnet/minecraft/commands/arguments/ArgumentSignatures;", cancellable = true)
    private static void signCommand_193248030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(193248030L))
            info.setReturnValue(null);
    }


}
