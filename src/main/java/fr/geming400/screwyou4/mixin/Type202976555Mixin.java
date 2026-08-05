package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.UniformValue.Type.class)
public class Type202976555Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/UniformValue$Type;", cancellable = true)
    private static void values__893304661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-893304661L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/UniformValue$Type;", cancellable = true)
    private static void valueOf__1775767548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1775767548L))
            info.setReturnValue(net.minecraft.client.renderer.UniformValue.Type.INT);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_291185177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(291185177L))
            info.setReturnValue("(^\u6D51Nft=3@ZG\uBE6FW3w");
    }


}
