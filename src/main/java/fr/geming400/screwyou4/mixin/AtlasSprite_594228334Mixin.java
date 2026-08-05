package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.objects.AtlasSprite.class)
public class AtlasSprite_594228334Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1979740592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1979740592L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__541231642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-541231642L))
            info.setReturnValue("t>Rc6}I");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_632491075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(632491075L))
            info.setReturnValue(114805156);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1964885239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1964885239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprite()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void sprite__1848838220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1848838220L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fontDescription()Lnet/minecraft/network/chat/FontDescription;", cancellable = true)
    private void fontDescription__465832304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-465832304L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atlas()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void atlas__1848838220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1848838220L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultFallback()Ljava/lang/String;", cancellable = true)
    private void defaultFallback__541232138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-541232138L))
            info.setReturnValue(".$#q?cyiJ:^Fo_yD");
    }


}
