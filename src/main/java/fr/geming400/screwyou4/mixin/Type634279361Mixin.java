package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.gui.GuiSpriteScaling.Type.class)
public class Type634279361Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/resources/metadata/gui/GuiSpriteScaling$Type;", cancellable = true)
    private static void values_968832169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(968832169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/resources/metadata/gui/GuiSpriteScaling$Type;", cancellable = true)
    private static void valueOf_817110978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(817110978L))
            info.setReturnValue(net.minecraft.client.resources.metadata.gui.GuiSpriteScaling.Type.TILE);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1700724615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1700724615L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_722487983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(722487983L))
            info.setReturnValue("tlc\u91C6X\uC171.h\u0A66m,p+Xtfsf}ST-(\u6C6CAQ\u4C24veH6V!2_/:{INqu(1$9EA:");
    }


}
