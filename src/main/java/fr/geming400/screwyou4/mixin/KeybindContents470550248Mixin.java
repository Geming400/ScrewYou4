package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.KeybindContents.class)
public class KeybindContents470550248Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__664910223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-664910223L))
            info.setReturnValue("Ye`#q9R8NB7RGVc\u421BtCV\u9D361`\uD614V>\u376E|c\u6A2Dn;.RN:");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1856062011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1856062011L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__664910223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-664910223L))
            info.setReturnValue("Ye`#q9R8NB7RGVc\u421BtCV\u9D361`\uD614V>\u376E|c\u6A2Dn;.RN:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_508812494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508812494L))
            info.setReturnValue(-120960354);
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/network/chat/FormattedText$StyledContentConsumer;Lnet/minecraft/network/chat/Style;)Ljava/util/Optional;", cancellable = true)
    private void visit__1434554522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1434554522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/network/chat/FormattedText$ContentConsumer;)Ljava/util/Optional;", cancellable = true)
    private void visit_620433625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(620433625L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2088563324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2088563324L))
            info.setReturnValue(null);
    }


}
