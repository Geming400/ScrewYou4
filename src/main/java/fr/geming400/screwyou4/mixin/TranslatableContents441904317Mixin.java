package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.TranslatableContents.class)
public class TranslatableContents441904317Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1827416080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1827416080L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__693556154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-693556154L))
            info.setReturnValue("6p\u3D8F7+ey2W|GUxp)ohg\uC8D1Kk!wY]\u0B07N\u3367X[\uC036^\u3372oNXRDK\u3D37d%`\uC4B0JJuMX\u7482M/ouY(Iz\u6DBB\u75F0\u5F9A-5\u6D2E^>k]KCh[6ra>oJ\u5C0F;\u2D13o]3K\u99CAPY\u6108thyss");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_480166563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(480166563L))
            info.setReturnValue(1441595650);
    }

    @Inject(at = @At("HEAD"), method = "getKey()Ljava/lang/String;", cancellable = true)
    private void getKey__693556154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-693556154L))
            info.setReturnValue("6p\u3D8F7+ey2W|GUxp)ohg\uC8D1Kk!wY]\u0B07N\u3367X[\uC036^\u3372oNXRDK\u3D37d%`\uC4B0JJuMX\u7482M/ouY(Iz\u6DBB\u75F0\u5F9A-5\u6D2E^>k]KCh[6ra>oJ\u5C0F;\u2D13o]3K\u99CAPY\u6108thyss");
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/network/chat/ResolutionContext;I)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void resolve_253894547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(253894547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/network/chat/FormattedText$ContentConsumer;)Ljava/util/Optional;", cancellable = true)
    private void visit_591787694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(591787694L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/network/chat/FormattedText$StyledContentConsumer;Lnet/minecraft/network/chat/Style;)Ljava/util/Optional;", cancellable = true)
    private void visit__1463200453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1463200453L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getArgs()[Ljava/lang/Object;", cancellable = true)
    private void getArgs_491622993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(491622993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAllowedPrimitiveArgument(Ljava/lang/Object;)Z", cancellable = true)
    private static void isAllowedPrimitiveArgument_1827416328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1827416328L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getFallback()Ljava/lang/String;", cancellable = true)
    private void getFallback__693556154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-693556154L))
            info.setReturnValue("6p\u3D8F7+ey2W|GUxp)ohg\uC8D1Kk!wY]\u0B07N\u3367X[\uC036^\u3372oNXRDK\u3D37d%`\uC4B0JJuMX\u7482M/ouY(Iz\u6DBB\u75F0\u5F9A-5\u6D2E^>k]KCh[6ra>oJ\u5C0F;\u2D13o]3K\u99CAPY\u6108thyss");
    }

    @Inject(at = @At("HEAD"), method = "getArgument(I)Lnet/minecraft/network/chat/FormattedText;", cancellable = true)
    private void getArgument_280394971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(280394971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2117209255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2117209255L))
            info.setReturnValue(null);
    }


}
