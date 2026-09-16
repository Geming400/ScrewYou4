package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.KeybindContents.class)
public class KeybindContents470550248Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1418296654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1418296654L))
            info.setReturnValue("\u759Bf\u775D:uR\u53EAG,dN\u1C708K6]\u494FG3\uBB5AJs\"m#e5_MUbZ,f+z\u1996n%-H\u9741u3w:>e");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__438076516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-438076516L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1240973277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1240973277L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1027901843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1027901843L))
            info.setReturnValue(-2038848323);
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/network/chat/FormattedText$StyledContentConsumer;Lnet/minecraft/network/chat/Style;)Ljava/util/Optional;", cancellable = true)
    private void visit__1288331023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1288331023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/network/chat/FormattedText$ContentConsumer;)Ljava/util/Optional;", cancellable = true)
    private void visit__1317869212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1317869212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1536995502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1536995502L))
            info.setReturnValue(null);
    }


}
