package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.RecipeDisplay.Type.class)
public class Type127404394Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__781221874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-781221874L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_897827919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(897827919L))
            info.setReturnValue("wCq$\uB150K\u9F1Fsd\u99E8(F\uD7BFi)+Xl'XzLc:|l,Y'!<&\u56C0QETbu,R2?*88");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_684756485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(684756485L))
            info.setReturnValue(-883665351);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1193849648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1193849648L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private void streamCodec__1011341712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1011341712L))
            info.setReturnValue(null);
    }


}
