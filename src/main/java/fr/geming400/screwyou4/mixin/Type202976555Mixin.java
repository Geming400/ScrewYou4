package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.UniformValue.Type.class)
public class Type202976555Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/UniformValue$Type;", cancellable = true)
    private static void values_69210377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(69210377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/UniformValue$Type;", cancellable = true)
    private static void valueOf_2079002668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2079002668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__932483916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-932483916L))
            info.setReturnValue(null);
    }


}
