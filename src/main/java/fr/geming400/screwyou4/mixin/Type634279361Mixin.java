package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.gui.GuiSpriteScaling.Type.class)
public class Type634279361Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/resources/metadata/gui/GuiSpriteScaling$Type;", cancellable = true)
    private static void values_194636167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(194636167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/resources/metadata/gui/GuiSpriteScaling$Type;", cancellable = true)
    private static void valueOf__1165064726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1165064726L))
            info.setReturnValue(net.minecraft.client.resources.metadata.gui.GuiSpriteScaling.Type.STRETCH);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1924834211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1924834211L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__501181110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-501181110L))
            info.setReturnValue("Yz,␕>#Rゐv]!rpkZ2Ꝿ}GdKI狡푙Y%꿽6輼U䅯%㣏");
    }


}
