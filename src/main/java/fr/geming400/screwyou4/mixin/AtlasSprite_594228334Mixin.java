package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.objects.AtlasSprite.class)
public class AtlasSprite_594228334Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__314397935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-314397935L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1364651858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364651858L))
            info.setReturnValue("6YYtz{m>");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1151580424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1151580424L))
            info.setReturnValue(528656644);
    }

    @Inject(at = @At("HEAD"), method = "atlas()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void atlas_750622015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(750622015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprite()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void sprite_855708025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(855708025L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1660673587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1660673587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fontDescription()Lnet/minecraft/network/chat/FontDescription;", cancellable = true)
    private void fontDescription_1753067709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1753067709L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultFallback()Ljava/lang/String;", cancellable = true)
    private void defaultFallback__557539335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-557539335L))
            info.setReturnValue(" |\u3ED5(_N|9|\u496A#Y\u55F6\uAF20]md?c8C00`o\u2C51)jT5I%z\u9D7CWgRe\u5F99--y\u38D7\u36B5\u3D26]`[x<1P<DN=eO,be<>:\u08E1JN:uSFF");
    }


}
