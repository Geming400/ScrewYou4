package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.atlas.sources.Unstitcher.Region.class)
public class Region92732363Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1478244622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1478244622L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1042727612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1042727612L))
            info.setReturnValue("gX\"ap'U\uFC73K\u6CC1c\u3FF2h\u6F92-e");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_130995105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(130995105L))
            info.setReturnValue(929378994);
    }

    @Inject(at = @At("HEAD"), method = "x()D", cancellable = true)
    private void x_130989804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(130989804L))
            info.setReturnValue(2.793479009472773E8D);
    }

    @Inject(at = @At("HEAD"), method = "y()D", cancellable = true)
    private void y_130989804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(130989804L))
            info.setReturnValue(2.793479009472773E8D);
    }

    @Inject(at = @At("HEAD"), method = "width()D", cancellable = true)
    private void width_130989804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(130989804L))
            info.setReturnValue(2.793479009472773E8D);
    }

    @Inject(at = @At("HEAD"), method = "sprite()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void sprite_1944633106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1944633106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()D", cancellable = true)
    private void height_130989804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(130989804L))
            info.setReturnValue(2.793479009472773E8D);
    }


}
