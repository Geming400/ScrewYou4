package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.login.custom.DiscardedQueryPayload.class)
public class DiscardedQueryPayload1019412197Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_110785929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(110785929L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1789835722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1789835722L))
            info.setReturnValue(" &Sq-DftLRk`\uA994\u0419i\u427Dt\u74D6meyKKfQ\u6E1F.Rl.A\u1645va1uu?q'J1=pIuTMbp\u0CC0lKC6u!u5{=&DZs\u4ED8`\u2087iEH_c\u4400VUE5D}`4\u9CFAm3&h\u771CPOnwEv");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1576764288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1576764288L))
            info.setReturnValue(1156312873);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1573365689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1573365689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write__409574461(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-409574461L))
            info.cancel();
    }


}
