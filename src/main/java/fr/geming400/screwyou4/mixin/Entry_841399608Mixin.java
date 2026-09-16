package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ArgumentSignatures.Entry.class)
public class Entry_841399608Mixin {
        @Inject(at = @At("HEAD"), method = "signature()Lnet/minecraft/network/chat/MessageSignature;", cancellable = true)
    private void signature_573454032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(573454032L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_1650666763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1650666763L))
            info.setReturnValue("\u0171ClFZl@Utru\u9549h#UYoX<#$");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__67226661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-67226661L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1611823132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1611823132L))
            info.setReturnValue("n+2c:H\u2CEB)lw\uA471%7z|z\u346C)%&%*{E+-\u9C72ot+9\u586C+UP<{}\u3F86@,KEQT#u%fxkDe&}lvu\uB492XnpB0\uB973Q0;kad\uCC95kD}\uC890ynEP\u058Fy");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1398751698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1398751698L))
            info.setReturnValue(-324656500);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write__587587051(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-587587051L))
            info.cancel();
    }


}
