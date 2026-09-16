package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.LastSeenTrackedEntry.class)
public class LastSeenTrackedEntry_327799837Mixin {
        @Inject(at = @At("HEAD"), method = "signature()Lnet/minecraft/network/chat/MessageSignature;", cancellable = true)
    private void signature_59854261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(59854261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__580826432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-580826432L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1098223361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1098223361L))
            info.setReturnValue("z\u475F\uB909DatwuCZa 9+a=}['\u27ECcc?}Y]3i!5$s^\u9B70_(W>z\u4001te<>G*130!m6fG\u427BHpL}-E)\u24CF{K$FAnO\uB2E0b<\u1A5C\u4C1C\"%D<VsCf5Z.sUL9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_885151927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(885151927L))
            info.setReturnValue(-1824920913);
    }

    @Inject(at = @At("HEAD"), method = "pending()Z", cancellable = true)
    private void pending_437962396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(437962396L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "acknowledge()Lnet/minecraft/network/chat/LastSeenTrackedEntry;", cancellable = true)
    private void acknowledge_1455238409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1455238409L))
            info.setReturnValue(null);
    }


}
